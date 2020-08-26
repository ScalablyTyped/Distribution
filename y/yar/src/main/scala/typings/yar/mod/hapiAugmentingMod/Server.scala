package typings.yar.mod.hapiAugmentingMod

import typings.yar.mod.ServerYar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  var yar: ServerYar = js.native
}

object Server {
  @scala.inline
  def apply(yar: ServerYar): Server = {
    val __obj = js.Dynamic.literal(yar = yar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
  @scala.inline
  implicit class ServerOps[Self <: Server] (val x: Self) extends AnyVal {
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
    def setYar(value: ServerYar): Self = this.set("yar", value.asInstanceOf[js.Any])
  }
  
}

