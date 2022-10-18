package typings.three

import typings.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmUtilsGeometryUtilsMod {
  
  @JSImport("three/examples/jsm/utils/GeometryUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gosper(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("gosper")().asInstanceOf[js.Array[Double]]
  inline def gosper(size: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("gosper")(size.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def hilbert2D(
    center: js.UndefOr[Vector3],
    size: js.UndefOr[Double],
    iterations: js.UndefOr[Double],
    v0: js.UndefOr[Double],
    v1: js.UndefOr[Double],
    v2: js.UndefOr[Double],
    v3: js.UndefOr[Double]
  ): js.Array[Vector3] = (^.asInstanceOf[js.Dynamic].applyDynamic("hilbert2D")(center.asInstanceOf[js.Any], size.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector3]]
  
  inline def hilbert3D(
    center: js.UndefOr[Vector3],
    size: js.UndefOr[Double],
    iterations: js.UndefOr[Double],
    v0: js.UndefOr[Double],
    v1: js.UndefOr[Double],
    v2: js.UndefOr[Double],
    v3: js.UndefOr[Double],
    v4: js.UndefOr[Double],
    v5: js.UndefOr[Double],
    v6: js.UndefOr[Double],
    v7: js.UndefOr[Double]
  ): js.Array[Vector3] = (^.asInstanceOf[js.Dynamic].applyDynamic("hilbert3D")(center.asInstanceOf[js.Any], size.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector3]]
}
