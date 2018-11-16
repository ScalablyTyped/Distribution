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
  
  val none: none with java.lang.String = js.native
  val showDisconnectButton: showDisconnectButton with java.lang.String = js.native
  val showProgress: showProgress with java.lang.String = js.native
  val showRetryButton: showRetryButton with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePickerDisplayStatusOptions with java.lang.String
  ] = js.native
}

