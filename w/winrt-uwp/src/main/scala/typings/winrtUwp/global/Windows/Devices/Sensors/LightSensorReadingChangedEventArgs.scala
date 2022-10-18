package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the ambient-light sensor reading-changed event. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.LightSensorReadingChangedEventArgs")
@js.native
open class LightSensorReadingChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.LightSensorReadingChangedEventArgs {
  
  /** Gets the current ambient light-sensor reading. */
  /* CompleteClass */
  var reading: typings.winrtUwp.Windows.Devices.Sensors.LightSensorReading = js.native
}
