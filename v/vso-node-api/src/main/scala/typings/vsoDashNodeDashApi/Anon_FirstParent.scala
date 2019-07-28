package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstParent extends js.Object {
  var firstParent: Double
  var fullHistory: Double
  var fullHistorySimplifyMerges: Double
  var simplifiedHistory: Double
}

object Anon_FirstParent {
  @scala.inline
  def apply(
    firstParent: Double,
    fullHistory: Double,
    fullHistorySimplifyMerges: Double,
    simplifiedHistory: Double
  ): Anon_FirstParent = {
    val __obj = js.Dynamic.literal(firstParent = firstParent, fullHistory = fullHistory, fullHistorySimplifyMerges = fullHistorySimplifyMerges, simplifiedHistory = simplifiedHistory)
  
    __obj.asInstanceOf[Anon_FirstParent]
  }
}

