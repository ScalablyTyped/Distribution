package typings.twilioChat.userdescriptorsMod

import typings.twilioChat.restpaginatorMod.RestPaginator
import typings.twilioChat.userdescriptorMod.UserDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-chat/lib/data/userdescriptors", "UserDescriptors")
@js.native
class UserDescriptors protected () extends js.Object {
  def this(services: UserDescriptorsServices, url: String) = this()
  
  def getChannelUserDescriptors(channelSid: String): js.Promise[RestPaginator[UserDescriptor]] = js.native
  def getChannelUserDescriptors(channelSid: String, args: js.Any): js.Promise[RestPaginator[UserDescriptor]] = js.native
  
  def getUserDescriptor(identity: String): js.Promise[UserDescriptor] = js.native
  
  var services: js.Any = js.native
  
  var url: js.Any = js.native
}
