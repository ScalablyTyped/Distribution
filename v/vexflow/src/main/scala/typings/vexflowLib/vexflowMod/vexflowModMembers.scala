package typings
package vexflowLib.vexflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", JSImport.Namespace)
@js.native
object vexflowModMembers extends js.Object {
  def BM(s: scala.Double, f: js.Function): scala.Unit = js.native
  def Contains(a: js.Array[_], obj: js.Any): scala.Boolean = js.native
  def Inherit[T /* <: js.Object */](child: T, parent: js.Object, `object`: js.Object): T = js.native
  def L(block: java.lang.String, args: js.Array[_]): scala.Unit = js.native
  def Max(a: scala.Double, b: scala.Double): scala.Double = js.native
  def Merge[T /* <: js.Object */](destination: T, source: js.Object): T = js.native
  def MidLine(a: scala.Double, b: scala.Double): scala.Double = js.native
  def Min(a: scala.Double, b: scala.Double): scala.Double = js.native
  def RoundN(x: scala.Double, n: scala.Double): scala.Double = js.native
  def SortAndUnique[T /* <: js.Array[_] */](arr: T, cmp: js.Function, eq: js.Function): T = js.native
  def drawDot(ctx: vexflowLib.VexNs.IRenderContext, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def drawDot(ctx: vexflowLib.VexNs.IRenderContext, x: scala.Double, y: scala.Double, color: java.lang.String): scala.Unit = js.native
  def getCanvasContext(canvas_sel: java.lang.String): stdLib.CanvasRenderingContext2D = js.native
}

