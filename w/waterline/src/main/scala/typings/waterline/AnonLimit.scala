package typings.waterline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLimit extends js.Object {
  var limit: Double
  var page: Double
}

object AnonLimit {
  @scala.inline
  def apply(limit: Double, page: Double): AnonLimit = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLimit]
  }
}

