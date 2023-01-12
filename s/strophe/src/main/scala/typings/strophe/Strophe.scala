package typings.strophe

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.strophe.Strophe.MUC.Plugin
import typings.strophe.stropheStrings.chat
import typings.strophe.stropheStrings.groupchat
import typings.strophe.stropheStrings.message
import typings.strophe.stropheStrings.presence
import typings.strophe.stropheStrings.roster
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Strophe {
  
  trait Connection extends StObject {
    
    var muc: Plugin
  }
  object Connection {
    
    inline def apply(muc: Plugin): Connection = {
      val __obj = js.Dynamic.literal(muc = muc.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
      
      inline def setMuc(value: Plugin): Self = StObject.set(x, "muc", value.asInstanceOf[js.Any])
    }
  }
  
  object MUC {
    
    @js.native
    trait Occupant
      extends StObject
         with OccupantInfo {
      
      def admin(): String = js.native
      def admin(reason: String): String = js.native
      def admin(reason: String, success_cb: js.Function): String = js.native
      def admin(reason: String, success_cb: js.Function, error_cb: js.Function): String = js.native
      def admin(reason: String, success_cb: Unit, error_cb: js.Function): String = js.native
      def admin(reason: Unit, success_cb: js.Function): String = js.native
      def admin(reason: Unit, success_cb: js.Function, error_cb: js.Function): String = js.native
      def admin(reason: Unit, success_cb: Unit, error_cb: js.Function): String = js.native
      
      def ban(): String = js.native
      def ban(reason: String): String = js.native
      def ban(reason: String, success_cb: js.Function): String = js.native
      def ban(reason: String, success_cb: js.Function, error_cb: js.Function): String = js.native
      def ban(reason: String, success_cb: Unit, error_cb: js.Function): String = js.native
      def ban(reason: Unit, success_cb: js.Function): String = js.native
      def ban(reason: Unit, success_cb: js.Function, error_cb: js.Function): String = js.native
      def ban(reason: Unit, success_cb: Unit, error_cb: js.Function): String = js.native
      
      def deop(): String = js.native
      def deop(reason: String): String = js.native
      def deop(reason: String, handler_cb: js.Function): String = js.native
      def deop(reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def deop(reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def deop(reason: Unit, handler_cb: js.Function): String = js.native
      def deop(reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def deop(reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      def kick(): String = js.native
      def kick(reason: String): String = js.native
      def kick(reason: String, handler_cb: js.Function): String = js.native
      def kick(reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def kick(reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def kick(reason: Unit, handler_cb: js.Function): String = js.native
      def kick(reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def kick(reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      def member(): String = js.native
      def member(reason: String): String = js.native
      def member(reason: String, success_cb: js.Function): String = js.native
      def member(reason: String, success_cb: js.Function, error_cb: js.Function): String = js.native
      def member(reason: String, success_cb: Unit, error_cb: js.Function): String = js.native
      def member(reason: Unit, success_cb: js.Function): String = js.native
      def member(reason: Unit, success_cb: js.Function, error_cb: js.Function): String = js.native
      def member(reason: Unit, success_cb: Unit, error_cb: js.Function): String = js.native
      
      def modifyAffiliation(affiliation: String): String = js.native
      def modifyAffiliation(affiliation: String, reason: String): String = js.native
      def modifyAffiliation(affiliation: String, reason: String, success_cb: js.Function): String = js.native
      def modifyAffiliation(affiliation: String, reason: String, success_cb: js.Function, error_cb: js.Function): String = js.native
      def modifyAffiliation(affiliation: String, reason: String, success_cb: Unit, error_cb: js.Function): String = js.native
      def modifyAffiliation(affiliation: String, reason: Unit, success_cb: js.Function): String = js.native
      def modifyAffiliation(affiliation: String, reason: Unit, success_cb: js.Function, error_cb: js.Function): String = js.native
      def modifyAffiliation(affiliation: String, reason: Unit, success_cb: Unit, error_cb: js.Function): String = js.native
      
      def modifyRole(role: String): String = js.native
      def modifyRole(role: String, reason: String): String = js.native
      def modifyRole(role: String, reason: String, success_cb: js.Function): String = js.native
      def modifyRole(role: String, reason: String, success_cb: js.Function, error_cb: js.Function): String = js.native
      def modifyRole(role: String, reason: String, success_cb: Unit, error_cb: js.Function): String = js.native
      def modifyRole(role: String, reason: Unit, success_cb: js.Function): String = js.native
      def modifyRole(role: String, reason: Unit, success_cb: js.Function, error_cb: js.Function): String = js.native
      def modifyRole(role: String, reason: Unit, success_cb: Unit, error_cb: js.Function): String = js.native
      
      def mute(): String = js.native
      def mute(reason: String): String = js.native
      def mute(reason: String, handler_cb: js.Function): String = js.native
      def mute(reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def mute(reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def mute(reason: Unit, handler_cb: js.Function): String = js.native
      def mute(reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def mute(reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      def op(): String = js.native
      def op(reason: String): String = js.native
      def op(reason: String, handler_cb: js.Function): String = js.native
      def op(reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def op(reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def op(reason: Unit, handler_cb: js.Function): String = js.native
      def op(reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def op(reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      def owner(): String = js.native
      def owner(reason: String): String = js.native
      def owner(reason: String, success_cb: js.Function): String = js.native
      def owner(reason: String, success_cb: js.Function, error_cb: js.Function): String = js.native
      def owner(reason: String, success_cb: Unit, error_cb: js.Function): String = js.native
      def owner(reason: Unit, success_cb: js.Function): String = js.native
      def owner(reason: Unit, success_cb: js.Function, error_cb: js.Function): String = js.native
      def owner(reason: Unit, success_cb: Unit, error_cb: js.Function): String = js.native
      
      def revoke(): String = js.native
      def revoke(reason: String): String = js.native
      def revoke(reason: String, success_cb: js.Function): String = js.native
      def revoke(reason: String, success_cb: js.Function, error_cb: js.Function): String = js.native
      def revoke(reason: String, success_cb: Unit, error_cb: js.Function): String = js.native
      def revoke(reason: Unit, success_cb: js.Function): String = js.native
      def revoke(reason: Unit, success_cb: js.Function, error_cb: js.Function): String = js.native
      def revoke(reason: Unit, success_cb: Unit, error_cb: js.Function): String = js.native
      
      def update(data: OccupantInfo): Unit = js.native
      
      def voice(): String = js.native
      def voice(reason: String): String = js.native
      def voice(reason: String, handler_cb: js.Function): String = js.native
      def voice(reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def voice(reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def voice(reason: Unit, handler_cb: js.Function): String = js.native
      def voice(reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def voice(reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
    }
    
    trait OccupantInfo extends StObject {
      
      var affiliation: js.UndefOr[String] = js.undefined
      
      var jid: js.UndefOr[String] = js.undefined
      
      var nick: js.UndefOr[String] = js.undefined
      
      var role: js.UndefOr[String] = js.undefined
      
      var show: js.UndefOr[String] = js.undefined
      
      var status: js.UndefOr[String] = js.undefined
    }
    object OccupantInfo {
      
      inline def apply(): OccupantInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OccupantInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OccupantInfo] (val x: Self) extends AnyVal {
        
        inline def setAffiliation(value: String): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
        
        inline def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
        
        inline def setJid(value: String): Self = StObject.set(x, "jid", value.asInstanceOf[js.Any])
        
        inline def setJidUndefined: Self = StObject.set(x, "jid", js.undefined)
        
        inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
        
        inline def setNickUndefined: Self = StObject.set(x, "nick", js.undefined)
        
        inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        inline def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
        
        inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
        
        inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    type OccupantMap = StringDictionary[Occupant]
    
    @js.native
    trait Plugin extends StObject {
      
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
      def ban(room: String, jid: String): String = js.native
      def ban(room: String, jid: String, reason: String): String = js.native
      def ban(room: String, jid: String, reason: String, handler_cb: js.Function): String = js.native
      def ban(room: String, jid: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def ban(room: String, jid: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def ban(room: String, jid: String, reason: Unit, handler_cb: js.Function): String = js.native
      def ban(room: String, jid: String, reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def ban(room: String, jid: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      /**
        * Cancel the room configuration
        *
        * @param room - The multi-user chat room name.
        * @return id - the unique id used to cancel the configuration.
        */
      def cancelConfigure(room: String): String = js.native
      
      /**
        * Change the current users nick name.
        *
        * @param room - The multi-user chat room name.
        * @param user - The new nick name.
        */
      def changeNick(room: String, user: String): Unit = js.native
      
      /**
        * Start a room configuration.
        *
        * @param room - The multi-user chat room name.
        * @param handler_cb - Optional function to handle the config form.
        * @param error_cb - Optional function to handle an error.
        * @return id - the unique id used to send the configuration request
        */
      def configure(room: String): String = js.native
      def configure(room: String, handler_cb: js.Function): String = js.native
      def configure(room: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def configure(room: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      /**
        * Create a configured room.
        *
        * @param room - The multi-user chat room name.
        * @param config - the configuration. ex: {"muc#roomconfig_publicroom": "0", "muc#roomconfig_persistentroom": "1"}
        * @param success_db - Optional function to handle success.
        * @param error_cb - Optional function to handle an error.
        * @return id - the unique id used to create the chat room.
        */
      def createConfiguredRoom(room: String, config: Any, success_cb: js.Function, error_cb: js.Function): String = js.native
      
      /**
        * Create an instance room.
        *
        * @param room - The multi-user chat room name.
        * @param success_db - Optional function to handle success.
        * @param error_cb - Optional function to handle an error.
        * @return id - the unique id used to create the chat room.
        */
      def createInstantRoom(room: String): String = js.native
      def createInstantRoom(room: String, success_cb: js.Function): String = js.native
      def createInstantRoom(room: String, success_cb: js.Function, error_cb: js.Function): String = js.native
      def createInstantRoom(room: String, success_cb: Unit, error_cb: js.Function): String = js.native
      
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
      def deop(room: String, nick: String): String = js.native
      def deop(room: String, nick: String, reason: String): String = js.native
      def deop(room: String, nick: String, reason: String, handler_cb: js.Function): String = js.native
      def deop(room: String, nick: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def deop(room: String, nick: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def deop(room: String, nick: String, reason: Unit, handler_cb: js.Function): String = js.native
      def deop(room: String, nick: String, reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def deop(room: String, nick: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      /**
        * Send a direct invitation.
        *
        * @param room - The multi-user chat room name.
        * @param receiver - The invitation's receiver.
        * @param reason - Optional reason for joining the room.
        * @param password - Optional password for the room.
        * @return msgiq - the unique id used to send the invitation
        */
      def directInvite(room: String, receiver: String): String = js.native
      def directInvite(room: String, receiver: String, reason: String): String = js.native
      def directInvite(room: String, receiver: String, reason: String, password: String): String = js.native
      def directInvite(room: String, receiver: String, reason: Unit, password: String): String = js.native
      
      /**
        * Convenience Function to send a Message to all Occupants
        *
        * @param room - The multi-user chat room name.
        * @param message - The plaintext message to send to the room.
        * @param html_message - Optional message to send to the room with html markup.
        * @param msgid - Optional unique ID which will be set as the 'id' attribute of the stanza
        * @return msgiq - the unique id used to send the message
        */
      def groupchat(room: String, message: String): String = js.native
      def groupchat(room: String, message: String, html_message: String): String = js.native
      def groupchat(room: String, message: String, html_message: String, msgid: String): String = js.native
      def groupchat(room: String, message: String, html_message: Unit, msgid: String): String = js.native
      
      /**
        * Initialize the MUC plugin. Sets the correct connection object and
        * extends the namesace.
        *
        * @param conn - the connection instance.
        */
      def init(conn: Connection): Unit = js.native
      
      /**
        * Send a mediated invitation.
        *
        * @param room - The multi-user chat room name.
        * @param receiver - The invitation's receiver.
        * @param reason - Optional reason for joining the room.
        * @return msgiq - the unique id used to send the invitation
        */
      def invite(room: String, receiver: String): String = js.native
      def invite(room: String, receiver: String, reason: String): String = js.native
      
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
        room: String,
        nick: String,
        msg_handler_cb: js.Function2[/* stanza */ Element, /* room */ XmppRoom, Boolean],
        pres_handler_cb: js.Function2[/* stanza */ Element, /* room */ XmppRoom, Boolean],
        roster_cb: js.Function2[/* occupants */ OccupantMap, /* room */ XmppRoom, Boolean]
      ): Unit = js.native
      def join(
        room: String,
        nick: String,
        msg_handler_cb: js.Function2[/* stanza */ Element, /* room */ XmppRoom, Boolean],
        pres_handler_cb: js.Function2[/* stanza */ Element, /* room */ XmppRoom, Boolean],
        roster_cb: js.Function2[/* occupants */ OccupantMap, /* room */ XmppRoom, Boolean],
        password: String
      ): Unit = js.native
      def join(
        room: String,
        nick: String,
        msg_handler_cb: js.Function2[/* stanza */ Element, /* room */ XmppRoom, Boolean],
        pres_handler_cb: js.Function2[/* stanza */ Element, /* room */ XmppRoom, Boolean],
        roster_cb: js.Function2[/* occupants */ OccupantMap, /* room */ XmppRoom, Boolean],
        password: String,
        history_attrs: Any
      ): Unit = js.native
      def join(
        room: String,
        nick: String,
        msg_handler_cb: js.Function2[/* stanza */ Element, /* room */ XmppRoom, Boolean],
        pres_handler_cb: js.Function2[/* stanza */ Element, /* room */ XmppRoom, Boolean],
        roster_cb: js.Function2[/* occupants */ OccupantMap, /* room */ XmppRoom, Boolean],
        password: String,
        history_attrs: Any,
        extended_presence: Element
      ): Unit = js.native
      def join(
        room: String,
        nick: String,
        msg_handler_cb: js.Function2[/* stanza */ Element, /* room */ XmppRoom, Boolean],
        pres_handler_cb: js.Function2[/* stanza */ Element, /* room */ XmppRoom, Boolean],
        roster_cb: js.Function2[/* occupants */ OccupantMap, /* room */ XmppRoom, Boolean],
        password: String,
        history_attrs: Unit,
        extended_presence: Element
      ): Unit = js.native
      def join(
        room: String,
        nick: String,
        msg_handler_cb: js.Function2[/* stanza */ Element, /* room */ XmppRoom, Boolean],
        pres_handler_cb: js.Function2[/* stanza */ Element, /* room */ XmppRoom, Boolean],
        roster_cb: js.Function2[/* occupants */ OccupantMap, /* room */ XmppRoom, Boolean],
        password: Unit,
        history_attrs: Any
      ): Unit = js.native
      def join(
        room: String,
        nick: String,
        msg_handler_cb: js.Function2[/* stanza */ Element, /* room */ XmppRoom, Boolean],
        pres_handler_cb: js.Function2[/* stanza */ Element, /* room */ XmppRoom, Boolean],
        roster_cb: js.Function2[/* occupants */ OccupantMap, /* room */ XmppRoom, Boolean],
        password: Unit,
        history_attrs: Any,
        extended_presence: Element
      ): Unit = js.native
      def join(
        room: String,
        nick: String,
        msg_handler_cb: js.Function2[/* stanza */ Element, /* room */ XmppRoom, Boolean],
        pres_handler_cb: js.Function2[/* stanza */ Element, /* room */ XmppRoom, Boolean],
        roster_cb: js.Function2[/* occupants */ OccupantMap, /* room */ XmppRoom, Boolean],
        password: Unit,
        history_attrs: Unit,
        extended_presence: Element
      ): Unit = js.native
      
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
      def kick(room: String, nick: String): String = js.native
      def kick(room: String, nick: String, reason: String): String = js.native
      def kick(room: String, nick: String, reason: String, handler_cb: js.Function): String = js.native
      def kick(room: String, nick: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def kick(room: String, nick: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def kick(room: String, nick: String, reason: Unit, handler_cb: js.Function): String = js.native
      def kick(room: String, nick: String, reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def kick(room: String, nick: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      /**
        * Leave a multi-user chat room
        *
        * @param room - The multi-user chat room to leave.
        * @param nick - The nick name used in the room.
        * @param handler_cb - Optional function to handle the successful leave.
        * @param exit_msg - optional exit message.
        * @return iqid - The unique id for the room leave.*
        */
      def leave(room: String, nick: String): String = js.native
      def leave(room: String, nick: String, handler_cb: js.Function): String = js.native
      def leave(room: String, nick: String, handler_cb: js.Function, exit_msg: String): String = js.native
      def leave(room: String, nick: String, handler_cb: Unit, exit_msg: String): String = js.native
      
      /**
        * List all chat room available on a server.
        *
        * @param server - name of chat server.
        * @param handle_cb - Function to call for room list return.
        * @param error_cb - Function to call on error.
        */
      def listRooms(
        server: String,
        handle_cb: js.Function1[/* stanza */ Element, Any],
        error_cb: js.Function1[/* error */ Any, Any]
      ): Unit = js.native
      
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
      def member(room: String, jid: String): String = js.native
      def member(room: String, jid: String, reason: String): String = js.native
      def member(room: String, jid: String, reason: String, handler_cb: js.Function): String = js.native
      def member(room: String, jid: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def member(room: String, jid: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def member(room: String, jid: String, reason: Unit, handler_cb: js.Function): String = js.native
      def member(room: String, jid: String, reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def member(room: String, jid: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
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
      def message(room: String, nick: String, message: String, html_message: String, `type`: groupchat | chat): String = js.native
      
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
      def modifyAffiliation(room: String, jid: String, affiliation: String): String = js.native
      def modifyAffiliation(room: String, jid: String, affiliation: String, reason: String): String = js.native
      def modifyAffiliation(room: String, jid: String, affiliation: String, reason: String, handler_cb: js.Function): String = js.native
      def modifyAffiliation(
        room: String,
        jid: String,
        affiliation: String,
        reason: String,
        handler_cb: js.Function,
        error_cb: js.Function
      ): String = js.native
      def modifyAffiliation(
        room: String,
        jid: String,
        affiliation: String,
        reason: String,
        handler_cb: Unit,
        error_cb: js.Function
      ): String = js.native
      def modifyAffiliation(room: String, jid: String, affiliation: String, reason: Unit, handler_cb: js.Function): String = js.native
      def modifyAffiliation(
        room: String,
        jid: String,
        affiliation: String,
        reason: Unit,
        handler_cb: js.Function,
        error_cb: js.Function
      ): String = js.native
      def modifyAffiliation(
        room: String,
        jid: String,
        affiliation: String,
        reason: Unit,
        handler_cb: Unit,
        error_cb: js.Function
      ): String = js.native
      
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
      def modifyRole(room: String, nick: String, role: String): String = js.native
      def modifyRole(room: String, nick: String, role: String, reason: String): String = js.native
      def modifyRole(room: String, nick: String, role: String, reason: String, handler_cb: js.Function): String = js.native
      def modifyRole(
        room: String,
        nick: String,
        role: String,
        reason: String,
        handler_cb: js.Function,
        error_cb: js.Function
      ): String = js.native
      def modifyRole(room: String, nick: String, role: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def modifyRole(room: String, nick: String, role: String, reason: Unit, handler_cb: js.Function): String = js.native
      def modifyRole(
        room: String,
        nick: String,
        role: String,
        reason: Unit,
        handler_cb: js.Function,
        error_cb: js.Function
      ): String = js.native
      def modifyRole(room: String, nick: String, role: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      /**
        * Send a mediated multiple invitation.
        *
        * @param room - The multi-user chat room name.
        * @param receivers - The invitation's receivers.
        * @param reason - Optional reason for joining the room.
        * @return msgiq - the unique id used to send the invitation
        */
      def multipleInvites(room: String, receivers: js.Array[String]): String = js.native
      def multipleInvites(room: String, receivers: js.Array[String], reason: String): String = js.native
      
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
      def mute(room: String, nick: String): String = js.native
      def mute(room: String, nick: String, reason: String): String = js.native
      def mute(room: String, nick: String, reason: String, handler_cb: js.Function): String = js.native
      def mute(room: String, nick: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def mute(room: String, nick: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def mute(room: String, nick: String, reason: Unit, handler_cb: js.Function): String = js.native
      def mute(room: String, nick: String, reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def mute(room: String, nick: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
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
      def op(room: String, nick: String): String = js.native
      def op(room: String, nick: String, reason: String): String = js.native
      def op(room: String, nick: String, reason: String, handler_cb: js.Function): String = js.native
      def op(room: String, nick: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def op(room: String, nick: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def op(room: String, nick: String, reason: Unit, handler_cb: js.Function): String = js.native
      def op(room: String, nick: String, reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def op(room: String, nick: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
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
      def owner(room: String, jid: String): String = js.native
      def owner(room: String, jid: String, reason: String): String = js.native
      def owner(room: String, jid: String, reason: String, handler_cb: js.Function): String = js.native
      def owner(room: String, jid: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def owner(room: String, jid: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def owner(room: String, jid: String, reason: Unit, handler_cb: js.Function): String = js.native
      def owner(room: String, jid: String, reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def owner(room: String, jid: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      /**
        * Queries a room for a list of occupants
        *
        * @param room - The multi-user chat room name.
        * @param success_cb - Optional function to handle the info.
        * @param error_cb - Optional function to handle an error.
        * @return id - the unique id used to send the info request
        */
      def queryOccupants(room: String): String = js.native
      def queryOccupants(room: String, success_cb: js.Function1[/* stanza */ Element, Any]): String = js.native
      def queryOccupants(
        room: String,
        success_cb: js.Function1[/* stanza */ Element, Any],
        error_cb: js.Function1[/* error */ Any, Any]
      ): String = js.native
      def queryOccupants(room: String, success_cb: Unit, error_cb: js.Function1[/* error */ Any, Any]): String = js.native
      
      /**
        * Registering with a room.
        * @see http://xmpp.org/extensions/xep-0045.html#register
        *
        * @param room - The multi-user chat room name.
        * @param handle_cb - Function to call for room list return.
        * @param error_cb - Function to call on error.
        */
      def registrationRequest(room: String, handle_cb: js.Function, error_cb: js.Function): Unit = js.native
      
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
      def revoke(room: String, jid: String): String = js.native
      def revoke(room: String, jid: String, reason: String): String = js.native
      def revoke(room: String, jid: String, reason: String, handler_cb: js.Function): String = js.native
      def revoke(room: String, jid: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def revoke(room: String, jid: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def revoke(room: String, jid: String, reason: Unit, handler_cb: js.Function): String = js.native
      def revoke(room: String, jid: String, reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def revoke(room: String, jid: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      /**
        * Save a room configuration.
        *
        * @param room - The multi-user chat room name.
        * @param config- Form Object or an array of form elements used to configure the room.
        * @param success_db - Optional function to handle success.
        * @param error_cb - Optional function to handle an error.
        * @return id - the unique id used to save the configuration.
        */
      def saveConfiguration(room: String, config: Any): String = js.native
      def saveConfiguration(room: String, config: Any, success_cb: js.Function): String = js.native
      def saveConfiguration(room: String, config: Any, success_cb: js.Function, error_cb: js.Function): String = js.native
      def saveConfiguration(room: String, config: Any, success_cb: Unit, error_cb: js.Function): String = js.native
      
      /**
        * Change the current users status.
        *
        * @param room - The multi-user chat room name.
        * @param user - The current nick.
        * @param show - The new show-text.
        * @param status - The new status-text.
        */
      def setStatus(room: String, user: String, show: String, status: String): Unit = js.native
      
      /**
        * Set the topic of the chat room.
        *
        * @param room - The multi-user chat room name.
        * @param topic - Topic message.
        */
      def setTopic(room: String, topic: String): Unit = js.native
      
      /**
        * Submits registration form.
        *
        * @param room - The multi-user chat room name.
        * @param fields - The form fields.
        * @param handle_cb - Function to call for room list return.
        * @param error_cb - Function to call on error.
        */
      def submitRegistrationForm(room: String, fields: Any, handle_cb: js.Function, error_cb: js.Function): Unit = js.native
      
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
      def voice(room: String, nick: String): String = js.native
      def voice(room: String, nick: String, reason: String): String = js.native
      def voice(room: String, nick: String, reason: String, handler_cb: js.Function): String = js.native
      def voice(room: String, nick: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def voice(room: String, nick: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def voice(room: String, nick: String, reason: Unit, handler_cb: js.Function): String = js.native
      def voice(room: String, nick: String, reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def voice(room: String, nick: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
    }
    
    @js.native
    trait RoomConfig extends StObject {
      
      def parse(): Any = js.native
      def parse(info: Element): Any = js.native
    }
    
    @js.native
    trait XmppRoom extends StObject {
      
      /**
        * Adds a handler to the MUC room.
        * Parameters:
        * @param handler_type - 'message', 'presence' or 'roster'.
        * @param handler - The handler function.
        * @return id - the id of handler.
        */
      def addHandler(handler_type: presence | message | roster, handler: js.Function): Double = js.native
      
      def admin(jid: String): String = js.native
      def admin(jid: String, reason: String): String = js.native
      def admin(jid: String, reason: String, handler_cb: js.Function): String = js.native
      def admin(jid: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def admin(jid: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def admin(jid: String, reason: Unit, handler_cb: js.Function): String = js.native
      def admin(jid: String, reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def admin(jid: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      def ban(jid: String): String = js.native
      def ban(jid: String, reason: String): String = js.native
      def ban(jid: String, reason: String, handler_cb: js.Function): String = js.native
      def ban(jid: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def ban(jid: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def ban(jid: String, reason: Unit, handler_cb: js.Function): String = js.native
      def ban(jid: String, reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def ban(jid: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      def cancelConfigure(): String = js.native
      
      def changeNick(nick: String): String = js.native
      
      def configure(handler_cb: js.Function): String = js.native
      
      def deop(nick: String): String = js.native
      def deop(nick: String, reason: String): String = js.native
      def deop(nick: String, reason: String, handler_cb: js.Function): String = js.native
      def deop(nick: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def deop(nick: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def deop(nick: String, reason: Unit, handler_cb: js.Function): String = js.native
      def deop(nick: String, reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def deop(nick: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      def directInvite(receiver: String): String = js.native
      def directInvite(receiver: String, reason: String): String = js.native
      
      def groupchat(message: String): String = js.native
      def groupchat(message: String, html_message: String): String = js.native
      
      def invite(receiver: String): String = js.native
      def invite(receiver: String, reason: String): String = js.native
      
      def join(msg_handler_cb: js.Function, pres_handler_cb: js.Function, roster_cb: js.Function): Unit = js.native
      
      def kick(nick: String): String = js.native
      def kick(nick: String, reason: String): String = js.native
      def kick(nick: String, reason: String, handler_cb: js.Function): String = js.native
      def kick(nick: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def kick(nick: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def kick(nick: String, reason: Unit, handler_cb: js.Function): String = js.native
      def kick(nick: String, reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def kick(nick: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      def leave(): Unit = js.native
      def leave(handler_cb: js.Function): Unit = js.native
      def leave(handler_cb: js.Function, exit_msg: String): Unit = js.native
      def leave(handler_cb: Unit, exit_msg: String): Unit = js.native
      
      def member(jid: String): String = js.native
      def member(jid: String, reason: String): String = js.native
      def member(jid: String, reason: String, handler_cb: js.Function): String = js.native
      def member(jid: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def member(jid: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def member(jid: String, reason: Unit, handler_cb: js.Function): String = js.native
      def member(jid: String, reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def member(jid: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      def message(message: String, html_message: String, `type`: groupchat | chat): String = js.native
      
      def modifyAffiliation(jid: String, affiliation: String): String = js.native
      def modifyAffiliation(jid: String, affiliation: String, reason: String): String = js.native
      def modifyAffiliation(jid: String, affiliation: String, reason: String, success_cb: js.Function): String = js.native
      def modifyAffiliation(jid: String, affiliation: String, reason: String, success_cb: js.Function, error_cb: js.Function): String = js.native
      def modifyAffiliation(jid: String, affiliation: String, reason: String, success_cb: Unit, error_cb: js.Function): String = js.native
      def modifyAffiliation(jid: String, affiliation: String, reason: Unit, success_cb: js.Function): String = js.native
      def modifyAffiliation(jid: String, affiliation: String, reason: Unit, success_cb: js.Function, error_cb: js.Function): String = js.native
      def modifyAffiliation(jid: String, affiliation: String, reason: Unit, success_cb: Unit, error_cb: js.Function): String = js.native
      
      def modifyRole(nick: String, role: String): String = js.native
      def modifyRole(nick: String, role: String, reason: String): String = js.native
      def modifyRole(nick: String, role: String, reason: String, success_cb: js.Function): String = js.native
      def modifyRole(nick: String, role: String, reason: String, success_cb: js.Function, error_cb: js.Function): String = js.native
      def modifyRole(nick: String, role: String, reason: String, success_cb: Unit, error_cb: js.Function): String = js.native
      def modifyRole(nick: String, role: String, reason: Unit, success_cb: js.Function): String = js.native
      def modifyRole(nick: String, role: String, reason: Unit, success_cb: js.Function, error_cb: js.Function): String = js.native
      def modifyRole(nick: String, role: String, reason: Unit, success_cb: Unit, error_cb: js.Function): String = js.native
      
      def multipleInvites(receivers: js.Array[String]): String = js.native
      def multipleInvites(receivers: js.Array[String], reason: String): String = js.native
      
      def mute(nick: String): String = js.native
      def mute(nick: String, reason: String): String = js.native
      def mute(nick: String, reason: String, handler_cb: js.Function): String = js.native
      def mute(nick: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def mute(nick: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def mute(nick: String, reason: Unit, handler_cb: js.Function): String = js.native
      def mute(nick: String, reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def mute(nick: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      def op(nick: String): String = js.native
      def op(nick: String, reason: String): String = js.native
      def op(nick: String, reason: String, handler_cb: js.Function): String = js.native
      def op(nick: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def op(nick: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def op(nick: String, reason: Unit, handler_cb: js.Function): String = js.native
      def op(nick: String, reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def op(nick: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      def owner(jid: String): String = js.native
      def owner(jid: String, reason: String): String = js.native
      def owner(jid: String, reason: String, handler_cb: js.Function): String = js.native
      def owner(jid: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def owner(jid: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def owner(jid: String, reason: Unit, handler_cb: js.Function): String = js.native
      def owner(jid: String, reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def owner(jid: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      def queryOccupants(success_cb: js.Function, error_cb: js.Function): Unit = js.native
      
      /**
        * Removes a handler from the MUC room.
        * This function takes ONLY ids returned by the addHandler function
        * of this room. passing handler ids returned by connection.addHandler
        * may brake things!
        *
        * @param id - the id of the handler
        */
      def removeHandler(id: Double): Unit = js.native
      
      def revoke(jid: String): String = js.native
      def revoke(jid: String, reason: String): String = js.native
      def revoke(jid: String, reason: String, handler_cb: js.Function): String = js.native
      def revoke(jid: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def revoke(jid: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def revoke(jid: String, reason: Unit, handler_cb: js.Function): String = js.native
      def revoke(jid: String, reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def revoke(jid: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
      
      def saveConfiguration(config: Any): String = js.native
      
      def setStatus(show: String, status: String): String = js.native
      
      def setTopic(topic: String): String = js.native
      
      def voice(nick: String): String = js.native
      def voice(nick: String, reason: String): String = js.native
      def voice(nick: String, reason: String, handler_cb: js.Function): String = js.native
      def voice(nick: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def voice(nick: String, reason: String, handler_cb: Unit, error_cb: js.Function): String = js.native
      def voice(nick: String, reason: Unit, handler_cb: js.Function): String = js.native
      def voice(nick: String, reason: Unit, handler_cb: js.Function, error_cb: js.Function): String = js.native
      def voice(nick: String, reason: Unit, handler_cb: Unit, error_cb: js.Function): String = js.native
    }
  }
}
