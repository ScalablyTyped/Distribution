package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a gyrometer reading. */
trait GyrometerReading extends StObject {
  
  /** Gets the angular velocity, in degrees per second, about the x-axis. */
  var angularVelocityX: Double
  
  /** Gets the angular velocity, in degrees per second, about the y-axis. */
  var angularVelocityY: Double
  
  /** Gets the angular velocity, in degrees per second, about the z-axis. */
  var angularVelocityZ: Double
  
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: js.Date
}
object GyrometerReading {
  
  inline def apply(angularVelocityX: Double, angularVelocityY: Double, angularVelocityZ: Double, timestamp: js.Date): GyrometerReading = {
    val __obj = js.Dynamic.literal(angularVelocityX = angularVelocityX.asInstanceOf[js.Any], angularVelocityY = angularVelocityY.asInstanceOf[js.Any], angularVelocityZ = angularVelocityZ.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GyrometerReading]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GyrometerReading] (val x: Self) extends AnyVal {
    
    inline def setAngularVelocityX(value: Double): Self = StObject.set(x, "angularVelocityX", value.asInstanceOf[js.Any])
    
    inline def setAngularVelocityY(value: Double): Self = StObject.set(x, "angularVelocityY", value.asInstanceOf[js.Any])
    
    inline def setAngularVelocityZ(value: Double): Self = StObject.set(x, "angularVelocityZ", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
