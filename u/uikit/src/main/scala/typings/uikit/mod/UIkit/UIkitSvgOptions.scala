package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitSvgOptions extends js.Object {
  var src: js.UndefOr[String] = js.undefined
  var `stroke-animation`: js.UndefOr[Boolean] = js.undefined
}

object UIkitSvgOptions {
  @scala.inline
  def apply(src: String = null, `stroke-animation`: js.UndefOr[Boolean] = js.undefined): UIkitSvgOptions = {
    val __obj = js.Dynamic.literal()
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (!js.isUndefined(`stroke-animation`)) __obj.updateDynamic("stroke-animation")(`stroke-animation`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitSvgOptions]
  }
}

