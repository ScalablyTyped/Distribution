package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Icon extends js.Object {
  /**
    * 游戏圈按钮的图标，仅当 object.type 参数为 image 时有效
    */
  var icon: js.UndefOr[wegameDashApiLib.wxNs.typesNs.GameClubButtonIcon] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[wegameDashApiLib.wxNs.typesNs.ButtonStyle] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var `type`: wegameDashApiLib.wxNs.typesNs.ButtonType
}

object Anon_Icon {
  @scala.inline
  def apply(
    `type`: wegameDashApiLib.wxNs.typesNs.ButtonType,
    icon: wegameDashApiLib.wxNs.typesNs.GameClubButtonIcon = null,
    image: java.lang.String = null,
    style: wegameDashApiLib.wxNs.typesNs.ButtonStyle = null,
    text: java.lang.String = null
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

