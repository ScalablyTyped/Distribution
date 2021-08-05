package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOrientationSensorReading extends StObject {
  
  var quaternion: SensorQuaternion
  
  var rotationMatrix: SensorRotationMatrix
  
  var timestamp: Date
}
object IOrientationSensorReading {
  
  inline def apply(quaternion: SensorQuaternion, rotationMatrix: SensorRotationMatrix, timestamp: Date): IOrientationSensorReading = {
    val __obj = js.Dynamic.literal(quaternion = quaternion.asInstanceOf[js.Any], rotationMatrix = rotationMatrix.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrientationSensorReading]
  }
  
  extension [Self <: IOrientationSensorReading](x: Self) {
    
    inline def setQuaternion(value: SensorQuaternion): Self = StObject.set(x, "quaternion", value.asInstanceOf[js.Any])
    
    inline def setRotationMatrix(value: SensorRotationMatrix): Self = StObject.set(x, "rotationMatrix", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
