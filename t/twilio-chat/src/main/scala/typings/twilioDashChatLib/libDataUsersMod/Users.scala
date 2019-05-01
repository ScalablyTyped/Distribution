package typings
package twilioDashChatLib.libDataUsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc Container for known users
  * @fires Users#userUpdated
  */
@JSImport("twilio-chat/lib/data/users", "Users")
@js.native
class Users protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(services: UsersServices) = this()
  var fifoStack: js.Any = js.native
  var fifoStackMaxLength: js.Any = js.native
  var handleSubscribeUser: js.Any = js.native
  var handleUnsubscribeUser: js.Any = js.native
  val myself: twilioDashChatLib.libUserMod.User = js.native
  var services: js.Any = js.native
  var subscribedUsers: js.Any = js.native
  var userDescriptors: js.Any = js.native
  var userDescriptorsPromise: js.Any = js.native
  /**
    * @returns {Promise<Paginator<UserDescriptor>>} Users descriptors page for given channel sid
    */
  def getChannelUserDescriptors(channelSid: java.lang.String): js.Promise[
    twilioDashChatLib.libInterfacesPaginatorMod.Paginator[twilioDashChatLib.libUserdescriptorMod.UserDescriptor]
  ] = js.native
  /**
    * @returns {Promise<Array<User>>} returns list of subscribed User objects {@see User}
    */
  def getSubscribedUsers(): js.Promise[js.Array[twilioDashChatLib.libUserMod.User]] = js.native
  /**
    * Gets user, if it's in subscribed list - then return the user object from it,
    * if not - then subscribes and adds user to the FIFO stack
    * @returns {Promise<User>} Fully initialized user
    */
  def getUser(identity: java.lang.String): js.Promise[twilioDashChatLib.libUserMod.User] = js.native
  def getUser(identity: java.lang.String, entityName: java.lang.String): js.Promise[twilioDashChatLib.libUserMod.User] = js.native
  /**
    * @returns {Promise<UserDescriptor>} User descriptor
    */
  def getUserDescriptor(identity: java.lang.String): js.Promise[twilioDashChatLib.libUserdescriptorMod.UserDescriptor] = js.native
}

