package typings.webpackDevServer

import typings.webpackDevServer.webpackDevServerStrings.ws
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientServer extends js.Object {
  var client: ws
  var server: js.Object
}

object AnonClientServer {
  @scala.inline
  def apply(client: ws, server: js.Object): AnonClientServer = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClientServer]
  }
}

