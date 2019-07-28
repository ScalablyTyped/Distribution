package typings.atTensorflowTfjsDashCore.distEngineMod

import typings.atTensorflowTfjsDashCore.Anon_NumBytes
import typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorMod.Variable
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorManager extends js.Object {
  def disposeTensor(a: Tensor[Rank]): Unit = js.native
  def memory(): Anon_NumBytes = js.native
  def registerTensor(a: Tensor[Rank]): Unit = js.native
  def registerTensor(a: Tensor[Rank], backend: KernelBackend): Unit = js.native
  def registerVariable(v: Variable[Rank]): Unit = js.native
}

