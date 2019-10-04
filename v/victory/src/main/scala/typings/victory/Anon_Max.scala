package typings.victory

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Max extends js.Object {
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

object Anon_Max {
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
  ): Anon_Max = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max)
    if (maxLabels != null) __obj.updateDynamic("maxLabels")(maxLabels)
    if (median != null) __obj.updateDynamic("median")(median)
    if (medianLabels != null) __obj.updateDynamic("medianLabels")(medianLabels)
    if (min != null) __obj.updateDynamic("min")(min)
    if (minLabels != null) __obj.updateDynamic("minLabels")(minLabels)
    if (q1 != null) __obj.updateDynamic("q1")(q1)
    if (q1Labels != null) __obj.updateDynamic("q1Labels")(q1Labels)
    if (q3 != null) __obj.updateDynamic("q3")(q3)
    if (q3Labels != null) __obj.updateDynamic("q3Labels")(q3Labels)
    __obj.asInstanceOf[Anon_Max]
  }
}

