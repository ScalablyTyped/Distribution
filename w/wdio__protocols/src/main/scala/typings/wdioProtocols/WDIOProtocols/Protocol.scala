package typings.wdioProtocols.WDIOProtocols

import typings.wdioProtocols.anon.RecordCommandMethodComman
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<@wdio/protocols.WDIOProtocols.CommandPath, std.Record<@wdio/protocols.WDIOProtocols.CommandMethod, @wdio/protocols.WDIOProtocols.CommandEndpoint>> */
@js.native
trait Protocol extends js.Object {
  
  var string: RecordCommandMethodComman = js.native
}
object Protocol {
  
  @scala.inline
  def apply(string: RecordCommandMethodComman): Protocol = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protocol]
  }
  
  @scala.inline
  implicit class ProtocolOps[Self <: Protocol] (val x: Self) extends AnyVal {
    
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
    def setString(value: RecordCommandMethodComman): Self = this.set("string", value.asInstanceOf[js.Any])
  }
}
