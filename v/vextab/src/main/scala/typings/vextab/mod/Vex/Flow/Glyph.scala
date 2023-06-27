package typings.vextab.mod.Vex.Flow

import typings.vexflow.Vex.IFont
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Cache
import typings.vexflow.anon.Outline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Glyph")
@js.native
open class Glyph protected ()
  extends typings.vexflow.mod.Flow.Glyph {
  def this(code: String, point: Double) = this()
  def this(code: String, point: Double, options: Cache) = this()
}
object Glyph {
  
  @JSImport("vextab", "Vex.Flow.Glyph")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def loadMetrics(font: IFont, code: String, cache: Boolean): Outline = (^.asInstanceOf[js.Dynamic].applyDynamic("loadMetrics")(font.asInstanceOf[js.Any], code.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[Outline]
  
  /* static member */
  inline def renderOutline(ctx: IRenderContext, outline: js.Array[Double], scale: Double, x_pos: Double, y_pos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderOutline")(ctx.asInstanceOf[js.Any], outline.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], x_pos.asInstanceOf[js.Any], y_pos.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
