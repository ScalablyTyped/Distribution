package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUsagegte extends js.Object {
  /**
    * Usage threshold that triggers the subscription to create an invoice
    */
  var usage_gte: Double
}

object AnonUsagegte {
  @scala.inline
  def apply(usage_gte: Double): AnonUsagegte = {
    val __obj = js.Dynamic.literal(usage_gte = usage_gte.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUsagegte]
  }
}

