package typings
package websocketLib.websocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBufferList
  extends nodeLib.eventsMod.EventEmitter {
  var encoding: java.lang.String = js.native
  var length: scala.Double = js.native
  def addListener(event: java.lang.String, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_advance(
    event: websocketLib.websocketLibStrings.advance,
    cb: js.Function1[/* n */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_write(
    event: websocketLib.websocketLibStrings.write,
    cb: js.Function1[/* buf */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  /**
    * Advance the buffer stream by `n` bytes.
    * If `n` the aggregate advance offset passes the end of the buffer list,
    * operations such as `take` will return empty strings until enough data is pushed.
    */
  def advance(n: scala.Double): IBufferList = js.native
  def end(buf: nodeLib.Buffer): scala.Unit = js.native
  /**
    * For each buffer, perform some action.
    * If fn's result is a true value, cut out early.
    */
  def forEach(fn: js.Function1[/* buf */ nodeLib.Buffer, scala.Boolean]): scala.Unit = js.native
  /** Create a single buffer out of all the chunks */
  def join(start: scala.Double, end: scala.Double): nodeLib.Buffer = js.native
  /** Join all the chunks to existing buffer */
  def joinInto(buf: nodeLib.Buffer, offset: scala.Double, start: scala.Double, end: scala.Double): nodeLib.Buffer = js.native
  // Events
  def on(event: java.lang.String, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_advance(
    event: websocketLib.websocketLibStrings.advance,
    cb: js.Function1[/* n */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_write(
    event: websocketLib.websocketLibStrings.write,
    cb: js.Function1[/* buf */ nodeLib.Buffer, scala.Unit]
  ): this.type = js.native
  def take(): js.Any = js.native
  def take(encoding: java.lang.String): js.Any = js.native
  /**
    * Take `n` bytes from the start of the buffers.
    * If there are less than `n` bytes in all the buffers or `n` is undefined,
    * returns the entire concatenated buffer string.
    */
  def take(n: scala.Double): js.Any = js.native
  def take(n: scala.Double, encoding: java.lang.String): js.Any = js.native
  def write(buf: nodeLib.Buffer): scala.Boolean = js.native
}

