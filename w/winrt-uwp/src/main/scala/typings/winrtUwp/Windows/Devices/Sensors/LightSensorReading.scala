package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ambient light–sensor reading. */
trait LightSensorReading extends StObject {
  
  /** Gets the illuminance level in lux. */
  var illuminanceInLux: Double
  
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: js.Date
}
object LightSensorReading {
  
  inline def apply(illuminanceInLux: Double, timestamp: js.Date): LightSensorReading = {
    val __obj = js.Dynamic.literal(illuminanceInLux = illuminanceInLux.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightSensorReading]
  }
  
  extension [Self <: LightSensorReading](x: Self) {
    
    inline def setIlluminanceInLux(value: Double): Self = StObject.set(x, "illuminanceInLux", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
