package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an altimeter reading. */
@js.native
trait AltimeterReading extends StObject {
  
  /** Gets the current altitude determined by the altimeter sensor. */
  var altitudeChangeInMeters: Double = js.native
  
  /** Gets the time for the most recent altimeter reading. */
  var timestamp: Date = js.native
}
object AltimeterReading {
  
  @scala.inline
  def apply(altitudeChangeInMeters: Double, timestamp: Date): AltimeterReading = {
    val __obj = js.Dynamic.literal(altitudeChangeInMeters = altitudeChangeInMeters.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AltimeterReading]
  }
  
  @scala.inline
  implicit class AltimeterReadingMutableBuilder[Self <: AltimeterReading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitudeChangeInMeters(value: Double): Self = StObject.set(x, "altitudeChangeInMeters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
