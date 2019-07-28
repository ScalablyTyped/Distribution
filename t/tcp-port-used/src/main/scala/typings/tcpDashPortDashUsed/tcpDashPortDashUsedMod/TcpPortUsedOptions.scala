package typings.tcpDashPortDashUsed.tcpDashPortDashUsedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpPortUsedOptions extends js.Object {
  var host: String
  var port: Double
  var retryTimeMs: Double
  var status: Boolean
  var timeOutMs: Double
}

object TcpPortUsedOptions {
  @scala.inline
  def apply(host: String, port: Double, retryTimeMs: Double, status: Boolean, timeOutMs: Double): TcpPortUsedOptions = {
    val __obj = js.Dynamic.literal(host = host, port = port, retryTimeMs = retryTimeMs, status = status, timeOutMs = timeOutMs)
  
    __obj.asInstanceOf[TcpPortUsedOptions]
  }
}

