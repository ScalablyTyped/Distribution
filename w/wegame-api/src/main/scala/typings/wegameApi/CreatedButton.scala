package typings.wegameApi

import typings.wegameApi.wx.types.ButtonStyle
import typings.wegameApi.wx.types.ButtonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatedButton extends js.Object {
  var image: String = js.native
  var style: ButtonStyle = js.native
  var text: String = js.native
  var `type`: ButtonType = js.native
  def destroy(): Unit = js.native
  def hide(): Unit = js.native
     // res参数会被具体按钮的API定义覆盖为具体信息
  def offTap(callback: js.Function1[/* res */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def onTap(callback: js.Function1[/* res */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def show(): Unit = js.native
}

object CreatedButton {
  @scala.inline
  def apply(
    destroy: () => Unit,
    hide: () => Unit,
    image: String,
    offTap: js.Function1[/* res */ js.UndefOr[js.Any], Unit] => Unit,
    onTap: js.Function1[/* res */ js.UndefOr[js.Any], Unit] => Unit,
    show: () => Unit,
    style: ButtonStyle,
    text: String,
    `type`: ButtonType
  ): CreatedButton = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), image = image.asInstanceOf[js.Any], offTap = js.Any.fromFunction1(offTap), onTap = js.Any.fromFunction1(onTap), show = js.Any.fromFunction0(show), style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedButton]
  }
  @scala.inline
  implicit class CreatedButtonOps[Self <: CreatedButton] (val x: Self) extends AnyVal {
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffTap(value: js.Function1[/* res */ js.UndefOr[js.Any], Unit] => Unit): Self = this.set("offTap", js.Any.fromFunction1(value))
    @scala.inline
    def setOnTap(value: js.Function1[/* res */ js.UndefOr[js.Any], Unit] => Unit): Self = this.set("onTap", js.Any.fromFunction1(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def setStyle(value: ButtonStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ButtonType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

