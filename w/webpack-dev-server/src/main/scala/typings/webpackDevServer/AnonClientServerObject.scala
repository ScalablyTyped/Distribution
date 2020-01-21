package typings.webpackDevServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientServerObject extends js.Object {
  var client: js.Object
  var server: js.Object
}

object AnonClientServerObject {
  @scala.inline
  def apply(client: js.Object, server: js.Object): AnonClientServerObject = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClientServerObject]
  }
}

