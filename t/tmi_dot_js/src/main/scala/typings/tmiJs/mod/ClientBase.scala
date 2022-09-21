package typings.tmiJs.mod

import typings.tmiJs.tmiJsStrings.CLOSED
import typings.tmiJs.tmiJsStrings.CLOSING
import typings.tmiJs.tmiJsStrings.CONNECTING
import typings.tmiJs.tmiJsStrings.OPEN
import typings.tmiJs.tmiJsStrings.action
import typings.tmiJs.tmiJsStrings.anongiftpaidupgrade
import typings.tmiJs.tmiJsStrings.anonsubgift
import typings.tmiJs.tmiJsStrings.anonsubmysterygift
import typings.tmiJs.tmiJsStrings.automod
import typings.tmiJs.tmiJsStrings.ban
import typings.tmiJs.tmiJsStrings.chat
import typings.tmiJs.tmiJsStrings.cheer
import typings.tmiJs.tmiJsStrings.clearchat
import typings.tmiJs.tmiJsStrings.connected
import typings.tmiJs.tmiJsStrings.connecting_
import typings.tmiJs.tmiJsStrings.disconnected
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
import typings.tmiJs.tmiJsStrings.part
import typings.tmiJs.tmiJsStrings.ping
import typings.tmiJs.tmiJsStrings.pong
import typings.tmiJs.tmiJsStrings.primepaidupgrade
import typings.tmiJs.tmiJsStrings.r9kbeta
import typings.tmiJs.tmiJsStrings.raided
import typings.tmiJs.tmiJsStrings.raw_message
import typings.tmiJs.tmiJsStrings.reconnect
import typings.tmiJs.tmiJsStrings.redeem
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

@js.native
trait ClientBase extends StObject {
  
  def addListener(event: Any, listener: Any): Client_ = js.native
  
  // wish this could work better but either I'm just not smart enough or it's not possible
  def emit(event: Any): Boolean = js.native
  
  def emits(
    events: js.Array[
      /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | anonsubmysterygift | anonsubgift | automod | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typings.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | primepaidupgrade | r9kbeta | raided | raw_message | reconnect | redeem | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper
    ],
    values: js.Array[js.Array[Any]]
  ): Unit = js.native
  
  def getChannels(): js.Array[String] = js.native
  
  def getOptions(): Options = js.native
  
  def getUsername(): String = js.native
  
  def isMod(channel: String, username: String): Boolean = js.native
  
  def listenerCount(
    event: /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | anonsubmysterygift | anonsubgift | automod | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typings.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | primepaidupgrade | r9kbeta | raided | raw_message | reconnect | redeem | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper
  ): Double = js.native
  
  def on(event: Any, listener: Any): Client_ = js.native
  
  def once(event: Any, listener: Any): Client_ = js.native
  
  def readyState(): CONNECTING | OPEN | CLOSING | CLOSED = js.native
  
  def removeAllListeners(): Client_ = js.native
  def removeAllListeners(
    event: /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | anonsubmysterygift | anonsubgift | automod | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typings.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | primepaidupgrade | r9kbeta | raided | raw_message | reconnect | redeem | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper
  ): Client_ = js.native
  
  def removeListener(event: Any, listener: Any): Client_ = js.native
  
  def setMaxListeners(n: Double): Client_ = js.native
}
