package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderLeftProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The border-left CSS property is a shorthand that sets the values of border-left-width,
    * border-left-style, and border-left-color. These properties describe an element's left border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left)
    */
  var borderLeft: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object BorderLeftProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BorderLeftProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderLeftProps[ThemeType, TVal]]
  }
  
  extension [Self <: BorderLeftProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (BorderLeftProps[ThemeType, TVal])) {
    
    inline def setBorderLeft(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftNull: Self = StObject.set(x, "borderLeft", null)
    
    inline def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
    
    inline def setBorderLeftVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderLeft", js.Array(value*))
  }
}
