package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderBottomProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The border-bottom CSS property sets an element's bottom border. It's a shorthand for
    * border-bottom-width, border-bottom-style and border-bottom-color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom)
    */
  var borderBottom: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}
object BorderBottomProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BorderBottomProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderBottomProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class BorderBottomPropsMutableBuilder[Self <: BorderBottomProps[_, _], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self with (BorderBottomProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def setBorderBottom(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomNull: Self = StObject.set(x, "borderBottom", null)
    
    @scala.inline
    def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
    
    @scala.inline
    def setBorderBottomVarargs(value: (TVal | Null)*): Self = StObject.set(x, "borderBottom", js.Array(value :_*))
  }
}
