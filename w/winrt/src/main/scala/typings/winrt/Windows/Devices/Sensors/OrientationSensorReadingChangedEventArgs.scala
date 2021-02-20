package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrientationSensorReadingChangedEventArgs extends IOrientationSensorReadingChangedEventArgs
object OrientationSensorReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: OrientationSensorReading): OrientationSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrientationSensorReadingChangedEventArgs]
  }
}
