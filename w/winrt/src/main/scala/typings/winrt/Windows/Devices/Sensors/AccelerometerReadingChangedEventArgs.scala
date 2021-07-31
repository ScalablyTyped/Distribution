package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccelerometerReadingChangedEventArgs
  extends StObject
     with IAccelerometerReadingChangedEventArgs
object AccelerometerReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: AccelerometerReading): AccelerometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerReadingChangedEventArgs]
  }
}
