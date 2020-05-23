package typings.stripe.mod.issuing.authorizations

import typings.stripe.anon.Entity
import typings.stripe.stripeStrings.account_compliance_disabled
import typings.stripe.stripeStrings.account_inactive
import typings.stripe.stripeStrings.authentication_failed
import typings.stripe.stripeStrings.authorization_controls
import typings.stripe.stripeStrings.card_active
import typings.stripe.stripeStrings.card_inactive
import typings.stripe.stripeStrings.insufficient_funds
import typings.stripe.stripeStrings.suspected_fraud
import typings.stripe.stripeStrings.webhook_approved
import typings.stripe.stripeStrings.webhook_declined
import typings.stripe.stripeStrings.webhook_timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestHistory extends js.Object {
  /**
    * Whether this request was approved.
    */
  var approved: Boolean
  /**
    * The amount that was authorized at the time of this request
    */
  var authorized_amount: Double
  /**
    * The currency that was presented to the cardholder for the authorization. Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var authorized_currency: String
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * The amount Stripe held from your account to fund the authorization, if the request was approved
    */
  var held_amount: Double
  /**
    * The currency of the held amount
    */
  var held_currency: String
  /**
    * One of authentication_failed, authorization_controls, card_active, card_inactive, insufficient_funds, account_compliance_disabled, account_inactive, suspected_fraud, webhook_approved, webhook_declined, or webhook_timeout.
    */
  var reason: authentication_failed | authorization_controls | card_active | card_inactive | insufficient_funds | account_compliance_disabled | account_inactive | suspected_fraud | webhook_approved | webhook_declined | webhook_timeout
  /**
    * When an authorization is declined due to authorization_controls, this array contains details about the authorization controls that were violated. Otherwise, it is empty.
    */
  var violated_authorization_controls: Entity
}

object RequestHistory {
  @scala.inline
  def apply(
    approved: Boolean,
    authorized_amount: Double,
    authorized_currency: String,
    created: Double,
    held_amount: Double,
    held_currency: String,
    reason: authentication_failed | authorization_controls | card_active | card_inactive | insufficient_funds | account_compliance_disabled | account_inactive | suspected_fraud | webhook_approved | webhook_declined | webhook_timeout,
    violated_authorization_controls: Entity
  ): RequestHistory = {
    val __obj = js.Dynamic.literal(approved = approved.asInstanceOf[js.Any], authorized_amount = authorized_amount.asInstanceOf[js.Any], authorized_currency = authorized_currency.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], held_amount = held_amount.asInstanceOf[js.Any], held_currency = held_currency.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], violated_authorization_controls = violated_authorization_controls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestHistory]
  }
}

