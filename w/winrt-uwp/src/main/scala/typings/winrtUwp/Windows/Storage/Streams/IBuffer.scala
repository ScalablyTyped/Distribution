package typings.winrtUwp.Windows.Storage.Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a referenced array of bytes used by byte stream read and write interfaces. Buffer is the class implementation of this interface. */
trait IBuffer extends js.Object {
  /** Gets the maximum number of bytes that the buffer can hold. */
  var capacity: Double
  /** Gets the number of bytes currently in use in the buffer. */
  var length: Double
}

object IBuffer {
  @scala.inline
  def apply(capacity: Double, length: Double): IBuffer = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBuffer]
  }
}

