package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/sparse_to_dense_util", JSImport.Namespace)
@js.native
object sparseToDenseUtilMod extends js.Object {
  
  def validateInput(
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: js.Array[Double],
    defaultValues: Tensor[Rank]
  ): Unit = js.native
}
