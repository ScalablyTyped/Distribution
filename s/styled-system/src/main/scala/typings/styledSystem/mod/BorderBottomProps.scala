package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderBottomProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The border-bottom CSS property sets an element's bottom border. It's a shorthand for
    * border-bottom-width, border-bottom-style and border-bottom-color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom)
    */
  var borderBottom: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object BorderBottomProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BorderBottomProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderBottomProps[ThemeType, TVal]]
  }
  
  extension [Self <: BorderBottomProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (BorderBottomProps[ThemeType, TVal])) {
    
    inline def setBorderBottom(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomNull: Self = StObject.set(x, "borderBottom", null)
    
    inline def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
    
    inline def setBorderBottomVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderBottom", js.Array(value*))
  }
}
