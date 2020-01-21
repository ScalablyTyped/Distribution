package typings.waterline

import typings.waterline.waterlineStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTime extends js.Object {
  var `type`: time
}

object AnonTime {
  @scala.inline
  def apply(`type`: time): AnonTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTime]
  }
}

