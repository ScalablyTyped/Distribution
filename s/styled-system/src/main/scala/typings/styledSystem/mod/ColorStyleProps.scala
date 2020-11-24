package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  
  var colors: js.UndefOr[ResponsiveValue[String, ThemeType]] = js.native
}
object ColorStyleProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): ColorStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorStyleProps[ThemeType]]
  }
  
  @scala.inline
  implicit class ColorStylePropsOps[Self <: ColorStyleProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with ColorStyleProps[ThemeType]) extends AnyVal {
    
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
    def setColorsVarargs(value: (String | Null)*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: ResponsiveValue[String, ThemeType]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setColorsNull: Self = this.set("colors", null)
  }
}
