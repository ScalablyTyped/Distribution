package typings.twilioChat.memberMod

import typings.node.eventsMod.EventEmitter
import typings.std.Date
import typings.twilioChat.memberMod.Member.Type
import typings.twilioChat.userMod.User
import typings.twilioChat.userdescriptorMod.UserDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc A Member represents a remote Client in a Channel.
  * @property {any} attributes - Object with custom attributes for Member
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
class Member_ protected () extends EventEmitter {
  /**
    * The update reason for <code>updated</code> event emitted on Member
    * @typedef {('attributes' | 'dateCreated' | 'dateUpdated' | 'roleSid' |
    'lastConsumedMessageIndex' | 'lastConsumptionTimestamp')} Member#UpdateReason
    */
  /**
    * The type of Member
    * @typedef {('chat' | 'sms' | 'whatsapp')} Member#Type
    */
  def this(services: MemberServices, channel: js.Any, data: MemberDescriptor, sid: String) = this()
  val channel: js.Any = js.native
  var services: js.Any = js.native
  var state: js.Any = js.native
  /**
    * Private method function used to stop typing indicator (with event emitting)
    * @private
    */
  def _endTyping(): Unit = js.native
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
  def attributes: js.Object = js.native
  def dateCreated: Date = js.native
  def dateUpdated: Date = js.native
  /**
    * Gets User for this member and subscribes to it. Supported only for <code>chat</code> type of Members
    * @returns {Promise<User|Error>}
    */
  def getUser(): js.Promise[User] = js.native
  /**
    * Gets User Descriptor for this member. Supported only for <code>chat</code> type of Members
    * @returns {Promise<UserDescriptor|Error>}
    */
  def getUserDescriptor(): js.Promise[UserDescriptor] = js.native
  def identity: String = js.native
  def isTyping: Boolean = js.native
  def lastConsumedMessageIndex: Double = js.native
  def lastConsumptionTimestamp: Date = js.native
  /**
    * Remove Member from the Channel.
    * @returns {Promise<void|Error|SessionError>}
    */
  def remove(): js.Promise[_] = js.native
  def roleSid: String = js.native
  def sid: String = js.native
  def `type`: Type = js.native
  /**
    * Edit member attributes.
    * @param {any} attributes new attributes for Member.
    * @returns {Promise<Member|Error|SessionError>}
    */
  def updateAttributes(attributes: js.Any): js.Promise[this.type] = js.native
}

