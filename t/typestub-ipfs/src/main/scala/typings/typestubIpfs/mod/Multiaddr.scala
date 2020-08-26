package typings.typestubIpfs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Multiaddr extends js.Object {
  var buffer: Uint8Array = js.native
}

object Multiaddr {
  @scala.inline
  def apply(buffer: Uint8Array): Multiaddr = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multiaddr]
  }
  @scala.inline
  implicit class MultiaddrOps[Self <: Multiaddr] (val x: Self) extends AnyVal {
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

