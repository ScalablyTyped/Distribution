package typings.webidl2.mod

import typings.webidl2.webidl2Strings.NaN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueDescriptionNaN extends ValueDescription {
  var `type`: NaN
}

object ValueDescriptionNaN {
  @scala.inline
  def apply(`type`: NaN): ValueDescriptionNaN = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescriptionNaN]
  }
}

