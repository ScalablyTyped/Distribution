package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an inclinometer reading. */
trait InclinometerReading extends StObject {
  
  /** Gets the rotation in degrees around the x-axis. */
  var pitchDegrees: Double
  
  /** Gets the rotation in degrees around the y-axis. */
  var rollDegrees: Double
  
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: js.Date
  
  /** Gets the inclinometer's z-axis accuracy. */
  var yawAccuracy: MagnetometerAccuracy
  
  /** Gets the rotation in degrees around the z-axis. */
  var yawDegrees: Double
}
object InclinometerReading {
  
  inline def apply(
    pitchDegrees: Double,
    rollDegrees: Double,
    timestamp: js.Date,
    yawAccuracy: MagnetometerAccuracy,
    yawDegrees: Double
  ): InclinometerReading = {
    val __obj = js.Dynamic.literal(pitchDegrees = pitchDegrees.asInstanceOf[js.Any], rollDegrees = rollDegrees.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], yawAccuracy = yawAccuracy.asInstanceOf[js.Any], yawDegrees = yawDegrees.asInstanceOf[js.Any])
    __obj.asInstanceOf[InclinometerReading]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InclinometerReading] (val x: Self) extends AnyVal {
    
    inline def setPitchDegrees(value: Double): Self = StObject.set(x, "pitchDegrees", value.asInstanceOf[js.Any])
    
    inline def setRollDegrees(value: Double): Self = StObject.set(x, "rollDegrees", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setYawAccuracy(value: MagnetometerAccuracy): Self = StObject.set(x, "yawAccuracy", value.asInstanceOf[js.Any])
    
    inline def setYawDegrees(value: Double): Self = StObject.set(x, "yawDegrees", value.asInstanceOf[js.Any])
  }
}
