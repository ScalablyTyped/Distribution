package typings
package atTensorflowTfjsDashCoreLib.distEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorManager extends js.Object {
  def disposeTensor(a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): scala.Unit = js.native
  def memory(): atTensorflowTfjsDashCoreLib.Anon_NumBytes = js.native
  def registerTensor(a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): scala.Unit = js.native
  def registerTensor(
    a: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    backend: atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend
  ): scala.Unit = js.native
  def registerVariable(
    v: atTensorflowTfjsDashCoreLib.distTensorMod.Variable[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): scala.Unit = js.native
}

