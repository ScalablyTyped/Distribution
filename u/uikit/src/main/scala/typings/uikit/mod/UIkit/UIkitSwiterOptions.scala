package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitSwiterOptions extends js.Object {
  var active: js.UndefOr[Double] = js.undefined
  var animation: js.UndefOr[String] = js.undefined
  var connect: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var swiping: js.UndefOr[Boolean] = js.undefined
  var toggle: js.UndefOr[String] = js.undefined
}

object UIkitSwiterOptions {
  @scala.inline
  def apply(
    active: js.UndefOr[Double] = js.undefined,
    animation: String = null,
    connect: String = null,
    duration: js.UndefOr[Double] = js.undefined,
    swiping: js.UndefOr[Boolean] = js.undefined,
    toggle: String = null
  ): UIkitSwiterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swiping)) __obj.updateDynamic("swiping")(swiping.get.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitSwiterOptions]
  }
}

