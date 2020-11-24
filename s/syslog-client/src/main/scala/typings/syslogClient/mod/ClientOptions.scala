package typings.syslogClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOptions extends js.Object {
  
  var appName: js.UndefOr[String] = js.native
  
  var dateFormatter: js.UndefOr[js.Function0[String]] = js.native
  
  var facility: js.UndefOr[Facility] = js.native
  
  var msgid: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var rfc3164: js.UndefOr[Boolean] = js.native
  
  var severity: js.UndefOr[Severity] = js.native
  
  var syslogHostname: js.UndefOr[String] = js.native
  
  var tcpTimeout: js.UndefOr[Double] = js.native
  
  var timestamp: js.UndefOr[Date] = js.native
  
  var transport: js.UndefOr[Transport] = js.native
}
object ClientOptions {
  
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
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
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppName: Self = this.set("appName", js.undefined)
    
    @scala.inline
    def setDateFormatter(value: () => String): Self = this.set("dateFormatter", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDateFormatter: Self = this.set("dateFormatter", js.undefined)
    
    @scala.inline
    def setFacility(value: Facility): Self = this.set("facility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacility: Self = this.set("facility", js.undefined)
    
    @scala.inline
    def setMsgid(value: String): Self = this.set("msgid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgid: Self = this.set("msgid", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setRfc3164(value: Boolean): Self = this.set("rfc3164", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRfc3164: Self = this.set("rfc3164", js.undefined)
    
    @scala.inline
    def setSeverity(value: Severity): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    
    @scala.inline
    def setSyslogHostname(value: String): Self = this.set("syslogHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyslogHostname: Self = this.set("syslogHostname", js.undefined)
    
    @scala.inline
    def setTcpTimeout(value: Double): Self = this.set("tcpTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTcpTimeout: Self = this.set("tcpTimeout", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setTransport(value: Transport): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
  }
}
