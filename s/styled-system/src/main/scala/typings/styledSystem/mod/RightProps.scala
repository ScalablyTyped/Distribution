package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RightProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The right CSS property participates in specifying the horizontal position of a
    * positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/right)
    */
  var right: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object RightProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): RightProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RightProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self & (RightProps[ThemeType, TVal])) extends AnyVal {
    
    inline def setRight(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightNull: Self = StObject.set(x, "right", null)
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setRightVarargs(value: (TVal | Null)*): Self = StObject.set(x, "right", js.Array(value*))
  }
}
