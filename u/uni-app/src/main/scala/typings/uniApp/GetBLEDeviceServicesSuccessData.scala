package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBLEDeviceServicesSuccessData extends StObject {
  
  /**
    * 该服务是否为主服务
    */
  var isPrimary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 蓝牙设备服务的 uuid
    */
  var uuid: js.UndefOr[String] = js.undefined
}
object GetBLEDeviceServicesSuccessData {
  
  inline def apply(): GetBLEDeviceServicesSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBLEDeviceServicesSuccessData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBLEDeviceServicesSuccessData] (val x: Self) extends AnyVal {
    
    inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    inline def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
