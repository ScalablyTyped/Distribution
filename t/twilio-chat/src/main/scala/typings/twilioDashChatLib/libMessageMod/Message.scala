package typings
package twilioDashChatLib.libMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc A Message represents a Message in a Channel.
  * @property {String} author - The name of the user that sent Message
  * @property {String} body - The body of the Message. Is null if Message is Media Message
  * @property {Object} attributes - Message custom attributes
  * @property {Channel} channel - Channel Message belongs to
  * @property {Date} dateUpdated - When Message was updated
  * @property {Number} index - Index of Message in the Channel's messages list
  * @property {String} lastUpdatedBy - Identity of the last user that updated Message
  * @property {Media} media - Contains Media information (if present)
  * @property {String} memberSid - Authoring Member's server-assigned unique identifier
  * @property {String} sid - The server-assigned unique identifier for Message
  * @property {Date} timestamp - When Message was created
  * @property {'text' | 'media' } type - Type of message: 'text' or 'media'
  * @fires Message#updated
  */
@JSImport("twilio-chat/lib/message", "Message")
@js.native
class Message protected ()
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * The update reason for <code>updated</code> event emitted on Message
    * @typedef {('body' | 'lastUpdatedBy' | 'dateUpdated' | 'timestamp' | 'attributes' | 'author')} Message#UpdateReason
    */
  def this(channel: twilioDashChatLib.libChannelMod.Channel, services: MessageServices, index: scala.Double, data: js.Any) = this()
  val attributes: js.Object = js.native
  val author: java.lang.String = js.native
  val body: java.lang.String = js.native
  val channel: twilioDashChatLib.libChannelMod.Channel = js.native
  val dateUpdated: stdLib.Date = js.native
  val index: scala.Double = js.native
  val lastUpdatedBy: java.lang.String = js.native
  val media: twilioDashChatLib.libMediaMod.Media = js.native
  val memberSid: java.lang.String = js.native
  var services: js.Any = js.native
  val sid: java.lang.String = js.native
  var state: js.Any = js.native
  val timestamp: stdLib.Date = js.native
  val `type`: twilioDashChatLib.libMessageMod.MessageNs.Type = js.native
  def _update(data: js.Any): scala.Unit = js.native
  /**
    * Get Member who is author of the Message
    * @returns {Promise<Member>}
    */
  def getMember(): js.Promise[twilioDashChatLib.libMemberMod.Member] = js.native
  /**
    * Remove the Message.
    * @returns {Promise<Message|SessionError>}
    */
  def remove(): js.Promise[Message | twilioDashChatLib.libSessionerrorMod.SessionError] = js.native
  /**
    * Edit message attributes.
    * @param {Object} attributes new attributes for Message.
    * @returns {Promise<Message|Error|SessionError>}
    */
  def updateAttributes(attributes: js.Object): js.Promise[this.type] = js.native
  /**
    * Edit message body.
    * @param {String} body - new body of Message.
    * @returns {Promise<Message|Error|SessionError>}
    */
  def updateBody(body: java.lang.String): js.Promise[Message | stdLib.Error | twilioDashChatLib.libSessionerrorMod.SessionError] = js.native
}

