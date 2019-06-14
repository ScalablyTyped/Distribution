package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SensorReadingType extends js.Object

/** Specifies the sensor reading type. */
@JSGlobal("Windows.Devices.Sensors.SensorReadingType")
@js.native
object SensorReadingType extends js.Object {
  /** The sensor reading type is absolute. */
  @js.native
  sealed trait absolute
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorReadingType
  
  /** The sensor reading type is relative. */
  @js.native
  sealed trait relative
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorReadingType
  
  /* 0 */ val absolute: absolute with scala.Double = js.native
  /* 1 */ val relative: relative with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorReadingType with scala.Double
  ] = js.native
}

