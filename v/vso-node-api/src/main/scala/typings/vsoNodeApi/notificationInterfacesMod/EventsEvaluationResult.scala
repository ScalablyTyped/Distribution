package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsEvaluationResult extends js.Object {
  /**
    * Count of events evaluated.
    */
  var count: Double
  /**
    * Count of matched events.
    */
  var matchedCount: Double
}

object EventsEvaluationResult {
  @scala.inline
  def apply(count: Double, matchedCount: Double): EventsEvaluationResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], matchedCount = matchedCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventsEvaluationResult]
  }
}

