package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBLEDeviceServicesSuccessData extends StObject {
  
  /**
    * 该服务是否为主服务
    */
  var isPrimary: js.UndefOr[Boolean] = js.native
  
  /**
    * 蓝牙设备服务的 uuid
    */
  var uuid: js.UndefOr[String] = js.native
}
object GetBLEDeviceServicesSuccessData {
  
  @scala.inline
  def apply(): GetBLEDeviceServicesSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBLEDeviceServicesSuccessData]
  }
  
  @scala.inline
  implicit class GetBLEDeviceServicesSuccessDataMutableBuilder[Self <: GetBLEDeviceServicesSuccessData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
