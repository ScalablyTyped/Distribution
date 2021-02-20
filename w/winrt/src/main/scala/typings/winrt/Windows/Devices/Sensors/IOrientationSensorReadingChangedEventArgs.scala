package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOrientationSensorReadingChangedEventArgs extends StObject {
  
  var reading: OrientationSensorReading = js.native
}
object IOrientationSensorReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: OrientationSensorReading): IOrientationSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrientationSensorReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit class IOrientationSensorReadingChangedEventArgsMutableBuilder[Self <: IOrientationSensorReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReading(value: OrientationSensorReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
