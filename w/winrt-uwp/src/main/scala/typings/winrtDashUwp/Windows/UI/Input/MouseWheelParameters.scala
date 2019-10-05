package typings.winrtDashUwp.Windows.UI.Input

import typings.winrtDashUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties associated with the button wheel of a mouse device. */
@JSGlobal("Windows.UI.Input.MouseWheelParameters")
@js.native
abstract class MouseWheelParameters () extends js.Object {
  /** Gets or sets the device-independent pixel (DIP) conversion factors for both character width and line height units (as set in the Wheel settings of the Mouse control panel). */
  var charTranslation: Point = js.native
  /** Gets or sets a value that indicates the change in the angle of rotation associated with input from the wheel button of a mouse. */
  var deltaRotationAngle: Double = js.native
  /** Gets or sets a value that indicates the change in scale associated with input from the wheel button of a mouse. */
  var deltaScale: Double = js.native
  /** Gets or sets the device-independent pixel (DIP) conversion factors for both page width and height units (as set in the Wheel settings of the Mouse control panel). */
  var pageTranslation: Point = js.native
}

