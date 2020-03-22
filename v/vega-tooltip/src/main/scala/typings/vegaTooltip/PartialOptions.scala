package typings.vegaTooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<vega-tooltip.vega-tooltip/build/src/defaults.Options> */
trait PartialOptions extends js.Object {
  var disableDefaultStyle: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var maxDepth: js.UndefOr[Double] = js.undefined
  var offsetX: js.UndefOr[Double] = js.undefined
  var offsetY: js.UndefOr[Double] = js.undefined
  var styleId: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    disableDefaultStyle: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    maxDepth: Int | Double = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    styleId: String = null,
    theme: String = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableDefaultStyle)) __obj.updateDynamic("disableDefaultStyle")(disableDefaultStyle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (styleId != null) __obj.updateDynamic("styleId")(styleId.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

