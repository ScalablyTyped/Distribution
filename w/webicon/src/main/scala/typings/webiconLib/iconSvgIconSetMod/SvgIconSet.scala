package typings
package webiconLib.iconSvgIconSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgIconSet
  extends webiconLib.iconSvgIconMod.SvgIcon {
  /**
    * A value indicating whether the icons are loaded separately.
    */
  var cumulative: js.UndefOr[webiconLib.webiconLibNumbers.`false`] = js.undefined
}

object SvgIconSet {
  @scala.inline
  def apply(
    cumulative: webiconLib.webiconLibNumbers.`false` = null,
    iconIdParser: (/* id */ java.lang.String, /* params */ js.Array[java.lang.String]) => java.lang.String = null,
    iconSize: scala.Int | scala.Double = null,
    viewBox: java.lang.String = null
  ): SvgIconSet = {
    val __obj = js.Dynamic.literal()
    if (cumulative != null) __obj.updateDynamic("cumulative")(cumulative)
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    __obj.asInstanceOf[SvgIconSet]
  }
}

