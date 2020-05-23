package typings.webpackDevServer.anon

import typings.webpackDevServer.webpackDevServerStrings.ws
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var client: js.Object
  var server: ws
}

object Client {
  @scala.inline
  def apply(client: js.Object, server: ws): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
}

