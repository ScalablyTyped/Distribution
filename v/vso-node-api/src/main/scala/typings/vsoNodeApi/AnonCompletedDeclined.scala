package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompletedDeclined extends js.Object {
  var completed: Double
  var declined: Double
  var inProgress: Double
  var notStarted: Double
  var paused: Double
  var unspecified: Double
}

object AnonCompletedDeclined {
  @scala.inline
  def apply(
    completed: Double,
    declined: Double,
    inProgress: Double,
    notStarted: Double,
    paused: Double,
    unspecified: Double
  ): AnonCompletedDeclined = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], declined = declined.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], unspecified = unspecified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCompletedDeclined]
  }
}

