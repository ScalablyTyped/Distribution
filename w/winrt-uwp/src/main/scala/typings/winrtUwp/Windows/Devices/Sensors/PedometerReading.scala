package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a pedometer reading. */
trait PedometerReading extends StObject {
  
  /** Gets the total number of steps taken for this pedometer reading. */
  var cumulativeSteps: Double
  
  /** Gets the amount of time that has elapsed for this pedometer reading. */
  var cumulativeStepsDuration: Double
  
  /** Indicates the type of steps taken for this pedometer reading. */
  var stepKind: PedometerStepKind
  
  /** Gets the time for the most recent pedometer reading. */
  var timestamp: js.Date
}
object PedometerReading {
  
  inline def apply(
    cumulativeSteps: Double,
    cumulativeStepsDuration: Double,
    stepKind: PedometerStepKind,
    timestamp: js.Date
  ): PedometerReading = {
    val __obj = js.Dynamic.literal(cumulativeSteps = cumulativeSteps.asInstanceOf[js.Any], cumulativeStepsDuration = cumulativeStepsDuration.asInstanceOf[js.Any], stepKind = stepKind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PedometerReading]
  }
  
  extension [Self <: PedometerReading](x: Self) {
    
    inline def setCumulativeSteps(value: Double): Self = StObject.set(x, "cumulativeSteps", value.asInstanceOf[js.Any])
    
    inline def setCumulativeStepsDuration(value: Double): Self = StObject.set(x, "cumulativeStepsDuration", value.asInstanceOf[js.Any])
    
    inline def setStepKind(value: PedometerStepKind): Self = StObject.set(x, "stepKind", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
