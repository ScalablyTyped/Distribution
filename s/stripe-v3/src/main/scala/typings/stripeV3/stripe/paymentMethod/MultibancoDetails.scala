package typings.stripeV3.stripe.paymentMethod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultibancoDetails extends js.Object {
  var entity: String
  var reference: String
}

object MultibancoDetails {
  @scala.inline
  def apply(entity: String, reference: String): MultibancoDetails = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultibancoDetails]
  }
}

