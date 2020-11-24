package typings.syslogClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageOptions extends js.Object {
  
  var appName: js.UndefOr[String] = js.native
  
  var facility: js.UndefOr[Facility] = js.native
  
  var msgid: js.UndefOr[String] = js.native
  
  var rfc3164: js.UndefOr[Boolean] = js.native
  
  var severity: js.UndefOr[Severity] = js.native
  
  var syslogHostname: js.UndefOr[String] = js.native
  
  var timestamp: js.UndefOr[Date] = js.native
}
object MessageOptions {
  
  @scala.inline
  def apply(): MessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageOptions]
  }
  
  @scala.inline
  implicit class MessageOptionsOps[Self <: MessageOptions] (val x: Self) extends AnyVal {
    
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
    def setFacility(value: Facility): Self = this.set("facility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacility: Self = this.set("facility", js.undefined)
    
    @scala.inline
    def setMsgid(value: String): Self = this.set("msgid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgid: Self = this.set("msgid", js.undefined)
    
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
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
}
