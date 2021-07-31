package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompassReading extends StObject {
  
  var headingMagneticNorth: Double
  
  var headingTrueNorth: Double
  
  var timestamp: Date
}
object ICompassReading {
  
  @scala.inline
  def apply(headingMagneticNorth: Double, headingTrueNorth: Double, timestamp: Date): ICompassReading = {
    val __obj = js.Dynamic.literal(headingMagneticNorth = headingMagneticNorth.asInstanceOf[js.Any], headingTrueNorth = headingTrueNorth.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompassReading]
  }
  
  @scala.inline
  implicit class ICompassReadingMutableBuilder[Self <: ICompassReading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeadingMagneticNorth(value: Double): Self = StObject.set(x, "headingMagneticNorth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingTrueNorth(value: Double): Self = StObject.set(x, "headingTrueNorth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
