package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.backendMod.DataMover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "DataStorage")
@js.native
class DataStorage[T] protected ()
  extends typings.tensorflowTfjsCore.backendMod.DataStorage[T] {
  def this(backend: typings.tensorflowTfjsCore.backendMod.KernelBackend, dataMover: DataMover) = this()
}

