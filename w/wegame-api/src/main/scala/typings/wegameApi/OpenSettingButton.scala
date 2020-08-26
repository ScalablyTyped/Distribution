package typings.wegameApi

import typings.wegameApi.wx.types.ButtonStyle
import typings.wegameApi.wx.types.ButtonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenSettingButton extends CreatedButton {
  def offTap(callback: js.Function0[Unit]): Unit = js.native
  def onTap(callback: js.Function0[Unit]): Unit = js.native
}

object OpenSettingButton {
  @scala.inline
  def apply(
    destroy: () => Unit,
    hide: () => Unit,
    image: String,
    offTap: js.Function0[Unit] => Unit,
    onTap: js.Function0[Unit] => Unit,
    show: () => Unit,
    style: ButtonStyle,
    text: String,
    `type`: ButtonType
  ): OpenSettingButton = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), image = image.asInstanceOf[js.Any], offTap = js.Any.fromFunction1(offTap), onTap = js.Any.fromFunction1(onTap), show = js.Any.fromFunction0(show), style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenSettingButton]
  }
  @scala.inline
  implicit class OpenSettingButtonOps[Self <: OpenSettingButton] (val x: Self) extends AnyVal {
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
    def setOffTap(value: js.Function0[Unit] => Unit): Self = this.set("offTap", js.Any.fromFunction1(value))
    @scala.inline
    def setOnTap(value: js.Function0[Unit] => Unit): Self = this.set("onTap", js.Any.fromFunction1(value))
  }
  
}

