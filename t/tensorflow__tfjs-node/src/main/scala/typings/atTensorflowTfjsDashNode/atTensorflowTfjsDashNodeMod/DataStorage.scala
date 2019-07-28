package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashCore.distBackendsBackendMod.DataMover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "DataStorage")
@js.native
class DataStorage[T] protected ()
  extends typings.atTensorflowTfjs.atTensorflowTfjsMod.DataStorage[T] {
  def this(
    backend: typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend,
    dataMover: DataMover
  ) = this()
}

