package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents data for the reading–changed event of the sensor. */
@JSGlobal("Windows.Devices.Sensors.ActivitySensorReadingChangedEventArgs")
@js.native
abstract class ActivitySensorReadingChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.ActivitySensorReadingChangedEventArgs {
  
  /** Gets the most recent sensor reading. */
  /* CompleteClass */
  var reading: typings.winrtUwp.Windows.Devices.Sensors.ActivitySensorReading = js.native
}
