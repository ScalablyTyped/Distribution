package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a pedometer reading. */
@JSGlobal("Windows.Devices.Sensors.PedometerReading")
@js.native
abstract class PedometerReading ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.PedometerReading {
  
  /** Gets the total number of steps taken for this pedometer reading. */
  /* CompleteClass */
  var cumulativeSteps: Double = js.native
  
  /** Gets the amount of time that has elapsed for this pedometer reading. */
  /* CompleteClass */
  var cumulativeStepsDuration: Double = js.native
  
  /** Indicates the type of steps taken for this pedometer reading. */
  /* CompleteClass */
  var stepKind: typings.winrtUwp.Windows.Devices.Sensors.PedometerStepKind = js.native
  
  /** Gets the time for the most recent pedometer reading. */
  /* CompleteClass */
  var timestamp: Date = js.native
}
