package typings.webpackDashDevDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientServerObject extends js.Object {
  var client: js.Object
  var server: js.Object
}

object Anon_ClientServerObject {
  @scala.inline
  def apply(client: js.Object, server: js.Object): Anon_ClientServerObject = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClientServerObject]
  }
}

