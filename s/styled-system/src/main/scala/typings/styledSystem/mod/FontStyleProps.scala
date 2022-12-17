package typings.styledSystem.mod

import typings.csstype.mod.Property.FontStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The font-style CSS property specifies whether a font should be styled with a normal, italic,
    * or oblique face from its font-family.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/font-style)
    */
  var fontStyle: js.UndefOr[ResponsiveValue[FontStyle, ThemeType]] = js.undefined
}
object FontStyleProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): FontStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontStyleProps[ThemeType]]
  }
  
  extension [Self <: FontStyleProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & FontStyleProps[ThemeType]) {
    
    inline def setFontStyle(value: ResponsiveValue[FontStyle, ThemeType]): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleNull: Self = StObject.set(x, "fontStyle", null)
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontStyleVarargs(value: (FontStyle | Null)*): Self = StObject.set(x, "fontStyle", js.Array(value*))
  }
}
