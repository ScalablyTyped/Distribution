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
  
  val facedown: facedown with java.lang.String = js.native
  val faceup: faceup with java.lang.String = js.native
  val notRotated: notRotated with java.lang.String = js.native
  val rotated180DegreesCounterclockwise: rotated180DegreesCounterclockwise with java.lang.String = js.native
  val rotated270DegreesCounterclockwise: rotated270DegreesCounterclockwise with java.lang.String = js.native
  val rotated90DegreesCounterclockwise: rotated90DegreesCounterclockwise with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation with java.lang.String] = js.native
}

