package typings.twilioDashChat.libDataUsersMod

import typings.node.eventsMod.EventEmitter
import typings.twilioDashChat.libInterfacesPaginatorMod.Paginator
import typings.twilioDashChat.libUserMod.User
import typings.twilioDashChat.libUserdescriptorMod.UserDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc Container for known users
  * @fires Users#userUpdated
  */
@JSImport("twilio-chat/lib/data/users", "Users")
@js.native
class Users protected () extends EventEmitter {
  def this(services: UsersServices) = this()
  var fifoStack: js.Any = js.native
  var fifoStackMaxLength: js.Any = js.native
  var handleSubscribeUser: js.Any = js.native
  var handleUnsubscribeUser: js.Any = js.native
  val myself: User = js.native
  var services: js.Any = js.native
  var subscribedUsers: js.Any = js.native
  var userDescriptors: js.Any = js.native
  var userDescriptorsPromise: js.Any = js.native
  /**
    * @returns {Promise<Paginator<UserDescriptor>>} Users descriptors page for given channel sid
    */
  def getChannelUserDescriptors(channelSid: String): js.Promise[Paginator[UserDescriptor]] = js.native
  /**
    * @returns {Promise<Array<User>>} returns list of subscribed User objects {@see User}
    */
  def getSubscribedUsers(): js.Promise[js.Array[User]] = js.native
  /**
    * Gets user, if it's in subscribed list - then return the user object from it,
    * if not - then subscribes and adds user to the FIFO stack
    * @returns {Promise<User>} Fully initialized user
    */
  def getUser(identity: String): js.Promise[User] = js.native
  def getUser(identity: String, entityName: String): js.Promise[User] = js.native
  /**
    * @returns {Promise<UserDescriptor>} User descriptor
    */
  def getUserDescriptor(identity: String): js.Promise[UserDescriptor] = js.native
}

