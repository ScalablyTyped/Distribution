package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanceledCancelling extends js.Object {
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

object Anon_CanceledCancelling {
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
  ): Anon_CanceledCancelling = {
    val __obj = js.Dynamic.literal(canceled = canceled, cancelling = cancelling, failed = failed, inProgress = inProgress, notStarted = notStarted, partiallySucceeded = partiallySucceeded, skipped = skipped, succeeded = succeeded, undefined = undefined)
  
    __obj.asInstanceOf[Anon_CanceledCancelling]
  }
}

