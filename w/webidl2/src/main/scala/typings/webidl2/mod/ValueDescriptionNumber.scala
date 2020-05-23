package typings.webidl2.mod

import typings.webidl2.webidl2Strings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueDescriptionNumber extends ValueDescription {
  var `type`: number
  var value: String
}

object ValueDescriptionNumber {
  @scala.inline
  def apply(`type`: number, value: String): ValueDescriptionNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescriptionNumber]
  }
}

