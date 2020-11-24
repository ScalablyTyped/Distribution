package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "tensor_util")
@js.native
object tensorUtil extends js.Object {
  
  def assertTypesMatch(
    a: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    b: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Unit = js.native
  
  def getTensorsInContainer(result: TensorContainer): js.Array[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]] = js.native
  
  def isTensorInList(
    tensor: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    tensorList: js.Array[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  ): Boolean = js.native
  
  def makeTypesMatch[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](a: T, b: T): js.Tuple2[T, T] = js.native
}
