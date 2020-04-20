package typings.tabris.clientMockMod

import typings.tabris.tabrisStrings.listen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientListenCall extends js.Object {
  var event: String
  var id: String
  var listen: Boolean
  var op: listen
}

object ClientListenCall {
  @scala.inline
  def apply(event: String, id: String, listen: Boolean, op: listen): ClientListenCall = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], listen = listen.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientListenCall]
  }
}

