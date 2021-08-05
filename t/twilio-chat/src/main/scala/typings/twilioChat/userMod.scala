package typings.twilioChat

import typings.node.eventsMod.EventEmitter
import typings.twilioChat.sessionMod.Session
import typings.twilioSync.mod.SyncClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userMod {
  
  /**
    * @classdesc Extended user information.
    * Note that <code>online</code> and <code>notifiable</code> properties are eligible
    * to use only if reachability function is enabled.
    * You may check if it is enabled by reading value of {@link Client}'s <code>reachabilityEnabled</code> property.
    *
    * @property {String} identity - User identity
    * @property {String} friendlyName - User friendly name, null if not set
    * @property {any} attributes - Object with custom attributes for user
    * @property {Boolean} online - User real-time channel connection status
    * @property {Boolean} notifiable - User push notification registration status
    *
    * @fires User#updated
    * @fires User#userSubscribed
    * @fires User#userUnsubscribed
    *
    * @constructor
    * @param {String} identity - Identity of user
    * @param {String} entityId - id of user's object
    * @param {Object} datasync - datasync service
    * @param {Object} session - session service
    */
  @JSImport("twilio-chat/lib/user", "User")
  @js.native
  class User protected () extends EventEmitter {
    /**
      * The update reason for <code>updated</code> event emitted on User
      * @typedef {('friendlyName' | 'attributes' | 'online' | 'notifiable')} User#UpdateReason
      */
    def this(identity: String, entityName: String, services: UserServices) = this()
    
    def _ensureFetched(): js.Promise[User] = js.native
    
    def _fetch(): js.Promise[User] = js.native
    
    def _update(key: String, value: js.Any): Unit = js.native
    
    def _updateReachabilityInfo(map: js.Any, update: js.Any): js.Any = js.native
    
    def attributes: js.Any = js.native
    
    /* private */ var entity: js.Any = js.native
    
    def entityName_=(name: String): Unit = js.native
    
    def friendlyName: String = js.native
    
    def identity: String = js.native
    def identity_=(identity: String): Unit = js.native
    
    def isSubscribed: Boolean = js.native
    
    def notifiable: Boolean = js.native
    
    def online: Boolean = js.native
    
    /* private */ var promiseToFetch: js.Any = js.native
    
    /* private */ var services: js.Any = js.native
    
    /* private */ var state: js.Any = js.native
    
    /* private */ var subscribed: js.Any = js.native
    
    /**
      * Removes User from subscription list.
      * @returns {Promise<void>} Promise of completion
      */
    def unsubscribe(): js.Promise[Unit] = js.native
    
    /**
      * Updates user attributes.
      * @param {any} attributes new attributes for User.
      * @returns {Promise<User|Error|SessionError>}
      */
    def updateAttributes(attributes: js.Any): js.Promise[this.type] = js.native
    
    /**
      * Update Users friendlyName.
      * @param {String} friendlyName - Updated friendlyName
      * @returns {Promise<User|Error|SessionError>}
      */
    def updateFriendlyName(friendlyName: js.Any): js.Promise[this.type] = js.native
  }
  object User {
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilioChat.twilioChatStrings.initializing
      - typings.twilioChat.twilioChatStrings.subscribed
      - typings.twilioChat.twilioChatStrings.unsubscribed
    */
    trait SubscriptionState extends StObject
    object SubscriptionState {
      
      inline def initializing: typings.twilioChat.twilioChatStrings.initializing = "initializing".asInstanceOf[typings.twilioChat.twilioChatStrings.initializing]
      
      inline def subscribed: typings.twilioChat.twilioChatStrings.subscribed = "subscribed".asInstanceOf[typings.twilioChat.twilioChatStrings.subscribed]
      
      inline def unsubscribed: typings.twilioChat.twilioChatStrings.unsubscribed = "unsubscribed".asInstanceOf[typings.twilioChat.twilioChatStrings.unsubscribed]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilioChat.twilioChatStrings.friendlyName
      - typings.twilioChat.twilioChatStrings.attributes
      - typings.twilioChat.twilioChatStrings.online
      - typings.twilioChat.twilioChatStrings.notifiable
    */
    trait UpdateReason extends StObject
    object UpdateReason {
      
      inline def attributes: typings.twilioChat.twilioChatStrings.attributes = "attributes".asInstanceOf[typings.twilioChat.twilioChatStrings.attributes]
      
      inline def friendlyName: typings.twilioChat.twilioChatStrings.friendlyName = "friendlyName".asInstanceOf[typings.twilioChat.twilioChatStrings.friendlyName]
      
      inline def notifiable: typings.twilioChat.twilioChatStrings.notifiable = "notifiable".asInstanceOf[typings.twilioChat.twilioChatStrings.notifiable]
      
      inline def online: typings.twilioChat.twilioChatStrings.online = "online".asInstanceOf[typings.twilioChat.twilioChatStrings.online]
    }
    
    trait UpdatedEventArgs extends StObject {
      
      var updateReasons: js.Array[UpdateReason]
      
      var user: User
    }
    object UpdatedEventArgs {
      
      inline def apply(updateReasons: js.Array[UpdateReason], user: User): UpdatedEventArgs = {
        val __obj = js.Dynamic.literal(updateReasons = updateReasons.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
        __obj.asInstanceOf[UpdatedEventArgs]
      }
      
      extension [Self <: UpdatedEventArgs](x: Self) {
        
        inline def setUpdateReasons(value: js.Array[UpdateReason]): Self = StObject.set(x, "updateReasons", value.asInstanceOf[js.Any])
        
        inline def setUpdateReasonsVarargs(value: UpdateReason*): Self = StObject.set(x, "updateReasons", js.Array(value :_*))
        
        inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait UserServices extends StObject {
    
    var session: Session
    
    var syncClient: SyncClient
  }
  object UserServices {
    
    inline def apply(session: Session, syncClient: SyncClient): UserServices = {
      val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserServices]
    }
    
    extension [Self <: UserServices](x: Self) {
      
      inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSyncClient(value: SyncClient): Self = StObject.set(x, "syncClient", value.asInstanceOf[js.Any])
    }
  }
}
