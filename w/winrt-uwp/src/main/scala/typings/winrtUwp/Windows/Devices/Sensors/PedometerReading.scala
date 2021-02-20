package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a pedometer reading. */
@js.native
trait PedometerReading extends StObject {
  
  /** Gets the total number of steps taken for this pedometer reading. */
  var cumulativeSteps: Double = js.native
  
  /** Gets the amount of time that has elapsed for this pedometer reading. */
  var cumulativeStepsDuration: Double = js.native
  
  /** Indicates the type of steps taken for this pedometer reading. */
  var stepKind: PedometerStepKind = js.native
  
  /** Gets the time for the most recent pedometer reading. */
  var timestamp: Date = js.native
}
object PedometerReading {
  
  @scala.inline
  def apply(
    cumulativeSteps: Double,
    cumulativeStepsDuration: Double,
    stepKind: PedometerStepKind,
    timestamp: Date
  ): PedometerReading = {
    val __obj = js.Dynamic.literal(cumulativeSteps = cumulativeSteps.asInstanceOf[js.Any], cumulativeStepsDuration = cumulativeStepsDuration.asInstanceOf[js.Any], stepKind = stepKind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PedometerReading]
  }
  
  @scala.inline
  implicit class PedometerReadingMutableBuilder[Self <: PedometerReading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCumulativeSteps(value: Double): Self = StObject.set(x, "cumulativeSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCumulativeStepsDuration(value: Double): Self = StObject.set(x, "cumulativeStepsDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepKind(value: PedometerStepKind): Self = StObject.set(x, "stepKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
