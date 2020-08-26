package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var variant: js.UndefOr[ResponsiveValue[String, ThemeType]] = js.native
}

object ButtonStyleProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): ButtonStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonStyleProps[ThemeType]]
  }
  @scala.inline
  implicit class ButtonStylePropsOps[Self <: ButtonStyleProps[_], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType] (val x: Self with ButtonStyleProps[ThemeType]) extends AnyVal {
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
    def setVariantVarargs(value: (String | Null)*): Self = this.set("variant", js.Array(value :_*))
    @scala.inline
    def setVariant(value: ResponsiveValue[String, ThemeType]): Self = this.set("variant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
    @scala.inline
    def setVariantNull: Self = this.set("variant", null)
  }
  
}

