package typings.webpackDevServer.anon

import typings.webpackDevServer.webpackDevServerStrings.ws
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  var client: ws
  var server: js.Object
}

object Server {
  @scala.inline
  def apply(client: ws, server: js.Object): Server = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
}

