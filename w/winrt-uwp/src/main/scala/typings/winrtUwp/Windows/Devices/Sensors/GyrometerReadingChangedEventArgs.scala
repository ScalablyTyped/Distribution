package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the gyrometer reading–changed event. */
@js.native
trait GyrometerReadingChangedEventArgs extends StObject {
  
  /** Gets the current gyrometer reading. */
  var reading: GyrometerReading = js.native
}
object GyrometerReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: GyrometerReading): GyrometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[GyrometerReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit class GyrometerReadingChangedEventArgsMutableBuilder[Self <: GyrometerReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReading(value: GyrometerReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
