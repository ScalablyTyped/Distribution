package typings.wegameApi

import typings.wegameApi.wx.types.ButtonStyle
import typings.wegameApi.wx.types.ButtonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatedButton extends js.Object {
  var image: String
  var style: ButtonStyle
  var text: String
  var `type`: ButtonType
  def destroy(): Unit
  def hide(): Unit
     // res参数会被具体按钮的API定义覆盖为具体信息
  def offTap(callback: js.Function1[/* res */ js.UndefOr[js.Any], Unit]): Unit
  def onTap(callback: js.Function1[/* res */ js.UndefOr[js.Any], Unit]): Unit
  def show(): Unit
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
}

