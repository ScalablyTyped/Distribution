package typings.webicon.iconSvgIconMod

import typings.webicon.iconIconMod.Icon
import typings.webicon.iconSizeableMod.Sizeable
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
    iconSize: Int | Double = null,
    viewBox: String = null
  ): SvgIcon = {
    val __obj = js.Dynamic.literal()
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    __obj.asInstanceOf[SvgIcon]
  }
}

