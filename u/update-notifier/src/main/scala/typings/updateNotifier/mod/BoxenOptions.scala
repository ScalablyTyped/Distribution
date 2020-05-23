package typings.updateNotifier.mod

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
    margin: js.UndefOr[Double] = js.undefined,
    padding: js.UndefOr[Double] = js.undefined
  ): BoxenOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxenOptions]
  }
}

