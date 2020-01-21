package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanceledFailedSucceeded extends js.Object {
  var canceled: Double
  var failed: Double
  var succeeded: Double
}

object AnonCanceledFailedSucceeded {
  @scala.inline
  def apply(canceled: Double, failed: Double, succeeded: Double): AnonCanceledFailedSucceeded = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCanceledFailedSucceeded]
  }
}

