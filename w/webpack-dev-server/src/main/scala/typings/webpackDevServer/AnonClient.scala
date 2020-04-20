package typings.webpackDevServer

import typings.webpackDevServer.webpackDevServerStrings.ws
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClient extends js.Object {
  var client: js.Object
  var server: ws
}

object AnonClient {
  @scala.inline
  def apply(client: js.Object, server: ws): AnonClient = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClient]
  }
}

