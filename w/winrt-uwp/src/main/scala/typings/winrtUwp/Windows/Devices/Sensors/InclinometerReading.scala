package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an inclinometer reading. */
@js.native
trait InclinometerReading extends StObject {
  
  /** Gets the rotation in degrees around the x-axis. */
  var pitchDegrees: Double = js.native
  
  /** Gets the rotation in degrees around the y-axis. */
  var rollDegrees: Double = js.native
  
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date = js.native
  
  /** Gets the inclinometer's z-axis accuracy. */
  var yawAccuracy: MagnetometerAccuracy = js.native
  
  /** Gets the rotation in degrees around the z-axis. */
  var yawDegrees: Double = js.native
}
object InclinometerReading {
  
  @scala.inline
  def apply(
    pitchDegrees: Double,
    rollDegrees: Double,
    timestamp: Date,
    yawAccuracy: MagnetometerAccuracy,
    yawDegrees: Double
  ): InclinometerReading = {
    val __obj = js.Dynamic.literal(pitchDegrees = pitchDegrees.asInstanceOf[js.Any], rollDegrees = rollDegrees.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], yawAccuracy = yawAccuracy.asInstanceOf[js.Any], yawDegrees = yawDegrees.asInstanceOf[js.Any])
    __obj.asInstanceOf[InclinometerReading]
  }
  
  @scala.inline
  implicit class InclinometerReadingMutableBuilder[Self <: InclinometerReading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPitchDegrees(value: Double): Self = StObject.set(x, "pitchDegrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollDegrees(value: Double): Self = StObject.set(x, "rollDegrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYawAccuracy(value: MagnetometerAccuracy): Self = StObject.set(x, "yawAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYawDegrees(value: Double): Self = StObject.set(x, "yawDegrees", value.asInstanceOf[js.Any])
  }
}
