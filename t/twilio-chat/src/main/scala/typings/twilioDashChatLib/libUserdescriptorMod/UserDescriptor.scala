package typings
package twilioDashChatLib.libUserdescriptorMod

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
  * @constructor
  * @param {Users} users Users instance
  * @param {Object} descriptor User descriptor data object
  */
@JSImport("twilio-chat/lib/userdescriptor", "UserDescriptor")
@js.native
class UserDescriptor protected () extends js.Object {
  /**
    * @param {UserDescriptorServices} services - services, needed for UserDescriptor
    * @param {Object} descriptor User descriptor data object
    * @private
    */
  def this(services: UserDescriptorServices, descriptor: js.Any) = this()
  val attributes: js.Object = js.native
  var descriptor: js.Any = js.native
  val friendlyName: java.lang.String = js.native
  val identity: java.lang.String = js.native
  val notifiable: scala.Boolean = js.native
  val online: scala.Boolean = js.native
  var services: js.Any = js.native
  def _getDescriptor(): js.Any = js.native
  /**
    * Gets User object from descriptor and subscribes to it.
    * @returns {Promise<User>}
    */
  def subscribe(): js.Promise[twilioDashChatLib.libUserMod.User] = js.native
}

