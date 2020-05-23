package typings.webidl2.mod

import typings.webidl2.webidl2Strings.sequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueDescriptionSequence extends ValueDescription {
  var `type`: sequence
  var value: js.Array[js.Any]
}

object ValueDescriptionSequence {
  @scala.inline
  def apply(`type`: sequence, value: js.Array[js.Any]): ValueDescriptionSequence = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescriptionSequence]
  }
}

