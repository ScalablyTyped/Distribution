package typings.waterline

import typings.waterline.waterlineStrings.date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  var `type`: date
}

object AnonDate {
  @scala.inline
  def apply(`type`: date): AnonDate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDate]
  }
}

