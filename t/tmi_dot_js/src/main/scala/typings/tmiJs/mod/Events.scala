package typings.tmiJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.tmiJs.tmiJsStrings.`highlighted-message`
import typings.tmiJs.tmiJsStrings.`skip-subs-mode-message`
import typings.tmiJs.tmiJsStrings.msg_rejected
import typings.tmiJs.tmiJsStrings.msg_rejected_mandatory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Events extends StObject {
  
  def action(channel: String, userstate: ChatUserstate, message: String, self: Boolean): Unit = js.native
  
  def anongiftpaidupgrade(channel: String, username: String, userstate: AnonSubGiftUpgradeUserstate): Unit = js.native
  
  def anonsubgift(
    channel: String,
    streakMonths: Double,
    recipient: String,
    methods: SubMethods,
    userstate: AnonSubGiftUserstate
  ): Unit = js.native
  
  def anonsubmysterygift(channel: String, numbOfSubs: Double, methods: SubMethods, userstate: AnonSubMysteryGiftUserstate): Unit = js.native
  
  def automod(channel: String, msgID: msg_rejected | msg_rejected_mandatory, message: String): Unit = js.native
  
  def ban(channel: String, username: String, reason: String): Unit = js.native
  
  def chat(channel: String, userstate: ChatUserstate, message: String, self: Boolean): Unit = js.native
  
  def cheer(channel: String, userstate: ChatUserstate, message: String): Unit = js.native
  
  def clearchat(channel: String): Unit = js.native
  
  def connected(address: String, port: Double): Unit = js.native
  
  def connecting(address: String, port: Double): Unit = js.native
  
  def disconnected(reason: String): Unit = js.native
  
  def emoteonly(channel: String, enabled: Boolean): Unit = js.native
  
  def emotesets(sets: String, obj: EmoteObj): Unit = js.native
  
  def followersonly(channel: String, enabled: Boolean, length: Double): Unit = js.native
  
  def giftpaidupgrade(channel: String, username: String, sender: String, userstate: SubGiftUpgradeUserstate): Unit = js.native
  
  def hosted(channel: String, username: String, viewers: Double, autohost: Boolean): Unit = js.native
  
  def hosting(channel: String, target: String, viewers: Double): Unit = js.native
  
  def join(channel: String, username: String, self: Boolean): Unit = js.native
  
  def logon(): Unit = js.native
  
  def message(channel: String, userstate: ChatUserstate, message: String, self: Boolean): Unit = js.native
  
  def messagedeleted(channel: String, username: String, deletedMessage: String, userstate: DeleteUserstate): Unit = js.native
  
  def mod(channel: String, username: String): Unit = js.native
  
  def mods(channel: String, mods: js.Array[String]): Unit = js.native
  
  def notice(channel: String, msgid: MsgID, message: String): Unit = js.native
  
  def part(channel: String, username: String, self: Boolean): Unit = js.native
  
  def ping(): Unit = js.native
  
  def pong(latency: Double): Unit = js.native
  
  def primepaidupgrade(channel: String, username: String, methods: SubMethods, userstate: PrimeUpgradeUserstate): Unit = js.native
  
  def r9kbeta(channel: String, enabled: Boolean): Unit = js.native
  
  def raided(channel: String, username: String, viewers: Double): Unit = js.native
  
  def raw_message(messageCloned: StringDictionary[Any], message: StringDictionary[Any]): Unit = js.native
  
  def reconnect(): Unit = js.native
  
  def redeem(
    channel: String,
    username: String,
    rewardType: `highlighted-message` | `skip-subs-mode-message`,
    tags: ChatUserstate
  ): Unit = js.native
  // additional string literals for autocomplete
  def redeem(channel: String, username: String, rewardType: String, tags: ChatUserstate): Unit = js.native
  
  def resub(
    channel: String,
    username: String,
    months: Double,
    message: String,
    userstate: SubUserstate,
    methods: SubMethods
  ): Unit = js.native
  
  def roomstate(channel: String, state: RoomState): Unit = js.native
  
  def serverchange(channel: String): Unit = js.native
  
  def slowmode(channel: String, enabled: Boolean, length: Double): Unit = js.native
  
  def subgift(
    channel: String,
    username: String,
    streakMonths: Double,
    recipient: String,
    methods: SubMethods,
    userstate: SubGiftUserstate
  ): Unit = js.native
  
  def submysterygift(
    channel: String,
    username: String,
    numbOfSubs: Double,
    methods: SubMethods,
    userstate: SubMysteryGiftUserstate
  ): Unit = js.native
  
  def subscribers(channel: String, enabled: Boolean): Unit = js.native
  
  def subscription(channel: String, username: String, methods: SubMethods, message: String, userstate: SubUserstate): Unit = js.native
  
  def timeout(channel: String, username: String, reason: String, duration: Double): Unit = js.native
  
  def unhost(channel: String, viewers: Double): Unit = js.native
  
  def unmod(channel: String, username: String): Unit = js.native
  
  def vips(channel: String, vips: js.Array[String]): Unit = js.native
  
  def whisper(from: String, userstate: ChatUserstate, message: String, self: Boolean): Unit = js.native
}
