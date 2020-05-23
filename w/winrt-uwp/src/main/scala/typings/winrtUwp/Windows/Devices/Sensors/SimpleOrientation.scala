package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SimpleOrientation extends js.Object

/** Indicates the orientation of the device. */
@JSGlobal("Windows.Devices.Sensors.SimpleOrientation")
@js.native
object SimpleOrientation extends js.Object {
  /** The device is face-down and the display is hidden from the user. */
  @js.native
  sealed trait facedown extends SimpleOrientation
  
  /** The device is face-up and the display is visible to the user. */
  @js.native
  sealed trait faceup extends SimpleOrientation
  
  /** The device is not rotated. */
  @js.native
  sealed trait notRotated extends SimpleOrientation
  
  /** The device is rotated 180-degrees counter-clockwise. */
  @js.native
  sealed trait rotated180DegreesCounterclockwise extends SimpleOrientation
  
  /** The device is rotated 270-degrees counter-clockwise. */
  @js.native
  sealed trait rotated270DegreesCounterclockwise extends SimpleOrientation
  
  /** The device is rotated 90-degrees counter-clockwise. */
  @js.native
  sealed trait rotated90DegreesCounterclockwise extends SimpleOrientation
  
}

