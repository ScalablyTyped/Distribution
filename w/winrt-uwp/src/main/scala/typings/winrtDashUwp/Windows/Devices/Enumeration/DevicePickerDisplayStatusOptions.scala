package typings.winrtDashUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Enumeration.DevicePickerDisplayStatusOptions.none
import typings.winrtDashUwp.Windows.Devices.Enumeration.DevicePickerDisplayStatusOptions.showDisconnectButton
import typings.winrtDashUwp.Windows.Devices.Enumeration.DevicePickerDisplayStatusOptions.showProgress
import typings.winrtDashUwp.Windows.Devices.Enumeration.DevicePickerDisplayStatusOptions.showRetryButton
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DevicePickerDisplayStatusOptions with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object showDisconnectButton extends TopLevel[showDisconnectButton with Double]
  
  /* 1 */ @js.native
  object showProgress extends TopLevel[showProgress with Double]
  
  /* 3 */ @js.native
  object showRetryButton extends TopLevel[showRetryButton with Double]
  
}

