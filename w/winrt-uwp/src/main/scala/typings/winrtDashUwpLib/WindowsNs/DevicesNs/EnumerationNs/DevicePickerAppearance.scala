package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the appearance of a device picker. */
@JSGlobal("Windows.Devices.Enumeration.DevicePickerAppearance")
@js.native
abstract class DevicePickerAppearance () extends js.Object {
  /** Gets and sets the accent color of the picker UI. */
  var accentColor: winrtDashUwpLib.WindowsNs.UINs.Color = js.native
  /** Gets and sets the background color of the picker UI. */
  var backgroundColor: winrtDashUwpLib.WindowsNs.UINs.Color = js.native
  /** Gets and sets the foreground color of the picker UI. */
  var foregroundColor: winrtDashUwpLib.WindowsNs.UINs.Color = js.native
  /** Gets and sets the accent color for a device that has been selected in the picker. */
  var selectedAccentColor: winrtDashUwpLib.WindowsNs.UINs.Color = js.native
  /** Gets and sets the background color for a device that is selected in the picker. */
  var selectedBackgroundColor: winrtDashUwpLib.WindowsNs.UINs.Color = js.native
  /** Gets and sets the foreground color for a device that is selected in the picker. */
  var selectedForegroundColor: winrtDashUwpLib.WindowsNs.UINs.Color = js.native
  /** Gets and sets the title for the picker UI. */
  var title: java.lang.String = js.native
}

