package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Cache
import typings.vexflow.anon.Xmax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Glyph extends js.Object {
  def getContext(): IRenderContext
  def getMetrics(): Xmax
  def render(ctx: IRenderContext, x_pos: Double, y_pos: Double): Unit
  def renderToStave(x: Double): Unit
  def reset(): Unit
  def setContext(context: IRenderContext): Glyph
  def setOptions(options: Cache): Unit
  def setStave(stave: Stave): Glyph
  def setWidth(width: Double): Glyph
  def setXShift(x_shift: Double): Glyph
  def setYShift(y_shift: Double): Glyph
}

object Glyph {
  @scala.inline
  def apply(
    getContext: () => IRenderContext,
    getMetrics: () => Xmax,
    render: (IRenderContext, Double, Double) => Unit,
    renderToStave: Double => Unit,
    reset: () => Unit,
    setContext: IRenderContext => Glyph,
    setOptions: Cache => Unit,
    setStave: Stave => Glyph,
    setWidth: Double => Glyph,
    setXShift: Double => Glyph,
    setYShift: Double => Glyph
  ): Glyph = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getMetrics = js.Any.fromFunction0(getMetrics), render = js.Any.fromFunction3(render), renderToStave = js.Any.fromFunction1(renderToStave), reset = js.Any.fromFunction0(reset), setContext = js.Any.fromFunction1(setContext), setOptions = js.Any.fromFunction1(setOptions), setStave = js.Any.fromFunction1(setStave), setWidth = js.Any.fromFunction1(setWidth), setXShift = js.Any.fromFunction1(setXShift), setYShift = js.Any.fromFunction1(setYShift))
    __obj.asInstanceOf[Glyph]
  }
}

