package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InProgress_ extends js.Object {
  var abandoned: scala.Double
  var completed: scala.Double
  var failed: scala.Double
  var inProgress: scala.Double
  var queued: scala.Double
}

object InProgress_ {
  @scala.inline
  def apply(
    abandoned: scala.Double,
    completed: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    queued: scala.Double
  ): InProgress_ = {
    val __obj = js.Dynamic.literal(abandoned = abandoned.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any])
    __obj.asInstanceOf[InProgress_]
  }
}

