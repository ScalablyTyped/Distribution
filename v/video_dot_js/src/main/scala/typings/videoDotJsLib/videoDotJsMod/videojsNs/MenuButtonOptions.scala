package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuButtonOptions extends ComponentOptions {
  var iniChildren: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object MenuButtonOptions {
  @scala.inline
  def apply(
    children: js.Array[Child] = null,
    iniChildren: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): MenuButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(iniChildren)) __obj.updateDynamic("iniChildren")(iniChildren)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[MenuButtonOptions]
  }
}

