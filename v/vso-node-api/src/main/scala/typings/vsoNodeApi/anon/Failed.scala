package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Failed extends js.Object {
  var failed: scala.Double
  var succeeded: scala.Double
  var unknown: scala.Double
}

object Failed {
  @scala.inline
  def apply(failed: scala.Double, succeeded: scala.Double, unknown: scala.Double): Failed = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failed]
  }
}

