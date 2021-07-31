package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the pedometer reading–changed event. */
@JSGlobal("Windows.Devices.Sensors.PedometerReadingChangedEventArgs")
@js.native
abstract class PedometerReadingChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.PedometerReadingChangedEventArgs {
  
  /** Gets the most recent pedometer reading. */
  /* CompleteClass */
  var reading: typings.winrtUwp.Windows.Devices.Sensors.PedometerReading = js.native
}
