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
    action: (java.lang.String, ChatUserstate, java.lang.String, scala.Boolean) => scala.Unit,
    anongiftpaidupgrade: (java.lang.String, java.lang.String, AnonSubGiftUpgradeUserstate) => scala.Unit,
    ban: (java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    chat: (java.lang.String, ChatUserstate, java.lang.String, scala.Boolean) => scala.Unit,
    cheer: (java.lang.String, ChatUserstate, java.lang.String) => scala.Unit,
    clearchat: java.lang.String => scala.Unit,
    connected: (java.lang.String, scala.Double) => scala.Unit,
    connecting: (java.lang.String, scala.Double) => scala.Unit,
    disconnected: java.lang.String => scala.Unit,
    emoteonly: (java.lang.String, scala.Boolean) => scala.Unit,
    emotesets: (java.lang.String, EmoteObj) => scala.Unit,
    followersonly: (java.lang.String, scala.Boolean, scala.Double) => scala.Unit,
    giftpaidupgrade: (java.lang.String, java.lang.String, java.lang.String, SubGiftUpgradeUserstate) => scala.Unit,
    hosted: (java.lang.String, java.lang.String, scala.Double, scala.Boolean) => scala.Unit,
    hosting: (java.lang.String, java.lang.String, scala.Double) => scala.Unit,
    join: (java.lang.String, java.lang.String, scala.Boolean) => scala.Unit,
    logon: () => scala.Unit,
    message: (java.lang.String, ChatUserstate, java.lang.String, scala.Boolean) => scala.Unit,
    messagedeleted: (java.lang.String, java.lang.String, java.lang.String, DeleteUserstate) => scala.Unit,
    mod: (java.lang.String, java.lang.String) => scala.Unit,
    mods: (java.lang.String, js.Array[java.lang.String]) => scala.Unit,
    notice: (java.lang.String, MsgID, java.lang.String) => scala.Unit,
    part: (java.lang.String, java.lang.String, scala.Boolean) => scala.Unit,
    ping: () => scala.Unit,
    pong: scala.Double => scala.Unit,
    r9kbeta: (java.lang.String, scala.Boolean) => scala.Unit,
    raided: (java.lang.String, java.lang.String, scala.Double) => scala.Unit,
    raw_message: (org.scalablytyped.runtime.StringDictionary[js.Any], org.scalablytyped.runtime.StringDictionary[js.Any]) => scala.Unit,
    reconnect: () => scala.Unit,
    resub: (java.lang.String, java.lang.String, scala.Double, java.lang.String, SubUserstate, SubMethods) => scala.Unit,
    roomstate: (java.lang.String, RoomState) => scala.Unit,
    serverchange: java.lang.String => scala.Unit,
    slowmode: (java.lang.String, scala.Boolean, scala.Double) => scala.Unit,
    subgift: (java.lang.String, java.lang.String, scala.Double, java.lang.String, SubMethods, SubGiftUserstate) => scala.Unit,
    submysterygift: (java.lang.String, java.lang.String, scala.Double, SubMethods, SubMysteryGiftUserstate) => scala.Unit,
    subscribers: (java.lang.String, scala.Boolean) => scala.Unit,
    subscription: (java.lang.String, java.lang.String, SubMethods, java.lang.String, SubUserstate) => scala.Unit,
    timeout: (java.lang.String, java.lang.String, java.lang.String, scala.Double) => scala.Unit,
    unhost: (java.lang.String, scala.Double) => scala.Unit,
    unmod: (java.lang.String, java.lang.String) => scala.Unit,
    vips: (java.lang.String, js.Array[java.lang.String]) => scala.Unit,
    whisper: (java.lang.String, ChatUserstate, java.lang.String, scala.Boolean) => scala.Unit
  ): Events = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction4(action), anongiftpaidupgrade = js.Any.fromFunction3(anongiftpaidupgrade), ban = js.Any.fromFunction3(ban), chat = js.Any.fromFunction4(chat), cheer = js.Any.fromFunction3(cheer), clearchat = js.Any.fromFunction1(clearchat), connected = js.Any.fromFunction2(connected), connecting = js.Any.fromFunction2(connecting), disconnected = js.Any.fromFunction1(disconnected), emoteonly = js.Any.fromFunction2(emoteonly), emotesets = js.Any.fromFunction2(emotesets), followersonly = js.Any.fromFunction3(followersonly), giftpaidupgrade = js.Any.fromFunction4(giftpaidupgrade), hosted = js.Any.fromFunction4(hosted), hosting = js.Any.fromFunction3(hosting), join = js.Any.fromFunction3(join), logon = js.Any.fromFunction0(logon), message = js.Any.fromFunction4(message), messagedeleted = js.Any.fromFunction4(messagedeleted), mod = js.Any.fromFunction2(mod), mods = js.Any.fromFunction2(mods), notice = js.Any.fromFunction3(notice), part = js.Any.fromFunction3(part), ping = js.Any.fromFunction0(ping), pong = js.Any.fromFunction1(pong), r9kbeta = js.Any.fromFunction2(r9kbeta), raided = js.Any.fromFunction3(raided), raw_message = js.Any.fromFunction2(raw_message), reconnect = js.Any.fromFunction0(reconnect), resub = js.Any.fromFunction6(resub), roomstate = js.Any.fromFunction2(roomstate), serverchange = js.Any.fromFunction1(serverchange), slowmode = js.Any.fromFunction3(slowmode), subgift = js.Any.fromFunction6(subgift), submysterygift = js.Any.fromFunction5(submysterygift), subscribers = js.Any.fromFunction2(subscribers), subscription = js.Any.fromFunction5(subscription), timeout = js.Any.fromFunction4(timeout), unhost = js.Any.fromFunction2(unhost), unmod = js.Any.fromFunction2(unmod), vips = js.Any.fromFunction2(vips), whisper = js.Any.fromFunction4(whisper))
  
    __obj.asInstanceOf[Events]
  }
}

