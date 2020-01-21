package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFailed extends js.Object {
  var failed: Double
  var succeeded: Double
  var unknown: Double
}

object AnonFailed {
  @scala.inline
  def apply(failed: Double, succeeded: Double, unknown: Double): AnonFailed = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFailed]
  }
}

