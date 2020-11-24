package typings.wdioProtocols.anon

import typings.wdioProtocols.WDIOProtocols.CommandEndpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<@wdio/protocols.WDIOProtocols.CommandMethod, @wdio/protocols.WDIOProtocols.CommandEndpoint> */
@js.native
trait RecordCommandMethodComman extends js.Object {
  
  var DELETE: CommandEndpoint = js.native
  
  var GET: CommandEndpoint = js.native
  
  var POST: CommandEndpoint = js.native
}
object RecordCommandMethodComman {
  
  @scala.inline
  def apply(DELETE: CommandEndpoint, GET: CommandEndpoint, POST: CommandEndpoint): RecordCommandMethodComman = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordCommandMethodComman]
  }
  
  @scala.inline
  implicit class RecordCommandMethodCommanOps[Self <: RecordCommandMethodComman] (val x: Self) extends AnyVal {
    
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
    def setDELETE(value: CommandEndpoint): Self = this.set("DELETE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGET(value: CommandEndpoint): Self = this.set("GET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPOST(value: CommandEndpoint): Self = this.set("POST", value.asInstanceOf[js.Any])
  }
}
