package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitOffcanvasOptions extends js.Object {
  var `bg-close`: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String | Boolean] = js.undefined
  var `esc-close`: js.UndefOr[Boolean] = js.undefined
  var flip: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var overlay: js.UndefOr[Boolean] = js.undefined
}

object UIkitOffcanvasOptions {
  @scala.inline
  def apply(
    `bg-close`: js.UndefOr[Boolean] = js.undefined,
    container: String | Boolean = null,
    `esc-close`: js.UndefOr[Boolean] = js.undefined,
    flip: js.UndefOr[Boolean] = js.undefined,
    mode: String = null,
    overlay: js.UndefOr[Boolean] = js.undefined
  ): UIkitOffcanvasOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`bg-close`)) __obj.updateDynamic("bg-close")(`bg-close`.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(`esc-close`)) __obj.updateDynamic("esc-close")(`esc-close`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitOffcanvasOptions]
  }
}

