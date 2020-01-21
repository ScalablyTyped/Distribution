package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllCancelling extends js.Object {
  var all: Double
  var cancelling: Double
  var completed: Double
  var inProgress: Double
  var none: Double
  var notStarted: Double
  var postponed: Double
}

object AnonAllCancelling {
  @scala.inline
  def apply(
    all: Double,
    cancelling: Double,
    completed: Double,
    inProgress: Double,
    none: Double,
    notStarted: Double,
    postponed: Double
  ): AnonAllCancelling = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], cancelling = cancelling.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], postponed = postponed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllCancelling]
  }
}

