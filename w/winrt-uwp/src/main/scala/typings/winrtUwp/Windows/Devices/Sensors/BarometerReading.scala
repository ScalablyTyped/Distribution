package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a barometer reading. */
@js.native
trait BarometerReading extends StObject {
  
  /** Gets the barometric pressure determined by the barometer sensor. */
  var stationPressureInHectopascals: Double = js.native
  
  /** Gets the time for the most recent barometer reading. */
  var timestamp: Date = js.native
}
object BarometerReading {
  
  @scala.inline
  def apply(stationPressureInHectopascals: Double, timestamp: Date): BarometerReading = {
    val __obj = js.Dynamic.literal(stationPressureInHectopascals = stationPressureInHectopascals.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarometerReading]
  }
  
  @scala.inline
  implicit class BarometerReadingMutableBuilder[Self <: BarometerReading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStationPressureInHectopascals(value: Double): Self = StObject.set(x, "stationPressureInHectopascals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
