package typings.winrtDashUwp.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reference counted memory buffer. */
trait IMemoryBuffer extends IClosable {
  /**
    * Returns a new managed object that implements the IMemoryBufferReference interface.
    * @return A new managed object that implements the IMemoryBufferReference interface.
    */
  def createReference(): IMemoryBufferReference
}

object IMemoryBuffer {
  @scala.inline
  def apply(close: () => Unit, createReference: () => IMemoryBufferReference): IMemoryBuffer = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), createReference = js.Any.fromFunction0(createReference))
  
    __obj.asInstanceOf[IMemoryBuffer]
  }
}

