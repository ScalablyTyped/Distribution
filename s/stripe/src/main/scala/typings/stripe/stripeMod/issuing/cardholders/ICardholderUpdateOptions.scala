package typings.stripe.stripeMod.issuing.cardholders

import typings.std.Exclude
import typings.stripe.Anon_AddressICardholderBillingAddress
import typings.stripe.stripeMod.IOptionsMetadata
import typings.stripe.stripeStrings.blocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardholderUpdateOptions extends js.Object {
  /**
    * Spending rules that give you some control over how your cards can be used. Refer to our authorizations documentation for more details.
    */
  var authorization_controls: js.UndefOr[ICardholderAuthorizationControls] = js.undefined
  /**
    * The cardholder’s billing address.
    */
  var billing: js.UndefOr[Anon_AddressICardholderBillingAddress] = js.undefined
  /**
    * Additional information about a business_entity cardholder.
    */
  var company: js.UndefOr[ICardholderBusinessEntity] = js.undefined
  /**
    * The cardholder’s email address.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * Additional information about an individual cardholder.
    */
  var individual: js.UndefOr[ICardholderIndividual] = js.undefined
  /**
    * Specifies whether to set this as the default cardholder.
    */
  var is_default: js.UndefOr[Boolean] = js.undefined
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to metadata.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
  /**
    * The cardholder’s phone number.
    */
  var phone_number: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether to permit authorizations on this cardholder’s cards. Possible values are active or inactive.
    */
  var status: js.UndefOr[Exclude[CardholderStatus, blocked]] = js.undefined
}

object ICardholderUpdateOptions {
  @scala.inline
  def apply(
    authorization_controls: ICardholderAuthorizationControls = null,
    billing: Anon_AddressICardholderBillingAddress = null,
    company: ICardholderBusinessEntity = null,
    email: String = null,
    individual: ICardholderIndividual = null,
    is_default: js.UndefOr[Boolean] = js.undefined,
    metadata: IOptionsMetadata = null,
    phone_number: String = null,
    status: Exclude[CardholderStatus, blocked] = null
  ): ICardholderUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (authorization_controls != null) __obj.updateDynamic("authorization_controls")(authorization_controls.asInstanceOf[js.Any])
    if (billing != null) __obj.updateDynamic("billing")(billing.asInstanceOf[js.Any])
    if (company != null) __obj.updateDynamic("company")(company.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (individual != null) __obj.updateDynamic("individual")(individual.asInstanceOf[js.Any])
    if (!js.isUndefined(is_default)) __obj.updateDynamic("is_default")(is_default.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (phone_number != null) __obj.updateDynamic("phone_number")(phone_number.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardholderUpdateOptions]
  }
}

