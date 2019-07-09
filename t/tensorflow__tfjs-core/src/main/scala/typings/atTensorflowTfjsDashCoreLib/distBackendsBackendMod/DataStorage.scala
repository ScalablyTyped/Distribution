package typings
package atTensorflowTfjsDashCoreLib.distBackendsBackendMod

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
  def delete(dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId): scala.Boolean = js.native
  def get(dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId): T = js.native
  def has(dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId): scala.Boolean = js.native
  def set(dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId, value: T): scala.Unit = js.native
}

