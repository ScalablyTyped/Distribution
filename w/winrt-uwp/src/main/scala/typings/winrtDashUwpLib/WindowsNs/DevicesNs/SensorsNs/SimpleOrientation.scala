package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

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
  sealed trait facedown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation
  
  /** The device is face-up and the display is visible to the user. */
  @js.native
  sealed trait faceup
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation
  
  /** The device is not rotated. */
  @js.native
  sealed trait notRotated
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation
  
  /** The device is rotated 180-degrees counter-clockwise. */
  @js.native
  sealed trait rotated180DegreesCounterclockwise
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation
  
  /** The device is rotated 270-degrees counter-clockwise. */
  @js.native
  sealed trait rotated270DegreesCounterclockwise
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation
  
  /** The device is rotated 90-degrees counter-clockwise. */
  @js.native
  sealed trait rotated90DegreesCounterclockwise
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation
  
  /* 5 */ val facedown: facedown with scala.Double = js.native
  /* 4 */ val faceup: faceup with scala.Double = js.native
  /* 0 */ val notRotated: notRotated with scala.Double = js.native
  /* 2 */ val rotated180DegreesCounterclockwise: rotated180DegreesCounterclockwise with scala.Double = js.native
  /* 3 */ val rotated270DegreesCounterclockwise: rotated270DegreesCounterclockwise with scala.Double = js.native
  /* 1 */ val rotated90DegreesCounterclockwise: rotated90DegreesCounterclockwise with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation with scala.Double
  ] = js.native
}

