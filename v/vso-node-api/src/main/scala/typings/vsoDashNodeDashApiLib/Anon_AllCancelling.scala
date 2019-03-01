package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllCancelling extends js.Object {
  var all: scala.Double
  var cancelling: scala.Double
  var completed: scala.Double
  var inProgress: scala.Double
  var none: scala.Double
  var notStarted: scala.Double
  var postponed: scala.Double
}

object Anon_AllCancelling {
  @scala.inline
  def apply(
    all: scala.Double,
    cancelling: scala.Double,
    completed: scala.Double,
    inProgress: scala.Double,
    none: scala.Double,
    notStarted: scala.Double,
    postponed: scala.Double
  ): Anon_AllCancelling = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("cancelling")(cancelling)
    __obj.updateDynamic("completed")(completed)
    __obj.updateDynamic("inProgress")(inProgress)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("notStarted")(notStarted)
    __obj.updateDynamic("postponed")(postponed)
    __obj.asInstanceOf[Anon_AllCancelling]
  }
}

