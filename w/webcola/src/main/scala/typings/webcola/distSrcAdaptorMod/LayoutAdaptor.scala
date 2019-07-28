package typings.webcola.distSrcAdaptorMod

import typings.webcola.distSrcLayoutMod.EventType
import typings.webcola.distSrcLayoutMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/adaptor", "LayoutAdaptor")
@js.native
class LayoutAdaptor protected () extends Layout {
  def this(options: js.Any) = this()
  def drag(): Unit = js.native
  def dragEnd(d: js.Any): Unit = js.native
  def dragStart(d: js.Any): Unit = js.native
  def dragend(d: js.Any): Unit = js.native
  def dragstart(d: js.Any): Unit = js.native
  def on(eventType: String, listener: js.Function0[Unit]): this.type = js.native
  def on(eventType: EventType, listener: js.Function0[Unit]): this.type = js.native
}

