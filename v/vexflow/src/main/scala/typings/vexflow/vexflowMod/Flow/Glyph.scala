package typings.vexflow.vexflowMod.Flow

import typings.vexflow.Anon_Cache
import typings.vexflow.Anon_HaOutline
import typings.vexflow.Vex.IFont
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Glyph")
@js.native
class Glyph protected ()
  extends typings.vexflow.Vex.Flow.Glyph {
  def this(code: String, point: Double) = this()
  def this(code: String, point: Double, options: Anon_Cache) = this()
}

/* static members */
@JSImport("vexflow", "Flow.Glyph")
@js.native
object Glyph extends js.Object {
  def loadMetrics(font: IFont, code: String, cache: Boolean): Anon_HaOutline = js.native
  def renderOutline(ctx: IRenderContext, outline: js.Array[Double], scale: Double, x_pos: Double, y_pos: Double): Unit = js.native
}

