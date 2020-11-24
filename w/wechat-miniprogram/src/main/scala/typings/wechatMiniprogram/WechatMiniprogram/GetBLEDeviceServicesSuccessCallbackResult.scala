package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBLEDeviceServicesSuccessCallbackResult extends js.Object {
  
  var errMsg: String = js.native
  
  /** 设备服务列表 */
  var services: js.Array[BLEService] = js.native
}
object GetBLEDeviceServicesSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, services: js.Array[BLEService]): GetBLEDeviceServicesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBLEDeviceServicesSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetBLEDeviceServicesSuccessCallbackResultOps[Self <: GetBLEDeviceServicesSuccessCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesVarargs(value: BLEService*): Self = this.set("services", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: js.Array[BLEService]): Self = this.set("services", value.asInstanceOf[js.Any])
  }
}
