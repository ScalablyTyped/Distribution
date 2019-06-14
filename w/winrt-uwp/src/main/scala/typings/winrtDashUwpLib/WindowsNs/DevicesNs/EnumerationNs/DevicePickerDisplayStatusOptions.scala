package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

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
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePickerDisplayStatusOptions
  
  /** Picker should display a disconnect button. */
  @js.native
  sealed trait showDisconnectButton
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePickerDisplayStatusOptions
  
  /** Picker should display progress. */
  @js.native
  sealed trait showProgress
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePickerDisplayStatusOptions
  
  /** Picker should display a retry button. */
  @js.native
  sealed trait showRetryButton
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePickerDisplayStatusOptions
  
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val showDisconnectButton: showDisconnectButton with scala.Double = js.native
  /* 1 */ val showProgress: showProgress with scala.Double = js.native
  /* 3 */ val showRetryButton: showRetryButton with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePickerDisplayStatusOptions with scala.Double
  ] = js.native
}

