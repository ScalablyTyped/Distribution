package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelledFailed extends js.Object {
  var cancelled: Double
  var failed: Double
  var inProgress: Double
  var notFound: Double
  var notSet: Double
  var queued: Double
  var succeeded: Double
  var timedOut: Double
}

object Anon_CancelledFailed {
  @scala.inline
  def apply(
    cancelled: Double,
    failed: Double,
    inProgress: Double,
    notFound: Double,
    notSet: Double,
    queued: Double,
    succeeded: Double,
    timedOut: Double
  ): Anon_CancelledFailed = {
    val __obj = js.Dynamic.literal(cancelled = cancelled, failed = failed, inProgress = inProgress, notFound = notFound, notSet = notSet, queued = queued, succeeded = succeeded, timedOut = timedOut)
  
    __obj.asInstanceOf[Anon_CancelledFailed]
  }
}

