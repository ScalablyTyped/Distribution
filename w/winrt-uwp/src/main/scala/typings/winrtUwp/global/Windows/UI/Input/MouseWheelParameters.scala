package typings.winrtUwp.global.Windows.UI.Input

import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties associated with the button wheel of a mouse device. */
@JSGlobal("Windows.UI.Input.MouseWheelParameters")
@js.native
abstract class MouseWheelParameters ()
  extends typings.winrtUwp.Windows.UI.Input.MouseWheelParameters {
  /** Gets or sets the device-independent pixel (DIP) conversion factors for both character width and line height units (as set in the Wheel settings of the Mouse control panel). */
  /* CompleteClass */
  override var charTranslation: Point = js.native
  /** Gets or sets a value that indicates the change in the angle of rotation associated with input from the wheel button of a mouse. */
  /* CompleteClass */
  override var deltaRotationAngle: Double = js.native
  /** Gets or sets a value that indicates the change in scale associated with input from the wheel button of a mouse. */
  /* CompleteClass */
  override var deltaScale: Double = js.native
  /** Gets or sets the device-independent pixel (DIP) conversion factors for both page width and height units (as set in the Wheel settings of the Mouse control panel). */
  /* CompleteClass */
  override var pageTranslation: Point = js.native
}

