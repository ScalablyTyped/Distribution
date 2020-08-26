package typings.winrtUwp.Windows.Storage.Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a default implementation of the IBuffer interface and its related interfaces. */
@js.native
trait Buffer extends js.Object {
  var byteLength: js.Any = js.native
   /* unmapped type */ /** Gets the maximum number of bytes that the buffer can hold. */
  var capacity: Double = js.native
  /** Gets the number of bytes currently in use in the buffer. */
  var length: Double = js.native
}

object Buffer {
  @scala.inline
  def apply(byteLength: js.Any, capacity: Double, length: Double): Buffer = {
    val __obj = js.Dynamic.literal(byteLength = byteLength.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  @scala.inline
  implicit class BufferOps[Self <: Buffer] (val x: Self) extends AnyVal {
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
    def setByteLength(value: js.Any): Self = this.set("byteLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
  
}

