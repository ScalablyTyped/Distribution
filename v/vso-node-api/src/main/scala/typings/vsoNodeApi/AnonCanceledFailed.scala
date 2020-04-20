package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanceledFailed extends js.Object {
  var canceled: Double
  var failed: Double
  var succeeded: Double
}

object AnonCanceledFailed {
  @scala.inline
  def apply(canceled: Double, failed: Double, succeeded: Double): AnonCanceledFailed = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCanceledFailed]
  }
}

