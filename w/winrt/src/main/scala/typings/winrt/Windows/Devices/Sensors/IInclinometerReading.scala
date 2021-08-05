package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInclinometerReading extends StObject {
  
  var pitchDegrees: Double
  
  var rollDegrees: Double
  
  var timestamp: Date
  
  var yawDegrees: Double
}
object IInclinometerReading {
  
  inline def apply(pitchDegrees: Double, rollDegrees: Double, timestamp: Date, yawDegrees: Double): IInclinometerReading = {
    val __obj = js.Dynamic.literal(pitchDegrees = pitchDegrees.asInstanceOf[js.Any], rollDegrees = rollDegrees.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], yawDegrees = yawDegrees.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInclinometerReading]
  }
  
  extension [Self <: IInclinometerReading](x: Self) {
    
    inline def setPitchDegrees(value: Double): Self = StObject.set(x, "pitchDegrees", value.asInstanceOf[js.Any])
    
    inline def setRollDegrees(value: Double): Self = StObject.set(x, "rollDegrees", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setYawDegrees(value: Double): Self = StObject.set(x, "yawDegrees", value.asInstanceOf[js.Any])
  }
}
