package typings.weixinApp.wx

import typings.weixinApp.anon.servicesArrayuuidstringis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBLEDeviceServicesOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 蓝牙设备 id，参考 getDevices 接口
    */
  var deviceId: String = js.native
  
  /**
    * 成功则返回本机蓝牙适配器状态
    */
  @JSName("success")
  def success_MGetBLEDeviceServicesOptions(res: servicesArrayuuidstringis): Unit = js.native
}
object GetBLEDeviceServicesOptions {
  
  @scala.inline
  def apply(deviceId: String, success: servicesArrayuuidstringis => Unit): GetBLEDeviceServicesOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetBLEDeviceServicesOptions]
  }
  
  @scala.inline
  implicit class GetBLEDeviceServicesOptionsOps[Self <: GetBLEDeviceServicesOptions] (val x: Self) extends AnyVal {
    
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
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: servicesArrayuuidstringis => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
}
