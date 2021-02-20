package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sparseToDenseUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/sparse_to_dense_util", "validateInput")
  @js.native
  def validateInput(
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: js.Array[Double],
    defaultValues: Tensor[Rank]
  ): Unit = js.native
}
