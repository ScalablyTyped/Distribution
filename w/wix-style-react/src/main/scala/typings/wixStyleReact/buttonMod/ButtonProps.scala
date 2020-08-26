package typings.wixStyleReact.buttonMod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonProps extends js.Object {
  var as: js.UndefOr[js.Any] = js.native
  var className: js.UndefOr[String] = js.native
  var dataHook: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var fullWidth: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var prefixIcon: js.UndefOr[ReactElement] = js.native
  var priority: js.UndefOr[ButtonPriority] = js.native
  var size: js.UndefOr[ButtonSize] = js.native
  var skin: js.UndefOr[ButtonSkin] = js.native
  var suffixIcon: js.UndefOr[ReactElement] = js.native
}

object ButtonProps {
  @scala.inline
  def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  @scala.inline
  implicit class ButtonPropsOps[Self <: ButtonProps] (val x: Self) extends AnyVal {
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
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDataHook(value: String): Self = this.set("dataHook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataHook: Self = this.set("dataHook", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setPrefixIcon(value: ReactElement): Self = this.set("prefixIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixIcon: Self = this.set("prefixIcon", js.undefined)
    @scala.inline
    def setPriority(value: ButtonPriority): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setSize(value: ButtonSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSkin(value: ButtonSkin): Self = this.set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkin: Self = this.set("skin", js.undefined)
    @scala.inline
    def setSuffixIcon(value: ReactElement): Self = this.set("suffixIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffixIcon: Self = this.set("suffixIcon", js.undefined)
  }
  
}

