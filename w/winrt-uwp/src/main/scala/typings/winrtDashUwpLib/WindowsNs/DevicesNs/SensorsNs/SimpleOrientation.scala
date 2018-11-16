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
  
  val facedown: facedown with java.lang.String = js.native
  val faceup: faceup with java.lang.String = js.native
  val notRotated: notRotated with java.lang.String = js.native
  val rotated180DegreesCounterclockwise: rotated180DegreesCounterclockwise with java.lang.String = js.native
  val rotated270DegreesCounterclockwise: rotated270DegreesCounterclockwise with java.lang.String = js.native
  val rotated90DegreesCounterclockwise: rotated90DegreesCounterclockwise with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation with java.lang.String
  ] = js.native
}

