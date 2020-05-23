package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotStarted extends js.Object {
  var canceled: scala.Double
  var cancelling: scala.Double
  var failed: scala.Double
  var inProgress: scala.Double
  var notStarted: scala.Double
  var partiallySucceeded: scala.Double
  var skipped: scala.Double
  var succeeded: scala.Double
  var undefined: scala.Double
}

object NotStarted {
  @scala.inline
  def apply(
    canceled: scala.Double,
    cancelling: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    notStarted: scala.Double,
    partiallySucceeded: scala.Double,
    skipped: scala.Double,
    succeeded: scala.Double,
    undefined: scala.Double
  ): NotStarted = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], cancelling = cancelling.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotStarted]
  }
}

