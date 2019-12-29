package typings.webicon.iconSvgCumulativeIconSetMod

import typings.webicon.iconSvgIconMod.SvgIcon
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
    iconSize: Int | Double = null,
    viewBox: String = null,
    waitDuration: Int | Double = null
  ): SvgCumulativeIconSet = {
    val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any])
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (waitDuration != null) __obj.updateDynamic("waitDuration")(waitDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgCumulativeIconSet]
  }
}

