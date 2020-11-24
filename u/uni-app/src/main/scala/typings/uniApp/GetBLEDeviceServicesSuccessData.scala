package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBLEDeviceServicesSuccessData extends js.Object {
  
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
  implicit class GetBLEDeviceServicesSuccessDataOps[Self <: GetBLEDeviceServicesSuccessData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsPrimary(value: Boolean): Self = this.set("isPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPrimary: Self = this.set("isPrimary", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
}
