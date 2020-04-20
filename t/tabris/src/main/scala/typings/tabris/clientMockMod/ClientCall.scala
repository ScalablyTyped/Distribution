package typings.tabris.clientMockMod

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.tabrisStrings.call
import typings.tabris.tabrisStrings.create
import typings.tabris.tabrisStrings.destroy
import typings.tabris.tabrisStrings.get
import typings.tabris.tabrisStrings.listen
import typings.tabris.tabrisStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCall extends js.Object {
  var event: String
  var id: String
  var listen: Boolean
  var method: String
  var op: create | set | get | listen | call | destroy
  var parameters: StringDictionary[js.Any]
  var properties: StringDictionary[js.Any]
  var property: String
  var `type`: String
}

object ClientCall {
  @scala.inline
  def apply(
    event: String,
    id: String,
    listen: Boolean,
    method: String,
    op: create | set | get | listen | call | destroy,
    parameters: StringDictionary[js.Any],
    properties: StringDictionary[js.Any],
    property: String,
    `type`: String
  ): ClientCall = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], listen = listen.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCall]
  }
}

