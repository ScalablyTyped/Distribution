package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an accelerometer reading. */
trait AccelerometerReading extends StObject {
  
  /** Gets the g-force acceleration along the x-axis. */
  var accelerationX: Double
  
  /** Gets the g-force acceleration along the y-axis. */
  var accelerationY: Double
  
  /** Gets the g-force acceleration along the z-axis. */
  var accelerationZ: Double
  
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: js.Date
}
object AccelerometerReading {
  
  inline def apply(accelerationX: Double, accelerationY: Double, accelerationZ: Double, timestamp: js.Date): AccelerometerReading = {
    val __obj = js.Dynamic.literal(accelerationX = accelerationX.asInstanceOf[js.Any], accelerationY = accelerationY.asInstanceOf[js.Any], accelerationZ = accelerationZ.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerReading]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccelerometerReading] (val x: Self) extends AnyVal {
    
    inline def setAccelerationX(value: Double): Self = StObject.set(x, "accelerationX", value.asInstanceOf[js.Any])
    
    inline def setAccelerationY(value: Double): Self = StObject.set(x, "accelerationY", value.asInstanceOf[js.Any])
    
    inline def setAccelerationZ(value: Double): Self = StObject.set(x, "accelerationZ", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
