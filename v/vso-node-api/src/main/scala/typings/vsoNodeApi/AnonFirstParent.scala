package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirstParent extends js.Object {
  var firstParent: Double
  var fullHistory: Double
  var fullHistorySimplifyMerges: Double
  var simplifiedHistory: Double
}

object AnonFirstParent {
  @scala.inline
  def apply(
    firstParent: Double,
    fullHistory: Double,
    fullHistorySimplifyMerges: Double,
    simplifiedHistory: Double
  ): AnonFirstParent = {
    val __obj = js.Dynamic.literal(firstParent = firstParent.asInstanceOf[js.Any], fullHistory = fullHistory.asInstanceOf[js.Any], fullHistorySimplifyMerges = fullHistorySimplifyMerges.asInstanceOf[js.Any], simplifiedHistory = simplifiedHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFirstParent]
  }
}

