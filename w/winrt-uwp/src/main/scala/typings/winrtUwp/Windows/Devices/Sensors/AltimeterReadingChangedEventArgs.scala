package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the altimeter reading–changed event. */
trait AltimeterReadingChangedEventArgs extends StObject {
  
  /** Gets the most recent barometer reading. */
  var reading: AltimeterReading
}
object AltimeterReadingChangedEventArgs {
  
  inline def apply(reading: AltimeterReading): AltimeterReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[AltimeterReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AltimeterReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setReading(value: AltimeterReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
