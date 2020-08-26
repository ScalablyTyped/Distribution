package typings.winstonLogglyBulk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferOptions extends js.Object {
  var retriesInMilliseconds: Double = js.native
  var size: Double = js.native
}

object BufferOptions {
  @scala.inline
  def apply(retriesInMilliseconds: Double, size: Double): BufferOptions = {
    val __obj = js.Dynamic.literal(retriesInMilliseconds = retriesInMilliseconds.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferOptions]
  }
  @scala.inline
  implicit class BufferOptionsOps[Self <: BufferOptions] (val x: Self) extends AnyVal {
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
    def setRetriesInMilliseconds(value: Double): Self = this.set("retriesInMilliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

