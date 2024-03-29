package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILightSensorReadingChangedEventArgs extends StObject {
  
  var reading: LightSensorReading
}
object ILightSensorReadingChangedEventArgs {
  
  inline def apply(reading: LightSensorReading): ILightSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILightSensorReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILightSensorReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setReading(value: LightSensorReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
