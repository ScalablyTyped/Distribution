package typings.tabris.clientMockMod

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.tabrisStrings.call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCallCall extends js.Object {
  var id: String
  var method: String
  var op: call
  var parameters: StringDictionary[js.Any]
}

object ClientCallCall {
  @scala.inline
  def apply(id: String, method: String, op: call, parameters: StringDictionary[js.Any]): ClientCallCall = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCallCall]
  }
}

