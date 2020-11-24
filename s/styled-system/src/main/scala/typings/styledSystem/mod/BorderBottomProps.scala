package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderBottomProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  
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
  implicit class BorderBottomPropsOps[Self <: BorderBottomProps[_, _], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self with (BorderBottomProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBorderBottomVarargs(value: (TVal | Null)*): Self = this.set("borderBottom", js.Array(value :_*))
    
    @scala.inline
    def setBorderBottom(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottom: Self = this.set("borderBottom", js.undefined)
    
    @scala.inline
    def setBorderBottomNull: Self = this.set("borderBottom", null)
  }
}
