package typings
package stropheDotJsLib.mucMod.stropheMod.StropheNs.MUCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmppRoom extends js.Object {
  @JSName("addHandler")
  def addHandler_message(
    handler_type: stropheDotJsLib.stropheDotJsLibStrings.message,
    handler: js.Function1[/* stanza */ stdLib.Element, _]
  ): scala.Double = js.native
  /**
    * Adds a handler to the MUC room.
    * Parameters:
    * @param handler_type - 'message', 'presence' or 'roster'.
    * @param handler - The handler function.
    * @return id - the id of handler.
    */
  @JSName("addHandler")
  def addHandler_presence(
    handler_type: stropheDotJsLib.stropheDotJsLibStrings.presence,
    handler: js.Function1[/* stanza */ stdLib.Element, _]
  ): scala.Double = js.native
  @JSName("addHandler")
  def addHandler_roster(
    handler_type: stropheDotJsLib.stropheDotJsLibStrings.roster,
    handler: js.Function1[/* stanza */ stdLib.Element, _]
  ): scala.Double = js.native
  def admin(jid: java.lang.String): java.lang.String = js.native
  def admin(jid: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def admin(
    jid: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def admin(
    jid: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def ban(jid: java.lang.String): java.lang.String = js.native
  def ban(jid: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def ban(
    jid: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def ban(
    jid: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def cancelConfigure(): java.lang.String = js.native
  def changeNick(nick: java.lang.String): java.lang.String = js.native
  def configure(handler_cb: js.Function1[/* stanza */ stdLib.Element, _]): java.lang.String = js.native
  def deop(nick: java.lang.String): java.lang.String = js.native
  def deop(nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def deop(
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def deop(
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def directInvite(receiver: java.lang.String): java.lang.String = js.native
  def directInvite(receiver: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def groupchat(message: java.lang.String): java.lang.String = js.native
  def groupchat(message: java.lang.String, html_message: java.lang.String): java.lang.String = js.native
  def invite(receiver: java.lang.String): java.lang.String = js.native
  def invite(receiver: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def join(
    msg_handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    pres_handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    roster_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): scala.Unit = js.native
  def kick(nick: java.lang.String): java.lang.String = js.native
  def kick(nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def kick(
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def kick(
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def leave(): scala.Unit = js.native
  def leave(handler_cb: js.Function1[/* stanza */ stdLib.Element, _]): scala.Unit = js.native
  def leave(handler_cb: js.Function1[/* stanza */ stdLib.Element, _], exit_msg: java.lang.String): scala.Unit = js.native
  def member(jid: java.lang.String): java.lang.String = js.native
  def member(jid: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def member(
    jid: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def member(
    jid: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  @JSName("message")
  def message_chat(
    message: java.lang.String,
    html_message: java.lang.String,
    `type`: stropheDotJsLib.stropheDotJsLibStrings.chat
  ): java.lang.String = js.native
  @JSName("message")
  def message_groupchat(
    message: java.lang.String,
    html_message: java.lang.String,
    `type`: stropheDotJsLib.stropheDotJsLibStrings.groupchat
  ): java.lang.String = js.native
  def modifyAffiliation(jid: java.lang.String, affiliation: java.lang.String): java.lang.String = js.native
  def modifyAffiliation(jid: java.lang.String, affiliation: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def modifyAffiliation(
    jid: java.lang.String,
    affiliation: java.lang.String,
    reason: java.lang.String,
    success_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def modifyAffiliation(
    jid: java.lang.String,
    affiliation: java.lang.String,
    reason: java.lang.String,
    success_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def modifyRole(nick: java.lang.String, role: java.lang.String): java.lang.String = js.native
  def modifyRole(nick: java.lang.String, role: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def modifyRole(
    nick: java.lang.String,
    role: java.lang.String,
    reason: java.lang.String,
    success_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def modifyRole(
    nick: java.lang.String,
    role: java.lang.String,
    reason: java.lang.String,
    success_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def multipleInvites(receivers: js.Array[java.lang.String]): java.lang.String = js.native
  def multipleInvites(receivers: js.Array[java.lang.String], reason: java.lang.String): java.lang.String = js.native
  def mute(nick: java.lang.String): java.lang.String = js.native
  def mute(nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def mute(
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def mute(
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def op(nick: java.lang.String): java.lang.String = js.native
  def op(nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def op(
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def op(
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def owner(jid: java.lang.String): java.lang.String = js.native
  def owner(jid: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def owner(
    jid: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def owner(
    jid: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def queryOccupants(
    success_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): scala.Unit = js.native
  /**
    * Removes a handler from the MUC room.
    * This function takes ONLY ids returned by the addHandler function
    * of this room. passing handler ids returned by connection.addHandler
    * may brake things!
    *
    * @param id - the id of the handler
    */
  def removeHandler(id: scala.Double): scala.Unit = js.native
  def revoke(jid: java.lang.String): java.lang.String = js.native
  def revoke(jid: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def revoke(
    jid: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def revoke(
    jid: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def saveConfiguration(config: js.Any): java.lang.String = js.native
  def setStatus(show: java.lang.String, status: java.lang.String): java.lang.String = js.native
  def setTopic(topic: java.lang.String): java.lang.String = js.native
  def voice(nick: java.lang.String): java.lang.String = js.native
  def voice(nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def voice(
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def voice(
    nick: java.lang.String,
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
}

