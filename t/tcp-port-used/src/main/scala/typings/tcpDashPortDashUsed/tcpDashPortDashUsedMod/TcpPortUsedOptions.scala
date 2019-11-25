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
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], retryTimeMs = retryTimeMs.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timeOutMs = timeOutMs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TcpPortUsedOptions]
  }
}

