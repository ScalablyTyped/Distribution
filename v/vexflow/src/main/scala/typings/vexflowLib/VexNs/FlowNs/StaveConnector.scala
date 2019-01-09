package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveConnector")
@js.native
class StaveConnector protected () extends js.Object {
  def this(top_stave: Stave, bottom_stave: Stave) = this()
  def draw(): scala.Unit = js.native
  def drawBoldDoubleLine(
    ctx: js.Object,
    `type`: vexflowLib.VexNs.FlowNs.StaveConnectorNs.`type`,
    topX: scala.Double,
    topY: scala.Double,
    botY: scala.Double
  ): scala.Unit = js.native
  def setContext(ctx: vexflowLib.VexNs.IRenderContext): StaveConnector = js.native
  def setFont(font: vexflowLib.Anon_Family): scala.Unit = js.native
  def setText(text: java.lang.String): StaveConnector = js.native
  def setText(text: java.lang.String, text_options: vexflowLib.Anon_Shiftx): StaveConnector = js.native
  def setType(`type`: vexflowLib.VexNs.FlowNs.StaveConnectorNs.`type`): StaveConnector = js.native
   //inconsistent type: void -> StaveConnector
  def setXShift(x_shift: scala.Double): StaveConnector = js.native
}

