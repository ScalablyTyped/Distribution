package typings.tabris.clientMockMod

import typings.tabris.tabrisStrings.get
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientGetCall extends js.Object {
  var id: String
  var op: get
  var property: String
}

object ClientGetCall {
  @scala.inline
  def apply(id: String, op: get, property: String): ClientGetCall = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientGetCall]
  }
}

