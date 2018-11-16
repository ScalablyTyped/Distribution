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
  
  val absolute: absolute with java.lang.String = js.native
  val relative: relative with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.SensorReadingType with java.lang.String
  ] = js.native
}

