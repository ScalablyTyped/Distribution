package typings.ts3NodejsLibrary.eventsMod

import typings.std.Record
import typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel
import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelEdit extends js.Object {
  
  var channel: TeamSpeakChannel = js.native
  
  var invoker: TeamSpeakClient = js.native
  
  var modified: Record[String, _] = js.native
  
  var reasonid: Double = js.native
}
object ChannelEdit {
  
  @scala.inline
  def apply(channel: TeamSpeakChannel, invoker: TeamSpeakClient, modified: Record[String, _], reasonid: Double): ChannelEdit = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], invoker = invoker.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelEdit]
  }
  
  @scala.inline
  implicit class ChannelEditOps[Self <: ChannelEdit] (val x: Self) extends AnyVal {
    
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
    def setInvoker(value: TeamSpeakClient): Self = this.set("invoker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModified(value: Record[String, _]): Self = this.set("modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonid(value: Double): Self = this.set("reasonid", value.asInstanceOf[js.Any])
  }
}
