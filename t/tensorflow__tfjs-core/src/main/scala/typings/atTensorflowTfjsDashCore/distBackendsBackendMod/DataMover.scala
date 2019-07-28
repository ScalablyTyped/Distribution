package typings.atTensorflowTfjsDashCore.distBackendsBackendMod

import typings.atTensorflowTfjsDashCore.distTensorMod.DataId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataMover extends js.Object {
  /**
    * To be called by backends whenever they see a dataId that they don't own.
    * Upon calling this method, the mover will fetch the tensor from another
    * backend and register it with the current active backend.
    */
  def moveData(backend: KernelBackend, dataId: DataId): Unit
}

object DataMover {
  @scala.inline
  def apply(moveData: (KernelBackend, DataId) => Unit): DataMover = {
    val __obj = js.Dynamic.literal(moveData = js.Any.fromFunction2(moveData))
  
    __obj.asInstanceOf[DataMover]
  }
}

