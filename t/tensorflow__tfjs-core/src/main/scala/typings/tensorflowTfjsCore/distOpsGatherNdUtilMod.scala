package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsGatherNdUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/gather_nd_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prepareAndValidate(tensor: TensorInfo, indices: TensorInfo): js.Tuple4[js.Array[Double], Double, Double, js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareAndValidate")(tensor.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[js.Array[Double], Double, Double, js.Array[Double]]]
}
