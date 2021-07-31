package typings.tabris.anon

import typings.tabris.mod.ColorValue
import typings.tabris.mod.FontValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextColor extends StObject {
  
  var children: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var font: js.UndefOr[FontValue] = js.undefined
  
  var textColor: js.UndefOr[ColorValue] = js.undefined
}
object TextColor {
  
  @scala.inline
  def apply(): TextColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextColor]
  }
  
  @scala.inline
  implicit class TextColorMutableBuilder[Self <: TextColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: String | js.Array[String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: String*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setFont(value: FontValue): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontNull: Self = StObject.set(x, "font", null)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setTextColor(value: ColorValue): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorNull: Self = StObject.set(x, "textColor", null)
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
