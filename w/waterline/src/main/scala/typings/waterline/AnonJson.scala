package typings.waterline

import typings.waterline.waterlineStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJson extends js.Object {
  var `type`: json
}

object AnonJson {
  @scala.inline
  def apply(`type`: json): AnonJson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJson]
  }
}

