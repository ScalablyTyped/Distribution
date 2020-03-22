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
    active: Int | Double = null,
    animation: String = null,
    connect: String = null,
    duration: Int | Double = null,
    swiping: js.UndefOr[Boolean] = js.undefined,
    toggle: String = null
  ): UIkitSwiterOptions = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(swiping)) __obj.updateDynamic("swiping")(swiping.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitSwiterOptions]
  }
}

