package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGyrometerReadingChangedEventArgs extends StObject {
  
  var reading: GyrometerReading = js.native
}
object IGyrometerReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: GyrometerReading): IGyrometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGyrometerReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit class IGyrometerReadingChangedEventArgsMutableBuilder[Self <: IGyrometerReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReading(value: GyrometerReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
