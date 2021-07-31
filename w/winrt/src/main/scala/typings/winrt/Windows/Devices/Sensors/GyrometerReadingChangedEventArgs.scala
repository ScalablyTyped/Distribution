package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GyrometerReadingChangedEventArgs
  extends StObject
     with IGyrometerReadingChangedEventArgs
object GyrometerReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: GyrometerReading): GyrometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[GyrometerReadingChangedEventArgs]
  }
}
