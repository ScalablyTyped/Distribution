package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensorOpsUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor_ops_util", "makeTensor")
  @js.native
  def makeTensor(values: TensorLike, shape: js.Array[Double], inferredShape: js.Array[Double]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/tensor_ops_util", "makeTensor")
  @js.native
  def makeTensor(values: TensorLike, shape: js.Array[Double], inferredShape: js.Array[Double], dtype: DataType): Tensor[Rank] = js.native
}
