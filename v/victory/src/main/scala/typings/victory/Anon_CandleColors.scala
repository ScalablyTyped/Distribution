package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CandleColors extends js.Object {
  var candleColors: js.UndefOr[Anon_Negative] = js.undefined
  var style: js.UndefOr[Anon_DataLabels] = js.undefined
}

object Anon_CandleColors {
  @scala.inline
  def apply(candleColors: Anon_Negative = null, style: Anon_DataLabels = null): Anon_CandleColors = {
    val __obj = js.Dynamic.literal()
    if (candleColors != null) __obj.updateDynamic("candleColors")(candleColors)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Anon_CandleColors]
  }
}

