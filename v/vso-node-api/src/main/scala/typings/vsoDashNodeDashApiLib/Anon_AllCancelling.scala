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
    val __obj = js.Dynamic.literal(all = all, cancelling = cancelling, completed = completed, inProgress = inProgress, none = none, notStarted = notStarted, postponed = postponed)
  
    __obj.asInstanceOf[Anon_AllCancelling]
  }
}

