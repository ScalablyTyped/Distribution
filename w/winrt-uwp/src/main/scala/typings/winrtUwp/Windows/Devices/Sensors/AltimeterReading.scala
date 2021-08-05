package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an altimeter reading. */
trait AltimeterReading extends StObject {
  
  /** Gets the current altitude determined by the altimeter sensor. */
  var altitudeChangeInMeters: Double
  
  /** Gets the time for the most recent altimeter reading. */
  var timestamp: Date
}
object AltimeterReading {
  
  inline def apply(altitudeChangeInMeters: Double, timestamp: Date): AltimeterReading = {
    val __obj = js.Dynamic.literal(altitudeChangeInMeters = altitudeChangeInMeters.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AltimeterReading]
  }
  
  extension [Self <: AltimeterReading](x: Self) {
    
    inline def setAltitudeChangeInMeters(value: Double): Self = StObject.set(x, "altitudeChangeInMeters", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
