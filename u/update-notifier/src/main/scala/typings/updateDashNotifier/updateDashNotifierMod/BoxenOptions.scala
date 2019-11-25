package typings.updateDashNotifier.updateDashNotifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxenOptions extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var borderStyle: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
}

object BoxenOptions {
  @scala.inline
  def apply(
    align: String = null,
    borderColor: String = null,
    borderStyle: String = null,
    margin: Int | Double = null,
    padding: Int | Double = null
  ): BoxenOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxenOptions]
  }
}

