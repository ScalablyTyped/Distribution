package typings.atTensorflowTfjsDashCore.distTensorMod

import typings.atTensorflowTfjsDashCore.distTypesMod.BackendValues
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorTracker extends js.Object {
  def disposeTensor(t: Tensor[Rank]): Unit = js.native
  def disposeVariable(v: Variable[Rank]): Unit = js.native
  def nextTensorId(): Double = js.native
  def nextVariableId(): Double = js.native
  def read(dataId: DataId): js.Promise[BackendValues] = js.native
  def readSync(dataId: DataId): BackendValues = js.native
  def registerTensor(t: Tensor[Rank]): Unit = js.native
  def registerTensor(t: Tensor[Rank], backend: Backend): Unit = js.native
  def registerVariable(v: Variable[Rank]): Unit = js.native
  def write(backend: Backend, dataId: DataId, values: BackendValues): Unit = js.native
}

