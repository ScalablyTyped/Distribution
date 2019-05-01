package typings
package twilioDashChatLib.libMemberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc A Member represents a remote Client in a Channel.
  * @property {Object} attributes - Object with custom attributes for Member
  * @property {Channel} channel - The Channel the remote Client is a Member of
  * @property {Date} dateCreated - The Date this Member was created
  * @property {Date} dateUpdated - The Date this Member was last updated
  * @property {String} identity - The identity of the remote Client
  * @property {Boolean} isTyping - Whether or not this Member is currently typing
  * @property {Number} lastConsumedMessageIndex - Latest consumed Message index by this Member.
  * Note that just retrieving messages on a client endpoint does not mean that messages are consumed/read,
  * please consider reading about [Consumption Horizon feature]{@link https://www.twilio.com/docs/api/chat/guides/consumption-horizon}
  * to find out how to mark messages as consumed.
  * @property {Date} lastConsumptionTimestamp - Date when Member has updated his consumption horizon
  * @property {String} sid - The server-assigned unique identifier for the Member
  * @property {Member#Type} type - The type of Member
  * @fires Member#typingEnded
  * @fires Member#typingStarted
  * @fires Member#updated
  */
@JSImport("twilio-chat/lib/member", "Member")
@js.native
class Member protected ()
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * The update reason for <code>updated</code> event emitted on Member
    * @typedef {('attributes' | 'dateCreated' | 'dateUpdated' | 'roleSid' |
    'lastConsumedMessageIndex' | 'lastConsumptionTimestamp')} Member#UpdateReason
    */
  /**
    * The type of Member
    * @typedef {('chat' | 'sms')} Member#Type
    */
  def this(services: MemberServices, channel: js.Any, data: MemberDescriptor, sid: java.lang.String) = this()
  val attributes: js.Object = js.native
  val channel: js.Any = js.native
  val dateCreated: stdLib.Date = js.native
  val dateUpdated: stdLib.Date = js.native
  val identity: java.lang.String = js.native
  val isTyping: scala.Boolean = js.native
  val lastConsumedMessageIndex: scala.Double = js.native
  val lastConsumptionTimestamp: stdLib.Date = js.native
  val roleSid: java.lang.String = js.native
  var services: js.Any = js.native
  val sid: java.lang.String = js.native
  var state: js.Any = js.native
  val `type`: twilioDashChatLib.libMemberMod.MemberNs.Type = js.native
  /**
    * Private method function used to stop typing indicator (with event emitting)
    * @private
    */
  def _endTyping(): scala.Unit = js.native
  /**
    * Private method used to start or reset the typing indicator timeout (with event emitting)
    * @private
    */
  def _startTyping(timeout: js.Any): this.type = js.native
  /**
    * Private method function used update local object's property roleSid with new value
    * @private
    */
  def _update(data: js.Any): this.type = js.native
  /**
    * Gets User for this member and subscribes to it. Supported only for <code>chat</code> type of Members
    * @returns {Promise<User|Error>}
    */
  def getUser(): js.Promise[twilioDashChatLib.libUserMod.User] = js.native
  /**
    * Gets User Descriptor for this member. Supported only for <code>chat</code> type of Members
    * @returns {Promise<UserDescriptor|Error>}
    */
  def getUserDescriptor(): js.Promise[twilioDashChatLib.libUserdescriptorMod.UserDescriptor] = js.native
  /**
    * Remove Member from the Channel. Supported only for <code>chat</code> type of Members
    * @returns {Promise<void|Error|SessionError>}
    */
  def remove(): js.Promise[_] = js.native
  /**
    * Edit member attributes.
    * @param {Object} attributes new attributes for Member.
    * @returns {Promise<Member|Error|SessionError>}
    */
  def updateAttributes(attributes: js.Object): js.Promise[this.type] = js.native
}

