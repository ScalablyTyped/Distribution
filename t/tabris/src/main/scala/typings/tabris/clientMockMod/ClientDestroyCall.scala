package typings.tabris.clientMockMod

import typings.tabris.tabrisStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientDestroyCall extends js.Object {
  var id: String
  var op: destroy
}

object ClientDestroyCall {
  @scala.inline
  def apply(id: String, op: destroy): ClientDestroyCall = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDestroyCall]
  }
}

