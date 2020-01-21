package typings.waterline

import typings.waterline.waterlineStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonString extends js.Object {
  var `type`: string
}

object AnonString {
  @scala.inline
  def apply(`type`: string): AnonString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonString]
  }
}

