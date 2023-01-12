package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the reading–changed event of the proximity sensor. */
trait ProximitySensorReadingChangedEventArgs extends StObject {
  
  /** Gets or sets the most recent proximity sensor reading. */
  var reading: ProximitySensorReading
}
object ProximitySensorReadingChangedEventArgs {
  
  inline def apply(reading: ProximitySensorReading): ProximitySensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximitySensorReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProximitySensorReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setReading(value: ProximitySensorReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
