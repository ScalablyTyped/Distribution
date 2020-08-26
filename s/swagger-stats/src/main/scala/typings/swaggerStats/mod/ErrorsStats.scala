package typings.swaggerStats.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorsStats extends js.Object {
  var statuscode: Record[Double, Double] = js.native
  var topnotfound: Record[String, Double] = js.native
  var topservererror: Record[String, Double] = js.native
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
  @scala.inline
  implicit class ErrorsStatsOps[Self <: ErrorsStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStatuscode(value: Record[Double, Double]): Self = this.set("statuscode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopnotfound(value: Record[String, Double]): Self = this.set("topnotfound", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopservererror(value: Record[String, Double]): Self = this.set("topservererror", value.asInstanceOf[js.Any])
  }
  
}

