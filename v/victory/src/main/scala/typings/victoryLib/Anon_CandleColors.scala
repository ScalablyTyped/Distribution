package typings
package victoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CandleColors extends js.Object {
  var candleColors: Anon_Negative
  var height: scala.Double
  var width: scala.Double
}

object Anon_CandleColors {
  @scala.inline
  def apply(candleColors: Anon_Negative, height: scala.Double, width: scala.Double): Anon_CandleColors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("candleColors")(candleColors)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_CandleColors]
  }
}

