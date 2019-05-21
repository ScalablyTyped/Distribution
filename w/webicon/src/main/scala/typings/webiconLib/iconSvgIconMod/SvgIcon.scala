package typings
package webiconLib.iconSvgIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgIcon
  extends webiconLib.iconIconMod.Icon
     with webiconLib.iconSizeableMod.Sizeable {
  /**
    * The default viewBox of the icon.
    */
  var viewBox: js.UndefOr[java.lang.String] = js.undefined
}

object SvgIcon {
  @scala.inline
  def apply(
    iconIdParser: (/* id */ java.lang.String, /* params */ js.Array[java.lang.String]) => java.lang.String = null,
    iconSize: scala.Int | scala.Double = null,
    viewBox: java.lang.String = null
  ): SvgIcon = {
    val __obj = js.Dynamic.literal()
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    __obj.asInstanceOf[SvgIcon]
  }
}

