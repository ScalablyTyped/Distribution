package typings.three

import typings.three.threeMod.Vector3
import typings.three.threeMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nurbsutilsMod {
  
  @JSImport("three/examples/jsm/curves/NURBSUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calcBSplineDerivatives(p: Double, U: js.Array[Double], P: js.Array[Vector4], u: Double, nd: Double): js.Array[Vector4] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcBSplineDerivatives")(p.asInstanceOf[js.Any], U.asInstanceOf[js.Any], P.asInstanceOf[js.Any], u.asInstanceOf[js.Any], nd.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector4]]
  
  inline def calcBSplinePoint(p: Double, U: js.Array[Double], P: js.Array[Vector4], u: Double): Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("calcBSplinePoint")(p.asInstanceOf[js.Any], U.asInstanceOf[js.Any], P.asInstanceOf[js.Any], u.asInstanceOf[js.Any])).asInstanceOf[Vector4]
  
  inline def calcBasisFunctionDerivatives(span: Double, u: Double, p: Double, n: Double, U: js.Array[Double]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcBasisFunctionDerivatives")(span.asInstanceOf[js.Any], u.asInstanceOf[js.Any], p.asInstanceOf[js.Any], n.asInstanceOf[js.Any], U.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  
  inline def calcBasisFunctions(span: Double, u: Double, p: Double, U: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcBasisFunctions")(span.asInstanceOf[js.Any], u.asInstanceOf[js.Any], p.asInstanceOf[js.Any], U.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def calcKoverI(k: Double, i: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calcKoverI")(k.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def calcNURBSDerivatives(p: Double, U: js.Array[Double], P: js.Array[Vector4], u: Double, nd: Double): js.Array[Vector3] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcNURBSDerivatives")(p.asInstanceOf[js.Any], U.asInstanceOf[js.Any], P.asInstanceOf[js.Any], u.asInstanceOf[js.Any], nd.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector3]]
  
  inline def calcRationalCurveDerivatives(Pders: js.Array[Vector4]): js.Array[Vector3] = ^.asInstanceOf[js.Dynamic].applyDynamic("calcRationalCurveDerivatives")(Pders.asInstanceOf[js.Any]).asInstanceOf[js.Array[Vector3]]
  
  inline def calcSurfacePoint(
    p: Double,
    q: Double,
    U: js.Array[Double],
    V: js.Array[Double],
    P: js.Array[Vector4],
    u: Double,
    v: Double,
    target: Vector3
  ): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("calcSurfacePoint")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], U.asInstanceOf[js.Any], V.asInstanceOf[js.Any], P.asInstanceOf[js.Any], u.asInstanceOf[js.Any], v.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Vector3]
  
  inline def findSpan(p: Double, u: Double, U: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findSpan")(p.asInstanceOf[js.Any], u.asInstanceOf[js.Any], U.asInstanceOf[js.Any])).asInstanceOf[Double]
}
