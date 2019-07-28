package typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs

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
  sealed trait high extends ActivitySensorReadingConfidence
  
  /** There is low confidence in the reading of the sensor. */
  @js.native
  sealed trait low extends ActivitySensorReadingConfidence
  
  /* 0 */ val high: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.ActivitySensorReadingConfidence.high with Double = js.native
  /* 1 */ val low: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.ActivitySensorReadingConfidence.low with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ActivitySensorReadingConfidence with Double] = js.native
}

