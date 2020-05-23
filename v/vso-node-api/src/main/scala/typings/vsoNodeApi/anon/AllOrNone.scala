package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllOrNone extends js.Object {
  var allOrNone: scala.Double
  var bestEffort: scala.Double
}

object AllOrNone {
  @scala.inline
  def apply(allOrNone: scala.Double, bestEffort: scala.Double): AllOrNone = {
    val __obj = js.Dynamic.literal(allOrNone = allOrNone.asInstanceOf[js.Any], bestEffort = bestEffort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllOrNone]
  }
}

