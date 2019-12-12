package typings.winrtDashUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Sensors.ActivitySensorReadingConfidence.high
import typings.winrtDashUwp.Windows.Devices.Sensors.ActivitySensorReadingConfidence.low
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ActivitySensorReadingConfidence with Double] = js.native
  /* 0 */ @js.native
  object high extends TopLevel[high with Double]
  
  /* 1 */ @js.native
  object low extends TopLevel[low with Double]
  
}

