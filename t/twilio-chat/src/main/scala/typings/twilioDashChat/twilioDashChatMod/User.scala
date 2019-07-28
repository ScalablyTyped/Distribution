package typings.twilioDashChat.twilioDashChatMod

import typings.twilioDashChat.libUserMod.UserServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc Extended user information.
  * Note that <code>online</code> and <code>notifiable</code> properties are eligible
  * to use only if reachability function is enabled.
  * You may check if it is enabled by reading value of {@link Client}'s <code>reachabilityEnabled</code> property.
  *
  * @property {String} identity - User identity
  * @property {String} friendlyName - User friendly name, null if not set
  * @property {Object} attributes - Object with custom attributes for user
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
@JSImport("twilio-chat", "User")
@js.native
class User protected ()
  extends typings.twilioDashChat.libUserMod.User {
  /**
    * The update reason for <code>updated</code> event emitted on User
    * @typedef {('friendlyName' | 'attributes' | 'online' | 'notifiable')} User#UpdateReason
    */
  def this(identity: String, entityName: String, services: UserServices) = this()
}

