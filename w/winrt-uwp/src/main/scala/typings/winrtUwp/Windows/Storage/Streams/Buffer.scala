package typings.winrtUwp.Windows.Storage.Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a default implementation of the IBuffer interface and its related interfaces. */
trait Buffer extends js.Object {
  var byteLength: js.Any
   /* unmapped type */ /** Gets the maximum number of bytes that the buffer can hold. */
  var capacity: Double
  /** Gets the number of bytes currently in use in the buffer. */
  var length: Double
}

object Buffer {
  @scala.inline
  def apply(byteLength: js.Any, capacity: Double, length: Double): Buffer = {
    val __obj = js.Dynamic.literal(byteLength = byteLength.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
}

