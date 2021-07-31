package typings.tmiJs.mod

import typings.tmiJs.strictEventEmitterTypesMod.EEMethodReturnType
import typings.tmiJs.strictEventEmitterTypesMod.ListenerType
import typings.tmiJs.tmiJsStrings.CLOSED
import typings.tmiJs.tmiJsStrings.CLOSING
import typings.tmiJs.tmiJsStrings.CONNECTING
import typings.tmiJs.tmiJsStrings.OPEN
import typings.tmiJs.tmiJsStrings.action
import typings.tmiJs.tmiJsStrings.addListener
import typings.tmiJs.tmiJsStrings.anongiftpaidupgrade
import typings.tmiJs.tmiJsStrings.ban
import typings.tmiJs.tmiJsStrings.chat
import typings.tmiJs.tmiJsStrings.cheer
import typings.tmiJs.tmiJsStrings.clearchat
import typings.tmiJs.tmiJsStrings.connected
import typings.tmiJs.tmiJsStrings.connecting_
import typings.tmiJs.tmiJsStrings.disconnected
import typings.tmiJs.tmiJsStrings.emit
import typings.tmiJs.tmiJsStrings.emoteonly
import typings.tmiJs.tmiJsStrings.emotesets
import typings.tmiJs.tmiJsStrings.followersonly
import typings.tmiJs.tmiJsStrings.giftpaidupgrade
import typings.tmiJs.tmiJsStrings.hosted
import typings.tmiJs.tmiJsStrings.hosting
import typings.tmiJs.tmiJsStrings.join
import typings.tmiJs.tmiJsStrings.logon
import typings.tmiJs.tmiJsStrings.message
import typings.tmiJs.tmiJsStrings.messagedeleted
import typings.tmiJs.tmiJsStrings.mods
import typings.tmiJs.tmiJsStrings.notice
import typings.tmiJs.tmiJsStrings.on
import typings.tmiJs.tmiJsStrings.once
import typings.tmiJs.tmiJsStrings.part
import typings.tmiJs.tmiJsStrings.ping
import typings.tmiJs.tmiJsStrings.pong
import typings.tmiJs.tmiJsStrings.r9kbeta
import typings.tmiJs.tmiJsStrings.raided
import typings.tmiJs.tmiJsStrings.raw_message
import typings.tmiJs.tmiJsStrings.reconnect
import typings.tmiJs.tmiJsStrings.removeListener
import typings.tmiJs.tmiJsStrings.resub
import typings.tmiJs.tmiJsStrings.roomstate
import typings.tmiJs.tmiJsStrings.serverchange
import typings.tmiJs.tmiJsStrings.slowmode
import typings.tmiJs.tmiJsStrings.subgift
import typings.tmiJs.tmiJsStrings.submysterygift
import typings.tmiJs.tmiJsStrings.subscribers
import typings.tmiJs.tmiJsStrings.subscription
import typings.tmiJs.tmiJsStrings.timeout
import typings.tmiJs.tmiJsStrings.unhost
import typings.tmiJs.tmiJsStrings.unmod
import typings.tmiJs.tmiJsStrings.vips
import typings.tmiJs.tmiJsStrings.whisper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tmi.js.tmi.js/strict-event-emitter-types.StrictEventEmitter<tmi.js.tmi.js.ClientBase, tmi.js.tmi.js.Events, tmi.js.tmi.js.Events, std.Exclude<tmi.js.tmi.js/strict-event-emitter-types.OverriddenKeys, keyof tmi.js.tmi.js.ClientBase>, std.Exclude<tmi.js.tmi.js/strict-event-emitter-types.OverriddenKeys, std.Exclude<tmi.js.tmi.js/strict-event-emitter-types.OverriddenKeys, keyof tmi.js.tmi.js.ClientBase>>> & tmi.js.tmi.js.Actions */
@js.native
trait Client_ extends StObject {
  
  @JSName(" _emitType")
  var Space_emitType: js.UndefOr[Events] = js.native
  
  @JSName(" _emitterType")
  var Space_emitterType: js.UndefOr[ClientBase] = js.native
  
  @JSName(" _eventsType")
  var Space_eventsType: js.UndefOr[Events] = js.native
  
  def action(channel: String, message: String): js.Promise[js.Array[String]] = js.native
  
  @JSName("addListener")
  var addListener_Original: js.ThisFunction2[
    /* this */ js.Any, 
    addListener, 
    /* listener */ js.Function1[/* args */ ListenerType[js.UndefOr[js.Any]], Unit], 
    EEMethodReturnType[ClientBase, addListener, js.Any, Unit]
  ] = js.native
  @JSName("addListener")
  def addListener_addListener[P /* <: /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typings.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | r9kbeta | raided | raw_message | reconnect | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper */, T](event: addListener, listener: js.Function1[/* args */ ListenerType[js.UndefOr[js.Any]], Unit]): EEMethodReturnType[ClientBase, addListener, T, Unit] = js.native
  
  def ban(channel: String, username: String): js.Promise[js.Tuple3[String, String, String]] = js.native
  def ban(channel: String, username: String, reason: String): js.Promise[js.Tuple3[String, String, String]] = js.native
  
  def clear(channel: String): js.Promise[js.Array[String]] = js.native
  
  def color(color: String): js.Promise[js.Array[String]] = js.native
  
  def commercial(channel: String, seconds: Double): js.Promise[js.Tuple2[String, Double]] = js.native
  
  def connect(): js.Promise[js.Tuple2[String, Double]] = js.native
  
  def deletemessage(channel: String, messageUUID: String): js.Promise[js.Array[String]] = js.native
  
  def disconnect(): js.Promise[js.Tuple2[String, Double]] = js.native
  
  @JSName("emit")
  var emit_Original: js.ThisFunction2[
    /* this */ js.Any, 
    emit, 
    /* args */ ListenerType[js.UndefOr[js.Any]], 
    EEMethodReturnType[ClientBase, emit, js.Any, Unit]
  ] = js.native
  @JSName("emit")
  def emit_emit[P /* <: /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typings.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | r9kbeta | raided | raw_message | reconnect | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper */, T](
    event: emit,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ListenerType<TEmitRecord[P]> is not an array type */ args: ListenerType[js.UndefOr[js.Any]]
  ): EEMethodReturnType[ClientBase, emit, T, Unit] = js.native
  
  def emits(
    events: js.Array[
      /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typings.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | r9kbeta | raided | raw_message | reconnect | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper
    ],
    values: js.Array[js.Array[js.Any]]
  ): Unit = js.native
  @JSName("emits")
  var emits_Original: js.Function2[
    /* events */ js.Array[
      /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typings.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | r9kbeta | raided | raw_message | reconnect | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper
    ], 
    /* values */ js.Array[js.Array[js.Any]], 
    Unit
  ] = js.native
  
  def emoteonly(channel: String): js.Promise[js.Array[String]] = js.native
  
  def emoteonlyoff(channel: String): js.Promise[js.Array[String]] = js.native
  
  def followersonly(channel: String): js.Promise[js.Tuple2[String, Double]] = js.native
  def followersonly(channel: String, length: Double): js.Promise[js.Tuple2[String, Double]] = js.native
  
  def followersonlyoff(channel: String): js.Promise[js.Array[String]] = js.native
  
  def getChannels(): js.Array[String] = js.native
  @JSName("getChannels")
  var getChannels_Original: js.Function0[js.Array[String]] = js.native
  
  def getOptions(): Options = js.native
  @JSName("getOptions")
  var getOptions_Original: js.Function0[Options] = js.native
  
  def getUsername(): String = js.native
  @JSName("getUsername")
  var getUsername_Original: js.Function0[String] = js.native
  
  def host(channel: String, target: String): js.Promise[js.Tuple2[String, String]] = js.native
  
  def isMod(channel: String, username: String): Boolean = js.native
  @JSName("isMod")
  var isMod_Original: js.Function2[/* channel */ String, /* username */ String, Boolean] = js.native
  
  def join(channel: String): js.Promise[js.Array[String]] = js.native
  
  def listenerCount(
    event: /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typings.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | r9kbeta | raided | raw_message | reconnect | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper
  ): Double = js.native
  @JSName("listenerCount")
  var listenerCount_Original: js.Function1[
    /* keyof tmi.js.tmi.js.Events */ /* event */ action | anongiftpaidupgrade | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typings.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | r9kbeta | raided | raw_message | reconnect | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper, 
    Double
  ] = js.native
  
  def mod(channel: String, username: String): js.Promise[js.Tuple2[String, String]] = js.native
  
  def mods(channel: String): js.Promise[js.Array[String]] = js.native
  
  @JSName("on")
  var on_Original: js.ThisFunction2[
    /* this */ js.Any, 
    on, 
    /* listener */ js.Function1[/* args */ ListenerType[js.UndefOr[js.Any]], Unit], 
    EEMethodReturnType[ClientBase, on, js.Any, Unit]
  ] = js.native
  @JSName("on")
  def on_on[P /* <: /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typings.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | r9kbeta | raided | raw_message | reconnect | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper */, T](event: on, listener: js.Function1[/* args */ ListenerType[js.UndefOr[js.Any]], Unit]): EEMethodReturnType[ClientBase, on, T, Unit] = js.native
  
  @JSName("once")
  var once_Original: js.ThisFunction2[
    /* this */ js.Any, 
    once, 
    /* listener */ js.Function1[/* args */ ListenerType[js.UndefOr[js.Any]], Unit], 
    EEMethodReturnType[ClientBase, once, js.Any, Unit]
  ] = js.native
  @JSName("once")
  def once_once[P /* <: /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typings.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | r9kbeta | raided | raw_message | reconnect | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper */, T](event: once, listener: js.Function1[/* args */ ListenerType[js.UndefOr[js.Any]], Unit]): EEMethodReturnType[ClientBase, once, T, Unit] = js.native
  
  def part(channel: String): js.Promise[js.Array[String]] = js.native
  
  def ping(): js.Promise[js.Array[Double]] = js.native
  
  def r9kbeta(channel: String): js.Promise[js.Array[String]] = js.native
  
  def r9kbetaoff(channel: String): js.Promise[js.Array[String]] = js.native
  
  def raw(message: String): js.Promise[js.Array[String]] = js.native
  
  def readyState(): CONNECTING | OPEN | CLOSING | CLOSED = js.native
  @JSName("readyState")
  var readyState_Original: js.Function0[CONNECTING | OPEN | CLOSING | CLOSED] = js.native
  
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(
    event: /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typings.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | r9kbeta | raided | raw_message | reconnect | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper
  ): this.type = js.native
  @JSName("removeAllListeners")
  var removeAllListeners_Original: js.Function1[
    /* event */ js.UndefOr[
      action | anongiftpaidupgrade | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typings.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | r9kbeta | raided | raw_message | reconnect | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper
    ], 
    this.type
  ] = js.native
  
  def removeListener[T](
    event: /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typings.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | r9kbeta | raided | raw_message | reconnect | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper,
    listener: js.Function1[/* repeated */ js.Any, js.Any]
  ): EEMethodReturnType[ClientBase, typings.tmiJs.tmiJsStrings.removeListener, T, Unit] = js.native
  @JSName("removeListener")
  var removeListener_Original: js.ThisFunction2[
    /* this */ js.Any, 
    /* keyof tmi.js.tmi.js.Events */ /* event */ action | anongiftpaidupgrade | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typings.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | r9kbeta | raided | raw_message | reconnect | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper, 
    /* listener */ js.Function1[/* repeated */ js.Any, js.Any], 
    EEMethodReturnType[ClientBase, removeListener, js.Any, Unit]
  ] = js.native
  
  def say(channel: String, message: String): js.Promise[js.Array[String]] = js.native
  
  def setMaxListeners(n: Double): this.type = js.native
  @JSName("setMaxListeners")
  var setMaxListeners_Original: js.Function1[/* n */ Double, this.type] = js.native
  
  def slow(channel: String): js.Promise[js.Array[String]] = js.native
  def slow(channel: String, length: Double): js.Promise[js.Array[String]] = js.native
  
  def slowoff(channel: String): js.Promise[js.Array[String]] = js.native
  
  def subscribers(channel: String): js.Promise[js.Array[String]] = js.native
  
  def subscribersoff(channel: String): js.Promise[js.Array[String]] = js.native
  
  def timeout(channel: String, username: String): js.Promise[js.Tuple4[String, String, Double, String]] = js.native
  def timeout(channel: String, username: String, length: Double): js.Promise[js.Tuple4[String, String, Double, String]] = js.native
  def timeout(channel: String, username: String, length: Double, reason: String): js.Promise[js.Tuple4[String, String, Double, String]] = js.native
  def timeout(channel: String, username: String, length: Unit, reason: String): js.Promise[js.Tuple4[String, String, Double, String]] = js.native
  
  def unban(channel: String, username: String): js.Promise[js.Tuple2[String, String]] = js.native
  
  def unhost(channel: String): js.Promise[js.Array[String]] = js.native
  
  def unmod(channel: String, username: String): js.Promise[js.Tuple2[String, String]] = js.native
  
  def unvip(channel: String, username: String): js.Promise[js.Tuple2[String, String]] = js.native
  
  def vip(channel: String, username: String): js.Promise[js.Tuple2[String, String]] = js.native
  
  def vips(channel: String): js.Promise[js.Array[String]] = js.native
  
  def whisper(username: String, message: String): js.Promise[js.Tuple2[String, String]] = js.native
}
object Client_ {
  
  @JSImport("tmi.js", "Client")
  @js.native
  def apply(opts: Options): Client_ = js.native
}
