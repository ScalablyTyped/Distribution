package typings.winrtUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reference counted memory buffer. */
trait MemoryBuffer extends js.Object {
  /** Disconnects this MemoryBuffer object from the actual memory buffer. */
  def close(): Unit
  /**
    * Returns a new managed object that implements the IMemoryBufferReference interface.
    * @return A new managed object that implements the IMemoryBufferReference interface.
    */
  def createReference(): IMemoryBufferReference
}

object MemoryBuffer {
  @scala.inline
  def apply(close: () => Unit, createReference: () => IMemoryBufferReference): MemoryBuffer = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), createReference = js.Any.fromFunction0(createReference))
    __obj.asInstanceOf[MemoryBuffer]
  }
}

