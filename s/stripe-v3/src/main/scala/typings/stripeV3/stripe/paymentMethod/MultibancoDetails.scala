package typings.stripeV3.stripe.paymentMethod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultibancoDetails extends js.Object {
  var entity: String = js.native
  var reference: String = js.native
}

object MultibancoDetails {
  @scala.inline
  def apply(entity: String, reference: String): MultibancoDetails = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultibancoDetails]
  }
  @scala.inline
  implicit class MultibancoDetailsOps[Self <: MultibancoDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntity(value: String): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def setReference(value: String): Self = this.set("reference", value.asInstanceOf[js.Any])
  }
  
}

