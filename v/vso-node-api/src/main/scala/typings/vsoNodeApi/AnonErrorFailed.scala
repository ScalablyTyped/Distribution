package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorFailed extends js.Object {
  var error: Double
  var failed: Double
  var notApplicable: Double
  var notSet: Double
  var pending: Double
  var succeeded: Double
}

object AnonErrorFailed {
  @scala.inline
  def apply(
    error: Double,
    failed: Double,
    notApplicable: Double,
    notSet: Double,
    pending: Double,
    succeeded: Double
  ): AnonErrorFailed = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], notApplicable = notApplicable.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrorFailed]
  }
}

