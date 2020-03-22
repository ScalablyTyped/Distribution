package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitTooltipOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var cls: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double | Boolean] = js.undefined
  var pos: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object UIkitTooltipOptions {
  @scala.inline
  def apply(
    animation: String = null,
    cls: String = null,
    delay: Int | Double = null,
    duration: Int | Double = null,
    offset: Double | Boolean = null,
    pos: String = null,
    title: String = null
  ): UIkitTooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (cls != null) __obj.updateDynamic("cls")(cls.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (pos != null) __obj.updateDynamic("pos")(pos.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitTooltipOptions]
  }
}

