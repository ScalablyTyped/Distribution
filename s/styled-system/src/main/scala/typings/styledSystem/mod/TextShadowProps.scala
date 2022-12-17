package typings.styledSystem.mod

import typings.csstype.mod.Property.TextShadow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextShadowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The `text-shadow` CSS property adds shadows to text. It accepts a comma-separated list of shadows to be applied
    * to the text and any of its `decorations`. Each shadow is described by some combination of X and Y offsets from
    * the element, blur radius, and color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/text-shadow)
    */
  var textShadow: js.UndefOr[ResponsiveValue[TextShadow | Double, ThemeType]] = js.undefined
}
object TextShadowProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): TextShadowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextShadowProps[ThemeType]]
  }
  
  extension [Self <: TextShadowProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & TextShadowProps[ThemeType]) {
    
    inline def setTextShadow(value: ResponsiveValue[TextShadow | Double, ThemeType]): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
    
    inline def setTextShadowNull: Self = StObject.set(x, "textShadow", null)
    
    inline def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
    
    inline def setTextShadowVarargs(value: ((TextShadow | Double) | Null)*): Self = StObject.set(x, "textShadow", js.Array(value*))
  }
}
