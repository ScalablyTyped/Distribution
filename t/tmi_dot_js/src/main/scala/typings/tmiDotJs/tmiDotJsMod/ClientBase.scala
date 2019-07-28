package typings.tmiDotJs.tmiDotJsMod

import typings.tmiDotJs.tmiDotJsStrings.CLOSED
import typings.tmiDotJs.tmiDotJsStrings.CLOSING
import typings.tmiDotJs.tmiDotJsStrings.CONNECTING
import typings.tmiDotJs.tmiDotJsStrings.OPEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientBase extends js.Object {
  def addListener(event: js.Any, listener: js.Any): Client = js.native
   // wish this could work better but either I'm just not smart enough or it's not possible
  def emit(event: js.Any): Boolean = js.native
  def emits(events: js.Array[String], values: js.Array[js.Array[_]]): Unit = js.native
  def getChannels(): js.Array[String] = js.native
  def getOptions(): Options = js.native
  def getUsername(): String = js.native
  def isMod(channel: String, username: String): Boolean = js.native
  def listenerCount(event: String): Double = js.native
  def on(event: js.Any, listener: js.Any): Client = js.native
  def once(event: js.Any, listener: js.Any): Client = js.native
  def readyState(): CONNECTING | OPEN | CLOSING | CLOSED = js.native
  def removeAllListeners(): Client = js.native
  def removeAllListeners(event: String): Client = js.native
  def removeListener(event: js.Any, listener: js.Any): Client = js.native
  def setMaxListeners(n: Double): Client = js.native
}

