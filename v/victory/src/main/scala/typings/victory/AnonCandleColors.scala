package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCandleColors extends js.Object {
  var candleColors: js.UndefOr[AnonNegative] = js.undefined
  var style: js.UndefOr[AnonData] = js.undefined
}

object AnonCandleColors {
  @scala.inline
  def apply(candleColors: AnonNegative = null, style: AnonData = null): AnonCandleColors = {
    val __obj = js.Dynamic.literal()
    if (candleColors != null) __obj.updateDynamic("candleColors")(candleColors.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCandleColors]
  }
}

