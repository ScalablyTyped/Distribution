package typings.webidl2.mod

import typings.webidl2.webidl2Strings.Infinity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueDescriptionInfinity extends ValueDescription {
  var negative: Boolean
  var `type`: Infinity
}

object ValueDescriptionInfinity {
  @scala.inline
  def apply(negative: Boolean, `type`: Infinity): ValueDescriptionInfinity = {
    val __obj = js.Dynamic.literal(negative = negative.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescriptionInfinity]
  }
}

