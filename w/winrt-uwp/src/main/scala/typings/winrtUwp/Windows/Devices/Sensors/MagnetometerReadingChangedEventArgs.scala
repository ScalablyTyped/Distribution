package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the magnetometer reading–changed event. */
@js.native
trait MagnetometerReadingChangedEventArgs extends StObject {
  
  /** Gets the current magnetometer reading. */
  var reading: MagnetometerReading = js.native
}
object MagnetometerReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: MagnetometerReading): MagnetometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagnetometerReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit class MagnetometerReadingChangedEventArgsMutableBuilder[Self <: MagnetometerReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReading(value: MagnetometerReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
