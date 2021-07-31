package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrientationSensorReading
  extends StObject
     with IOrientationSensorReading
object OrientationSensorReading {
  
  @scala.inline
  def apply(quaternion: SensorQuaternion, rotationMatrix: SensorRotationMatrix, timestamp: Date): OrientationSensorReading = {
    val __obj = js.Dynamic.literal(quaternion = quaternion.asInstanceOf[js.Any], rotationMatrix = rotationMatrix.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrientationSensorReading]
  }
}
