package typings.swaggerStats.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorsStats extends js.Object {
  var statuscode: Record[Double, Double]
  var topnotfound: Record[String, Double]
  var topservererror: Record[String, Double]
}

object ErrorsStats {
  @scala.inline
  def apply(
    statuscode: Record[Double, Double],
    topnotfound: Record[String, Double],
    topservererror: Record[String, Double]
  ): ErrorsStats = {
    val __obj = js.Dynamic.literal(statuscode = statuscode.asInstanceOf[js.Any], topnotfound = topnotfound.asInstanceOf[js.Any], topservererror = topservererror.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorsStats]
  }
}

