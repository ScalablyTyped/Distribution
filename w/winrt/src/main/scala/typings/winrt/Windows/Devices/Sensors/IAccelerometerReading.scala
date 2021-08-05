package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccelerometerReading extends StObject {
  
  var accelerationX: Double
  
  var accelerationY: Double
  
  var accelerationZ: Double
  
  var timestamp: Date
}
object IAccelerometerReading {
  
  inline def apply(accelerationX: Double, accelerationY: Double, accelerationZ: Double, timestamp: Date): IAccelerometerReading = {
    val __obj = js.Dynamic.literal(accelerationX = accelerationX.asInstanceOf[js.Any], accelerationY = accelerationY.asInstanceOf[js.Any], accelerationZ = accelerationZ.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccelerometerReading]
  }
  
  extension [Self <: IAccelerometerReading](x: Self) {
    
    inline def setAccelerationX(value: Double): Self = StObject.set(x, "accelerationX", value.asInstanceOf[js.Any])
    
    inline def setAccelerationY(value: Double): Self = StObject.set(x, "accelerationY", value.asInstanceOf[js.Any])
    
    inline def setAccelerationZ(value: Double): Self = StObject.set(x, "accelerationZ", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
