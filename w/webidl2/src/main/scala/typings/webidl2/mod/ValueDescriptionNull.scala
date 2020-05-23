package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`null`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueDescriptionNull extends ValueDescription {
  var `type`: `null`
}

object ValueDescriptionNull {
  @scala.inline
  def apply(`type`: `null`): ValueDescriptionNull = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescriptionNull]
  }
}

