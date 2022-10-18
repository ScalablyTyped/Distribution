package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsConcatUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/concat_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertParamsConsistent(shapes: js.Array[js.Array[Double]], axis: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertParamsConsistent")(shapes.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def computeOutShape(shapes: js.Array[js.Array[Double]], axis: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOutShape")(shapes.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
