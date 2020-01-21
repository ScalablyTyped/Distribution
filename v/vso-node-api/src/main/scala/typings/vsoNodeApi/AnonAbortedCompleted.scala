package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbortedCompleted extends js.Object {
  var aborted: Double
  var completed: Double
  var inProgress: Double
  var needsInvestigation: Double
  var notStarted: Double
  var unspecified: Double
  var waiting: Double
}

object AnonAbortedCompleted {
  @scala.inline
  def apply(
    aborted: Double,
    completed: Double,
    inProgress: Double,
    needsInvestigation: Double,
    notStarted: Double,
    unspecified: Double,
    waiting: Double
  ): AnonAbortedCompleted = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], needsInvestigation = needsInvestigation.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], unspecified = unspecified.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAbortedCompleted]
  }
}

