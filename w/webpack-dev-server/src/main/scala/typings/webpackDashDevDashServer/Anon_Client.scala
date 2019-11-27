package typings.webpackDashDevDashServer

import typings.webpackDashDevDashServer.webpackDashDevDashServerStrings.ws
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Client extends js.Object {
  var client: js.Object
  var server: ws
}

object Anon_Client {
  @scala.inline
  def apply(client: js.Object, server: ws): Anon_Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Client]
  }
}

