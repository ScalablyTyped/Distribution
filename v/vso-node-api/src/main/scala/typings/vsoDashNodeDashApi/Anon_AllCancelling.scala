package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllCancelling extends js.Object {
  var all: Double
  var cancelling: Double
  var completed: Double
  var inProgress: Double
  var none: Double
  var notStarted: Double
  var postponed: Double
}

object Anon_AllCancelling {
  @scala.inline
  def apply(
    all: Double,
    cancelling: Double,
    completed: Double,
    inProgress: Double,
    none: Double,
    notStarted: Double,
    postponed: Double
  ): Anon_AllCancelling = {
    val __obj = js.Dynamic.literal(all = all, cancelling = cancelling, completed = completed, inProgress = inProgress, none = none, notStarted = notStarted, postponed = postponed)
  
    __obj.asInstanceOf[Anon_AllCancelling]
  }
}

