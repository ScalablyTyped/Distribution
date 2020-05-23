package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Failure extends js.Object {
  var canceled: scala.Double
  var failed: scala.Double
  var failure: scala.Double
  var inProgress: scala.Double
  var partiallySucceeded: scala.Double
  var pending: scala.Double
  var skipped: scala.Double
  var succeeded: scala.Double
  var success: scala.Double
  var unknown: scala.Double
}

object Failure {
  @scala.inline
  def apply(
    canceled: scala.Double,
    failed: scala.Double,
    failure: scala.Double,
    inProgress: scala.Double,
    partiallySucceeded: scala.Double,
    pending: scala.Double,
    skipped: scala.Double,
    succeeded: scala.Double,
    success: scala.Double,
    unknown: scala.Double
  ): Failure = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failure]
  }
}

