package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitSortableOptions extends js.Object {
  var animation: js.UndefOr[Double] = js.undefined
  var `cls-base`: js.UndefOr[String] = js.undefined
  var `cls-custom`: String
  var `cls-drag`: js.UndefOr[String] = js.undefined
  var `cls-drag-state`: js.UndefOr[String] = js.undefined
  var `cls-empty`: js.UndefOr[String] = js.undefined
  var `cls-item`: js.UndefOr[String] = js.undefined
  var `cls-no-drag`: js.UndefOr[String] = js.undefined
  var `cls-placeholder`: js.UndefOr[String] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var handle: js.UndefOr[String] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object UIkitSortableOptions {
  @scala.inline
  def apply(
    `cls-custom`: String,
    animation: js.UndefOr[Double] = js.undefined,
    `cls-base`: String = null,
    `cls-drag`: String = null,
    `cls-drag-state`: String = null,
    `cls-empty`: String = null,
    `cls-item`: String = null,
    `cls-no-drag`: String = null,
    `cls-placeholder`: String = null,
    group: String = null,
    handle: String = null,
    threshold: js.UndefOr[Double] = js.undefined
  ): UIkitSortableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cls-custom")(`cls-custom`.asInstanceOf[js.Any])
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.get.asInstanceOf[js.Any])
    if (`cls-base` != null) __obj.updateDynamic("cls-base")(`cls-base`.asInstanceOf[js.Any])
    if (`cls-drag` != null) __obj.updateDynamic("cls-drag")(`cls-drag`.asInstanceOf[js.Any])
    if (`cls-drag-state` != null) __obj.updateDynamic("cls-drag-state")(`cls-drag-state`.asInstanceOf[js.Any])
    if (`cls-empty` != null) __obj.updateDynamic("cls-empty")(`cls-empty`.asInstanceOf[js.Any])
    if (`cls-item` != null) __obj.updateDynamic("cls-item")(`cls-item`.asInstanceOf[js.Any])
    if (`cls-no-drag` != null) __obj.updateDynamic("cls-no-drag")(`cls-no-drag`.asInstanceOf[js.Any])
    if (`cls-placeholder` != null) __obj.updateDynamic("cls-placeholder")(`cls-placeholder`.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitSortableOptions]
  }
}

