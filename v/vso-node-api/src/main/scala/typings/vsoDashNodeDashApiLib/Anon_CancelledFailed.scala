package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelledFailed extends js.Object {
  var cancelled: scala.Double
  var failed: scala.Double
  var inProgress: scala.Double
  var notFound: scala.Double
  var notSet: scala.Double
  var queued: scala.Double
  var succeeded: scala.Double
  var timedOut: scala.Double
}

object Anon_CancelledFailed {
  @scala.inline
  def apply(
    cancelled: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    notFound: scala.Double,
    notSet: scala.Double,
    queued: scala.Double,
    succeeded: scala.Double,
    timedOut: scala.Double
  ): Anon_CancelledFailed = {
    val __obj = js.Dynamic.literal(cancelled = cancelled, failed = failed, inProgress = inProgress, notFound = notFound, notSet = notSet, queued = queued, succeeded = succeeded, timedOut = timedOut)
  
    __obj.asInstanceOf[Anon_CancelledFailed]
  }
}

