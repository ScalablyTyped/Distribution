package typings.victory.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Max extends js.Object {
  var max: js.UndefOr[CSSProperties] = js.undefined
  var maxLabels: js.UndefOr[CSSProperties] = js.undefined
  var median: js.UndefOr[CSSProperties] = js.undefined
  var medianLabels: js.UndefOr[CSSProperties] = js.undefined
  var min: js.UndefOr[CSSProperties] = js.undefined
  var minLabels: js.UndefOr[CSSProperties] = js.undefined
  var q1: js.UndefOr[CSSProperties] = js.undefined
  var q1Labels: js.UndefOr[CSSProperties] = js.undefined
  var q3: js.UndefOr[CSSProperties] = js.undefined
  var q3Labels: js.UndefOr[CSSProperties] = js.undefined
}

object Max {
  @scala.inline
  def apply(
    max: CSSProperties = null,
    maxLabels: CSSProperties = null,
    median: CSSProperties = null,
    medianLabels: CSSProperties = null,
    min: CSSProperties = null,
    minLabels: CSSProperties = null,
    q1: CSSProperties = null,
    q1Labels: CSSProperties = null,
    q3: CSSProperties = null,
    q3Labels: CSSProperties = null
  ): Max = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLabels != null) __obj.updateDynamic("maxLabels")(maxLabels.asInstanceOf[js.Any])
    if (median != null) __obj.updateDynamic("median")(median.asInstanceOf[js.Any])
    if (medianLabels != null) __obj.updateDynamic("medianLabels")(medianLabels.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLabels != null) __obj.updateDynamic("minLabels")(minLabels.asInstanceOf[js.Any])
    if (q1 != null) __obj.updateDynamic("q1")(q1.asInstanceOf[js.Any])
    if (q1Labels != null) __obj.updateDynamic("q1Labels")(q1Labels.asInstanceOf[js.Any])
    if (q3 != null) __obj.updateDynamic("q3")(q3.asInstanceOf[js.Any])
    if (q3Labels != null) __obj.updateDynamic("q3Labels")(q3Labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
}

