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
  
  extension [Self <: IAccelerometerReadingChangedEventArgs](x: Self) {
    
    inline def setReading(value: AccelerometerReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
