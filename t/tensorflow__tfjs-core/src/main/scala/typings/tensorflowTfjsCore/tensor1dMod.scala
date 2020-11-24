package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TensorLike1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/tensor1d", JSImport.Namespace)
@js.native
object tensor1dMod extends js.Object {
  
  def tensor1d(values: TensorLike1D): Tensor1D = js.native
  def tensor1d(values: TensorLike1D, dtype: DataType): Tensor1D = js.native
}
