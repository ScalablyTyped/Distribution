package typings.twilioDashChat.libDataUserdescriptorsMod

import typings.twilioDashChat.libRestpaginatorMod.RestPaginator
import typings.twilioDashChat.libUserdescriptorMod.UserDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-chat/lib/data/userdescriptors", "UserDescriptors")
@js.native
class UserDescriptors protected () extends js.Object {
  def this(services: UserDescriptorsServices, url: String) = this()
  var services: js.Any = js.native
  var url: js.Any = js.native
  def getChannelUserDescriptors(channelSid: String): js.Promise[RestPaginator[UserDescriptor]] = js.native
  def getChannelUserDescriptors(channelSid: String, args: js.Any): js.Promise[RestPaginator[UserDescriptor]] = js.native
  def getUserDescriptor(identity: String): js.Promise[UserDescriptor] = js.native
}

