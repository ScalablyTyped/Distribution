package typings.stripe.stripeMod.issuing.cardholders

import typings.std.Exclude
import typings.stripe.Anon_AddressICardholderBillingAddress
import typings.stripe.stripeMod.IOptionsMetadata
import typings.stripe.stripeStrings.blocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardholderCreateOptions extends ICardholderUpdateOptions {
  /**
    * The cardholder’s billing address.
    */
  @JSName("billing")
  var billing_ICardholderCreateOptions: Anon_AddressICardholderBillingAddress
  /**
    * The cardholder’s name. This will be printed on cards issued to them.
    */
  var name: String
  /**
    * The type of cardholder. Possible values are individual or business_entity.
    */
  var `type`: CardholderType
}

object ICardholderCreateOptions {
  @scala.inline
  def apply(
    billing: Anon_AddressICardholderBillingAddress,
    name: String,
    `type`: CardholderType,
    authorization_controls: ICardholderAuthorizationControls = null,
    company: ICardholderBusinessEntity = null,
    email: String = null,
    individual: ICardholderIndividual = null,
    is_default: js.UndefOr[Boolean] = js.undefined,
    metadata: IOptionsMetadata = null,
    phone_number: String = null,
    status: Exclude[CardholderStatus, blocked] = null
  ): ICardholderCreateOptions = {
    val __obj = js.Dynamic.literal(billing = billing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (authorization_controls != null) __obj.updateDynamic("authorization_controls")(authorization_controls.asInstanceOf[js.Any])
    if (company != null) __obj.updateDynamic("company")(company.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (individual != null) __obj.updateDynamic("individual")(individual.asInstanceOf[js.Any])
    if (!js.isUndefined(is_default)) __obj.updateDynamic("is_default")(is_default.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (phone_number != null) __obj.updateDynamic("phone_number")(phone_number.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardholderCreateOptions]
  }
}

