package typings.vexflow.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Vex {
  
  @scala.inline
  def BM(s: scala.Double, f: js.Function): scala.Unit = (typings.vexflow.global.Vex.^.asInstanceOf[js.Dynamic].applyDynamic("BM")(s.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def Contains(a: js.Array[_], obj: js.Any): scala.Boolean = (typings.vexflow.global.Vex.^.asInstanceOf[js.Dynamic].applyDynamic("Contains")(a.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def Inherit[T /* <: js.Object */](child: T, parent: js.Object, `object`: js.Object): T = (typings.vexflow.global.Vex.^.asInstanceOf[js.Dynamic].applyDynamic("Inherit")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def L(block: java.lang.String, args: js.Array[_]): scala.Unit = (typings.vexflow.global.Vex.^.asInstanceOf[js.Dynamic].applyDynamic("L")(block.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def Max(a: scala.Double, b: scala.Double): scala.Double = (typings.vexflow.global.Vex.^.asInstanceOf[js.Dynamic].applyDynamic("Max")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def Merge[T /* <: js.Object */](destination: T, source: js.Object): T = (typings.vexflow.global.Vex.^.asInstanceOf[js.Dynamic].applyDynamic("Merge")(destination.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def MidLine(a: scala.Double, b: scala.Double): scala.Double = (typings.vexflow.global.Vex.^.asInstanceOf[js.Dynamic].applyDynamic("MidLine")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def Min(a: scala.Double, b: scala.Double): scala.Double = (typings.vexflow.global.Vex.^.asInstanceOf[js.Dynamic].applyDynamic("Min")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def RoundN(x: scala.Double, n: scala.Double): scala.Double = (typings.vexflow.global.Vex.^.asInstanceOf[js.Dynamic].applyDynamic("RoundN")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def SortAndUnique[T /* <: js.Array[_] */](arr: T, cmp: js.Function, eq: js.Function): T = (typings.vexflow.global.Vex.^.asInstanceOf[js.Dynamic].applyDynamic("SortAndUnique")(arr.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def drawDot(ctx: typings.vexflow.Vex.IRenderContext, x: scala.Double, y: scala.Double): scala.Unit = (typings.vexflow.global.Vex.^.asInstanceOf[js.Dynamic].applyDynamic("drawDot")(ctx.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def drawDot(ctx: typings.vexflow.Vex.IRenderContext, x: scala.Double, y: scala.Double, color: java.lang.String): scala.Unit = (typings.vexflow.global.Vex.^.asInstanceOf[js.Dynamic].applyDynamic("drawDot")(ctx.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getCanvasContext(canvas_sel: java.lang.String): typings.std.CanvasRenderingContext2D = typings.vexflow.global.Vex.^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasContext")(canvas_sel.asInstanceOf[js.Any]).asInstanceOf[typings.std.CanvasRenderingContext2D]
}
