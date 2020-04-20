package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSucceeded extends js.Object {
  var failed: Double
  var inProgress: Double
  var none: Double
  var pending: Double
  var succeeded: Double
}

object AnonSucceeded {
  @scala.inline
  def apply(failed: Double, inProgress: Double, none: Double, pending: Double, succeeded: Double): AnonSucceeded = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSucceeded]
  }
}

