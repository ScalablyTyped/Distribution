package typings.svg2ttf.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MicroBuffer extends js.Object {
  var buffer: Uint8Array = js.native
}

object MicroBuffer {
  @scala.inline
  def apply(buffer: Uint8Array): MicroBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MicroBuffer]
  }
  @scala.inline
  implicit class MicroBufferOps[Self <: MicroBuffer] (val x: Self) extends AnyVal {
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
    def setBuffer(value: Uint8Array): Self = this.set("buffer", value.asInstanceOf[js.Any])
  }
  
}

