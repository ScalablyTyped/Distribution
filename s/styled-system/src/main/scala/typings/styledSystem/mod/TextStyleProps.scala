package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  
  var textStyle: js.UndefOr[ResponsiveValue[String, ThemeType]] = js.native
}
object TextStyleProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): TextStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyleProps[ThemeType]]
  }
  
  @scala.inline
  implicit class TextStylePropsOps[Self <: TextStyleProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with TextStyleProps[ThemeType]) extends AnyVal {
    
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
    def setTextStyleVarargs(value: (String | Null)*): Self = this.set("textStyle", js.Array(value :_*))
    
    @scala.inline
    def setTextStyle(value: ResponsiveValue[String, ThemeType]): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setTextStyleNull: Self = this.set("textStyle", null)
  }
}
