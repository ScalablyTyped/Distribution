package typings.twilioChat.mod

import typings.twilioReplayEventEmitter.mod.ReplayEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc Container for known users
  * @fires Users#userUpdated
  */
@js.native
trait Users extends ReplayEventEmitter[UsersEvents] {
  
  /* private */ val configuration: Any = js.native
  
  /* private */ var fifoStack: Any = js.native
  
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
  
  /* private */ var handleSubscribeUser: Any = js.native
  
  /* private */ var handleUnsubscribeUser: Any = js.native
  
  val myself: User = js.native
  
  /* private */ val services: Any = js.native
  
  /* private */ var subscribedUsers: Any = js.native
  
  /* private */ var userDescriptors: Any = js.native
}
