package typings.wegameDashApi

import typings.wegameDashApi.wxNs.typesNs.ButtonStyle
import typings.wegameDashApi.wxNs.typesNs.ButtonType
import typings.wegameDashApi.wxNs.typesNs.GameClubButtonIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Icon extends js.Object {
  /**
    * 游戏圈按钮的图标，仅当 object.type 参数为 image 时有效
    */
  var icon: js.UndefOr[GameClubButtonIcon] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[ButtonStyle] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var `type`: ButtonType
}

object Anon_Icon {
  @scala.inline
  def apply(
    `type`: ButtonType,
    icon: GameClubButtonIcon = null,
    image: String = null,
    style: ButtonStyle = null,
    text: String = null
  ): Anon_Icon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (image != null) __obj.updateDynamic("image")(image)
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Icon]
  }
}

