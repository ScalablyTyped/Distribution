package typings.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DevicePickerDisplayStatusOptions extends StObject
/** Indicates what you'd like the device picker to show about a given device. Used with the SetDisplayStatus method on the DevicePicker object. */
@JSGlobal("Windows.Devices.Enumeration.DevicePickerDisplayStatusOptions")
@js.native
object DevicePickerDisplayStatusOptions extends StObject {
  
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
}
