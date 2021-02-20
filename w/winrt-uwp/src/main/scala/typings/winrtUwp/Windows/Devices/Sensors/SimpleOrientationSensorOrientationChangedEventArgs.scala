package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the sensor reading–changed event. */
@js.native
trait SimpleOrientationSensorOrientationChangedEventArgs extends StObject {
  
  /** Gets the current sensor orientation. */
  var orientation: SimpleOrientation = js.native
  
  /** Gets the time of the current sensor reading. */
  var timestamp: Date = js.native
}
object SimpleOrientationSensorOrientationChangedEventArgs {
  
  @scala.inline
  def apply(orientation: SimpleOrientation, timestamp: Date): SimpleOrientationSensorOrientationChangedEventArgs = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleOrientationSensorOrientationChangedEventArgs]
  }
  
  @scala.inline
  implicit class SimpleOrientationSensorOrientationChangedEventArgsMutableBuilder[Self <: SimpleOrientationSensorOrientationChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrientation(value: SimpleOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
