package typings.webicon.svgCumulativeIconSetMod

import typings.webicon.svgIconMod.SvgIcon
import typings.webicon.webiconBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgCumulativeIconSet extends SvgIcon {
  /**
    * A value indicating whether the icons are loaded separately.
    */
  var cumulative: `true`
  /**
    * The number of miliseconds to wait before downloading the icons.
    */
  var waitDuration: js.UndefOr[Double] = js.undefined
}

object SvgCumulativeIconSet {
  @scala.inline
  def apply(
    cumulative: `true`,
    iconIdParser: (/* id */ String, /* params */ js.Array[String]) => String = null,
    iconSize: js.UndefOr[Double] = js.undefined,
    viewBox: String = null,
    waitDuration: js.UndefOr[Double] = js.undefined
  ): SvgCumulativeIconSet = {
    val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any])
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    if (!js.isUndefined(iconSize)) __obj.updateDynamic("iconSize")(iconSize.get.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (!js.isUndefined(waitDuration)) __obj.updateDynamic("waitDuration")(waitDuration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgCumulativeIconSet]
  }
}

