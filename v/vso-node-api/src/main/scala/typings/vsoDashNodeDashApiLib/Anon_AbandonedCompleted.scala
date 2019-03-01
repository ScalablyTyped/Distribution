package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbandonedCompleted extends js.Object {
  var abandoned: scala.Double
  var completed: scala.Double
  var failed: scala.Double
  var inProgress: scala.Double
  var queued: scala.Double
}

object Anon_AbandonedCompleted {
  @scala.inline
  def apply(
    abandoned: scala.Double,
    completed: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    queued: scala.Double
  ): Anon_AbandonedCompleted = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abandoned")(abandoned)
    __obj.updateDynamic("completed")(completed)
    __obj.updateDynamic("failed")(failed)
    __obj.updateDynamic("inProgress")(inProgress)
    __obj.updateDynamic("queued")(queued)
    __obj.asInstanceOf[Anon_AbandonedCompleted]
  }
}

