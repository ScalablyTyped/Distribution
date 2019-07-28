package typings.tmiDotJs.tmiDotJsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  def action(channel: String, userstate: ChatUserstate, message: String, self: Boolean): Unit
  def anongiftpaidupgrade(channel: String, username: String, userstate: AnonSubGiftUpgradeUserstate): Unit
  def ban(channel: String, username: String, reason: String): Unit
  def chat(channel: String, userstate: ChatUserstate, message: String, self: Boolean): Unit
  def cheer(channel: String, userstate: ChatUserstate, message: String): Unit
  def clearchat(channel: String): Unit
  def connected(address: String, port: Double): Unit
  def connecting(address: String, port: Double): Unit
  def disconnected(reason: String): Unit
  def emoteonly(channel: String, enabled: Boolean): Unit
  def emotesets(sets: String, obj: EmoteObj): Unit
  def followersonly(channel: String, enabled: Boolean, length: Double): Unit
  def giftpaidupgrade(channel: String, username: String, sender: String, userstate: SubGiftUpgradeUserstate): Unit
  def hosted(channel: String, username: String, viewers: Double, autohost: Boolean): Unit
  def hosting(channel: String, target: String, viewers: Double): Unit
  def join(channel: String, username: String, self: Boolean): Unit
  def logon(): Unit
  def message(channel: String, userstate: ChatUserstate, message: String, self: Boolean): Unit
  def messagedeleted(channel: String, username: String, deletedMessage: String, userstate: DeleteUserstate): Unit
  def mod(channel: String, username: String): Unit
  def mods(channel: String, mods: js.Array[String]): Unit
  def notice(channel: String, msgid: MsgID, message: String): Unit
  def part(channel: String, username: String, self: Boolean): Unit
  def ping(): Unit
  def pong(latency: Double): Unit
  def r9kbeta(channel: String, enabled: Boolean): Unit
  def raided(channel: String, username: String, viewers: Double): Unit
  def raw_message(messageCloned: StringDictionary[js.Any], message: StringDictionary[js.Any]): Unit
  def reconnect(): Unit
  def resub(
    channel: String,
    username: String,
    months: Double,
    message: String,
    userstate: SubUserstate,
    methods: SubMethods
  ): Unit
  def roomstate(channel: String, state: RoomState): Unit
  def serverchange(channel: String): Unit
  def slowmode(channel: String, enabled: Boolean, length: Double): Unit
  def subgift(
    channel: String,
    username: String,
    streakMonths: Double,
    recipient: String,
    methods: SubMethods,
    userstate: SubGiftUserstate
  ): Unit
  def submysterygift(
    channel: String,
    username: String,
    numbOfSubs: Double,
    methods: SubMethods,
    userstate: SubMysteryGiftUserstate
  ): Unit
  def subscribers(channel: String, enabled: Boolean): Unit
  def subscription(channel: String, username: String, methods: SubMethods, message: String, userstate: SubUserstate): Unit
  def timeout(channel: String, username: String, reason: String, duration: Double): Unit
  def unhost(channel: String, viewers: Double): Unit
  def unmod(channel: String, username: String): Unit
  def vips(channel: String, vips: js.Array[String]): Unit
  def whisper(from: String, userstate: ChatUserstate, message: String, self: Boolean): Unit
}

object Events {
  @scala.inline
  def apply(
    action: (String, ChatUserstate, String, Boolean) => Unit,
    anongiftpaidupgrade: (String, String, AnonSubGiftUpgradeUserstate) => Unit,
    ban: (String, String, String) => Unit,
    chat: (String, ChatUserstate, String, Boolean) => Unit,
    cheer: (String, ChatUserstate, String) => Unit,
    clearchat: String => Unit,
    connected: (String, Double) => Unit,
    connecting: (String, Double) => Unit,
    disconnected: String => Unit,
    emoteonly: (String, Boolean) => Unit,
    emotesets: (String, EmoteObj) => Unit,
    followersonly: (String, Boolean, Double) => Unit,
    giftpaidupgrade: (String, String, String, SubGiftUpgradeUserstate) => Unit,
    hosted: (String, String, Double, Boolean) => Unit,
    hosting: (String, String, Double) => Unit,
    join: (String, String, Boolean) => Unit,
    logon: () => Unit,
    message: (String, ChatUserstate, String, Boolean) => Unit,
    messagedeleted: (String, String, String, DeleteUserstate) => Unit,
    mod: (String, String) => Unit,
    mods: (String, js.Array[String]) => Unit,
    notice: (String, MsgID, String) => Unit,
    part: (String, String, Boolean) => Unit,
    ping: () => Unit,
    pong: Double => Unit,
    r9kbeta: (String, Boolean) => Unit,
    raided: (String, String, Double) => Unit,
    raw_message: (StringDictionary[js.Any], StringDictionary[js.Any]) => Unit,
    reconnect: () => Unit,
    resub: (String, String, Double, String, SubUserstate, SubMethods) => Unit,
    roomstate: (String, RoomState) => Unit,
    serverchange: String => Unit,
    slowmode: (String, Boolean, Double) => Unit,
    subgift: (String, String, Double, String, SubMethods, SubGiftUserstate) => Unit,
    submysterygift: (String, String, Double, SubMethods, SubMysteryGiftUserstate) => Unit,
    subscribers: (String, Boolean) => Unit,
    subscription: (String, String, SubMethods, String, SubUserstate) => Unit,
    timeout: (String, String, String, Double) => Unit,
    unhost: (String, Double) => Unit,
    unmod: (String, String) => Unit,
    vips: (String, js.Array[String]) => Unit,
    whisper: (String, ChatUserstate, String, Boolean) => Unit
  ): Events = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction4(action), anongiftpaidupgrade = js.Any.fromFunction3(anongiftpaidupgrade), ban = js.Any.fromFunction3(ban), chat = js.Any.fromFunction4(chat), cheer = js.Any.fromFunction3(cheer), clearchat = js.Any.fromFunction1(clearchat), connected = js.Any.fromFunction2(connected), connecting = js.Any.fromFunction2(connecting), disconnected = js.Any.fromFunction1(disconnected), emoteonly = js.Any.fromFunction2(emoteonly), emotesets = js.Any.fromFunction2(emotesets), followersonly = js.Any.fromFunction3(followersonly), giftpaidupgrade = js.Any.fromFunction4(giftpaidupgrade), hosted = js.Any.fromFunction4(hosted), hosting = js.Any.fromFunction3(hosting), join = js.Any.fromFunction3(join), logon = js.Any.fromFunction0(logon), message = js.Any.fromFunction4(message), messagedeleted = js.Any.fromFunction4(messagedeleted), mod = js.Any.fromFunction2(mod), mods = js.Any.fromFunction2(mods), notice = js.Any.fromFunction3(notice), part = js.Any.fromFunction3(part), ping = js.Any.fromFunction0(ping), pong = js.Any.fromFunction1(pong), r9kbeta = js.Any.fromFunction2(r9kbeta), raided = js.Any.fromFunction3(raided), raw_message = js.Any.fromFunction2(raw_message), reconnect = js.Any.fromFunction0(reconnect), resub = js.Any.fromFunction6(resub), roomstate = js.Any.fromFunction2(roomstate), serverchange = js.Any.fromFunction1(serverchange), slowmode = js.Any.fromFunction3(slowmode), subgift = js.Any.fromFunction6(subgift), submysterygift = js.Any.fromFunction5(submysterygift), subscribers = js.Any.fromFunction2(subscribers), subscription = js.Any.fromFunction5(subscription), timeout = js.Any.fromFunction4(timeout), unhost = js.Any.fromFunction2(unhost), unmod = js.Any.fromFunction2(unmod), vips = js.Any.fromFunction2(vips), whisper = js.Any.fromFunction4(whisper))
  
    __obj.asInstanceOf[Events]
  }
}

