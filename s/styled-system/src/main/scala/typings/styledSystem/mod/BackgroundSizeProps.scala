package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundSizeProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  
  /**
    * The background-size CSS property sets the size of the element's background image. The
    * image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-size)
    */
  var backgroundSize: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}
object BackgroundSizeProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BackgroundSizeProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundSizeProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class BackgroundSizePropsOps[Self <: BackgroundSizeProps[_, _], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self with (BackgroundSizeProps[ThemeType, TVal])) extends AnyVal {
    
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
    def setBackgroundSizeVarargs(value: (TVal | Null)*): Self = this.set("backgroundSize", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundSize(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("backgroundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundSize: Self = this.set("backgroundSize", js.undefined)
    
    @scala.inline
    def setBackgroundSizeNull: Self = this.set("backgroundSize", null)
  }
}
