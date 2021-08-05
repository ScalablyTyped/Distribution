package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The bottom CSS property participates in specifying the vertical position of a
    * positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/top)
    */
  var bottom: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object BottomProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BottomProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BottomProps[ThemeType, TVal]]
  }
  
  extension [Self <: BottomProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (BottomProps[ThemeType, TVal])) {
    
    inline def setBottom(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomNull: Self = StObject.set(x, "bottom", null)
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setBottomVarargs(value: (TVal | Null)*): Self = StObject.set(x, "bottom", js.Array(value :_*))
  }
}
