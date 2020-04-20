package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConflicts extends js.Object {
  var conflicts: Double
  var failure: Double
  var notSet: Double
  var queued: Double
  var rejectedByPolicy: Double
  var succeeded: Double
}

object AnonConflicts {
  @scala.inline
  def apply(
    conflicts: Double,
    failure: Double,
    notSet: Double,
    queued: Double,
    rejectedByPolicy: Double,
    succeeded: Double
  ): AnonConflicts = {
    val __obj = js.Dynamic.literal(conflicts = conflicts.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], rejectedByPolicy = rejectedByPolicy.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConflicts]
  }
}

