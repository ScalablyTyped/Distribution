package typings.winrt.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SimpleOrientation extends js.Object

@JSGlobal("Windows.Devices.Sensors.SimpleOrientation")
@js.native
object SimpleOrientation extends js.Object {
  @js.native
  sealed trait facedown extends SimpleOrientation
  
  @js.native
  sealed trait faceup extends SimpleOrientation
  
  @js.native
  sealed trait notRotated extends SimpleOrientation
  
  @js.native
  sealed trait rotated180DegreesCounterclockwise extends SimpleOrientation
  
  @js.native
  sealed trait rotated270DegreesCounterclockwise extends SimpleOrientation
  
  @js.native
  sealed trait rotated90DegreesCounterclockwise extends SimpleOrientation
  
  /* 5 */ val facedown: typings.winrt.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation.facedown with Double = js.native
  /* 4 */ val faceup: typings.winrt.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation.faceup with Double = js.native
  /* 0 */ val notRotated: typings.winrt.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation.notRotated with Double = js.native
  /* 2 */ val rotated180DegreesCounterclockwise: typings.winrt.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation.rotated180DegreesCounterclockwise with Double = js.native
  /* 3 */ val rotated270DegreesCounterclockwise: typings.winrt.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation.rotated270DegreesCounterclockwise with Double = js.native
  /* 1 */ val rotated90DegreesCounterclockwise: typings.winrt.WindowsNs.DevicesNs.SensorsNs.SimpleOrientation.rotated90DegreesCounterclockwise with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SimpleOrientation with Double] = js.native
}

