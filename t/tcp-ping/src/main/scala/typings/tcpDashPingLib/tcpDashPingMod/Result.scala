package typings
package tcpDashPingLib.tcpDashPingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var address: java.lang.String
  var attempts: scala.Double
  var avg: scala.Double
  var max: scala.Double
  var min: scala.Double
  var port: scala.Double
  var results: js.Array[Results]
}

object Result {
  @scala.inline
  def apply(
    address: java.lang.String,
    attempts: scala.Double,
    avg: scala.Double,
    max: scala.Double,
    min: scala.Double,
    port: scala.Double,
    results: js.Array[Results]
  ): Result = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("attempts")(attempts)
    __obj.updateDynamic("avg")(avg)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[Result]
  }
}

