package typings.tensorflowTfjsCore.backendMod

import typings.tensorflowTfjsCore.tensorMod.DataId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataMover extends js.Object {
  /**
    * To be called by backends whenever they see a dataId that they don't own.
    * Upon calling this method, the mover will fetch the tensor from another
    * backend and register it with the current active backend.
    */
  def moveData(backend: KernelBackend, dataId: DataId): Unit = js.native
}

object DataMover {
  @scala.inline
  def apply(moveData: (KernelBackend, DataId) => Unit): DataMover = {
    val __obj = js.Dynamic.literal(moveData = js.Any.fromFunction2(moveData))
    __obj.asInstanceOf[DataMover]
  }
  @scala.inline
  implicit class DataMoverOps[Self <: DataMover] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMoveData(value: (KernelBackend, DataId) => Unit): Self = this.set("moveData", js.Any.fromFunction2(value))
  }
  
}

