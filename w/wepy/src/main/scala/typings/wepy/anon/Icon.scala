package typings.wepy.anon

import typings.wepy.wepyStrings.loading
import typings.wepy.wepyStrings.none
import typings.wepy.wepyStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var icon: js.UndefOr[success | loading | none] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  var title: String
}

object Icon {
  @scala.inline
  def apply(
    title: String,
    duration: js.UndefOr[Double] = js.undefined,
    icon: success | loading | none = null,
    image: String = null,
    mask: js.UndefOr[Boolean] = js.undefined
  ): Icon = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
}

