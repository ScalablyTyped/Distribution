package typings.webpackDevServer.anon

import typings.webpackDevServer.webpackDevServerStrings.ws
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  var client: ws = js.native
  var server: js.Object = js.native
}

object Server {
  @scala.inline
  def apply(client: ws, server: js.Object): Server = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
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
    def setClient(value: ws): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setServer(value: js.Object): Self = this.set("server", value.asInstanceOf[js.Any])
  }
  
}

