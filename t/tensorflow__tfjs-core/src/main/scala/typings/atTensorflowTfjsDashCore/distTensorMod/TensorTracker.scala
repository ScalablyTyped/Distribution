package typings.atTensorflowTfjsDashCore.distTensorMod

import typings.atTensorflowTfjsDashCore.distTypesMod.BackendValues
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.DataValues
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorTracker extends js.Object {
  def disposeTensor(t: Tensor[Rank]): Unit = js.native
  def disposeVariable(v: Variable[Rank]): Unit = js.native
  def incRef(a: Tensor[Rank], backend: Backend): Unit = js.native
  def makeTensor(values: DataValues, shape: js.Array[Double], dtype: DataType): Tensor[Rank] = js.native
  def makeTensor(values: DataValues, shape: js.Array[Double], dtype: DataType, backend: Backend): Tensor[Rank] = js.native
  def makeVariable(initialValue: Tensor[Rank]): Variable[Rank] = js.native
  def makeVariable(initialValue: Tensor[Rank], trainable: Boolean): Variable[Rank] = js.native
  def makeVariable(initialValue: Tensor[Rank], trainable: Boolean, name: String): Variable[Rank] = js.native
  def makeVariable(initialValue: Tensor[Rank], trainable: Boolean, name: String, dtype: DataType): Variable[Rank] = js.native
  def read(dataId: DataId): js.Promise[BackendValues] = js.native
  def readSync(dataId: DataId): BackendValues = js.native
}

