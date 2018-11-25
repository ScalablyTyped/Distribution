package typings
package vexdbLib.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveEventEmitter[Q, R]
  extends eventsLib.eventsMod.EventEmitter {
  def close(): scala.Unit = js.native
  def current(): js.Array[R] = js.native
  @JSName("on")
  def on_fetch(
    event: vexdbLib.vexdbLibStrings.fetch,
    callback: js.Function1[/* newItems */ js.Array[R], scala.Unit]
  ): this.type = js.native
  // Update Events
  @JSName("on")
  def on_item(event: vexdbLib.vexdbLibStrings.item, callback: js.Function1[/* item */ R, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_prefetch(
    event: vexdbLib.vexdbLibStrings.prefetch,
    callback: js.Function1[/* results */ js.Array[R], scala.Unit]
  ): this.type = js.native
  def params(updateParameters: Q): Q = js.native
}

