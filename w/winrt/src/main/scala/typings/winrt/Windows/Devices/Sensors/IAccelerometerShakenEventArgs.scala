package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccelerometerShakenEventArgs extends StObject {
  
  var timestamp: Date
}
object IAccelerometerShakenEventArgs {
  
  inline def apply(timestamp: Date): IAccelerometerShakenEventArgs = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccelerometerShakenEventArgs]
  }
  
  extension [Self <: IAccelerometerShakenEventArgs](x: Self) {
    
    inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
