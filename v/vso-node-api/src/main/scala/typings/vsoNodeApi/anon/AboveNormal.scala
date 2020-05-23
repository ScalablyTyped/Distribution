package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboveNormal extends js.Object {
  var aboveNormal: scala.Double
  var belowNormal: scala.Double
  var high: scala.Double
  var low: scala.Double
  var normal: scala.Double
}

object AboveNormal {
  @scala.inline
  def apply(
    aboveNormal: scala.Double,
    belowNormal: scala.Double,
    high: scala.Double,
    low: scala.Double,
    normal: scala.Double
  ): AboveNormal = {
    val __obj = js.Dynamic.literal(aboveNormal = aboveNormal.asInstanceOf[js.Any], belowNormal = belowNormal.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AboveNormal]
  }
}

