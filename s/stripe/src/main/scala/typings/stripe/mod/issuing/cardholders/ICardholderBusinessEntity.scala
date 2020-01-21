package typings.stripe.mod.issuing.cardholders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardholderBusinessEntity extends js.Object {
  /**
    * Whether the company’s business ID number was provided.
    */
  var tax_id_provided: js.UndefOr[Boolean] = js.undefined
}

object ICardholderBusinessEntity {
  @scala.inline
  def apply(tax_id_provided: js.UndefOr[Boolean] = js.undefined): ICardholderBusinessEntity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(tax_id_provided)) __obj.updateDynamic("tax_id_provided")(tax_id_provided.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardholderBusinessEntity]
  }
}

