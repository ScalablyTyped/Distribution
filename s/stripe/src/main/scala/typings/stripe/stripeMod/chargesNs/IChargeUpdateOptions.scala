package typings.stripe.stripeMod.chargesNs

import typings.stripe.Anon_FraudulentSafe
import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import typings.stripe.stripeMod.IShippingInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChargeUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * An arbitrary string which you can attach to a charge object. It is displayed when in the web interface alongside the charge.
    * Note that if you use Stripe to send automatic email receipts to your customers, your receipt emails will include the description
    * of the charge(s) that they are describing. This can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * A set of key/value pairs you can attach to a charge giving information about its riskiness.
    */
  var fraud_details: js.UndefOr[Anon_FraudulentSafe] = js.undefined
  /**
    * This is the email address that the receipt for this charge will be sent to.
    * If this field is updated, then a new email receipt will be sent to the updated address.
    */
  var receipt_email: js.UndefOr[String] = js.undefined
  /**
    * Shipping information for the charge. Helps prevent fraud on charges for
    * physical goods.
    */
  var shipping: js.UndefOr[IShippingInformation] = js.undefined
}

object IChargeUpdateOptions {
  @scala.inline
  def apply(
    description: String = null,
    expand: js.Array[String] = null,
    fraud_details: Anon_FraudulentSafe = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null,
    receipt_email: String = null,
    shipping: IShippingInformation = null
  ): IChargeUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (fraud_details != null) __obj.updateDynamic("fraud_details")(fraud_details)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    __obj.asInstanceOf[IChargeUpdateOptions]
  }
}

