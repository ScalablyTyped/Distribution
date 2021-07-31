package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderRightProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The border-right CSS property is a shorthand that sets border-right-width, border-right-style,
    * and border-right-color. These properties set an element's right border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right)
    */
  var borderRight: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}
object BorderRightProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BorderRightProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderRightProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class BorderRightPropsMutableBuilder[Self <: BorderRightProps[?, ?], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self & (BorderRightProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def setBorderRight(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRightNull: Self = StObject.set(x, "borderRight", null)
    
    @scala.inline
    def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
    
    @scala.inline
    def setBorderRightVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderRight", js.Array(value :_*))
  }
}
