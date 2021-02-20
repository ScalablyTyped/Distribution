package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a compass reading. */
@js.native
trait CompassReading extends StObject {
  
  /** Gets the compass's heading accuracy. */
  var headingAccuracy: MagnetometerAccuracy = js.native
  
  /** Gets the heading in degrees relative to magnetic-north. */
  var headingMagneticNorth: Double = js.native
  
  /** Gets the heading in degrees relative to geographic true-north. */
  var headingTrueNorth: Double = js.native
  
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date = js.native
}
object CompassReading {
  
  @scala.inline
  def apply(
    headingAccuracy: MagnetometerAccuracy,
    headingMagneticNorth: Double,
    headingTrueNorth: Double,
    timestamp: Date
  ): CompassReading = {
    val __obj = js.Dynamic.literal(headingAccuracy = headingAccuracy.asInstanceOf[js.Any], headingMagneticNorth = headingMagneticNorth.asInstanceOf[js.Any], headingTrueNorth = headingTrueNorth.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassReading]
  }
  
  @scala.inline
  implicit class CompassReadingMutableBuilder[Self <: CompassReading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeadingAccuracy(value: MagnetometerAccuracy): Self = StObject.set(x, "headingAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingMagneticNorth(value: Double): Self = StObject.set(x, "headingMagneticNorth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingTrueNorth(value: Double): Self = StObject.set(x, "headingTrueNorth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
