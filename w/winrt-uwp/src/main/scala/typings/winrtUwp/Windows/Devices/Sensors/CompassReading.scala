package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a compass reading. */
trait CompassReading extends StObject {
  
  /** Gets the compass's heading accuracy. */
  var headingAccuracy: MagnetometerAccuracy
  
  /** Gets the heading in degrees relative to magnetic-north. */
  var headingMagneticNorth: Double
  
  /** Gets the heading in degrees relative to geographic true-north. */
  var headingTrueNorth: Double
  
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: js.Date
}
object CompassReading {
  
  inline def apply(
    headingAccuracy: MagnetometerAccuracy,
    headingMagneticNorth: Double,
    headingTrueNorth: Double,
    timestamp: js.Date
  ): CompassReading = {
    val __obj = js.Dynamic.literal(headingAccuracy = headingAccuracy.asInstanceOf[js.Any], headingMagneticNorth = headingMagneticNorth.asInstanceOf[js.Any], headingTrueNorth = headingTrueNorth.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassReading]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompassReading] (val x: Self) extends AnyVal {
    
    inline def setHeadingAccuracy(value: MagnetometerAccuracy): Self = StObject.set(x, "headingAccuracy", value.asInstanceOf[js.Any])
    
    inline def setHeadingMagneticNorth(value: Double): Self = StObject.set(x, "headingMagneticNorth", value.asInstanceOf[js.Any])
    
    inline def setHeadingTrueNorth(value: Double): Self = StObject.set(x, "headingTrueNorth", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
