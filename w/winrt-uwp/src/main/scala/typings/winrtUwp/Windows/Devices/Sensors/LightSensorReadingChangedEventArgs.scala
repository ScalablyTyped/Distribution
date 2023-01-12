package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the ambient-light sensor reading-changed event. */
trait LightSensorReadingChangedEventArgs extends StObject {
  
  /** Gets the current ambient light-sensor reading. */
  var reading: LightSensorReading
}
object LightSensorReadingChangedEventArgs {
  
  inline def apply(reading: LightSensorReading): LightSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightSensorReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LightSensorReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setReading(value: LightSensorReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
