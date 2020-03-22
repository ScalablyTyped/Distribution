package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitTabOptions extends js.Object {
  var active: js.UndefOr[Double] = js.undefined
  var animation: js.UndefOr[String] = js.undefined
  var connect: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var media: js.UndefOr[Double | String] = js.undefined
  var swiping: js.UndefOr[Boolean] = js.undefined
  var toggle: js.UndefOr[String] = js.undefined
}

object UIkitTabOptions {
  @scala.inline
  def apply(
    active: Int | Double = null,
    animation: String = null,
    connect: String = null,
    duration: Int | Double = null,
    media: Double | String = null,
    swiping: js.UndefOr[Boolean] = js.undefined,
    toggle: String = null
  ): UIkitTabOptions = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (!js.isUndefined(swiping)) __obj.updateDynamic("swiping")(swiping.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitTabOptions]
  }
}

