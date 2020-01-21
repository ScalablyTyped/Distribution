package typings.waterline

import typings.waterline.waterlineStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonText extends js.Object {
  var `type`: text
}

object AnonText {
  @scala.inline
  def apply(`type`: text): AnonText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonText]
  }
}

