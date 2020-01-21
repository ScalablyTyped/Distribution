package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLimit extends js.Object {
  var limit: Double
}

object AnonLimit {
  @scala.inline
  def apply(limit: Double): AnonLimit = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLimit]
  }
}

