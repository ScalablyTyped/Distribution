package typings
package tcpDashPortDashUsedLib.tcpDashPortDashUsedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpPortUsedOptions extends js.Object {
  var host: java.lang.String
  var port: scala.Double
  var retryTimeMs: scala.Double
  var status: scala.Boolean
  var timeOutMs: scala.Double
}

object TcpPortUsedOptions {
  @scala.inline
  def apply(
    host: java.lang.String,
    port: scala.Double,
    retryTimeMs: scala.Double,
    status: scala.Boolean,
    timeOutMs: scala.Double
  ): TcpPortUsedOptions = {
    val __obj = js.Dynamic.literal(host = host, port = port, retryTimeMs = retryTimeMs, status = status, timeOutMs = timeOutMs)
  
    __obj.asInstanceOf[TcpPortUsedOptions]
  }
}

