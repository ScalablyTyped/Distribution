package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties associated with the button wheel of a mouse device. */
trait MouseWheelParameters extends js.Object {
  /** Gets or sets the device-independent pixel (DIP) conversion factors for both character width and line height units (as set in the Wheel settings of the Mouse control panel). */
  var charTranslation: Point
  /** Gets or sets a value that indicates the change in the angle of rotation associated with input from the wheel button of a mouse. */
  var deltaRotationAngle: Double
  /** Gets or sets a value that indicates the change in scale associated with input from the wheel button of a mouse. */
  var deltaScale: Double
  /** Gets or sets the device-independent pixel (DIP) conversion factors for both page width and height units (as set in the Wheel settings of the Mouse control panel). */
  var pageTranslation: Point
}

object MouseWheelParameters {
  @scala.inline
  def apply(charTranslation: Point, deltaRotationAngle: Double, deltaScale: Double, pageTranslation: Point): MouseWheelParameters = {
    val __obj = js.Dynamic.literal(charTranslation = charTranslation.asInstanceOf[js.Any], deltaRotationAngle = deltaRotationAngle.asInstanceOf[js.Any], deltaScale = deltaScale.asInstanceOf[js.Any], pageTranslation = pageTranslation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseWheelParameters]
  }
}

