package typings.weixinApp.wx

import typings.weixinApp.anon.devicesArrayBluetoothDevi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBluetoothDevicesOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MGetBluetoothDevicesOptions(res: devicesArrayBluetoothDevi): Unit = js.native
}
object GetBluetoothDevicesOptions {
  
  @scala.inline
  def apply(success: devicesArrayBluetoothDevi => Unit): GetBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetBluetoothDevicesOptions]
  }
  
  @scala.inline
  implicit class GetBluetoothDevicesOptionsOps[Self <: GetBluetoothDevicesOptions] (val x: Self) extends AnyVal {
    
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
    def setSuccess(value: devicesArrayBluetoothDevi => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
}
