package typings.waterline

import typings.waterline.waterlineStrings.email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  var `type`: email
}

object AnonEmail {
  @scala.inline
  def apply(`type`: email): AnonEmail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmail]
  }
}

