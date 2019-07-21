package typings
package atTensorflowTfjsDashCoreLib.distTensorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorTracker extends js.Object {
  def disposeTensor(t: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): scala.Unit = js.native
  def disposeVariable(v: Variable[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): scala.Unit = js.native
  def nextTensorId(): scala.Double = js.native
  def nextVariableId(): scala.Double = js.native
  def read(dataId: DataId): js.Promise[atTensorflowTfjsDashCoreLib.distTypesMod.BackendValues] = js.native
  def readSync(dataId: DataId): atTensorflowTfjsDashCoreLib.distTypesMod.BackendValues = js.native
  def registerTensor(t: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): scala.Unit = js.native
  def registerTensor(t: Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], backend: Backend): scala.Unit = js.native
  def registerVariable(v: Variable[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]): scala.Unit = js.native
  def write(backend: Backend, dataId: DataId, values: atTensorflowTfjsDashCoreLib.distTypesMod.BackendValues): scala.Unit = js.native
}

