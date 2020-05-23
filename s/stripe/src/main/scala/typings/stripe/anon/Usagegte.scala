package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Usagegte extends js.Object {
  /**
    * Usage threshold that triggers the subscription to create an invoice
    */
  var usage_gte: Double
}

object Usagegte {
  @scala.inline
  def apply(usage_gte: Double): Usagegte = {
    val __obj = js.Dynamic.literal(usage_gte = usage_gte.asInstanceOf[js.Any])
    __obj.asInstanceOf[Usagegte]
  }
}

