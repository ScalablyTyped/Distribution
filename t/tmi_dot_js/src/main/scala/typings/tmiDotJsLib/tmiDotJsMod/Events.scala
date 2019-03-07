package typings
package tmiDotJsLib.tmiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  def action(
    channel: java.lang.String,
    userstate: ChatUserstate,
    message: java.lang.String,
    self: scala.Boolean
  ): scala.Unit
  def ban(channel: java.lang.String, username: java.lang.String, reason: java.lang.String): scala.Unit
  def chat(
    channel: java.lang.String,
    userstate: ChatUserstate,
    message: java.lang.String,
    self: scala.Boolean
  ): scala.Unit
  def cheer(channel: java.lang.String, userstate: ChatUserstate, message: java.lang.String): scala.Unit
  def clearchat(channel: java.lang.String): scala.Unit
  def connected(address: java.lang.String, port: scala.Double): scala.Unit
  def connecting(address: java.lang.String, port: scala.Double): scala.Unit
  def disconnected(reason: java.lang.String): scala.Unit
  def emoteonly(channel: java.lang.String, enabled: scala.Boolean): scala.Unit
  def emotesets(sets: java.lang.String, obj: EmoteObj): scala.Unit
  def followersonly(channel: java.lang.String, enabled: scala.Boolean, length: scala.Double): scala.Unit
  def hosted(
    channel: java.lang.String,
    username: java.lang.String,
    viewers: scala.Double,
    autohost: scala.Boolean
  ): scala.Unit
  def hosting(channel: java.lang.String, target: java.lang.String, viewers: scala.Double): scala.Unit
  def join(channel: java.lang.String, username: java.lang.String, self: scala.Boolean): scala.Unit
  def logon(): scala.Unit
  def message(
    channel: java.lang.String,
    userstate: ChatUserstate,
    message: java.lang.String,
    self: scala.Boolean
  ): scala.Unit
  def mod(channel: java.lang.String, username: java.lang.String): scala.Unit
  def mods(channel: java.lang.String, mods: js.Array[java.lang.String]): scala.Unit
  def notice(channel: java.lang.String, msgid: MsgID, message: java.lang.String): scala.Unit
  def part(channel: java.lang.String, username: java.lang.String, self: scala.Boolean): scala.Unit
  def ping(): scala.Unit
  def pong(latency: scala.Double): scala.Unit
  def r9kbeta(channel: java.lang.String, enabled: scala.Boolean): scala.Unit
  def reconnect(): scala.Unit
  def resub(
    channel: java.lang.String,
    username: java.lang.String,
    months: scala.Double,
    message: java.lang.String,
    userstate: SubUserstate,
    methods: ResubMethod
  ): scala.Unit
  def roomstate(channel: java.lang.String, state: RoomState): scala.Unit
  def serverchange(channel: java.lang.String): scala.Unit
  def slowmode(channel: java.lang.String, enabled: scala.Boolean, length: scala.Double): scala.Unit
  def subscribers(channel: java.lang.String, enabled: scala.Boolean): scala.Unit
  def subscription(
    channel: java.lang.String,
    username: java.lang.String,
    method: ResubMethod,
    message: java.lang.String,
    userstate: SubUserstate
  ): scala.Unit
  def timeout(
    channel: java.lang.String,
    username: java.lang.String,
    reason: java.lang.String,
    duration: scala.Double
  ): scala.Unit
  def unhost(channel: java.lang.String, viewers: scala.Double): scala.Unit
  def unmod(channel: java.lang.String, username: java.lang.String): scala.Unit
  def whisper(from: java.lang.String, userstate: ChatUserstate, message: java.lang.String, self: scala.Boolean): scala.Unit
}

object Events {
  @scala.inline
  def apply(
    action: js.Function4[java.lang.String, ChatUserstate, java.lang.String, scala.Boolean, scala.Unit],
    ban: js.Function3[java.lang.String, java.lang.String, java.lang.String, scala.Unit],
    chat: js.Function4[java.lang.String, ChatUserstate, java.lang.String, scala.Boolean, scala.Unit],
    cheer: js.Function3[java.lang.String, ChatUserstate, java.lang.String, scala.Unit],
    clearchat: js.Function1[java.lang.String, scala.Unit],
    connected: js.Function2[java.lang.String, scala.Double, scala.Unit],
    connecting: js.Function2[java.lang.String, scala.Double, scala.Unit],
    disconnected: js.Function1[java.lang.String, scala.Unit],
    emoteonly: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    emotesets: js.Function2[java.lang.String, EmoteObj, scala.Unit],
    followersonly: js.Function3[java.lang.String, scala.Boolean, scala.Double, scala.Unit],
    hosted: js.Function4[java.lang.String, java.lang.String, scala.Double, scala.Boolean, scala.Unit],
    hosting: js.Function3[java.lang.String, java.lang.String, scala.Double, scala.Unit],
    join: js.Function3[java.lang.String, java.lang.String, scala.Boolean, scala.Unit],
    logon: js.Function0[scala.Unit],
    message: js.Function4[java.lang.String, ChatUserstate, java.lang.String, scala.Boolean, scala.Unit],
    mod: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    mods: js.Function2[java.lang.String, js.Array[java.lang.String], scala.Unit],
    notice: js.Function3[java.lang.String, MsgID, java.lang.String, scala.Unit],
    part: js.Function3[java.lang.String, java.lang.String, scala.Boolean, scala.Unit],
    ping: js.Function0[scala.Unit],
    pong: js.Function1[scala.Double, scala.Unit],
    r9kbeta: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    reconnect: js.Function0[scala.Unit],
    resub: js.Function6[
      java.lang.String, 
      java.lang.String, 
      scala.Double, 
      java.lang.String, 
      SubUserstate, 
      ResubMethod, 
      scala.Unit
    ],
    roomstate: js.Function2[java.lang.String, RoomState, scala.Unit],
    serverchange: js.Function1[java.lang.String, scala.Unit],
    slowmode: js.Function3[java.lang.String, scala.Boolean, scala.Double, scala.Unit],
    subscribers: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    subscription: js.Function5[
      java.lang.String, 
      java.lang.String, 
      ResubMethod, 
      java.lang.String, 
      SubUserstate, 
      scala.Unit
    ],
    timeout: js.Function4[java.lang.String, java.lang.String, java.lang.String, scala.Double, scala.Unit],
    unhost: js.Function2[java.lang.String, scala.Double, scala.Unit],
    unmod: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    whisper: js.Function4[java.lang.String, ChatUserstate, java.lang.String, scala.Boolean, scala.Unit]
  ): Events = {
    val __obj = js.Dynamic.literal(action = action, ban = ban, chat = chat, cheer = cheer, clearchat = clearchat, connected = connected, connecting = connecting, disconnected = disconnected, emoteonly = emoteonly, emotesets = emotesets, followersonly = followersonly, hosted = hosted, hosting = hosting, join = join, logon = logon, message = message, mod = mod, mods = mods, notice = notice, part = part, ping = ping, pong = pong, r9kbeta = r9kbeta, reconnect = reconnect, resub = resub, roomstate = roomstate, serverchange = serverchange, slowmode = slowmode, subscribers = subscribers, subscription = subscription, timeout = timeout, unhost = unhost, unmod = unmod, whisper = whisper)
  
    __obj.asInstanceOf[Events]
  }
}

