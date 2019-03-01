package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsEvaluationResult extends js.Object {
  /**
    * Count of events evaluated.
    */
  var count: scala.Double
  /**
    * Count of matched events.
    */
  var matchedCount: scala.Double
}

object EventsEvaluationResult {
  @scala.inline
  def apply(count: scala.Double, matchedCount: scala.Double): EventsEvaluationResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("matchedCount")(matchedCount)
    __obj.asInstanceOf[EventsEvaluationResult]
  }
}

