package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the accelerometer-shaken event. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.AccelerometerShakenEventArgs")
@js.native
open class AccelerometerShakenEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.AccelerometerShakenEventArgs {
  
  /** Gets the time at which the sensor reported the shaken event. */
  /* CompleteClass */
  var timestamp: js.Date = js.native
}
