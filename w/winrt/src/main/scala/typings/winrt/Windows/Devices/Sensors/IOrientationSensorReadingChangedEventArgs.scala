package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOrientationSensorReadingChangedEventArgs extends StObject {
  
  var reading: OrientationSensorReading
}
object IOrientationSensorReadingChangedEventArgs {
  
  inline def apply(reading: OrientationSensorReading): IOrientationSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrientationSensorReadingChangedEventArgs]
  }
  
  extension [Self <: IOrientationSensorReadingChangedEventArgs](x: Self) {
    
    inline def setReading(value: OrientationSensorReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
