package typings.wepy

import typings.wepy.wepyStrings.loading
import typings.wepy.wepyStrings.none
import typings.wepy.wepyStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DurationIcon extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var icon: js.UndefOr[success | loading | none] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  var title: String
}

object Anon_DurationIcon {
  @scala.inline
  def apply(
    title: String,
    duration: Int | Double = null,
    icon: success | loading | none = null,
    image: String = null,
    mask: js.UndefOr[Boolean] = js.undefined
  ): Anon_DurationIcon = {
    val __obj = js.Dynamic.literal(title = title)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask)
    __obj.asInstanceOf[Anon_DurationIcon]
  }
}

