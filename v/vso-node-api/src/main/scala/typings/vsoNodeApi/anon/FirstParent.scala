package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstParent extends js.Object {
  var firstParent: scala.Double
  var fullHistory: scala.Double
  var fullHistorySimplifyMerges: scala.Double
  var simplifiedHistory: scala.Double
}

object FirstParent {
  @scala.inline
  def apply(
    firstParent: scala.Double,
    fullHistory: scala.Double,
    fullHistorySimplifyMerges: scala.Double,
    simplifiedHistory: scala.Double
  ): FirstParent = {
    val __obj = js.Dynamic.literal(firstParent = firstParent.asInstanceOf[js.Any], fullHistory = fullHistory.asInstanceOf[js.Any], fullHistorySimplifyMerges = fullHistorySimplifyMerges.asInstanceOf[js.Any], simplifiedHistory = simplifiedHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstParent]
  }
}

