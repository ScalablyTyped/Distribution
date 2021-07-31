package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInclinometerReadingChangedEventArgs extends StObject {
  
  var reading: InclinometerReading
}
object IInclinometerReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: InclinometerReading): IInclinometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInclinometerReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit class IInclinometerReadingChangedEventArgsMutableBuilder[Self <: IInclinometerReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReading(value: InclinometerReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
