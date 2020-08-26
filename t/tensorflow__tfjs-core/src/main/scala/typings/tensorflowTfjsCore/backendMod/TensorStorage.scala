package typings.tensorflowTfjsCore.backendMod

import typings.tensorflowTfjsCore.anon.Unreliable
import typings.tensorflowTfjsCore.distTypesMod.BackendValues
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.tensorMod.DataId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorStorage extends js.Object {
  def disposeData(dataId: DataId): Unit = js.native
  def memory(): Unreliable = js.native
  def move(dataId: DataId, values: BackendValues, shape: js.Array[Double], dtype: DataType): Unit = js.native
  /** Returns number of data ids currently in the storage. */
  def numDataIds(): Double = js.native
  def read(dataId: DataId): js.Promise[BackendValues] = js.native
  def readSync(dataId: DataId): BackendValues = js.native
  def write(values: BackendValues, shape: js.Array[Double], dtype: DataType): DataId = js.native
}

object TensorStorage {
  @scala.inline
  def apply(
    disposeData: DataId => Unit,
    memory: () => Unreliable,
    move: (DataId, BackendValues, js.Array[Double], DataType) => Unit,
    numDataIds: () => Double,
    read: DataId => js.Promise[BackendValues],
    readSync: DataId => BackendValues,
    write: (BackendValues, js.Array[Double], DataType) => DataId
  ): TensorStorage = {
    val __obj = js.Dynamic.literal(disposeData = js.Any.fromFunction1(disposeData), memory = js.Any.fromFunction0(memory), move = js.Any.fromFunction4(move), numDataIds = js.Any.fromFunction0(numDataIds), read = js.Any.fromFunction1(read), readSync = js.Any.fromFunction1(readSync), write = js.Any.fromFunction3(write))
    __obj.asInstanceOf[TensorStorage]
  }
  @scala.inline
  implicit class TensorStorageOps[Self <: TensorStorage] (val x: Self) extends AnyVal {
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
    def setDisposeData(value: DataId => Unit): Self = this.set("disposeData", js.Any.fromFunction1(value))
    @scala.inline
    def setMemory(value: () => Unreliable): Self = this.set("memory", js.Any.fromFunction0(value))
    @scala.inline
    def setMove(value: (DataId, BackendValues, js.Array[Double], DataType) => Unit): Self = this.set("move", js.Any.fromFunction4(value))
    @scala.inline
    def setNumDataIds(value: () => Double): Self = this.set("numDataIds", js.Any.fromFunction0(value))
    @scala.inline
    def setRead(value: DataId => js.Promise[BackendValues]): Self = this.set("read", js.Any.fromFunction1(value))
    @scala.inline
    def setReadSync(value: DataId => BackendValues): Self = this.set("readSync", js.Any.fromFunction1(value))
    @scala.inline
    def setWrite(value: (BackendValues, js.Array[Double], DataType) => DataId): Self = this.set("write", js.Any.fromFunction3(value))
  }
  
}

