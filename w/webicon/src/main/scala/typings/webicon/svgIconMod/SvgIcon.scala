package typings.webicon.svgIconMod

import typings.webicon.iconMod.Icon
import typings.webicon.sizeableMod.Sizeable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgIcon
  extends Icon
     with Sizeable {
  /**
    * The default viewBox of the icon.
    */
  var viewBox: js.UndefOr[String] = js.undefined
}

object SvgIcon {
  @scala.inline
  def apply(
    iconIdParser: (/* id */ String, /* params */ js.Array[String]) => String = null,
    iconSize: js.UndefOr[Double] = js.undefined,
    viewBox: String = null
  ): SvgIcon = {
    val __obj = js.Dynamic.literal()
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    if (!js.isUndefined(iconSize)) __obj.updateDynamic("iconSize")(iconSize.get.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgIcon]
  }
}

