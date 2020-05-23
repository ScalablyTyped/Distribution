package typings.webidl2.mod

import typings.webidl2.webidl2Strings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueDescriptionBoolean extends ValueDescription {
  var `type`: boolean
  var value: Boolean
}

object ValueDescriptionBoolean {
  @scala.inline
  def apply(`type`: boolean, value: Boolean): ValueDescriptionBoolean = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescriptionBoolean]
  }
}

