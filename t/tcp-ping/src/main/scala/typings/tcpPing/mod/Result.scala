package typings.tcpPing.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var address: String
  var attempts: Double
  var avg: Double
  var max: Double
  var min: Double
  var port: Double
  var results: js.Array[Results]
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
}

