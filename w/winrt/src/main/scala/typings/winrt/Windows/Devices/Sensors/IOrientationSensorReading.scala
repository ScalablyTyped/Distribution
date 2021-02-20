package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOrientationSensorReading extends StObject {
  
  var quaternion: SensorQuaternion = js.native
  
  var rotationMatrix: SensorRotationMatrix = js.native
  
  var timestamp: Date = js.native
}
object IOrientationSensorReading {
  
  @scala.inline
  def apply(quaternion: SensorQuaternion, rotationMatrix: SensorRotationMatrix, timestamp: Date): IOrientationSensorReading = {
    val __obj = js.Dynamic.literal(quaternion = quaternion.asInstanceOf[js.Any], rotationMatrix = rotationMatrix.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrientationSensorReading]
  }
  
  @scala.inline
  implicit class IOrientationSensorReadingMutableBuilder[Self <: IOrientationSensorReading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuaternion(value: SensorQuaternion): Self = StObject.set(x, "quaternion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationMatrix(value: SensorRotationMatrix): Self = StObject.set(x, "rotationMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
