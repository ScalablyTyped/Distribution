package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_Family
import typings.vexflow.Anon_Shiftx
import typings.vexflow.VexNs.FlowNs.StaveConnectorNs.`type`
import typings.vexflow.VexNs.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveConnector")
@js.native
class StaveConnector protected () extends js.Object {
  def this(top_stave: Stave, bottom_stave: Stave) = this()
  var bottom_stave: Stave = js.native
  var thickness: Double = js.native
  var top_stave: Stave = js.native
  var x_shift: Double = js.native
  def draw(): Unit = js.native
  def drawBoldDoubleLine(ctx: js.Object, `type`: `type`, topX: Double, topY: Double, botY: Double): Unit = js.native
  def setContext(ctx: IRenderContext): StaveConnector = js.native
  def setFont(font: Anon_Family): Unit = js.native
  def setText(text: String): StaveConnector = js.native
  def setText(text: String, text_options: Anon_Shiftx): StaveConnector = js.native
  def setType(`type`: `type`): StaveConnector = js.native
   //inconsistent type: void -> StaveConnector
  def setXShift(x_shift: Double): StaveConnector = js.native
}

