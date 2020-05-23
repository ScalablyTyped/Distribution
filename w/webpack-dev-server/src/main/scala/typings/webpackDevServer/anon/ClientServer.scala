package typings.webpackDevServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientServer extends js.Object {
  var client: js.Object
  var server: js.Object
}

object ClientServer {
  @scala.inline
  def apply(client: js.Object, server: js.Object): ClientServer = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientServer]
  }
}

