package typings.strophe.mucMod.stropheAugmentingMod.Strophe.MUC

import typings.strophe.stropheStrings.chat
import typings.strophe.stropheStrings.groupchat
import typings.strophe.stropheStrings.message
import typings.strophe.stropheStrings.presence
import typings.strophe.stropheStrings.roster
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmppRoom extends js.Object {
  
  @JSName("addHandler")
  def addHandler_message(handler_type: message, handler: js.Function): Double = js.native
  /**
    * Adds a handler to the MUC room.
    * Parameters:
    * @param handler_type - 'message', 'presence' or 'roster'.
    * @param handler - The handler function.
    * @return id - the id of handler.
    */
  @JSName("addHandler")
  def addHandler_presence(handler_type: presence, handler: js.Function): Double = js.native
  @JSName("addHandler")
  def addHandler_roster(handler_type: roster, handler: js.Function): Double = js.native
  
  def admin(jid: String): String = js.native
  def admin(
    jid: String,
    reason: js.UndefOr[scala.Nothing],
    handler_cb: js.UndefOr[scala.Nothing],
    error_cb: js.Function
  ): String = js.native
  def admin(jid: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function): String = js.native
  def admin(jid: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function, error_cb: js.Function): String = js.native
  def admin(jid: String, reason: String): String = js.native
  def admin(jid: String, reason: String, handler_cb: js.UndefOr[scala.Nothing], error_cb: js.Function): String = js.native
  def admin(jid: String, reason: String, handler_cb: js.Function): String = js.native
  def admin(jid: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
  
  def ban(jid: String): String = js.native
  def ban(
    jid: String,
    reason: js.UndefOr[scala.Nothing],
    handler_cb: js.UndefOr[scala.Nothing],
    error_cb: js.Function
  ): String = js.native
  def ban(jid: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function): String = js.native
  def ban(jid: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function, error_cb: js.Function): String = js.native
  def ban(jid: String, reason: String): String = js.native
  def ban(jid: String, reason: String, handler_cb: js.UndefOr[scala.Nothing], error_cb: js.Function): String = js.native
  def ban(jid: String, reason: String, handler_cb: js.Function): String = js.native
  def ban(jid: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
  
  def cancelConfigure(): String = js.native
  
  def changeNick(nick: String): String = js.native
  
  def configure(handler_cb: js.Function): String = js.native
  
  def deop(nick: String): String = js.native
  def deop(
    nick: String,
    reason: js.UndefOr[scala.Nothing],
    handler_cb: js.UndefOr[scala.Nothing],
    error_cb: js.Function
  ): String = js.native
  def deop(nick: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function): String = js.native
  def deop(nick: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function, error_cb: js.Function): String = js.native
  def deop(nick: String, reason: String): String = js.native
  def deop(nick: String, reason: String, handler_cb: js.UndefOr[scala.Nothing], error_cb: js.Function): String = js.native
  def deop(nick: String, reason: String, handler_cb: js.Function): String = js.native
  def deop(nick: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
  
  def directInvite(receiver: String): String = js.native
  def directInvite(receiver: String, reason: String): String = js.native
  
  def groupchat(message: String): String = js.native
  def groupchat(message: String, html_message: String): String = js.native
  
  def invite(receiver: String): String = js.native
  def invite(receiver: String, reason: String): String = js.native
  
  def join(msg_handler_cb: js.Function, pres_handler_cb: js.Function, roster_cb: js.Function): Unit = js.native
  
  def kick(nick: String): String = js.native
  def kick(
    nick: String,
    reason: js.UndefOr[scala.Nothing],
    handler_cb: js.UndefOr[scala.Nothing],
    error_cb: js.Function
  ): String = js.native
  def kick(nick: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function): String = js.native
  def kick(nick: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function, error_cb: js.Function): String = js.native
  def kick(nick: String, reason: String): String = js.native
  def kick(nick: String, reason: String, handler_cb: js.UndefOr[scala.Nothing], error_cb: js.Function): String = js.native
  def kick(nick: String, reason: String, handler_cb: js.Function): String = js.native
  def kick(nick: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
  
  def leave(): Unit = js.native
  def leave(handler_cb: js.UndefOr[scala.Nothing], exit_msg: String): Unit = js.native
  def leave(handler_cb: js.Function): Unit = js.native
  def leave(handler_cb: js.Function, exit_msg: String): Unit = js.native
  
  def member(jid: String): String = js.native
  def member(
    jid: String,
    reason: js.UndefOr[scala.Nothing],
    handler_cb: js.UndefOr[scala.Nothing],
    error_cb: js.Function
  ): String = js.native
  def member(jid: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function): String = js.native
  def member(jid: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function, error_cb: js.Function): String = js.native
  def member(jid: String, reason: String): String = js.native
  def member(jid: String, reason: String, handler_cb: js.UndefOr[scala.Nothing], error_cb: js.Function): String = js.native
  def member(jid: String, reason: String, handler_cb: js.Function): String = js.native
  def member(jid: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
  
  @JSName("message")
  def message_chat(message: String, html_message: String, `type`: chat): String = js.native
  @JSName("message")
  def message_groupchat(message: String, html_message: String, `type`: groupchat): String = js.native
  
  def modifyAffiliation(jid: String, affiliation: String): String = js.native
  def modifyAffiliation(
    jid: String,
    affiliation: String,
    reason: js.UndefOr[scala.Nothing],
    success_cb: js.UndefOr[scala.Nothing],
    error_cb: js.Function
  ): String = js.native
  def modifyAffiliation(jid: String, affiliation: String, reason: js.UndefOr[scala.Nothing], success_cb: js.Function): String = js.native
  def modifyAffiliation(
    jid: String,
    affiliation: String,
    reason: js.UndefOr[scala.Nothing],
    success_cb: js.Function,
    error_cb: js.Function
  ): String = js.native
  def modifyAffiliation(jid: String, affiliation: String, reason: String): String = js.native
  def modifyAffiliation(
    jid: String,
    affiliation: String,
    reason: String,
    success_cb: js.UndefOr[scala.Nothing],
    error_cb: js.Function
  ): String = js.native
  def modifyAffiliation(jid: String, affiliation: String, reason: String, success_cb: js.Function): String = js.native
  def modifyAffiliation(jid: String, affiliation: String, reason: String, success_cb: js.Function, error_cb: js.Function): String = js.native
  
  def modifyRole(nick: String, role: String): String = js.native
  def modifyRole(
    nick: String,
    role: String,
    reason: js.UndefOr[scala.Nothing],
    success_cb: js.UndefOr[scala.Nothing],
    error_cb: js.Function
  ): String = js.native
  def modifyRole(nick: String, role: String, reason: js.UndefOr[scala.Nothing], success_cb: js.Function): String = js.native
  def modifyRole(
    nick: String,
    role: String,
    reason: js.UndefOr[scala.Nothing],
    success_cb: js.Function,
    error_cb: js.Function
  ): String = js.native
  def modifyRole(nick: String, role: String, reason: String): String = js.native
  def modifyRole(
    nick: String,
    role: String,
    reason: String,
    success_cb: js.UndefOr[scala.Nothing],
    error_cb: js.Function
  ): String = js.native
  def modifyRole(nick: String, role: String, reason: String, success_cb: js.Function): String = js.native
  def modifyRole(nick: String, role: String, reason: String, success_cb: js.Function, error_cb: js.Function): String = js.native
  
  def multipleInvites(receivers: js.Array[String]): String = js.native
  def multipleInvites(receivers: js.Array[String], reason: String): String = js.native
  
  def mute(nick: String): String = js.native
  def mute(
    nick: String,
    reason: js.UndefOr[scala.Nothing],
    handler_cb: js.UndefOr[scala.Nothing],
    error_cb: js.Function
  ): String = js.native
  def mute(nick: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function): String = js.native
  def mute(nick: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function, error_cb: js.Function): String = js.native
  def mute(nick: String, reason: String): String = js.native
  def mute(nick: String, reason: String, handler_cb: js.UndefOr[scala.Nothing], error_cb: js.Function): String = js.native
  def mute(nick: String, reason: String, handler_cb: js.Function): String = js.native
  def mute(nick: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
  
  def op(nick: String): String = js.native
  def op(
    nick: String,
    reason: js.UndefOr[scala.Nothing],
    handler_cb: js.UndefOr[scala.Nothing],
    error_cb: js.Function
  ): String = js.native
  def op(nick: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function): String = js.native
  def op(nick: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function, error_cb: js.Function): String = js.native
  def op(nick: String, reason: String): String = js.native
  def op(nick: String, reason: String, handler_cb: js.UndefOr[scala.Nothing], error_cb: js.Function): String = js.native
  def op(nick: String, reason: String, handler_cb: js.Function): String = js.native
  def op(nick: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
  
  def owner(jid: String): String = js.native
  def owner(
    jid: String,
    reason: js.UndefOr[scala.Nothing],
    handler_cb: js.UndefOr[scala.Nothing],
    error_cb: js.Function
  ): String = js.native
  def owner(jid: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function): String = js.native
  def owner(jid: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function, error_cb: js.Function): String = js.native
  def owner(jid: String, reason: String): String = js.native
  def owner(jid: String, reason: String, handler_cb: js.UndefOr[scala.Nothing], error_cb: js.Function): String = js.native
  def owner(jid: String, reason: String, handler_cb: js.Function): String = js.native
  def owner(jid: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
  
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
  def revoke(
    jid: String,
    reason: js.UndefOr[scala.Nothing],
    handler_cb: js.UndefOr[scala.Nothing],
    error_cb: js.Function
  ): String = js.native
  def revoke(jid: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function): String = js.native
  def revoke(jid: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function, error_cb: js.Function): String = js.native
  def revoke(jid: String, reason: String): String = js.native
  def revoke(jid: String, reason: String, handler_cb: js.UndefOr[scala.Nothing], error_cb: js.Function): String = js.native
  def revoke(jid: String, reason: String, handler_cb: js.Function): String = js.native
  def revoke(jid: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
  
  def saveConfiguration(config: js.Any): String = js.native
  
  def setStatus(show: String, status: String): String = js.native
  
  def setTopic(topic: String): String = js.native
  
  def voice(nick: String): String = js.native
  def voice(
    nick: String,
    reason: js.UndefOr[scala.Nothing],
    handler_cb: js.UndefOr[scala.Nothing],
    error_cb: js.Function
  ): String = js.native
  def voice(nick: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function): String = js.native
  def voice(nick: String, reason: js.UndefOr[scala.Nothing], handler_cb: js.Function, error_cb: js.Function): String = js.native
  def voice(nick: String, reason: String): String = js.native
  def voice(nick: String, reason: String, handler_cb: js.UndefOr[scala.Nothing], error_cb: js.Function): String = js.native
  def voice(nick: String, reason: String, handler_cb: js.Function): String = js.native
  def voice(nick: String, reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
}
