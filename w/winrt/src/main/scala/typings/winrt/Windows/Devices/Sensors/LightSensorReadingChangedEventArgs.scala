package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightSensorReadingChangedEventArgs extends ILightSensorReadingChangedEventArgs
object LightSensorReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: LightSensorReading): LightSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightSensorReadingChangedEventArgs]
  }
}
