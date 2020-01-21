package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.backendMod.DataMover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "DataStorage")
@js.native
class DataStorage[T] protected ()
  extends typings.tensorflowTfjs.mod.DataStorage[T] {
  def this(backend: typings.tensorflowTfjsCore.backendMod.KernelBackend, dataMover: DataMover) = this()
}

