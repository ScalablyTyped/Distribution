package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompletedDeclined extends js.Object {
  var completed: scala.Double
  var declined: scala.Double
  var inProgress: scala.Double
  var notStarted: scala.Double
  var paused: scala.Double
  var unspecified: scala.Double
}

object Anon_CompletedDeclined {
  @scala.inline
  def apply(
    completed: scala.Double,
    declined: scala.Double,
    inProgress: scala.Double,
    notStarted: scala.Double,
    paused: scala.Double,
    unspecified: scala.Double
  ): Anon_CompletedDeclined = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("completed")(completed)
    __obj.updateDynamic("declined")(declined)
    __obj.updateDynamic("inProgress")(inProgress)
    __obj.updateDynamic("notStarted")(notStarted)
    __obj.updateDynamic("paused")(paused)
    __obj.updateDynamic("unspecified")(unspecified)
    __obj.asInstanceOf[Anon_CompletedDeclined]
  }
}

