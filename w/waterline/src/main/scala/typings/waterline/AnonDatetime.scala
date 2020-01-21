package typings.waterline

import typings.waterline.waterlineStrings.datetime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDatetime extends js.Object {
  var `type`: datetime
}

object AnonDatetime {
  @scala.inline
  def apply(`type`: datetime): AnonDatetime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDatetime]
  }
}

