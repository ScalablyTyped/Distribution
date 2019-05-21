package typings
package webiconLib.iconSvgCumulativeIconSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgCumulativeIconSet
  extends webiconLib.iconSvgIconMod.SvgIcon {
  /**
    * A value indicating whether the icons are loaded separately.
    */
  var cumulative: webiconLib.webiconLibNumbers.`true`
  /**
    * The number of miliseconds to wait before downloading the icons.
    */
  var waitDuration: js.UndefOr[scala.Double] = js.undefined
}

object SvgCumulativeIconSet {
  @scala.inline
  def apply(
    cumulative: webiconLib.webiconLibNumbers.`true`,
    iconIdParser: (/* id */ java.lang.String, /* params */ js.Array[java.lang.String]) => java.lang.String = null,
    iconSize: scala.Int | scala.Double = null,
    viewBox: java.lang.String = null,
    waitDuration: scala.Int | scala.Double = null
  ): SvgCumulativeIconSet = {
    val __obj = js.Dynamic.literal(cumulative = cumulative)
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    if (waitDuration != null) __obj.updateDynamic("waitDuration")(waitDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgCumulativeIconSet]
  }
}

