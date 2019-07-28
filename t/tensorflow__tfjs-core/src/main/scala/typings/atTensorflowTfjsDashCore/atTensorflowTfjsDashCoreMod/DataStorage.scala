package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import typings.atTensorflowTfjsDashCore.distBackendsBackendMod.DataMover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "DataStorage")
@js.native
class DataStorage[T] protected ()
  extends typings.atTensorflowTfjsDashCore.distBackendsBackendMod.DataStorage[T] {
  def this(
    backend: typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend,
    dataMover: DataMover
  ) = this()
}

