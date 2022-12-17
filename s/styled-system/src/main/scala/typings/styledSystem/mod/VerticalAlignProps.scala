package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerticalAlignProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The vertical-align CSS property specifies sets vertical alignment of an inline or table-cell box.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align)
    */
  var verticalAlign: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object VerticalAlignProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): VerticalAlignProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerticalAlignProps[ThemeType, TVal]]
  }
  
  extension [Self <: VerticalAlignProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (VerticalAlignProps[ThemeType, TVal])) {
    
    inline def setVerticalAlign(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignNull: Self = StObject.set(x, "verticalAlign", null)
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setVerticalAlignVarargs(value: (TVal | Null)*): Self = StObject.set(x, "verticalAlign", js.Array(value*))
  }
}
