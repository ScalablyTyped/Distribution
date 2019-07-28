package typings.vexflow.vexflowMod

import typings.std.CanvasRenderingContext2D
import typings.vexflow.VexNs.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def BM(s: Double, f: js.Function): Unit = js.native
  def Contains(a: js.Array[_], obj: js.Any): Boolean = js.native
  def Inherit[T /* <: js.Object */](child: T, parent: js.Object, `object`: js.Object): T = js.native
  def L(block: String, args: js.Array[_]): Unit = js.native
  def Max(a: Double, b: Double): Double = js.native
  def Merge[T /* <: js.Object */](destination: T, source: js.Object): T = js.native
  def MidLine(a: Double, b: Double): Double = js.native
  def Min(a: Double, b: Double): Double = js.native
  def RoundN(x: Double, n: Double): Double = js.native
  def SortAndUnique[T /* <: js.Array[_] */](arr: T, cmp: js.Function, eq: js.Function): T = js.native
  def drawDot(ctx: IRenderContext, x: Double, y: Double): Unit = js.native
  def drawDot(ctx: IRenderContext, x: Double, y: Double, color: String): Unit = js.native
  def getCanvasContext(canvas_sel: String): CanvasRenderingContext2D = js.native
}

