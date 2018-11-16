package typings
package webcolaLib.distSrcAdaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/adaptor", "LayoutAdaptor")
@js.native
class LayoutAdaptor protected ()
  extends webcolaLib.distSrcLayoutMod.Layout {
  def this(options: js.Any) = this()
  def drag(): scala.Unit = js.native
  def dragEnd(d: js.Any): scala.Unit = js.native
  def dragStart(d: js.Any): scala.Unit = js.native
  def dragend(d: js.Any): scala.Unit = js.native
  def dragstart(d: js.Any): scala.Unit = js.native
  def on(eventType: java.lang.String, listener: js.Function0[scala.Unit]): this.type = js.native
  def on(eventType: webcolaLib.distSrcLayoutMod.EventType, listener: js.Function0[scala.Unit]): this.type = js.native
}

