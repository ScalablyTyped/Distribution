package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The top CSS property participates in specifying the vertical position of a
    * positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/top)
    */
  var top: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object TopProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): TopProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopProps[ThemeType, TVal]]
  }
  
  extension [Self <: TopProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](x: Self & (TopProps[ThemeType, TVal])) {
    
    inline def setTop(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopNull: Self = StObject.set(x, "top", null)
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setTopVarargs(value: (TVal | Null)*): Self = StObject.set(x, "top", js.Array(value :_*))
  }
}
