package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SimpleOrientation extends js.Object

@JSGlobal("Windows.Devices.Sensors.SimpleOrientation")
@js.native
object SimpleOrientation extends js.Object {
  @js.native
  sealed trait facedown
    extends winrtLib.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation
  
  @js.native
  sealed trait faceup
    extends winrtLib.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation
  
  @js.native
  sealed trait notRotated
    extends winrtLib.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation
  
  @js.native
  sealed trait rotated180DegreesCounterclockwise
    extends winrtLib.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation
  
  @js.native
  sealed trait rotated270DegreesCounterclockwise
    extends winrtLib.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation
  
  @js.native
  sealed trait rotated90DegreesCounterclockwise
    extends winrtLib.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation
  
  /* 5 */ val facedown: facedown with scala.Double = js.native
  /* 4 */ val faceup: faceup with scala.Double = js.native
  /* 0 */ val notRotated: notRotated with scala.Double = js.native
  /* 2 */ val rotated180DegreesCounterclockwise: rotated180DegreesCounterclockwise with scala.Double = js.native
  /* 3 */ val rotated270DegreesCounterclockwise: rotated270DegreesCounterclockwise with scala.Double = js.native
  /* 1 */ val rotated90DegreesCounterclockwise: rotated90DegreesCounterclockwise with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation with scala.Double] = js.native
}

