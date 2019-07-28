package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgLegendEncode extends js.Object {
  var gradient: js.UndefOr[VgGuideEncode] = js.undefined
  var labels: js.UndefOr[VgGuideEncode] = js.undefined
  var legend: js.UndefOr[VgGuideEncode] = js.undefined
  var symbols: js.UndefOr[VgGuideEncode] = js.undefined
  var title: js.UndefOr[VgGuideEncode] = js.undefined
}

object VgLegendEncode {
  @scala.inline
  def apply(
    gradient: VgGuideEncode = null,
    labels: VgGuideEncode = null,
    legend: VgGuideEncode = null,
    symbols: VgGuideEncode = null,
    title: VgGuideEncode = null
  ): VgLegendEncode = {
    val __obj = js.Dynamic.literal()
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (symbols != null) __obj.updateDynamic("symbols")(symbols)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[VgLegendEncode]
  }
}

