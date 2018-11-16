package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActivitySensorReadingConfidence extends js.Object

/** Specifies the confidence of a sensor reading. */
@JSGlobal("Windows.Devices.Sensors.ActivitySensorReadingConfidence")
@js.native
object ActivitySensorReadingConfidence extends js.Object {
  /** There is high confidence in the reading of the sensor. */
  @js.native
  sealed trait high
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.ActivitySensorReadingConfidence
  
  /** There is low confidence in the reading of the sensor. */
  @js.native
  sealed trait low
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.ActivitySensorReadingConfidence
  
  val high: high with java.lang.String = js.native
  val low: low with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.ActivitySensorReadingConfidence with java.lang.String
  ] = js.native
}

