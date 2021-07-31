package typings.vexflow.mod.Flow

import typings.vexflow.Vex.IFont
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Cache
import typings.vexflow.anon.Outline
import typings.vexflow.anon.Xmax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Glyph")
@js.native
class Glyph protected ()
  extends StObject
     with typings.vexflow.Vex.Flow.Glyph {
  def this(code: String, point: Double) = this()
  def this(code: String, point: Double, options: Cache) = this()
  
  /* CompleteClass */
  override def getContext(): IRenderContext = js.native
  
  /* CompleteClass */
  override def getMetrics(): Xmax = js.native
  
  /* CompleteClass */
  override def render(ctx: IRenderContext, x_pos: Double, y_pos: Double): Unit = js.native
  
  /* CompleteClass */
  override def renderToStave(x: Double): Unit = js.native
  
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /* CompleteClass */
  override def setContext(context: IRenderContext): typings.vexflow.Vex.Flow.Glyph = js.native
  
  /* CompleteClass */
  override def setOptions(options: Cache): Unit = js.native
  
  /* CompleteClass */
  override def setStave(stave: typings.vexflow.Vex.Flow.Stave): typings.vexflow.Vex.Flow.Glyph = js.native
  
  /* CompleteClass */
  override def setWidth(width: Double): typings.vexflow.Vex.Flow.Glyph = js.native
  
  /* CompleteClass */
  override def setXShift(x_shift: Double): typings.vexflow.Vex.Flow.Glyph = js.native
  
  /* CompleteClass */
  override def setYShift(y_shift: Double): typings.vexflow.Vex.Flow.Glyph = js.native
}
object Glyph {
  
  @JSImport("vexflow", "Flow.Glyph")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def loadMetrics(font: IFont, code: String, cache: Boolean): Outline = (^.asInstanceOf[js.Dynamic].applyDynamic("loadMetrics")(font.asInstanceOf[js.Any], code.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[Outline]
  
  /* static member */
  @scala.inline
  def renderOutline(ctx: IRenderContext, outline: js.Array[Double], scale: Double, x_pos: Double, y_pos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderOutline")(ctx.asInstanceOf[js.Any], outline.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], x_pos.asInstanceOf[js.Any], y_pos.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
