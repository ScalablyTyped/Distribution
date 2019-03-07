package typings
package tmiDotJsLib.tmiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientBase extends js.Object {
  def addListener(event: js.Any, listener: js.Any): Client = js.native
   // wish this could work better but either I'm just not smart enough or it's not possible
  def emit(event: js.Any): scala.Boolean = js.native
  def emits(events: js.Array[java.lang.String], values: js.Array[js.Array[_]]): scala.Unit = js.native
  def getChannels(): js.Array[java.lang.String] = js.native
  def getOptions(): Options = js.native
  def getUsername(): java.lang.String = js.native
  def isMod(channel: java.lang.String, username: java.lang.String): scala.Boolean = js.native
  def listenerCount(event: java.lang.String): scala.Double = js.native
  def on(event: js.Any, listener: js.Any): Client = js.native
  def once(event: js.Any, listener: js.Any): Client = js.native
  def readyState(): tmiDotJsLib.tmiDotJsLibStrings.CONNECTING | tmiDotJsLib.tmiDotJsLibStrings.OPEN | tmiDotJsLib.tmiDotJsLibStrings.CLOSING | tmiDotJsLib.tmiDotJsLibStrings.CLOSED = js.native
  def removeAllListeners(): Client = js.native
  def removeAllListeners(event: java.lang.String): Client = js.native
  def removeListener(event: js.Any, listener: js.Any): Client = js.native
  def setMaxListeners(n: scala.Double): Client = js.native
}

