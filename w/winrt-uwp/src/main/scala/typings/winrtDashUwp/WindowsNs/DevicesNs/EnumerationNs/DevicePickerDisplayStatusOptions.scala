package typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DevicePickerDisplayStatusOptions extends js.Object

/** Indicates what you'd like the device picker to show about a given device. Used with the SetDisplayStatus method on the DevicePicker object. */
@JSGlobal("Windows.Devices.Enumeration.DevicePickerDisplayStatusOptions")
@js.native
object DevicePickerDisplayStatusOptions extends js.Object {
  /** Picker should show nothing, or no changes. */
  @js.native
  sealed trait none extends DevicePickerDisplayStatusOptions
  
  /** Picker should display a disconnect button. */
  @js.native
  sealed trait showDisconnectButton extends DevicePickerDisplayStatusOptions
  
  /** Picker should display progress. */
  @js.native
  sealed trait showProgress extends DevicePickerDisplayStatusOptions
  
  /** Picker should display a retry button. */
  @js.native
  sealed trait showRetryButton extends DevicePickerDisplayStatusOptions
  
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DevicePickerDisplayStatusOptions.none with Double = js.native
  /* 2 */ val showDisconnectButton: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DevicePickerDisplayStatusOptions.showDisconnectButton with Double = js.native
  /* 1 */ val showProgress: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DevicePickerDisplayStatusOptions.showProgress with Double = js.native
  /* 3 */ val showRetryButton: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DevicePickerDisplayStatusOptions.showRetryButton with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DevicePickerDisplayStatusOptions with Double] = js.native
}

