package typings.wegameApi

import typings.wegameApi.wx.types.ButtonStyle
import typings.wegameApi.wx.types.ButtonType
import typings.wegameApi.wx.types.GameClubButtonIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameClubButton extends CreatedButton {
  var icon: GameClubButtonIcon = js.native
}

object GameClubButton {
  @scala.inline
  def apply(
    destroy: () => Unit,
    hide: () => Unit,
    icon: GameClubButtonIcon,
    image: String,
    offTap: js.Function1[/* res */ js.UndefOr[js.Any], Unit] => Unit,
    onTap: js.Function1[/* res */ js.UndefOr[js.Any], Unit] => Unit,
    show: () => Unit,
    style: ButtonStyle,
    text: String,
    `type`: ButtonType
  ): GameClubButton = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), icon = icon.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], offTap = js.Any.fromFunction1(offTap), onTap = js.Any.fromFunction1(onTap), show = js.Any.fromFunction0(show), style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameClubButton]
  }
  @scala.inline
  implicit class GameClubButtonOps[Self <: GameClubButton] (val x: Self) extends AnyVal {
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
    def setIcon(value: GameClubButtonIcon): Self = this.set("icon", value.asInstanceOf[js.Any])
  }
  
}

