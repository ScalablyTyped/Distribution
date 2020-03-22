package typings.webpackDevServer

import typings.webpackDevServer.webpackDevServerStrings.ws
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonServer extends js.Object {
  var client: ws
  var server: js.Object
}

object AnonServer {
  @scala.inline
  def apply(client: ws, server: js.Object): AnonServer = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonServer]
  }
}

