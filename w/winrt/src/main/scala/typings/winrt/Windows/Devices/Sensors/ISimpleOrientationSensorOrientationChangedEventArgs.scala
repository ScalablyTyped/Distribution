package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISimpleOrientationSensorOrientationChangedEventArgs extends StObject {
  
  var orientation: SimpleOrientation
  
  var timestamp: Date
}
object ISimpleOrientationSensorOrientationChangedEventArgs {
  
  inline def apply(orientation: SimpleOrientation, timestamp: Date): ISimpleOrientationSensorOrientationChangedEventArgs = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimpleOrientationSensorOrientationChangedEventArgs]
  }
  
  extension [Self <: ISimpleOrientationSensorOrientationChangedEventArgs](x: Self) {
    
    inline def setOrientation(value: SimpleOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
