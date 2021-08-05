package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 设备服务列表 */
trait BLEService extends StObject {
  
  /** 该服务是否为主服务 */
  var isPrimary: Boolean
  
  /** 蓝牙设备服务的 uuid */
  var uuid: String
}
object BLEService {
  
  inline def apply(isPrimary: Boolean, uuid: String): BLEService = {
    val __obj = js.Dynamic.literal(isPrimary = isPrimary.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BLEService]
  }
  
  extension [Self <: BLEService](x: Self) {
    
    inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
