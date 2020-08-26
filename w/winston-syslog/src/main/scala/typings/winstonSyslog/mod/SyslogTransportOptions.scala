package typings.winstonSyslog.mod

import typings.winstonTransport.mod.TransportStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyslogTransportOptions extends TransportStreamOptions {
  var app_name: js.UndefOr[String] = js.native
  var eol: js.UndefOr[String] = js.native
  var facility: js.UndefOr[String] = js.native
  var host: js.UndefOr[String] = js.native
  var localhost: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var pid: js.UndefOr[Double] = js.native
  var port: js.UndefOr[Double] = js.native
  var protocol: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object SyslogTransportOptions {
  @scala.inline
  def apply(): SyslogTransportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyslogTransportOptions]
  }
  @scala.inline
  implicit class SyslogTransportOptionsOps[Self <: SyslogTransportOptions] (val x: Self) extends AnyVal {
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
    def setApp_name(value: String): Self = this.set("app_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp_name: Self = this.set("app_name", js.undefined)
    @scala.inline
    def setEol(value: String): Self = this.set("eol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEol: Self = this.set("eol", js.undefined)
    @scala.inline
    def setFacility(value: String): Self = this.set("facility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacility: Self = this.set("facility", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setLocalhost(value: String): Self = this.set("localhost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalhost: Self = this.set("localhost", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePid: Self = this.set("pid", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

