package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbortedCompleted extends js.Object {
  var aborted: scala.Double
  var completed: scala.Double
  var inProgress: scala.Double
  var needsInvestigation: scala.Double
  var notStarted: scala.Double
  var unspecified: scala.Double
  var waiting: scala.Double
}

object Anon_AbortedCompleted {
  @scala.inline
  def apply(
    aborted: scala.Double,
    completed: scala.Double,
    inProgress: scala.Double,
    needsInvestigation: scala.Double,
    notStarted: scala.Double,
    unspecified: scala.Double,
    waiting: scala.Double
  ): Anon_AbortedCompleted = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aborted")(aborted)
    __obj.updateDynamic("completed")(completed)
    __obj.updateDynamic("inProgress")(inProgress)
    __obj.updateDynamic("needsInvestigation")(needsInvestigation)
    __obj.updateDynamic("notStarted")(notStarted)
    __obj.updateDynamic("unspecified")(unspecified)
    __obj.updateDynamic("waiting")(waiting)
    __obj.asInstanceOf[Anon_AbortedCompleted]
  }
}

