package typings.atTensorflowTfjsDashNode

import typings.atTensorflowTfjsDashCore.Anon_Data
import typings.atTensorflowTfjsDashCore.distIoTypesMod.WeightGroup
import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.NamedTensor
import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Group extends js.Object {
  def apply(tensors: js.Array[NamedTensor]): js.Promise[Anon_Data] = js.native
  def apply(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[Anon_Data] = js.native
  def apply(tensors: NamedTensorMap): js.Promise[Anon_Data] = js.native
  def apply(tensors: NamedTensorMap, group: WeightGroup): js.Promise[Anon_Data] = js.native
}

