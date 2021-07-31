package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gatherNdUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/gather_nd_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def prepareAndValidate(tensor: Tensor[Rank], indices: Tensor[Rank]): js.Tuple4[js.Array[Double], Double, Double, js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareAndValidate")(tensor.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[js.Array[Double], Double, Double, js.Array[Double]]]
}
