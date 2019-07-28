package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbortedCompleted extends js.Object {
  var aborted: Double
  var completed: Double
  var inProgress: Double
  var needsInvestigation: Double
  var notStarted: Double
  var unspecified: Double
  var waiting: Double
}

object Anon_AbortedCompleted {
  @scala.inline
  def apply(
    aborted: Double,
    completed: Double,
    inProgress: Double,
    needsInvestigation: Double,
    notStarted: Double,
    unspecified: Double,
    waiting: Double
  ): Anon_AbortedCompleted = {
    val __obj = js.Dynamic.literal(aborted = aborted, completed = completed, inProgress = inProgress, needsInvestigation = needsInvestigation, notStarted = notStarted, unspecified = unspecified, waiting = waiting)
  
    __obj.asInstanceOf[Anon_AbortedCompleted]
  }
}

