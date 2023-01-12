package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGyrometerReadingChangedEventArgs extends StObject {
  
  var reading: GyrometerReading
}
object IGyrometerReadingChangedEventArgs {
  
  inline def apply(reading: GyrometerReading): IGyrometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGyrometerReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGyrometerReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setReading(value: GyrometerReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
