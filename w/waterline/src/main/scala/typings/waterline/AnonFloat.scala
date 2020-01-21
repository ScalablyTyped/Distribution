package typings.waterline

import typings.waterline.waterlineStrings.float
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFloat extends js.Object {
  var `type`: float
}

object AnonFloat {
  @scala.inline
  def apply(`type`: float): AnonFloat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFloat]
  }
}

