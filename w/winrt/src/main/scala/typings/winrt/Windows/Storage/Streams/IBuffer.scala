package typings.winrt.Windows.Storage.Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBuffer extends js.Object {
  var capacity: Double = js.native
  var length: Double = js.native
}

object IBuffer {
  @scala.inline
  def apply(capacity: Double, length: Double): IBuffer = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBuffer]
  }
  @scala.inline
  implicit class IBufferOps[Self <: IBuffer] (val x: Self) extends AnyVal {
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
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
  
}

