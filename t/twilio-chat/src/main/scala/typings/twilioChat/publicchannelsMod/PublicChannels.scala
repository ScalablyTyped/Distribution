package typings.twilioChat.publicchannelsMod

import typings.twilioChat.channeldescriptorMod.ChannelDescriptor
import typings.twilioChat.mod.Client
import typings.twilioChat.restpaginatorMod.RestPaginator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Public channels collection
  * It's a cassandra-backed pull-based collection
  */
@JSImport("twilio-chat/lib/data/publicchannels", "PublicChannels")
@js.native
class PublicChannels protected () extends js.Object {
  def this(client: Client, services: PublicChannelServices, url: String) = this()
  
  var client: js.Any = js.native
  
  def getChannelBySid(sid: String): js.Promise[ChannelDescriptor] = js.native
  
  def getChannelByUniqueName(uniqueName: String): js.Promise[ChannelDescriptor] = js.native
  
  def getChannels(): js.Promise[RestPaginator[ChannelDescriptor]] = js.native
  def getChannels(args: js.Any): js.Promise[RestPaginator[ChannelDescriptor]] = js.native
  
  var services: js.Any = js.native
  
  var url: js.Any = js.native
}
