package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an orientation-sensor reading. */
@js.native
trait OrientationSensorReading extends StObject {
  
  /** Gets the Quaternion for the current orientation-sensor reading. */
  var quaternion: SensorQuaternion = js.native
  
  /** Gets the rotation matrix for the current orientation-sensor reading. */
  var rotationMatrix: SensorRotationMatrix = js.native
  
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date = js.native
  
  /** Gets the orientation sensor's z-axis accuracy. */
  var yawAccuracy: MagnetometerAccuracy = js.native
}
object OrientationSensorReading {
  
  @scala.inline
  def apply(
    quaternion: SensorQuaternion,
    rotationMatrix: SensorRotationMatrix,
    timestamp: Date,
    yawAccuracy: MagnetometerAccuracy
  ): OrientationSensorReading = {
    val __obj = js.Dynamic.literal(quaternion = quaternion.asInstanceOf[js.Any], rotationMatrix = rotationMatrix.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], yawAccuracy = yawAccuracy.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrientationSensorReading]
  }
  
  @scala.inline
  implicit class OrientationSensorReadingMutableBuilder[Self <: OrientationSensorReading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuaternion(value: SensorQuaternion): Self = StObject.set(x, "quaternion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationMatrix(value: SensorRotationMatrix): Self = StObject.set(x, "rotationMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYawAccuracy(value: MagnetometerAccuracy): Self = StObject.set(x, "yawAccuracy", value.asInstanceOf[js.Any])
  }
}
