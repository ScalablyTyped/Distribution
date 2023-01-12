package typings.tabris.anon

import typings.tabris.mod.ColorValue
import typings.tabris.mod.FontValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Href extends StObject {
  
  var children: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var font: js.UndefOr[FontValue] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var textColor: js.UndefOr[ColorValue] = js.undefined
}
object Href {
  
  inline def apply(): Href = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Href]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Href] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: String | js.Array[String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: String*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setFont(value: FontValue): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontNull: Self = StObject.set(x, "font", null)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setTextColor(value: ColorValue): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorNull: Self = StObject.set(x, "textColor", null)
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
