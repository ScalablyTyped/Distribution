package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NeedsInvestigation extends js.Object {
  var aborted: scala.Double
  var completed: scala.Double
  var inProgress: scala.Double
  var needsInvestigation: scala.Double
  var notStarted: scala.Double
  var unspecified: scala.Double
  var waiting: scala.Double
}

object NeedsInvestigation {
  @scala.inline
  def apply(
    aborted: scala.Double,
    completed: scala.Double,
    inProgress: scala.Double,
    needsInvestigation: scala.Double,
    notStarted: scala.Double,
    unspecified: scala.Double,
    waiting: scala.Double
  ): NeedsInvestigation = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], needsInvestigation = needsInvestigation.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], unspecified = unspecified.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedsInvestigation]
  }
}

