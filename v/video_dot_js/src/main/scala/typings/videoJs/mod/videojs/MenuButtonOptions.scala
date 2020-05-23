package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuButtonOptions extends ComponentOptions {
  var iniChildren: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object MenuButtonOptions {
  @scala.inline
  def apply(
    children: js.Array[Child] = null,
    iniChildren: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): MenuButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(iniChildren)) __obj.updateDynamic("iniChildren")(iniChildren.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuButtonOptions]
  }
}

