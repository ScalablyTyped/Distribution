package typings.vegaTypings.encodeMod

import typings.vegaTypings.colorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradientStop extends StObject {
  
  /**
    * The color value at this point in the gradient.
    */
  var color: Color
  
  /**
    * The offset fraction for the color stop, indicating its position within the gradient.
    */
  var offset: Double
}
object GradientStop {
  
  @scala.inline
  def apply(color: Color, offset: Double): GradientStop = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientStop]
  }
  
  @scala.inline
  implicit class GradientStopMutableBuilder[Self <: GradientStop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
