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

@js.native
trait RequestHistory extends js.Object {
  /**
    * Whether this request was approved.
    */
  var approved: Boolean = js.native
  /**
    * The amount that was authorized at the time of this request
    */
  var authorized_amount: Double = js.native
  /**
    * The currency that was presented to the cardholder for the authorization. Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var authorized_currency: String = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * The amount Stripe held from your account to fund the authorization, if the request was approved
    */
  var held_amount: Double = js.native
  /**
    * The currency of the held amount
    */
  var held_currency: String = js.native
  /**
    * One of authentication_failed, authorization_controls, card_active, card_inactive, insufficient_funds, account_compliance_disabled, account_inactive, suspected_fraud, webhook_approved, webhook_declined, or webhook_timeout.
    */
  var reason: authentication_failed | authorization_controls | card_active | card_inactive | insufficient_funds | account_compliance_disabled | account_inactive | suspected_fraud | webhook_approved | webhook_declined | webhook_timeout = js.native
  /**
    * When an authorization is declined due to authorization_controls, this array contains details about the authorization controls that were violated. Otherwise, it is empty.
    */
  var violated_authorization_controls: Entity = js.native
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
  @scala.inline
  implicit class RequestHistoryOps[Self <: RequestHistory] (val x: Self) extends AnyVal {
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
    def setApproved(value: Boolean): Self = this.set("approved", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorized_amount(value: Double): Self = this.set("authorized_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorized_currency(value: String): Self = this.set("authorized_currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeld_amount(value: Double): Self = this.set("held_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeld_currency(value: String): Self = this.set("held_currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(
      value: authentication_failed | authorization_controls | card_active | card_inactive | insufficient_funds | account_compliance_disabled | account_inactive | suspected_fraud | webhook_approved | webhook_declined | webhook_timeout
    ): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setViolated_authorization_controls(value: Entity): Self = this.set("violated_authorization_controls", value.asInstanceOf[js.Any])
  }
  
}

