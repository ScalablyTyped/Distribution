package typings.webidl2.mod

import typings.webidl2.webidl2Strings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueDescriptionString extends ValueDescription {
  var `type`: string
  var value: String
}

object ValueDescriptionString {
  @scala.inline
  def apply(`type`: string, value: String): ValueDescriptionString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescriptionString]
  }
}

