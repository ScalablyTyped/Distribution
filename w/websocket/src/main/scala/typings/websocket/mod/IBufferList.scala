package typings.websocket.mod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.websocket.websocketStrings.advance
import typings.websocket.websocketStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBufferList extends EventEmitter {
  
  @JSName("addListener")
  def addListener_advance(event: advance, cb: js.Function1[/* n */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_write(event: write, cb: js.Function1[/* buf */ Buffer, Unit]): this.type = js.native
  
  /**
    * Advance the buffer stream by `n` bytes.
    * If `n` the aggregate advance offset passes the end of the buffer list,
    * operations such as `take` will return empty strings until enough data is pushed.
    */
  def advance(n: Double): IBufferList = js.native
  
  var encoding: String = js.native
  
  def end(buf: Buffer): Unit = js.native
  
  /**
    * For each buffer, perform some action.
    * If fn's result is a true value, cut out early.
    */
  def forEach(fn: js.Function1[/* buf */ Buffer, Boolean]): Unit = js.native
  
  /** Create a single buffer out of all the chunks */
  def join(start: Double, end: Double): Buffer = js.native
  
  /** Join all the chunks to existing buffer */
  def joinInto(buf: Buffer, offset: Double, start: Double, end: Double): Buffer = js.native
  
  var length: Double = js.native
  
  // Events
  @JSName("on")
  def on_advance(event: advance, cb: js.Function1[/* n */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_write(event: write, cb: js.Function1[/* buf */ Buffer, Unit]): this.type = js.native
  
  def push(): Unit = js.native
  
  def take(): js.Any = js.native
  def take(encoding: String): js.Any = js.native
  /**
    * Take `n` bytes from the start of the buffers.
    * If there are less than `n` bytes in all the buffers or `n` is undefined,
    * returns the entire concatenated buffer string.
    */
  def take(n: Double): js.Any = js.native
  def take(n: Double, encoding: String): js.Any = js.native
  
  def write(buf: Buffer): Boolean = js.native
}
