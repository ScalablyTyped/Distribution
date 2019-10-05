package typings.vexflow.Vex.Flow

import typings.std.HTMLElement
import typings.vexflow.Anon_Color
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.RaphaelContext")
@js.native
class RaphaelContext protected () extends IRenderContext {
  def this(element: HTMLElement) = this()
  @JSName("glow")
  def glow_Anon_Color(): Anon_Color = js.native
  def rect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  @JSName("setLineWidth")
  def setLineWidth_Unit(width: Double): Unit = js.native
  def setViewBox(viewBox: String): Unit = js.native
}

