package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllOrNone extends js.Object {
  var allOrNone: Double
  var bestEffort: Double
}

object AnonAllOrNone {
  @scala.inline
  def apply(allOrNone: Double, bestEffort: Double): AnonAllOrNone = {
    val __obj = js.Dynamic.literal(allOrNone = allOrNone.asInstanceOf[js.Any], bestEffort = bestEffort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllOrNone]
  }
}

