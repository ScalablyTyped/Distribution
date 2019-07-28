package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanceledFailed extends js.Object {
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

object Anon_CanceledFailed {
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
  ): Anon_CanceledFailed = {
    val __obj = js.Dynamic.literal(canceled = canceled, failed = failed, failure = failure, inProgress = inProgress, partiallySucceeded = partiallySucceeded, pending = pending, skipped = skipped, succeeded = succeeded, success = success, unknown = unknown)
  
    __obj.asInstanceOf[Anon_CanceledFailed]
  }
}

