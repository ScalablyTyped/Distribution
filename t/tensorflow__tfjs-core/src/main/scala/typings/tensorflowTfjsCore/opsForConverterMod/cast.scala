package typings.tensorflowTfjsCore.opsForConverterMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cast")
@js.native
object cast extends js.Object {
  
  def apply[T /* <: Tensor[Rank] */](x: T, dtype: DataType): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, dtype: DataType): T = js.native
}
