package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a barometer reading. */
trait BarometerReading extends StObject {
  
  /** Gets the barometric pressure determined by the barometer sensor. */
  var stationPressureInHectopascals: Double
  
  /** Gets the time for the most recent barometer reading. */
  var timestamp: js.Date
}
object BarometerReading {
  
  inline def apply(stationPressureInHectopascals: Double, timestamp: js.Date): BarometerReading = {
    val __obj = js.Dynamic.literal(stationPressureInHectopascals = stationPressureInHectopascals.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarometerReading]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarometerReading] (val x: Self) extends AnyVal {
    
    inline def setStationPressureInHectopascals(value: Double): Self = StObject.set(x, "stationPressureInHectopascals", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
