package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseWheelParameters extends StObject {
  
  var charTranslation: Point
  
  var deltaRotationAngle: Double
  
  var deltaScale: Double
  
  var pageTranslation: Point
}
object IMouseWheelParameters {
  
  inline def apply(charTranslation: Point, deltaRotationAngle: Double, deltaScale: Double, pageTranslation: Point): IMouseWheelParameters = {
    val __obj = js.Dynamic.literal(charTranslation = charTranslation.asInstanceOf[js.Any], deltaRotationAngle = deltaRotationAngle.asInstanceOf[js.Any], deltaScale = deltaScale.asInstanceOf[js.Any], pageTranslation = pageTranslation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseWheelParameters]
  }
  
  extension [Self <: IMouseWheelParameters](x: Self) {
    
    inline def setCharTranslation(value: Point): Self = StObject.set(x, "charTranslation", value.asInstanceOf[js.Any])
    
    inline def setDeltaRotationAngle(value: Double): Self = StObject.set(x, "deltaRotationAngle", value.asInstanceOf[js.Any])
    
    inline def setDeltaScale(value: Double): Self = StObject.set(x, "deltaScale", value.asInstanceOf[js.Any])
    
    inline def setPageTranslation(value: Point): Self = StObject.set(x, "pageTranslation", value.asInstanceOf[js.Any])
  }
}
