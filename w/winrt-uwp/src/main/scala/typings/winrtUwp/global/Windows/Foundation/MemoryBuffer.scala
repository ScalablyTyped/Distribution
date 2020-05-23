package typings.winrtUwp.global.Windows.Foundation

import typings.winrtUwp.Windows.Foundation.IMemoryBufferReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reference counted memory buffer. */
@JSGlobal("Windows.Foundation.MemoryBuffer")
@js.native
class MemoryBuffer protected ()
  extends typings.winrtUwp.Windows.Foundation.MemoryBuffer {
  /**
    * Initializes a new MemoryBuffer instance with the specified capacity.
    * @param capacity The desired size of the new memory buffer.
    */
  def this(capacity: Double) = this()
  /** Disconnects this MemoryBuffer object from the actual memory buffer. */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Returns a new managed object that implements the IMemoryBufferReference interface.
    * @return A new managed object that implements the IMemoryBufferReference interface.
    */
  /* CompleteClass */
  override def createReference(): IMemoryBufferReference = js.native
}

