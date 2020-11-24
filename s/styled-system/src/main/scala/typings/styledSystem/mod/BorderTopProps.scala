package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderTopProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  
  /**
    * The border-top CSS property is a shorthand that sets the values of border-top-width, border-top-style,
    * and border-top-color. These properties describe an element's top border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top)
    */
  var borderTop: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}
object BorderTopProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BorderTopProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderTopProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class BorderTopPropsOps[Self <: BorderTopProps[_, _], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self with (BorderTopProps[ThemeType, TVal])) extends AnyVal {
    
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
    def setBorderTopVarargs(value: (TVal | Null)*): Self = this.set("borderTop", js.Array(value :_*))
    
    @scala.inline
    def setBorderTop(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTop: Self = this.set("borderTop", js.undefined)
    
    @scala.inline
    def setBorderTopNull: Self = this.set("borderTop", null)
  }
}
