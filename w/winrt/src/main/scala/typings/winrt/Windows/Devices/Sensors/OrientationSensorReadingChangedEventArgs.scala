package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrientationSensorReadingChangedEventArgs
  extends StObject
     with IOrientationSensorReadingChangedEventArgs
object OrientationSensorReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: OrientationSensorReading): OrientationSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrientationSensorReadingChangedEventArgs]
  }
}
