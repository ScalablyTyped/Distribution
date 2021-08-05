package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the inclinometer reading–changed event. */
trait InclinometerReadingChangedEventArgs extends StObject {
  
  /** Gets the current inclinometer reading. */
  var reading: InclinometerReading
}
object InclinometerReadingChangedEventArgs {
  
  inline def apply(reading: InclinometerReading): InclinometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[InclinometerReadingChangedEventArgs]
  }
  
  extension [Self <: InclinometerReadingChangedEventArgs](x: Self) {
    
    inline def setReading(value: InclinometerReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
