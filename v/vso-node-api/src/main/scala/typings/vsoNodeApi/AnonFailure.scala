package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFailure extends js.Object {
  var canceled: Double
  var failed: Double
  var failure: Double
  var inProgress: Double
  var partiallySucceeded: Double
  var pending: Double
  var skipped: Double
  var succeeded: Double
  var success: Double
  var unknown: Double
}

object AnonFailure {
  @scala.inline
  def apply(
    canceled: Double,
    failed: Double,
    failure: Double,
    inProgress: Double,
    partiallySucceeded: Double,
    pending: Double,
    skipped: Double,
    succeeded: Double,
    success: Double,
    unknown: Double
  ): AnonFailure = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFailure]
  }
}

