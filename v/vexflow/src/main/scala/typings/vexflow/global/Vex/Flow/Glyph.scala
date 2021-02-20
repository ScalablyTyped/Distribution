package typings.vexflow.global.Vex.Flow

import typings.vexflow.Vex.IFont
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Cache
import typings.vexflow.anon.Outline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Glyph")
@js.native
class Glyph protected ()
  extends typings.vexflow.Vex.Flow.Glyph {
  def this(code: String, point: Double) = this()
  def this(code: String, point: Double, options: Cache) = this()
}
object Glyph {
  
  /* static member */
  @JSGlobal("Vex.Flow.Glyph.loadMetrics")
  @js.native
  def loadMetrics(font: IFont, code: String, cache: Boolean): Outline = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Glyph.renderOutline")
  @js.native
  def renderOutline(ctx: IRenderContext, outline: js.Array[Double], scale: Double, x_pos: Double, y_pos: Double): Unit = js.native
}
