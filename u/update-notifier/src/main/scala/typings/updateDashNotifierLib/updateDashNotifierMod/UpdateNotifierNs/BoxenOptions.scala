package typings
package updateDashNotifierLib.updateDashNotifierMod.UpdateNotifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxenOptions extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var borderStyle: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[scala.Double] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
}

object BoxenOptions {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    borderColor: java.lang.String = null,
    borderStyle: java.lang.String = null,
    margin: scala.Int | scala.Double = null,
    padding: scala.Int | scala.Double = null
  ): BoxenOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxenOptions]
  }
}

