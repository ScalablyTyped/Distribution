package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InclinometerReadingChangedEventArgs
  extends StObject
     with IInclinometerReadingChangedEventArgs
object InclinometerReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: InclinometerReading): InclinometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[InclinometerReadingChangedEventArgs]
  }
}
