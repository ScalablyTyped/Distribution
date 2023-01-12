package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the pedometer reading–changed event. */
trait PedometerReadingChangedEventArgs extends StObject {
  
  /** Gets the most recent pedometer reading. */
  var reading: PedometerReading
}
object PedometerReadingChangedEventArgs {
  
  inline def apply(reading: PedometerReading): PedometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PedometerReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PedometerReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setReading(value: PedometerReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
