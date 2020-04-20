package typings.tabris.clientMockMod

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.tabrisStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientSetCall extends js.Object {
  var id: String
  var op: set
  var properties: StringDictionary[js.Any]
}

object ClientSetCall {
  @scala.inline
  def apply(id: String, op: set, properties: StringDictionary[js.Any]): ClientSetCall = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientSetCall]
  }
}

