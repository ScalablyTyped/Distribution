package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancelling extends js.Object {
  var all: scala.Double
  var cancelling: scala.Double
  var completed: scala.Double
  var inProgress: scala.Double
  var none: scala.Double
  var notStarted: scala.Double
  var postponed: scala.Double
}

object Cancelling {
  @scala.inline
  def apply(
    all: scala.Double,
    cancelling: scala.Double,
    completed: scala.Double,
    inProgress: scala.Double,
    none: scala.Double,
    notStarted: scala.Double,
    postponed: scala.Double
  ): Cancelling = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], cancelling = cancelling.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], postponed = postponed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelling]
  }
}

