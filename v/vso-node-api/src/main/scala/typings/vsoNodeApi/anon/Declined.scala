package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Declined extends js.Object {
  var completed: scala.Double
  var declined: scala.Double
  var inProgress: scala.Double
  var notStarted: scala.Double
  var paused: scala.Double
  var unspecified: scala.Double
}

object Declined {
  @scala.inline
  def apply(
    completed: scala.Double,
    declined: scala.Double,
    inProgress: scala.Double,
    notStarted: scala.Double,
    paused: scala.Double,
    unspecified: scala.Double
  ): Declined = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], declined = declined.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], unspecified = unspecified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declined]
  }
}

