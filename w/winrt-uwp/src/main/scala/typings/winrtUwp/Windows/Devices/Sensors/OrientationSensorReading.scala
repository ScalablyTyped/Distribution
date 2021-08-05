package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an orientation-sensor reading. */
trait OrientationSensorReading extends StObject {
  
  /** Gets the Quaternion for the current orientation-sensor reading. */
  var quaternion: SensorQuaternion
  
  /** Gets the rotation matrix for the current orientation-sensor reading. */
  var rotationMatrix: SensorRotationMatrix
  
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date
  
  /** Gets the orientation sensor's z-axis accuracy. */
  var yawAccuracy: MagnetometerAccuracy
}
object OrientationSensorReading {
  
  inline def apply(
    quaternion: SensorQuaternion,
    rotationMatrix: SensorRotationMatrix,
    timestamp: Date,
    yawAccuracy: MagnetometerAccuracy
  ): OrientationSensorReading = {
    val __obj = js.Dynamic.literal(quaternion = quaternion.asInstanceOf[js.Any], rotationMatrix = rotationMatrix.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], yawAccuracy = yawAccuracy.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrientationSensorReading]
  }
  
  extension [Self <: OrientationSensorReading](x: Self) {
    
    inline def setQuaternion(value: SensorQuaternion): Self = StObject.set(x, "quaternion", value.asInstanceOf[js.Any])
    
    inline def setRotationMatrix(value: SensorRotationMatrix): Self = StObject.set(x, "rotationMatrix", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setYawAccuracy(value: MagnetometerAccuracy): Self = StObject.set(x, "yawAccuracy", value.asInstanceOf[js.Any])
  }
}
