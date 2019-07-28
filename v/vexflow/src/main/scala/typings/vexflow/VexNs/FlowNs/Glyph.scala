package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_Cache
import typings.vexflow.Anon_HaOutline
import typings.vexflow.Anon_Height
import typings.vexflow.VexNs.IFont
import typings.vexflow.VexNs.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Glyph")
@js.native
class Glyph protected () extends js.Object {
  def this(code: String, point: Double) = this()
  def this(code: String, point: Double, options: Anon_Cache) = this()
  def getContext(): IRenderContext = js.native
  def getMetrics(): Anon_Height = js.native
  def render(ctx: IRenderContext, x_pos: Double, y_pos: Double): Unit = js.native
  def renderToStave(x: Double): Unit = js.native
  def reset(): Unit = js.native
  def setContext(context: IRenderContext): Glyph = js.native
  def setOptions(options: Anon_Cache): Unit = js.native
  def setStave(stave: Stave): Glyph = js.native
  def setWidth(width: Double): Glyph = js.native
  def setXShift(x_shift: Double): Glyph = js.native
  def setYShift(y_shift: Double): Glyph = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Glyph")
@js.native
object Glyph extends js.Object {
  def loadMetrics(font: IFont, code: String, cache: Boolean): Anon_HaOutline = js.native
  def renderOutline(ctx: IRenderContext, outline: js.Array[Double], scale: Double, x_pos: Double, y_pos: Double): Unit = js.native
}

