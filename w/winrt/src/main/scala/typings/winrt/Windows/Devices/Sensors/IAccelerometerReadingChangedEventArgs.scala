package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccelerometerReadingChangedEventArgs extends StObject {
  
  var reading: AccelerometerReading
}
object IAccelerometerReadingChangedEventArgs {
  
  inline def apply(reading: AccelerometerReading): IAccelerometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccelerometerReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAccelerometerReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setReading(value: AccelerometerReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
