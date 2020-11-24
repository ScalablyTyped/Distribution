package typings.twilioChat.userMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
class User_ protected () extends EventEmitter {
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
  
  var entity: js.Any = js.native
  
  def entityName_=(name: String): Unit = js.native
  
  def friendlyName: String = js.native
  
  def identity: String = js.native
  def identity_=(identity: String): Unit = js.native
  
  def isSubscribed: Boolean = js.native
  
  def notifiable: Boolean = js.native
  
  def online: Boolean = js.native
  
  var promiseToFetch: js.Any = js.native
  
  var services: js.Any = js.native
  
  var state: js.Any = js.native
  
  var subscribed: js.Any = js.native
  
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
