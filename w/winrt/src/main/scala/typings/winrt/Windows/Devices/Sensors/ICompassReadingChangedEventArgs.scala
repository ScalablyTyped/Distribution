package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompassReadingChangedEventArgs extends StObject {
  
  var reading: CompassReading
}
object ICompassReadingChangedEventArgs {
  
  inline def apply(reading: CompassReading): ICompassReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompassReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICompassReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setReading(value: CompassReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
