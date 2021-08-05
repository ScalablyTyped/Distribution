package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 设备特征值列表 */
trait BLECharacteristic extends StObject {
  
  /** 该特征值支持的操作类型 */
  var properties: BLECharacteristicProperties
  
  /** 蓝牙设备特征值的 uuid */
  var uuid: String
}
object BLECharacteristic {
  
  inline def apply(properties: BLECharacteristicProperties, uuid: String): BLECharacteristic = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BLECharacteristic]
  }
  
  extension [Self <: BLECharacteristic](x: Self) {
    
    inline def setProperties(value: BLECharacteristicProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
