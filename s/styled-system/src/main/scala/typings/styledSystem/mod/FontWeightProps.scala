package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeightProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The font-weight CSS property specifies the weight (or boldness) of the font.
    *
    * The font weights available to you will depend on the font-family you are using. Some fonts are only available in normal and bold.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight)
    */
  var fontWeight: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object FontWeightProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): FontWeightProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontWeightProps[ThemeType, TVal]]
  }
  
  extension [Self <: FontWeightProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (FontWeightProps[ThemeType, TVal])) {
    
    inline def setFontWeight(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightNull: Self = StObject.set(x, "fontWeight", null)
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setFontWeightVarargs(value: (TVal | Null)*): Self = StObject.set(x, "fontWeight", js.Array(value*))
  }
}
