package typings.winrtUwp.global.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates what you'd like the device picker to show about a given device. Used with the SetDisplayStatus method on the DevicePicker object. */
@JSGlobal("Windows.Devices.Enumeration.DevicePickerDisplayStatusOptions")
@js.native
object DevicePickerDisplayStatusOptions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Devices.Enumeration.DevicePickerDisplayStatusOptions with Double
  ] = js.native
  
  /* 0 */ val none: typings.winrtUwp.Windows.Devices.Enumeration.DevicePickerDisplayStatusOptions.none with Double = js.native
  
  /* 2 */ val showDisconnectButton: typings.winrtUwp.Windows.Devices.Enumeration.DevicePickerDisplayStatusOptions.showDisconnectButton with Double = js.native
  
  /* 1 */ val showProgress: typings.winrtUwp.Windows.Devices.Enumeration.DevicePickerDisplayStatusOptions.showProgress with Double = js.native
  
  /* 3 */ val showRetryButton: typings.winrtUwp.Windows.Devices.Enumeration.DevicePickerDisplayStatusOptions.showRetryButton with Double = js.native
}
