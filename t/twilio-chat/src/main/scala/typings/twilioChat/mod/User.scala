package typings.twilioChat.mod

import typings.twilioReplayEventEmitter.mod.ReplayEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extended user information.
  * Note that `isOnline` and `isNotifiable` properties are eligible
  * for use only if the reachability function is enabled.
  * You may check if it is enabled by reading the value of {@link Client.reachabilityEnabled}.
  */
@JSImport("twilio-chat", "User")
@js.native
open class User protected () extends ReplayEventEmitter[UserEvents] {
  def this(identity: String, entityName: String, configuration: Null, services: UserServices) = this()
  /**
    * @internal
    */
  def this(identity: String, entityName: String, configuration: Configuration, services: UserServices) = this()
  
  // Not private because it is accessed from Client constructor.
  def _ensureFetched(): js.Promise[User] = js.native
  
  // Fetch user
  /* private */ var _fetch: Any = js.native
  
  /* private */ var _initializationPromise: Any = js.native
  
  def _resolveInitialization(configuration: Configuration, identity: String, entityName: String, emitUpdated: Boolean): Unit = js.native
  
  /* private */ var _resolveInitializationPromise: Any = js.native
  
  // Handles service updates
  /* private */ var _update: Any = js.native
  
  // Fetch reachability info
  /* private */ var _updateReachabilityInfo: Any = js.native
  
  /**
    * Custom attributes of the user.
    */
  def attributes: Any = js.native
  
  /* private */ var configuration: Any = js.native
  
  /* private */ var entity: Any = js.native
  
  def entityName_=(name: String): Unit = js.native
  
  /**
    * Friendly name of the user, null if not set.
    */
  def friendlyName: String = js.native
  
  /**
    * User identity.
    */
  def identity: String = js.native
  def identity_=(identity: String): Unit = js.native
  
  /**
    * True if this user is receiving real-time status updates.
    */
  def isSubscribed: Boolean = js.native
  
  /* private */ var links: Any = js.native
  
  /**
    * User push notification registration status.
    */
  def notifiable: Boolean = js.native
  
  /**
    * Status of the real-time conversation connection of the user.
    */
  def online: Boolean = js.native
  
  /* private */ var promiseToFetch: Any = js.native
  
  /* private */ val services: Any = js.native
  
  /* private */ var state: Any = js.native
  
  /* private */ var subscribed: Any = js.native
  
  /**
    * Remove the user from the subscription list.
    * @return A promise of completion.
    */
  def unsubscribe(): js.Promise[Unit] = js.native
  
  /**
    * Edit user attributes.
    * @param attributes New attributes.
    */
  def updateAttributes(attributes: Any): js.Promise[User] = js.native
  
  /**
    * Update the friendly name of the user.
    * @param friendlyName New friendly name.
    */
  def updateFriendlyName(friendlyName: Any): js.Promise[User] = js.native
  
  /**
    * Fired when the properties or the reachability status of the message have been updated.
    *
    * Parameters:
    * 1. object `data` - info object provided with the event. It has the following properties:
    *     * {@link User} `user` - the user in question
    *     * {@link UserUpdateReason}[] `updateReasons` - array of reasons for the update
    * @event
    */
  val updated: /* "updated" */ String = js.native
  
  /**
    * Fired when the client has subscribed to the user.
    *
    * Parameters:
    * 1. {@link User} `user` - the user in question
    * @event
    */
  val userSubscribed: /* "userSubscribed" */ String = js.native
  
  /**
    * Fired when the client has unsubscribed from the user.
    *
    * Parameters:
    * 1. {@link User} `user` - the user in question
    * @event
    */
  val userUnsubscribed: /* "userUnsubscribed" */ String = js.native
}
