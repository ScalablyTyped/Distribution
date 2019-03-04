package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DurationIcon extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var icon: js.UndefOr[
    wepyLib.wepyLibStrings.success | wepyLib.wepyLibStrings.loading | wepyLib.wepyLibStrings.none
  ] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var mask: js.UndefOr[scala.Boolean] = js.undefined
  var title: java.lang.String
}

object Anon_DurationIcon {
  @scala.inline
  def apply(
    title: java.lang.String,
    duration: scala.Int | scala.Double = null,
    icon: wepyLib.wepyLibStrings.success | wepyLib.wepyLibStrings.loading | wepyLib.wepyLibStrings.none = null,
    image: java.lang.String = null,
    mask: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DurationIcon = {
    val __obj = js.Dynamic.literal(title = title)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask)
    __obj.asInstanceOf[Anon_DurationIcon]
  }
}

