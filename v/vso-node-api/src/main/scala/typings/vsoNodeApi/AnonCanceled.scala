package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanceled extends js.Object {
  var canceled: Double
  var failed: Double
  var none: Double
  var partiallySucceeded: Double
  var succeeded: Double
}

object AnonCanceled {
  @scala.inline
  def apply(canceled: Double, failed: Double, none: Double, partiallySucceeded: Double, succeeded: Double): AnonCanceled = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCanceled]
  }
}

