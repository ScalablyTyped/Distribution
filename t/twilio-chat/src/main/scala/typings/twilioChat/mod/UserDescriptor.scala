package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains extended user information.
  */
@JSImport("twilio-chat", "UserDescriptor")
@js.native
open class UserDescriptor protected () extends StObject {
  /**
    * @internal
    */
  def this(services: UserDescriptorServices, descriptor: Any) = this()
  
  def _getDescriptor(): Any = js.native
  
  /**
    * Custom attributes of the user.
    */
  val attributes: Any = js.native
  
  /* private */ var descriptor: Any = js.native
  
  /**
    * Friendly name of the user, null if not set.
    */
  val friendlyName: String = js.native
  
  /**
    * User identity.
    */
  val identity: String = js.native
  
  /**
    * User push notification registration status.
    *
    * Works only when the reachability functionality is enabled.
    * Refer to {@link Client.reachabilityEnabled}.
    */
  val notifiable: Boolean = js.native
  
  /**
    * Status of the real-time conversation connection of the user.
    *
    * Works only when the reachability functionality is enabled.
    * Refer to {@link Client.reachabilityEnabled}.
    */
  val online: Boolean = js.native
  
  /* private */ var services: Any = js.native
  
  /**
    * Get the user object from the descriptor and subscribe to it.
    */
  def subscribe(): js.Promise[User] = js.native
}
