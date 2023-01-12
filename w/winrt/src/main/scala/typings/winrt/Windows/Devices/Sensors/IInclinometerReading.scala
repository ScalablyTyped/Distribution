package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInclinometerReading extends StObject {
  
  var pitchDegrees: Double
  
  var rollDegrees: Double
  
  var timestamp: js.Date
  
  var yawDegrees: Double
}
object IInclinometerReading {
  
  inline def apply(pitchDegrees: Double, rollDegrees: Double, timestamp: js.Date, yawDegrees: Double): IInclinometerReading = {
    val __obj = js.Dynamic.literal(pitchDegrees = pitchDegrees.asInstanceOf[js.Any], rollDegrees = rollDegrees.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], yawDegrees = yawDegrees.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInclinometerReading]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IInclinometerReading] (val x: Self) extends AnyVal {
    
    inline def setPitchDegrees(value: Double): Self = StObject.set(x, "pitchDegrees", value.asInstanceOf[js.Any])
    
    inline def setRollDegrees(value: Double): Self = StObject.set(x, "rollDegrees", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setYawDegrees(value: Double): Self = StObject.set(x, "yawDegrees", value.asInstanceOf[js.Any])
  }
}
