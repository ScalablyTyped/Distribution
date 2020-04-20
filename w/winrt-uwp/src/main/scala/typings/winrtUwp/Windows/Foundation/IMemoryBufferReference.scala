package typings.winrtUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reference to an IMemoryBuffer object. */
trait IMemoryBufferReference extends IClosable {
  /** Gets the size of the memory buffer in bytes. */
  var capacity: Double
}

object IMemoryBufferReference {
  @scala.inline
  def apply(capacity: Double, close: () => Unit): IMemoryBufferReference = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[IMemoryBufferReference]
  }
}

