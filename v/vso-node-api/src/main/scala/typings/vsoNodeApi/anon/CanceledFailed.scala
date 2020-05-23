package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanceledFailed extends js.Object {
  var canceled: scala.Double
  var failed: scala.Double
  var succeeded: scala.Double
}

object CanceledFailed {
  @scala.inline
  def apply(canceled: scala.Double, failed: scala.Double, succeeded: scala.Double): CanceledFailed = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanceledFailed]
  }
}

