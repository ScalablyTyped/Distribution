package typings.atTensorflowTfjsDashCore.distBackendsBackendMod

import typings.atTensorflowTfjsDashCore.distTensorMod.DataId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/backend", "DataStorage")
@js.native
class DataStorage[T] protected () extends js.Object {
  def this(backend: KernelBackend, dataMover: DataMover) = this()
  var backend: js.Any = js.native
  var data: js.Any = js.native
  var dataMover: js.Any = js.native
  def delete(dataId: DataId): Boolean = js.native
  def get(dataId: DataId): T = js.native
  def has(dataId: DataId): Boolean = js.native
  def set(dataId: DataId, value: T): Unit = js.native
}

