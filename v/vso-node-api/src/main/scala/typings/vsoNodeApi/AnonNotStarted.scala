package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNotStarted extends js.Object {
  var canceled: Double
  var cancelling: Double
  var failed: Double
  var inProgress: Double
  var notStarted: Double
  var partiallySucceeded: Double
  var skipped: Double
  var succeeded: Double
  var undefined: Double
}

object AnonNotStarted {
  @scala.inline
  def apply(
    canceled: Double,
    cancelling: Double,
    failed: Double,
    inProgress: Double,
    notStarted: Double,
    partiallySucceeded: Double,
    skipped: Double,
    succeeded: Double,
    undefined: Double
  ): AnonNotStarted = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], cancelling = cancelling.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNotStarted]
  }
}

