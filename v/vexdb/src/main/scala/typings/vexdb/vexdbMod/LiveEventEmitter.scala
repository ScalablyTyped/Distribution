package typings.vexdb.vexdbMod

import typings.node.eventsMod.EventEmitter
import typings.vexdb.vexdbStrings.fetch
import typings.vexdb.vexdbStrings.item
import typings.vexdb.vexdbStrings.prefetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveEventEmitter[Q, R] extends EventEmitter {
  def close(): Unit = js.native
  def current(): js.Array[R] = js.native
  @JSName("on")
  def on_fetch(event: fetch, callback: js.Function1[/* newItems */ js.Array[R], Unit]): this.type = js.native
  // Update Events
  @JSName("on")
  def on_item(event: item, callback: js.Function1[/* item */ R, Unit]): this.type = js.native
  @JSName("on")
  def on_prefetch(event: prefetch, callback: js.Function1[/* results */ js.Array[R], Unit]): this.type = js.native
  def params(updateParameters: Q): Q = js.native
}

