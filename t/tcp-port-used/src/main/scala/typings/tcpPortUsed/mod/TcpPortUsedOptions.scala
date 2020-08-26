package typings.tcpPortUsed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TcpPortUsedOptions extends js.Object {
  var host: String = js.native
  var port: Double = js.native
  var retryTimeMs: Double = js.native
  var status: Boolean = js.native
  var timeOutMs: Double = js.native
}

object TcpPortUsedOptions {
  @scala.inline
  def apply(host: String, port: Double, retryTimeMs: Double, status: Boolean, timeOutMs: Double): TcpPortUsedOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], retryTimeMs = retryTimeMs.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timeOutMs = timeOutMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpPortUsedOptions]
  }
  @scala.inline
  implicit class TcpPortUsedOptionsOps[Self <: TcpPortUsedOptions] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetryTimeMs(value: Double): Self = this.set("retryTimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Boolean): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeOutMs(value: Double): Self = this.set("timeOutMs", value.asInstanceOf[js.Any])
  }
  
}

