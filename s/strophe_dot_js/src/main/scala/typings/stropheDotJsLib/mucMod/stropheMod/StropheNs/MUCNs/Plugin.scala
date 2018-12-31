package typings
package stropheDotJsLib.mucMod.stropheMod.StropheNs.MUCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  /**
    * Ban a user.
    *
    * @param room - The multi-user chat room name.
    * @param jid  - The jid of the user to modify.
    * @param reason - Optional reason for the change.
    * @param handler_cb - Optional callback for success
    * @param error_cb - Optional callback for error
    * @return iq - the id of the mode change request.
    */
  def ban(room: java.lang.String, jid: java.lang.String): java.lang.String = js.native
  def ban(room: java.lang.String, jid: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def ban(
    room: java.lang.String,
    jid: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def ban(
    room: java.lang.String,
    jid: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  /**
    * Cancel the room configuration
    *
    * @param room - The multi-user chat room name.
    * @return id - the unique id used to cancel the configuration.
    */
  def cancelConfigure(room: java.lang.String): java.lang.String = js.native
  /**
    * Change the current users nick name.
    *
    * @param room - The multi-user chat room name.
    * @param user - The new nick name.
    */
  def changeNick(room: java.lang.String, user: java.lang.String): scala.Unit = js.native
  /**
    * Start a room configuration.
    *
    * @param room - The multi-user chat room name.
    * @param handler_cb - Optional function to handle the config form.
    * @param error_cb - Optional function to handle an error.
    * @return id - the unique id used to send the configuration request
    */
  def configure(room: java.lang.String): java.lang.String = js.native
  def configure(room: java.lang.String, handler_cb: js.Function1[/* stanza */ stdLib.Element, _]): java.lang.String = js.native
  def configure(
    room: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  /**
    * Create a configured room.
    *
    * @param room - The multi-user chat room name.
    * @param config - the configuration. ex: {"muc#roomconfig_publicroom": "0", "muc#roomconfig_persistentroom": "1"}
    * @param success_db - Optional function to handle success.
    * @param error_cb - Optional function to handle an error.
    * @return id - the unique id used to create the chat room.
    */
  def createConfiguredRoom(
    room: java.lang.String,
    config: js.Any,
    success_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  /**
    * Create an instance room.
    *
    * @param room - The multi-user chat room name.
    * @param success_db - Optional function to handle success.
    * @param error_cb - Optional function to handle an error.
    * @return id - the unique id used to create the chat room.
    */
  def createInstantRoom(room: java.lang.String): java.lang.String = js.native
  def createInstantRoom(room: java.lang.String, success_cb: js.Function1[/* stanza */ stdLib.Element, _]): java.lang.String = js.native
  def createInstantRoom(
    room: java.lang.String,
    success_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  /**
    * De-Op a user.
    *
    * @param room - The multi-user chat room name.
    * @param nick - The nick name of the user to modify.
    * @param reason - Optional reason for the change.
    * @param handler_cb - Optional callback for success
    * @param error_cb - Optional callback for error
    * @return iq - the id of the mode change request.
    */
  def deop(room: java.lang.String, nick: java.lang.String): java.lang.String = js.native
  def deop(room: java.lang.String, nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def deop(
    room: java.lang.String,
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def deop(
    room: java.lang.String,
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  /**
    * Send a direct invitation.
    *
    * @param room - The multi-user chat room name.
    * @param receiver - The invitation's receiver.
    * @param reason - Optional reason for joining the room.
    * @param password - Optional password for the room.
    * @return msgiq - the unique id used to send the invitation
    */
  def directInvite(room: java.lang.String, receiver: java.lang.String): java.lang.String = js.native
  def directInvite(room: java.lang.String, receiver: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def directInvite(
    room: java.lang.String,
    receiver: java.lang.String,
    reason: java.lang.String,
    password: java.lang.String
  ): java.lang.String = js.native
  /**
    * Convenience Function to send a Message to all Occupants
    *
    * @param room - The multi-user chat room name.
    * @param message - The plaintext message to send to the room.
    * @param html_message - Optional message to send to the room with html markup.
    * @param msgid - Optional unique ID which will be set as the 'id' attribute of the stanza
    * @return msgiq - the unique id used to send the message
    */
  def groupchat(room: java.lang.String, message: java.lang.String): java.lang.String = js.native
  def groupchat(room: java.lang.String, message: java.lang.String, html_message: java.lang.String): java.lang.String = js.native
  def groupchat(
    room: java.lang.String,
    message: java.lang.String,
    html_message: java.lang.String,
    msgid: java.lang.String
  ): java.lang.String = js.native
  /**
    * Initialize the MUC plugin. Sets the correct connection object and
    * extends the namesace.
    *
    * @param conn - the connection instance.
    */
  def init(conn: stropheDotJsLib.mucMod.stropheMod.StropheNs.Connection): scala.Unit = js.native
  /**
    * Send a mediated invitation.
    *
    * @param room - The multi-user chat room name.
    * @param receiver - The invitation's receiver.
    * @param reason - Optional reason for joining the room.
    * @return msgiq - the unique id used to send the invitation
    */
  def invite(room: java.lang.String, receiver: java.lang.String): java.lang.String = js.native
  def invite(room: java.lang.String, receiver: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  /**
    * Join a multi-user chat room
    *
    * @param room - The multi-user chat room to join.
    * @param nick - The nickname to use in the chat room. Optional
    * @param msg_handler_cb - The function call to handle messages from the specified chat room.
    * @param pres_handler_cb - The function call back to handle presence in the chat room.
    * @param roster_cb - The function call to handle roster info in the chat room
    * @param password - The optional password to use. (password protected rooms only)
    * @param history_attrs - Optional attributes for retrieving history
    * @param extended_presence - Optional XML for extending presence
    */
  def join(
    room: java.lang.String,
    nick: java.lang.String,
    msg_handler_cb: js.Function2[/* stanza */ stdLib.Element, /* room */ XmppRoom, scala.Boolean],
    pres_handler_cb: js.Function2[/* stanza */ stdLib.Element, /* room */ XmppRoom, scala.Boolean],
    roster_cb: js.Function2[/* occupants */ OccupantMap, /* room */ XmppRoom, scala.Boolean]
  ): scala.Unit = js.native
  def join(
    room: java.lang.String,
    nick: java.lang.String,
    msg_handler_cb: js.Function2[/* stanza */ stdLib.Element, /* room */ XmppRoom, scala.Boolean],
    pres_handler_cb: js.Function2[/* stanza */ stdLib.Element, /* room */ XmppRoom, scala.Boolean],
    roster_cb: js.Function2[/* occupants */ OccupantMap, /* room */ XmppRoom, scala.Boolean],
    password: java.lang.String
  ): scala.Unit = js.native
  def join(
    room: java.lang.String,
    nick: java.lang.String,
    msg_handler_cb: js.Function2[/* stanza */ stdLib.Element, /* room */ XmppRoom, scala.Boolean],
    pres_handler_cb: js.Function2[/* stanza */ stdLib.Element, /* room */ XmppRoom, scala.Boolean],
    roster_cb: js.Function2[/* occupants */ OccupantMap, /* room */ XmppRoom, scala.Boolean],
    password: java.lang.String,
    history_attrs: js.Any
  ): scala.Unit = js.native
  def join(
    room: java.lang.String,
    nick: java.lang.String,
    msg_handler_cb: js.Function2[/* stanza */ stdLib.Element, /* room */ XmppRoom, scala.Boolean],
    pres_handler_cb: js.Function2[/* stanza */ stdLib.Element, /* room */ XmppRoom, scala.Boolean],
    roster_cb: js.Function2[/* occupants */ OccupantMap, /* room */ XmppRoom, scala.Boolean],
    password: java.lang.String,
    history_attrs: js.Any,
    extended_presence: stdLib.Element
  ): scala.Unit = js.native
  /**
    * Kick a user.
    *
    * @param room - The multi-user chat room name.
    * @param nick - The nick name of the user to modify.
    * @param reason - Optional reason for the change.
    * @param handler_cb - Optional callback for success
    * @param error_cb - Optional callback for error
    * @return iq - the id of the mode change request.
    */
  def kick(room: java.lang.String, nick: java.lang.String): java.lang.String = js.native
  def kick(room: java.lang.String, nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def kick(
    room: java.lang.String,
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def kick(
    room: java.lang.String,
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  /**
    * Leave a multi-user chat room
    *
    * @param room - The multi-user chat room to leave.
    * @param nick - The nick name used in the room.
    * @param handler_cb - Optional function to handle the successful leave.
    * @param exit_msg - optional exit message.
    * @return iqid - The unique id for the room leave.*
    */
  def leave(room: java.lang.String, nick: java.lang.String): java.lang.String = js.native
  def leave(
    room: java.lang.String,
    nick: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, scala.Boolean]
  ): java.lang.String = js.native
  def leave(
    room: java.lang.String,
    nick: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, scala.Boolean],
    exit_msg: java.lang.String
  ): java.lang.String = js.native
  /**
    * List all chat room available on a server.
    *
    * @param server - name of chat server.
    * @param handle_cb - Function to call for room list return.
    * @param error_cb - Function to call on error.
    */
  def listRooms(
    server: java.lang.String,
    handle_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* error */ js.Any, _]
  ): scala.Unit = js.native
  /**
    * Member a user.
    *
    * @param room - The multi-user chat room name.
    * @param jid  - The jid of the user to modify.
    * @param reason - Optional reason for the change.
    * @param handler_cb - Optional callback for success
    * @param error_cb - Optional callback for error
    * @return iq - the id of the mode change request.
    */
  def member(room: java.lang.String, jid: java.lang.String): java.lang.String = js.native
  def member(room: java.lang.String, jid: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def member(
    room: java.lang.String,
    jid: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def member(
    room: java.lang.String,
    jid: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  @JSName("message")
  def message_chat(
    room: java.lang.String,
    nick: java.lang.String,
    message: java.lang.String,
    html_message: java.lang.String,
    `type`: stropheDotJsLib.stropheDotJsLibStrings.chat
  ): java.lang.String = js.native
  /**
    * Send a message to a room.
    *
    * @param) room - The multi-user chat room name.
    * @param nick - The nick name used in the chat room.
    * @param message - The plaintext message to send to the room.
    * @param html_message - The message to send to the room with html markup.
    * @param type - "groupchat" for group chat messages o "chat" for private chat messages
    * @return msgiq - the unique id used to send the message
    */
  @JSName("message")
  def message_groupchat(
    room: java.lang.String,
    nick: java.lang.String,
    message: java.lang.String,
    html_message: java.lang.String,
    `type`: stropheDotJsLib.stropheDotJsLibStrings.groupchat
  ): java.lang.String = js.native
  /**
    * Changes the affiliation of a member of a MUC room.
    * The modification can only be done by a room moderator. An error will be
    * returned if the user doesn't have permission.
    * Parameters:
    * @param room - The multi-user chat room name.
    * @param jid  - The jid of the user to modify.
    * @param affiliation - The new affiliation of the user.
    * @param reason - Optional reason for the change.
    * @param handler_cb - Optional callback for success
    * @param error_cb - Optional callback for error
    * @return iq - the id of the mode change request.
    */
  def modifyAffiliation(room: java.lang.String, jid: java.lang.String, affiliation: java.lang.String): java.lang.String = js.native
  def modifyAffiliation(
    room: java.lang.String,
    jid: java.lang.String,
    affiliation: java.lang.String,
    reason: java.lang.String
  ): java.lang.String = js.native
  def modifyAffiliation(
    room: java.lang.String,
    jid: java.lang.String,
    affiliation: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def modifyAffiliation(
    room: java.lang.String,
    jid: java.lang.String,
    affiliation: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  /**
    * Changes the role of a member of a MUC room.
    * The modification can only be done by a room moderator. An error will be
    * returned if the user doesn't have permission.
    *
    * @param room - The multi-user chat room name.
    * @param nick - The nick name of the user to modify.
    * @param role - The new role of the user.
    * @param reason - Optional reason for the change.
    * @param handler_cb - Optional callback for success
    * @param error_cb - Optional callback for error
    * @return iq - the id of the mode change request.
    */
  def modifyRole(room: java.lang.String, nick: java.lang.String, role: java.lang.String): java.lang.String = js.native
  def modifyRole(room: java.lang.String, nick: java.lang.String, role: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def modifyRole(
    room: java.lang.String,
    nick: java.lang.String,
    role: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def modifyRole(
    room: java.lang.String,
    nick: java.lang.String,
    role: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  /**
    * Send a mediated multiple invitation.
    *
    * @param room - The multi-user chat room name.
    * @param receivers - The invitation's receivers.
    * @param reason - Optional reason for joining the room.
    * @return msgiq - the unique id used to send the invitation
    */
  def multipleInvites(room: java.lang.String, receivers: js.Array[java.lang.String]): java.lang.String = js.native
  def multipleInvites(room: java.lang.String, receivers: js.Array[java.lang.String], reason: java.lang.String): java.lang.String = js.native
  /**
    * Mute a user.
    *
    * @param room - The multi-user chat room name.
    * @param nick - The nick name of the user to modify.
    * @param reason - Optional reason for the change.
    * @param handler_cb - Optional callback for success
    * @param error_cb - Optional callback for error
    * @return iq - the id of the mode change request.
    */
  def mute(room: java.lang.String, nick: java.lang.String): java.lang.String = js.native
  def mute(room: java.lang.String, nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def mute(
    room: java.lang.String,
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def mute(
    room: java.lang.String,
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  /**
    * Op a user.
    *
    * @param room - The multi-user chat room name.
    * @param nick - The nick name of the user to modify.
    * @param reason - Optional reason for the change.
    * @param handler_cb - Optional callback for success
    * @param error_cb - Optional callback for error
    * @return iq - the id of the mode change request.
    */
  def op(room: java.lang.String, nick: java.lang.String): java.lang.String = js.native
  def op(room: java.lang.String, nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def op(
    room: java.lang.String,
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def op(
    room: java.lang.String,
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  /**
    * Owner a user.
    *
    * @param room - The multi-user chat room name.
    * @param jid  - The jid of the user to modify.
    * @param reason - Optional reason for the change.
    * @param handler_cb - Optional callback for success
    * @param error_cb - Optional callback for error
    * @return iq - the id of the mode change request.
    */
  def owner(room: java.lang.String, jid: java.lang.String): java.lang.String = js.native
  def owner(room: java.lang.String, jid: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def owner(
    room: java.lang.String,
    jid: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def owner(
    room: java.lang.String,
    jid: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  /**
    * Queries a room for a list of occupants
    *
    * @param room - The multi-user chat room name.
    * @param success_cb - Optional function to handle the info.
    * @param error_cb - Optional function to handle an error.
    * @return id - the unique id used to send the info request
    */
  def queryOccupants(room: java.lang.String): java.lang.String = js.native
  def queryOccupants(room: java.lang.String, success_cb: js.Function1[/* stanza */ stdLib.Element, _]): java.lang.String = js.native
  def queryOccupants(
    room: java.lang.String,
    success_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* error */ js.Any, _]
  ): java.lang.String = js.native
  /**
    * Registering with a room.
    * @see http://xmpp.org/extensions/xep-0045.html#register
    *
    * @param room - The multi-user chat room name.
    * @param handle_cb - Function to call for room list return.
    * @param error_cb - Function to call on error.
    */
  def registrationRequest(
    room: java.lang.String,
    handle_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): scala.Unit = js.native
  /**
    * Revoke a user.
    *
    * @param room - The multi-user chat room name.
    * @param jid  - The jid of the user to modify.
    * @param reason - Optional reason for the change.
    * @param handler_cb - Optional callback for success
    * @param error_cb - Optional callback for error
    * @return iq - the id of the mode change request.
    */
  def revoke(room: java.lang.String, jid: java.lang.String): java.lang.String = js.native
  def revoke(room: java.lang.String, jid: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def revoke(
    room: java.lang.String,
    jid: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def revoke(
    room: java.lang.String,
    jid: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  /**
    * Save a room configuration.
    *
    * @param room - The multi-user chat room name.
    * @param config- Form Object or an array of form elements used to configure the room.
    * @param success_db - Optional function to handle success.
    * @param error_cb - Optional function to handle an error.
    * @return id - the unique id used to save the configuration.
    */
  def saveConfiguration(room: java.lang.String, config: js.Any): java.lang.String = js.native
  def saveConfiguration(room: java.lang.String, config: js.Any, success_cb: js.Function1[/* stanza */ stdLib.Element, _]): java.lang.String = js.native
  def saveConfiguration(
    room: java.lang.String,
    config: js.Any,
    success_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  /**
    * Change the current users status.
    *
    * @param room - The multi-user chat room name.
    * @param user - The current nick.
    * @param show - The new show-text.
    * @param status - The new status-text.
    */
  def setStatus(room: java.lang.String, user: java.lang.String, show: java.lang.String, status: java.lang.String): scala.Unit = js.native
  /**
    * Set the topic of the chat room.
    *
    * @param room - The multi-user chat room name.
    * @param topic - Topic message.
    */
  def setTopic(room: java.lang.String, topic: java.lang.String): scala.Unit = js.native
  /**
    * Submits registration form.
    *
    * @param room - The multi-user chat room name.
    * @param fields - The form fields.
    * @param handle_cb - Function to call for room list return.
    * @param error_cb - Function to call on error.
    */
  def submitRegistrationForm(
    room: java.lang.String,
    fields: js.Any,
    handle_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): scala.Unit = js.native
  /**
    * Voice a user.
    *
    * @param room - The multi-user chat room name.
    * @param nick - The nick name of the user to modify.
    * @param reason - Optional reason for the change.
    * @param handler_cb - Optional callback for success
    * @param error_cb - Optional callback for error
    * @return iq - the id of the mode change request.
    */
  def voice(room: java.lang.String, nick: java.lang.String): java.lang.String = js.native
  def voice(room: java.lang.String, nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def voice(
    room: java.lang.String,
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def voice(
    room: java.lang.String,
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
}

