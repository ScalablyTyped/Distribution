package typings.typeFest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUrl extends js.Object {
  var `type`: String
  var url: String
}

object AnonUrl {
  @scala.inline
  def apply(`type`: String, url: String): AnonUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUrl]
  }
}

