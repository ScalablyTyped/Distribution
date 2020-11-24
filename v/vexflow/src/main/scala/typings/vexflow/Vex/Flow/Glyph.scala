package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Cache
import typings.vexflow.anon.Xmax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Glyph extends js.Object {
  
  def getContext(): IRenderContext = js.native
  
  def getMetrics(): Xmax = js.native
  
  def render(ctx: IRenderContext, x_pos: Double, y_pos: Double): Unit = js.native
  
  def renderToStave(x: Double): Unit = js.native
  
  def reset(): Unit = js.native
  
  def setContext(context: IRenderContext): Glyph = js.native
  
  def setOptions(options: Cache): Unit = js.native
  
  def setStave(stave: Stave): Glyph = js.native
  
  def setWidth(width: Double): Glyph = js.native
  
  def setXShift(x_shift: Double): Glyph = js.native
  
  def setYShift(y_shift: Double): Glyph = js.native
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
  
  @scala.inline
  implicit class GlyphOps[Self <: Glyph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetContext(value: () => IRenderContext): Self = this.set("getContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMetrics(value: () => Xmax): Self = this.set("getMetrics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRender(value: (IRenderContext, Double, Double) => Unit): Self = this.set("render", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderToStave(value: Double => Unit): Self = this.set("renderToStave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetContext(value: IRenderContext => Glyph): Self = this.set("setContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOptions(value: Cache => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStave(value: Stave => Glyph): Self = this.set("setStave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWidth(value: Double => Glyph): Self = this.set("setWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetXShift(value: Double => Glyph): Self = this.set("setXShift", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetYShift(value: Double => Glyph): Self = this.set("setYShift", js.Any.fromFunction1(value))
  }
}
