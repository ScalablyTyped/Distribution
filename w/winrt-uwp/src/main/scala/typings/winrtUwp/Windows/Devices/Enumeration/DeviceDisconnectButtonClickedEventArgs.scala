package typings.winrtUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the DisconnectButtonClicked event on the DevicePicker object. */
@js.native
trait DeviceDisconnectButtonClickedEventArgs extends js.Object {
  
  /** The device that the user clicked the disconnect button for. */
  var device: DeviceInformation = js.native
}
object DeviceDisconnectButtonClickedEventArgs {
  
  @scala.inline
  def apply(device: DeviceInformation): DeviceDisconnectButtonClickedEventArgs = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDisconnectButtonClickedEventArgs]
  }
  
  @scala.inline
  implicit class DeviceDisconnectButtonClickedEventArgsOps[Self <: DeviceDisconnectButtonClickedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setDevice(value: DeviceInformation): Self = this.set("device", value.asInstanceOf[js.Any])
  }
}
