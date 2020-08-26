package typings.stripe.mod.issuing.cards

import typings.stripe.stripeStrings.active
import typings.stripe.stripeStrings.blocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about the PIN on the card.
  */
@js.native
trait IIssuingCardPin extends js.Object {
  var status: blocked | active = js.native
}

object IIssuingCardPin {
  @scala.inline
  def apply(status: blocked | active): IIssuingCardPin = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingCardPin]
  }
  @scala.inline
  implicit class IIssuingCardPinOps[Self <: IIssuingCardPin] (val x: Self) extends AnyVal {
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
    def setStatus(value: blocked | active): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

