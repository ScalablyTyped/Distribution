package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod.ColorHCL
import typings.vegaTypings.encodeMod.ColorHSL
import typings.vegaTypings.encodeMod.ColorLAB
import typings.vegaTypings.encodeMod.ColorRGB
import typings.vegaTypings.encodeMod._ColorValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color
  extends StObject
     with _ColorValueRef {
  
  var color: ColorRGB | ColorHSL | ColorLAB | ColorHCL
}
object Color {
  
  @scala.inline
  def apply(color: ColorRGB | ColorHSL | ColorLAB | ColorHCL): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorRGB | ColorHSL | ColorLAB | ColorHCL): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
