package typings.winrtUwp.global.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the appearance of a device picker. */
@JSGlobal("Windows.Devices.Enumeration.DevicePickerAppearance")
@js.native
abstract class DevicePickerAppearance ()
  extends typings.winrtUwp.Windows.Devices.Enumeration.DevicePickerAppearance {
  /** Gets and sets the accent color of the picker UI. */
  /* CompleteClass */
  override var accentColor: Color = js.native
  /** Gets and sets the background color of the picker UI. */
  /* CompleteClass */
  override var backgroundColor: Color = js.native
  /** Gets and sets the foreground color of the picker UI. */
  /* CompleteClass */
  override var foregroundColor: Color = js.native
  /** Gets and sets the accent color for a device that has been selected in the picker. */
  /* CompleteClass */
  override var selectedAccentColor: Color = js.native
  /** Gets and sets the background color for a device that is selected in the picker. */
  /* CompleteClass */
  override var selectedBackgroundColor: Color = js.native
  /** Gets and sets the foreground color for a device that is selected in the picker. */
  /* CompleteClass */
  override var selectedForegroundColor: Color = js.native
  /** Gets and sets the title for the picker UI. */
  /* CompleteClass */
  override var title: String = js.native
}

