package typings.webpackDevServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientServer extends js.Object {
  var client: js.Object = js.native
  var server: js.Object = js.native
}

object ClientServer {
  @scala.inline
  def apply(client: js.Object, server: js.Object): ClientServer = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientServer]
  }
  @scala.inline
  implicit class ClientServerOps[Self <: ClientServer] (val x: Self) extends AnyVal {
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
    def setClient(value: js.Object): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setServer(value: js.Object): Self = this.set("server", value.asInstanceOf[js.Any])
  }
  
}

