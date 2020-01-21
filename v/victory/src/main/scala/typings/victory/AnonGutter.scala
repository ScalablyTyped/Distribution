package typings.victory

import typings.victory.mod.OrientationTypes
import typings.victory.victoryStrings.horizontal
import typings.victory.victoryStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGutter extends js.Object {
  var gutter: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[vertical | horizontal] = js.undefined
  var style: js.UndefOr[AnonDataLabels] = js.undefined
  var titleOrientation: js.UndefOr[OrientationTypes] = js.undefined
}

object AnonGutter {
  @scala.inline
  def apply(
    gutter: Int | Double = null,
    orientation: vertical | horizontal = null,
    style: AnonDataLabels = null,
    titleOrientation: OrientationTypes = null
  ): AnonGutter = {
    val __obj = js.Dynamic.literal()
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (titleOrientation != null) __obj.updateDynamic("titleOrientation")(titleOrientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGutter]
  }
}

