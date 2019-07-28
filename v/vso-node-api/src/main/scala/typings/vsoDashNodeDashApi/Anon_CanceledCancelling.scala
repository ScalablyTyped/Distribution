package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanceledCancelling extends js.Object {
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

object Anon_CanceledCancelling {
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
  ): Anon_CanceledCancelling = {
    val __obj = js.Dynamic.literal(canceled = canceled, cancelling = cancelling, failed = failed, inProgress = inProgress, notStarted = notStarted, partiallySucceeded = partiallySucceeded, skipped = skipped, succeeded = succeeded, undefined = undefined)
  
    __obj.asInstanceOf[Anon_CanceledCancelling]
  }
}

