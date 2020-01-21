package typings.twilioChat.userchannelsMod

import typings.twilioChat.channeldescriptorMod.ChannelDescriptor
import typings.twilioChat.mod.Client
import typings.twilioChat.restpaginatorMod.RestPaginator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Users channels collection
  * It's a cassandra-backed pull-based collection
  */
@JSImport("twilio-chat/lib/data/userchannels", "UserChannels")
@js.native
class UserChannels protected () extends js.Object {
  def this(client: Client, services: UserChannelServices, url: String) = this()
  var client: js.Any = js.native
  var services: js.Any = js.native
  var url: js.Any = js.native
  def getChannels(): js.Promise[RestPaginator[ChannelDescriptor]] = js.native
  def getChannels(args: js.Any): js.Promise[RestPaginator[ChannelDescriptor]] = js.native
}

