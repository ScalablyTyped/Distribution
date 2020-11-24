package typings.ts3NodejsLibrary.eventsMod

import typings.ts3NodejsLibrary.anon.Cfid
import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientDisconnect extends js.Object {
  
  var client: js.UndefOr[TeamSpeakClient] = js.native
  
  var event: Cfid = js.native
}
object ClientDisconnect {
  
  @scala.inline
  def apply(event: Cfid): ClientDisconnect = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDisconnect]
  }
  
  @scala.inline
  implicit class ClientDisconnectOps[Self <: ClientDisconnect] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: Cfid): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient(value: TeamSpeakClient): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
  }
}
