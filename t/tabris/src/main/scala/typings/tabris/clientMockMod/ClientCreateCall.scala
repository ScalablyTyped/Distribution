package typings.tabris.clientMockMod

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.tabrisStrings.create
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCreateCall extends js.Object {
  var id: String
  var op: create
  var properties: StringDictionary[js.Any]
  var `type`: String
}

object ClientCreateCall {
  @scala.inline
  def apply(id: String, op: create, properties: StringDictionary[js.Any], `type`: String): ClientCreateCall = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCreateCall]
  }
}

