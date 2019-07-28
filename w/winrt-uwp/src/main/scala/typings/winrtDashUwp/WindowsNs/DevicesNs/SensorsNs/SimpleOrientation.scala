package typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs

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
  
  /* 5 */ val facedown: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation.facedown with Double = js.native
  /* 4 */ val faceup: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation.faceup with Double = js.native
  /* 0 */ val notRotated: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation.notRotated with Double = js.native
  /* 2 */ val rotated180DegreesCounterclockwise: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation.rotated180DegreesCounterclockwise with Double = js.native
  /* 3 */ val rotated270DegreesCounterclockwise: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation.rotated270DegreesCounterclockwise with Double = js.native
  /* 1 */ val rotated90DegreesCounterclockwise: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation.rotated90DegreesCounterclockwise with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SimpleOrientation with Double] = js.native
}

