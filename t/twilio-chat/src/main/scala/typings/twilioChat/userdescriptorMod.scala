package typings.twilioChat

import typings.twilioChat.userMod.User
import typings.twilioChat.usersMod.Users
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userdescriptorMod {
  
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
    * @constructor
    * @param {Users} users Users instance
    * @param {Object} descriptor User descriptor data object
    */
  @JSImport("twilio-chat/lib/userdescriptor", "UserDescriptor")
  @js.native
  class UserDescriptor protected () extends StObject {
    /**
      * @param {UserDescriptorServices} services - services, needed for UserDescriptor
      * @param {Object} descriptor User descriptor data object
      * @private
      */
    def this(services: UserDescriptorServices, descriptor: js.Any) = this()
    
    def _getDescriptor(): js.Any = js.native
    
    val attributes: js.Any = js.native
    
    /* private */ var descriptor: js.Any = js.native
    
    val friendlyName: String = js.native
    
    val identity: String = js.native
    
    val notifiable: Boolean = js.native
    
    val online: Boolean = js.native
    
    /* private */ var services: js.Any = js.native
    
    /**
      * Gets User object from descriptor and subscribes to it.
      * @returns {Promise<User>}
      */
    def subscribe(): js.Promise[User] = js.native
  }
  
  trait UserDescriptorServices extends StObject {
    
    var users: Users
  }
  object UserDescriptorServices {
    
    inline def apply(users: Users): UserDescriptorServices = {
      val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserDescriptorServices]
    }
    
    extension [Self <: UserDescriptorServices](x: Self) {
      
      inline def setUsers(value: Users): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
}
