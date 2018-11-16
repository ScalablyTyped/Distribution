package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Glyph")
@js.native
class Glyph protected () extends js.Object {
  def this(code: java.lang.String, point: scala.Double) = this()
  def this(code: java.lang.String, point: scala.Double, options: vexflowLib.Anon_Cache) = this()
  def getContext(): vexflowLib.VexNs.IRenderContext = js.native
  def getMetrics(): vexflowLib.Anon_XminHeight = js.native
  def render(ctx: vexflowLib.VexNs.IRenderContext, x_pos: scala.Double, y_pos: scala.Double): scala.Unit = js.native
  def renderToStave(x: scala.Double): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def setContext(context: vexflowLib.VexNs.IRenderContext): Glyph = js.native
  def setOptions(options: vexflowLib.Anon_Cache): scala.Unit = js.native
  def setStave(stave: Stave): Glyph = js.native
  def setWidth(width: scala.Double): Glyph = js.native
  def setXShift(x_shift: scala.Double): Glyph = js.native
  def setYShift(y_shift: scala.Double): Glyph = js.native
}

@JSGlobal("Vex.Flow.Glyph")
@js.native
object Glyph extends js.Object {
  def loadMetrics(font: vexflowLib.VexNs.IFont, code: java.lang.String, cache: scala.Boolean): vexflowLib.Anon_XminHa = js.native
  def renderOutline(
    ctx: vexflowLib.VexNs.IRenderContext,
    outline: js.Array[scala.Double],
    scale: scala.Double,
    x_pos: scala.Double,
    y_pos: scala.Double
  ): scala.Unit = js.native
}

