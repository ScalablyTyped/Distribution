package typings.svgPathdata

import typings.svgPathdata.libTypesMod.CommandA
import typings.svgPathdata.libTypesMod.CommandC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMathUtilsMod {
  
  @JSImport("svg-pathdata/lib/mathUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("svg-pathdata/lib/mathUtils", "DEG")
  @js.native
  val DEG: Double = js.native
  
  inline def a2c(arc: CommandA, x0: Double, y0: Double): js.Array[CommandC] = (^.asInstanceOf[js.Dynamic].applyDynamic("a2c")(arc.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[js.Array[CommandC]]
  
  inline def annotateArcCommand(c: CommandA, x1: Double, y1: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("annotateArcCommand")(c.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def arcAt(c: Double, x1: Double, x2: Double, phiDeg: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arcAt")(c.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], phiDeg.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def assertNumbers(numbers: Double*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNumbers")(numbers.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Boolean]
  
  inline def bezierAt(x0: Double, x1: Double, x2: Double, x3: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bezierAt")(x0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def bezierRoot(x0: Double, x1: Double, x2: Double, x3: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("bezierRoot")(x0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def intersectionUnitCircleLine(a: Double, b: Double, c: Double): js.Array[js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectionUnitCircleLine")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[Double, Double]]]
  
  inline def lerp(a: Double, b: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rotate(param0: js.Tuple2[Double, Double], rad: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(param0.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
