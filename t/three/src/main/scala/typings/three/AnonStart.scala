package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStart extends js.Object {
  var count: Double
  var start: Double
}

object AnonStart {
  @scala.inline
  def apply(count: Double, start: Double): AnonStart = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStart]
  }
}

