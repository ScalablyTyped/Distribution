package typings.webicon.svgIconSetMod

import typings.webicon.svgIconMod.SvgIcon
import typings.webicon.webiconBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgIconSet extends SvgIcon {
  /**
    * A value indicating whether the icons are loaded separately.
    */
  var cumulative: js.UndefOr[`false`] = js.undefined
}

object SvgIconSet {
  @scala.inline
  def apply(
    cumulative: `false` = null,
    iconIdParser: (/* id */ String, /* params */ js.Array[String]) => String = null,
    iconSize: Int | Double = null,
    viewBox: String = null
  ): SvgIconSet = {
    val __obj = js.Dynamic.literal()
    if (cumulative != null) __obj.updateDynamic("cumulative")(cumulative.asInstanceOf[js.Any])
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgIconSet]
  }
}

