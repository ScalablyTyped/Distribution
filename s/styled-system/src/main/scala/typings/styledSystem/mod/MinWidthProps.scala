package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinWidthProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The min-width CSS property sets the minimum width of an element.
    * It prevents the used value of the width property from becoming smaller than the value specified for min-width.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/min-width)
    */
  var minWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object MinWidthProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): MinWidthProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinWidthProps[ThemeType, TVal]]
  }
  
  extension [Self <: MinWidthProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (MinWidthProps[ThemeType, TVal])) {
    
    inline def setMinWidth(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthNull: Self = StObject.set(x, "minWidth", null)
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setMinWidthVarargs(value: (TVal | Null)*): Self = StObject.set(x, "minWidth", js.Array(value :_*))
  }
}
