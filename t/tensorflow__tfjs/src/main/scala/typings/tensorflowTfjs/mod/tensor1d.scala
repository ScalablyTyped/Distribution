package typings.tensorflowTfjs.mod

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TensorLike1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "tensor1d")
@js.native
object tensor1d extends js.Object {
  
  def apply(values: TensorLike1D): Tensor1D = js.native
  def apply(values: TensorLike1D, dtype: DataType): Tensor1D = js.native
}
