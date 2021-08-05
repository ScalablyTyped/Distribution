package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the compass reading–changed event. */
trait CompassReadingChangedEventArgs extends StObject {
  
  /** Gets the current compass reading. */
  var reading: CompassReading
}
object CompassReadingChangedEventArgs {
  
  inline def apply(reading: CompassReading): CompassReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassReadingChangedEventArgs]
  }
  
  extension [Self <: CompassReadingChangedEventArgs](x: Self) {
    
    inline def setReading(value: CompassReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
