package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMouseWheelParameters extends StObject {
  
  var charTranslation: Point = js.native
  
  var deltaRotationAngle: Double = js.native
  
  var deltaScale: Double = js.native
  
  var pageTranslation: Point = js.native
}
object IMouseWheelParameters {
  
  @scala.inline
  def apply(charTranslation: Point, deltaRotationAngle: Double, deltaScale: Double, pageTranslation: Point): IMouseWheelParameters = {
    val __obj = js.Dynamic.literal(charTranslation = charTranslation.asInstanceOf[js.Any], deltaRotationAngle = deltaRotationAngle.asInstanceOf[js.Any], deltaScale = deltaScale.asInstanceOf[js.Any], pageTranslation = pageTranslation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseWheelParameters]
  }
  
  @scala.inline
  implicit class IMouseWheelParametersMutableBuilder[Self <: IMouseWheelParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharTranslation(value: Point): Self = StObject.set(x, "charTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaRotationAngle(value: Double): Self = StObject.set(x, "deltaRotationAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaScale(value: Double): Self = StObject.set(x, "deltaScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTranslation(value: Point): Self = StObject.set(x, "pageTranslation", value.asInstanceOf[js.Any])
  }
}
