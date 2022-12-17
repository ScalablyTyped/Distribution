package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderTopProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The border-top CSS property is a shorthand that sets the values of border-top-width, border-top-style,
    * and border-top-color. These properties describe an element's top border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top)
    */
  var borderTop: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object BorderTopProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BorderTopProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderTopProps[ThemeType, TVal]]
  }
  
  extension [Self <: BorderTopProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (BorderTopProps[ThemeType, TVal])) {
    
    inline def setBorderTop(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
    
    inline def setBorderTopNull: Self = StObject.set(x, "borderTop", null)
    
    inline def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
    
    inline def setBorderTopVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderTop", js.Array(value*))
  }
}
