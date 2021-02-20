package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the pedometer reading–changed event. */
@js.native
trait PedometerReadingChangedEventArgs extends StObject {
  
  /** Gets the most recent pedometer reading. */
  var reading: PedometerReading = js.native
}
object PedometerReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: PedometerReading): PedometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PedometerReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit class PedometerReadingChangedEventArgsMutableBuilder[Self <: PedometerReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReading(value: PedometerReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
