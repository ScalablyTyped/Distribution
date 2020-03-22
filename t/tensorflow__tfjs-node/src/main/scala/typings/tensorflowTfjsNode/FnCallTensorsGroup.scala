package typings.tensorflowTfjsNode

import typings.tensorflowTfjsCore.AnonData
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensor
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.typesMod.WeightGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallTensorsGroup extends js.Object {
  def apply(tensors: js.Array[NamedTensor]): js.Promise[AnonData] = js.native
  def apply(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[AnonData] = js.native
  def apply(tensors: NamedTensorMap): js.Promise[AnonData] = js.native
  def apply(tensors: NamedTensorMap, group: WeightGroup): js.Promise[AnonData] = js.native
}

