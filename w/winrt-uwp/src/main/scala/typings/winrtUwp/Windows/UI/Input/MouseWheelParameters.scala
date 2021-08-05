package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties associated with the button wheel of a mouse device. */
trait MouseWheelParameters extends StObject {
  
  /** Gets or sets the device-independent pixel (DIP) conversion factors for both character width and line height units (as set in the Wheel settings of the Mouse control panel). */
  var charTranslation: Point
  
  /** Gets or sets a value that indicates the change in the angle of rotation associated with input from the wheel button of a mouse. */
  var deltaRotationAngle: Double
  
  /** Gets or sets a value that indicates the change in scale associated with input from the wheel button of a mouse. */
  var deltaScale: Double
  
  /** Gets or sets the device-independent pixel (DIP) conversion factors for both page width and height units (as set in the Wheel settings of the Mouse control panel). */
  var pageTranslation: Point
}
object MouseWheelParameters {
  
  inline def apply(charTranslation: Point, deltaRotationAngle: Double, deltaScale: Double, pageTranslation: Point): MouseWheelParameters = {
    val __obj = js.Dynamic.literal(charTranslation = charTranslation.asInstanceOf[js.Any], deltaRotationAngle = deltaRotationAngle.asInstanceOf[js.Any], deltaScale = deltaScale.asInstanceOf[js.Any], pageTranslation = pageTranslation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseWheelParameters]
  }
  
  extension [Self <: MouseWheelParameters](x: Self) {
    
    inline def setCharTranslation(value: Point): Self = StObject.set(x, "charTranslation", value.asInstanceOf[js.Any])
    
    inline def setDeltaRotationAngle(value: Double): Self = StObject.set(x, "deltaRotationAngle", value.asInstanceOf[js.Any])
    
    inline def setDeltaScale(value: Double): Self = StObject.set(x, "deltaScale", value.asInstanceOf[js.Any])
    
    inline def setPageTranslation(value: Point): Self = StObject.set(x, "pageTranslation", value.asInstanceOf[js.Any])
  }
}
