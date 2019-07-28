package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distBackendsBackendMod.DataMover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "DataStorage")
@js.native
class DataStorage[T] protected ()
  extends typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.DataStorage[T] {
  def this(
    backend: typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend,
    dataMover: DataMover
  ) = this()
}

