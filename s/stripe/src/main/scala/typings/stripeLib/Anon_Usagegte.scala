package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Usagegte extends js.Object {
  /**
    * Usage threshold that triggers the subscription to create an invoice
    */
  var usage_gte: scala.Double
}

object Anon_Usagegte {
  @scala.inline
  def apply(usage_gte: scala.Double): Anon_Usagegte = {
    val __obj = js.Dynamic.literal(usage_gte = usage_gte)
  
    __obj.asInstanceOf[Anon_Usagegte]
  }
}

