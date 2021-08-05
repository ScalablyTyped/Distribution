package typings.tmiJs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: Events](x: Self) {
    
    inline def setAction(value: (String, ChatUserstate, String, Boolean) => Unit): Self = StObject.set(x, "action", js.Any.fromFunction4(value))
    
    inline def setAnongiftpaidupgrade(value: (String, String, AnonSubGiftUpgradeUserstate) => Unit): Self = StObject.set(x, "anongiftpaidupgrade", js.Any.fromFunction3(value))
    
    inline def setBan(value: (String, String, String) => Unit): Self = StObject.set(x, "ban", js.Any.fromFunction3(value))
    
    inline def setChat(value: (String, ChatUserstate, String, Boolean) => Unit): Self = StObject.set(x, "chat", js.Any.fromFunction4(value))
    
    inline def setCheer(value: (String, ChatUserstate, String) => Unit): Self = StObject.set(x, "cheer", js.Any.fromFunction3(value))
    
    inline def setClearchat(value: String => Unit): Self = StObject.set(x, "clearchat", js.Any.fromFunction1(value))
    
    inline def setConnected(value: (String, Double) => Unit): Self = StObject.set(x, "connected", js.Any.fromFunction2(value))
    
    inline def setConnecting(value: (String, Double) => Unit): Self = StObject.set(x, "connecting", js.Any.fromFunction2(value))
    
    inline def setDisconnected(value: String => Unit): Self = StObject.set(x, "disconnected", js.Any.fromFunction1(value))
    
    inline def setEmoteonly(value: (String, Boolean) => Unit): Self = StObject.set(x, "emoteonly", js.Any.fromFunction2(value))
    
    inline def setEmotesets(value: (String, EmoteObj) => Unit): Self = StObject.set(x, "emotesets", js.Any.fromFunction2(value))
    
    inline def setFollowersonly(value: (String, Boolean, Double) => Unit): Self = StObject.set(x, "followersonly", js.Any.fromFunction3(value))
    
    inline def setGiftpaidupgrade(value: (String, String, String, SubGiftUpgradeUserstate) => Unit): Self = StObject.set(x, "giftpaidupgrade", js.Any.fromFunction4(value))
    
    inline def setHosted(value: (String, String, Double, Boolean) => Unit): Self = StObject.set(x, "hosted", js.Any.fromFunction4(value))
    
    inline def setHosting(value: (String, String, Double) => Unit): Self = StObject.set(x, "hosting", js.Any.fromFunction3(value))
    
    inline def setJoin(value: (String, String, Boolean) => Unit): Self = StObject.set(x, "join", js.Any.fromFunction3(value))
    
    inline def setLogon(value: () => Unit): Self = StObject.set(x, "logon", js.Any.fromFunction0(value))
    
    inline def setMessage(value: (String, ChatUserstate, String, Boolean) => Unit): Self = StObject.set(x, "message", js.Any.fromFunction4(value))
    
    inline def setMessagedeleted(value: (String, String, String, DeleteUserstate) => Unit): Self = StObject.set(x, "messagedeleted", js.Any.fromFunction4(value))
    
    inline def setMod(value: (String, String) => Unit): Self = StObject.set(x, "mod", js.Any.fromFunction2(value))
    
    inline def setMods(value: (String, js.Array[String]) => Unit): Self = StObject.set(x, "mods", js.Any.fromFunction2(value))
    
    inline def setNotice(value: (String, MsgID, String) => Unit): Self = StObject.set(x, "notice", js.Any.fromFunction3(value))
    
    inline def setPart(value: (String, String, Boolean) => Unit): Self = StObject.set(x, "part", js.Any.fromFunction3(value))
    
    inline def setPing(value: () => Unit): Self = StObject.set(x, "ping", js.Any.fromFunction0(value))
    
    inline def setPong(value: Double => Unit): Self = StObject.set(x, "pong", js.Any.fromFunction1(value))
    
    inline def setR9kbeta(value: (String, Boolean) => Unit): Self = StObject.set(x, "r9kbeta", js.Any.fromFunction2(value))
    
    inline def setRaided(value: (String, String, Double) => Unit): Self = StObject.set(x, "raided", js.Any.fromFunction3(value))
    
    inline def setRaw_message(value: (StringDictionary[js.Any], StringDictionary[js.Any]) => Unit): Self = StObject.set(x, "raw_message", js.Any.fromFunction2(value))
    
    inline def setReconnect(value: () => Unit): Self = StObject.set(x, "reconnect", js.Any.fromFunction0(value))
    
    inline def setResub(value: (String, String, Double, String, SubUserstate, SubMethods) => Unit): Self = StObject.set(x, "resub", js.Any.fromFunction6(value))
    
    inline def setRoomstate(value: (String, RoomState) => Unit): Self = StObject.set(x, "roomstate", js.Any.fromFunction2(value))
    
    inline def setServerchange(value: String => Unit): Self = StObject.set(x, "serverchange", js.Any.fromFunction1(value))
    
    inline def setSlowmode(value: (String, Boolean, Double) => Unit): Self = StObject.set(x, "slowmode", js.Any.fromFunction3(value))
    
    inline def setSubgift(value: (String, String, Double, String, SubMethods, SubGiftUserstate) => Unit): Self = StObject.set(x, "subgift", js.Any.fromFunction6(value))
    
    inline def setSubmysterygift(value: (String, String, Double, SubMethods, SubMysteryGiftUserstate) => Unit): Self = StObject.set(x, "submysterygift", js.Any.fromFunction5(value))
    
    inline def setSubscribers(value: (String, Boolean) => Unit): Self = StObject.set(x, "subscribers", js.Any.fromFunction2(value))
    
    inline def setSubscription(value: (String, String, SubMethods, String, SubUserstate) => Unit): Self = StObject.set(x, "subscription", js.Any.fromFunction5(value))
    
    inline def setTimeout(value: (String, String, String, Double) => Unit): Self = StObject.set(x, "timeout", js.Any.fromFunction4(value))
    
    inline def setUnhost(value: (String, Double) => Unit): Self = StObject.set(x, "unhost", js.Any.fromFunction2(value))
    
    inline def setUnmod(value: (String, String) => Unit): Self = StObject.set(x, "unmod", js.Any.fromFunction2(value))
    
    inline def setVips(value: (String, js.Array[String]) => Unit): Self = StObject.set(x, "vips", js.Any.fromFunction2(value))
    
    inline def setWhisper(value: (String, ChatUserstate, String, Boolean) => Unit): Self = StObject.set(x, "whisper", js.Any.fromFunction4(value))
  }
}
