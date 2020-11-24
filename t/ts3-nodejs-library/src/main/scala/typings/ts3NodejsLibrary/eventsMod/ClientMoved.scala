package typings.ts3NodejsLibrary.eventsMod

import typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel
import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient
import typings.ts3NodejsLibrary.enumMod.ReasonIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientMoved extends js.Object {
  
  var channel: TeamSpeakChannel = js.native
  
  var client: TeamSpeakClient = js.native
  
  var reasonid: ReasonIdentifier = js.native
}
object ClientMoved {
  
  @scala.inline
  def apply(channel: TeamSpeakChannel, client: TeamSpeakClient, reasonid: ReasonIdentifier): ClientMoved = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientMoved]
  }
  
  @scala.inline
  implicit class ClientMovedOps[Self <: ClientMoved] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: TeamSpeakChannel): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient(value: TeamSpeakClient): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonid(value: ReasonIdentifier): Self = this.set("reasonid", value.asInstanceOf[js.Any])
  }
}
