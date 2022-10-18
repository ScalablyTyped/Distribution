package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the sensor reading–changed event. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.SimpleOrientationSensorOrientationChangedEventArgs")
@js.native
open class SimpleOrientationSensorOrientationChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.SimpleOrientationSensorOrientationChangedEventArgs {
  
  /** Gets the current sensor orientation. */
  /* CompleteClass */
  var orientation: typings.winrtUwp.Windows.Devices.Sensors.SimpleOrientation = js.native
  
  /** Gets the time of the current sensor reading. */
  /* CompleteClass */
  var timestamp: js.Date = js.native
}
