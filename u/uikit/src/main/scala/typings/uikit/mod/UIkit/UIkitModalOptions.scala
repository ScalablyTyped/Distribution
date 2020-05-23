package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitModalOptions extends js.Object {
  var `bg-close`: js.UndefOr[Boolean] = js.undefined
  var `cls-page`: js.UndefOr[String] = js.undefined
  var `cls-panel`: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[String | Boolean] = js.undefined
  var `esc-close`: js.UndefOr[Boolean] = js.undefined
  var `sel-close`: js.UndefOr[String] = js.undefined
  var stack: js.UndefOr[Boolean] = js.undefined
}

object UIkitModalOptions {
  @scala.inline
  def apply(
    `bg-close`: js.UndefOr[Boolean] = js.undefined,
    `cls-page`: String = null,
    `cls-panel`: String = null,
    container: String | Boolean = null,
    `esc-close`: js.UndefOr[Boolean] = js.undefined,
    `sel-close`: String = null,
    stack: js.UndefOr[Boolean] = js.undefined
  ): UIkitModalOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`bg-close`)) __obj.updateDynamic("bg-close")(`bg-close`.get.asInstanceOf[js.Any])
    if (`cls-page` != null) __obj.updateDynamic("cls-page")(`cls-page`.asInstanceOf[js.Any])
    if (`cls-panel` != null) __obj.updateDynamic("cls-panel")(`cls-panel`.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(`esc-close`)) __obj.updateDynamic("esc-close")(`esc-close`.get.asInstanceOf[js.Any])
    if (`sel-close` != null) __obj.updateDynamic("sel-close")(`sel-close`.asInstanceOf[js.Any])
    if (!js.isUndefined(stack)) __obj.updateDynamic("stack")(stack.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitModalOptions]
  }
}

