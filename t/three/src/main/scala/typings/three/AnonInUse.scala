package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInUse extends js.Object {
  var inUse: Double
  var total: Double
}

object AnonInUse {
  @scala.inline
  def apply(inUse: Double, total: Double): AnonInUse = {
    val __obj = js.Dynamic.literal(inUse = inUse.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInUse]
  }
}

