package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsSparseToDenseUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/sparse_to_dense_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateInput(
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: js.Array[Double],
    defaultValues: Tensor[Rank]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateInput")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValues.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
