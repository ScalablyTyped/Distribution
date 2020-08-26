package typings.tcpPing.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var address: String = js.native
  var attempts: Double = js.native
  var avg: Double = js.native
  var max: Double = js.native
  var min: Double = js.native
  var port: Double = js.native
  var results: js.Array[Results] = js.native
}

object Result {
  @scala.inline
  def apply(
    address: String,
    attempts: Double,
    avg: Double,
    max: Double,
    min: Double,
    port: Double,
    results: js.Array[Results]
  ): Result = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], attempts = attempts.asInstanceOf[js.Any], avg = avg.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttempts(value: Double): Self = this.set("attempts", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvg(value: Double): Self = this.set("avg", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsVarargs(value: Results*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[Results]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
  
}

