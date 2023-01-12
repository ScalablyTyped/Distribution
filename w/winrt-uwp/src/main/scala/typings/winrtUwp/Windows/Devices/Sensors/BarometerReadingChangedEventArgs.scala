package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the barometer reading–changed event. */
trait BarometerReadingChangedEventArgs extends StObject {
  
  /** Gets the most recent barometer reading. */
  var reading: BarometerReading
}
object BarometerReadingChangedEventArgs {
  
  inline def apply(reading: BarometerReading): BarometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarometerReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarometerReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setReading(value: BarometerReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
