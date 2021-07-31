package typings.twilioChat

import typings.node.eventsMod.EventEmitter
import typings.twilioChat.networkMod.Network
import typings.twilioChat.paginatorMod.Paginator
import typings.twilioChat.sessionMod.Session
import typings.twilioChat.userMod.User
import typings.twilioChat.userdescriptorMod.UserDescriptor
import typings.twilioSync.mod.SyncClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usersMod {
  
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
    
    var handleSubscribeUser: js.Any = js.native
    
    var handleUnsubscribeUser: js.Any = js.native
    
    val myself: User = js.native
    
    var services: js.Any = js.native
    
    var subscribedUsers: js.Any = js.native
    
    var userDescriptors: js.Any = js.native
    
    var userDescriptorsPromise: js.Any = js.native
  }
  
  trait UsersServices extends StObject {
    
    var network: Network
    
    var session: Session
    
    var syncClient: SyncClient
  }
  object UsersServices {
    
    @scala.inline
    def apply(network: Network, session: Session, syncClient: SyncClient): UsersServices = {
      val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsersServices]
    }
    
    @scala.inline
    implicit class UsersServicesMutableBuilder[Self <: UsersServices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncClient(value: SyncClient): Self = StObject.set(x, "syncClient", value.asInstanceOf[js.Any])
    }
  }
}
