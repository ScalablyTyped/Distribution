package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainer
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "tensor_util")
@js.native
object tensor_util extends js.Object {
  def assertTypesMatch(
    a: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
    b: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
  ): Unit = js.native
  def getTensorsInContainer(result: TensorContainer): js.Array[typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]] = js.native
  def isTensorInList(
    tensor: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
    tensorList: js.Array[typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]]
  ): Boolean = js.native
  def makeTypesMatch[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](a: T, b: T): js.Tuple2[T, T] = js.native
}

