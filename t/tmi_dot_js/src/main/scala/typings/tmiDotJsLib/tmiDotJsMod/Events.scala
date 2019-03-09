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
  def anongiftpaidupgrade(channel: java.lang.String, username: java.lang.String, userstate: AnonSubGiftUpgradeUserstate): scala.Unit
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
  def giftpaidupgrade(
    channel: java.lang.String,
    username: java.lang.String,
    sender: java.lang.String,
    userstate: SubGiftUpgradeUserstate
  ): scala.Unit
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
  def messagedeleted(
    channel: java.lang.String,
    username: java.lang.String,
    deletedMessage: java.lang.String,
    userstate: DeleteUserstate
  ): scala.Unit
  def mod(channel: java.lang.String, username: java.lang.String): scala.Unit
  def mods(channel: java.lang.String, mods: js.Array[java.lang.String]): scala.Unit
  def notice(channel: java.lang.String, msgid: MsgID, message: java.lang.String): scala.Unit
  def part(channel: java.lang.String, username: java.lang.String, self: scala.Boolean): scala.Unit
  def ping(): scala.Unit
  def pong(latency: scala.Double): scala.Unit
  def r9kbeta(channel: java.lang.String, enabled: scala.Boolean): scala.Unit
  def raided(channel: java.lang.String, username: java.lang.String, viewers: scala.Double): scala.Unit
  def raw_message(
    messageCloned: org.scalablytyped.runtime.StringDictionary[js.Any],
    message: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit
  def reconnect(): scala.Unit
  def resub(
    channel: java.lang.String,
    username: java.lang.String,
    months: scala.Double,
    message: java.lang.String,
    userstate: SubUserstate,
    methods: SubMethods
  ): scala.Unit
  def roomstate(channel: java.lang.String, state: RoomState): scala.Unit
  def serverchange(channel: java.lang.String): scala.Unit
  def slowmode(channel: java.lang.String, enabled: scala.Boolean, length: scala.Double): scala.Unit
  def subgift(
    channel: java.lang.String,
    username: java.lang.String,
    streakMonths: scala.Double,
    recipient: java.lang.String,
    methods: SubMethods,
    userstate: SubGiftUserstate
  ): scala.Unit
  def submysterygift(
    channel: java.lang.String,
    username: java.lang.String,
    numbOfSubs: scala.Double,
    methods: SubMethods,
    userstate: SubMysteryGiftUserstate
  ): scala.Unit
  def subscribers(channel: java.lang.String, enabled: scala.Boolean): scala.Unit
  def subscription(
    channel: java.lang.String,
    username: java.lang.String,
    methods: SubMethods,
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
  def vips(channel: java.lang.String, vips: js.Array[java.lang.String]): scala.Unit
  def whisper(from: java.lang.String, userstate: ChatUserstate, message: java.lang.String, self: scala.Boolean): scala.Unit
}

object Events {
  @scala.inline
  def apply(
    action: js.Function4[java.lang.String, ChatUserstate, java.lang.String, scala.Boolean, scala.Unit],
    anongiftpaidupgrade: js.Function3[java.lang.String, java.lang.String, AnonSubGiftUpgradeUserstate, scala.Unit],
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
    giftpaidupgrade: js.Function4[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      SubGiftUpgradeUserstate, 
      scala.Unit
    ],
    hosted: js.Function4[java.lang.String, java.lang.String, scala.Double, scala.Boolean, scala.Unit],
    hosting: js.Function3[java.lang.String, java.lang.String, scala.Double, scala.Unit],
    join: js.Function3[java.lang.String, java.lang.String, scala.Boolean, scala.Unit],
    logon: js.Function0[scala.Unit],
    message: js.Function4[java.lang.String, ChatUserstate, java.lang.String, scala.Boolean, scala.Unit],
    messagedeleted: js.Function4[java.lang.String, java.lang.String, java.lang.String, DeleteUserstate, scala.Unit],
    mod: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    mods: js.Function2[java.lang.String, js.Array[java.lang.String], scala.Unit],
    notice: js.Function3[java.lang.String, MsgID, java.lang.String, scala.Unit],
    part: js.Function3[java.lang.String, java.lang.String, scala.Boolean, scala.Unit],
    ping: js.Function0[scala.Unit],
    pong: js.Function1[scala.Double, scala.Unit],
    r9kbeta: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    raided: js.Function3[java.lang.String, java.lang.String, scala.Double, scala.Unit],
    raw_message: js.Function2[
      org.scalablytyped.runtime.StringDictionary[js.Any], 
      org.scalablytyped.runtime.StringDictionary[js.Any], 
      scala.Unit
    ],
    reconnect: js.Function0[scala.Unit],
    resub: js.Function6[
      java.lang.String, 
      java.lang.String, 
      scala.Double, 
      java.lang.String, 
      SubUserstate, 
      SubMethods, 
      scala.Unit
    ],
    roomstate: js.Function2[java.lang.String, RoomState, scala.Unit],
    serverchange: js.Function1[java.lang.String, scala.Unit],
    slowmode: js.Function3[java.lang.String, scala.Boolean, scala.Double, scala.Unit],
    subgift: js.Function6[
      java.lang.String, 
      java.lang.String, 
      scala.Double, 
      java.lang.String, 
      SubMethods, 
      SubGiftUserstate, 
      scala.Unit
    ],
    submysterygift: js.Function5[
      java.lang.String, 
      java.lang.String, 
      scala.Double, 
      SubMethods, 
      SubMysteryGiftUserstate, 
      scala.Unit
    ],
    subscribers: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    subscription: js.Function5[java.lang.String, java.lang.String, SubMethods, java.lang.String, SubUserstate, scala.Unit],
    timeout: js.Function4[java.lang.String, java.lang.String, java.lang.String, scala.Double, scala.Unit],
    unhost: js.Function2[java.lang.String, scala.Double, scala.Unit],
    unmod: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    vips: js.Function2[java.lang.String, js.Array[java.lang.String], scala.Unit],
    whisper: js.Function4[java.lang.String, ChatUserstate, java.lang.String, scala.Boolean, scala.Unit]
  ): Events = {
    val __obj = js.Dynamic.literal(action = action, anongiftpaidupgrade = anongiftpaidupgrade, ban = ban, chat = chat, cheer = cheer, clearchat = clearchat, connected = connected, connecting = connecting, disconnected = disconnected, emoteonly = emoteonly, emotesets = emotesets, followersonly = followersonly, giftpaidupgrade = giftpaidupgrade, hosted = hosted, hosting = hosting, join = join, logon = logon, message = message, messagedeleted = messagedeleted, mod = mod, mods = mods, notice = notice, part = part, ping = ping, pong = pong, r9kbeta = r9kbeta, raided = raided, raw_message = raw_message, reconnect = reconnect, resub = resub, roomstate = roomstate, serverchange = serverchange, slowmode = slowmode, subgift = subgift, submysterygift = submysterygift, subscribers = subscribers, subscription = subscription, timeout = timeout, unhost = unhost, unmod = unmod, vips = vips, whisper = whisper)
  
    __obj.asInstanceOf[Events]
  }
}

