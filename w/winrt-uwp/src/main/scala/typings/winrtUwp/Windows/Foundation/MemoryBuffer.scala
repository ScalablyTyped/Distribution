package typings.winrtUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reference counted memory buffer. */
@js.native
trait MemoryBuffer extends js.Object {
  /** Disconnects this MemoryBuffer object from the actual memory buffer. */
  def close(): Unit = js.native
  /**
    * Returns a new managed object that implements the IMemoryBufferReference interface.
    * @return A new managed object that implements the IMemoryBufferReference interface.
    */
  def createReference(): IMemoryBufferReference = js.native
}

object MemoryBuffer {
  @scala.inline
  def apply(close: () => Unit, createReference: () => IMemoryBufferReference): MemoryBuffer = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), createReference = js.Any.fromFunction0(createReference))
    __obj.asInstanceOf[MemoryBuffer]
  }
  @scala.inline
  implicit class MemoryBufferOps[Self <: MemoryBuffer] (val x: Self) extends AnyVal {
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateReference(value: () => IMemoryBufferReference): Self = this.set("createReference", js.Any.fromFunction0(value))
  }
  
}

