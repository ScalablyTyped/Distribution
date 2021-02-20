package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 设备特征值列表 */
@js.native
trait BLECharacteristic extends StObject {
  
  /** 该特征值支持的操作类型 */
  var properties: BLECharacteristicProperties = js.native
  
  /** 蓝牙设备特征值的 uuid */
  var uuid: String = js.native
}
object BLECharacteristic {
  
  @scala.inline
  def apply(properties: BLECharacteristicProperties, uuid: String): BLECharacteristic = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BLECharacteristic]
  }
  
  @scala.inline
  implicit class BLECharacteristicMutableBuilder[Self <: BLECharacteristic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: BLECharacteristicProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
