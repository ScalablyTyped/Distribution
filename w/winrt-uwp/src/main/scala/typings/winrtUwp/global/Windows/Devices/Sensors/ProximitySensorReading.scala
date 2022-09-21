package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a reading from the proximity sensor. */
@JSGlobal("Windows.Devices.Sensors.ProximitySensorReading")
@js.native
abstract class ProximitySensorReading ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.ProximitySensorReading {
  
  /** Gets the distance from the proximity sensor to the detected object. */
  /* CompleteClass */
  var distanceInMillimeters: Double = js.native
  
  /** Gets whether or not an object is detected by the proximity sensor. */
  /* CompleteClass */
  var isDetected: Boolean = js.native
  
  /** Gets the time for the most recent proximity sensor reading. */
  /* CompleteClass */
  var timestamp: js.Date = js.native
}
