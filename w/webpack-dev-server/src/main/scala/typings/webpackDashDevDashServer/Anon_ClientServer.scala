package typings.webpackDashDevDashServer

import typings.webpackDashDevDashServer.webpackDashDevDashServerStrings.ws
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientServer extends js.Object {
  var client: ws
  var server: js.Object
}

object Anon_ClientServer {
  @scala.inline
  def apply(client: ws, server: js.Object): Anon_ClientServer = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClientServer]
  }
}

