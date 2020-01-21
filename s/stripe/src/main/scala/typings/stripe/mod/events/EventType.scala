package typings.stripe.mod.events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.Asterisk
  - typings.stripe.stripeStrings.accountDotupdated
  - typings.stripe.stripeStrings.accountDotapplicationDotauthorized
  - typings.stripe.stripeStrings.accountDotapplicationDotdeauthorized
  - typings.stripe.stripeStrings.accountDotexternal_accountDotcreated
  - typings.stripe.stripeStrings.accountDotexternal_accountDotdeleted
  - typings.stripe.stripeStrings.accountDotexternal_accountDotupdated
  - typings.stripe.stripeStrings.application_feeDotcreated
  - typings.stripe.stripeStrings.application_feeDotrefunded
  - typings.stripe.stripeStrings.application_feeDotrefundDotupdated
  - typings.stripe.stripeStrings.balanceDotavailable
  - typings.stripe.stripeStrings.capabilityDotupdated
  - typings.stripe.stripeStrings.chargeDotcaptured
  - typings.stripe.stripeStrings.chargeDotexpired
  - typings.stripe.stripeStrings.chargeDotfailed
  - typings.stripe.stripeStrings.chargeDotpending
  - typings.stripe.stripeStrings.chargeDotrefunded
  - typings.stripe.stripeStrings.chargeDotsucceeded
  - typings.stripe.stripeStrings.chargeDotupdated
  - typings.stripe.stripeStrings.chargeDotdisputeDotclosed
  - typings.stripe.stripeStrings.chargeDotdisputeDotcreated
  - typings.stripe.stripeStrings.chargeDotdisputeDotfunds_reinstated
  - typings.stripe.stripeStrings.chargeDotdisputeDotfunds_withdrawn
  - typings.stripe.stripeStrings.chargeDotdisputeDotupdated
  - typings.stripe.stripeStrings.chargeDotrefundDotupdated
  - typings.stripe.stripeStrings.checkoutDotsessionDotcompleted
  - typings.stripe.stripeStrings.couponDotcreated
  - typings.stripe.stripeStrings.couponDotdeleted
  - typings.stripe.stripeStrings.couponDotupdated
  - typings.stripe.stripeStrings.credit_noteDotcreated
  - typings.stripe.stripeStrings.credit_noteDotupdated
  - typings.stripe.stripeStrings.credit_noteDotvoided
  - typings.stripe.stripeStrings.customerDotcreated
  - typings.stripe.stripeStrings.customerDotdeleted
  - typings.stripe.stripeStrings.customerDotupdated
  - typings.stripe.stripeStrings.customerDotdiscountDotcreated
  - typings.stripe.stripeStrings.customerDotdiscountDotdeleted
  - typings.stripe.stripeStrings.customerDotdiscountDotupdated
  - typings.stripe.stripeStrings.customerDotsourceDotcreated
  - typings.stripe.stripeStrings.customerDotsourceDotdeleted
  - typings.stripe.stripeStrings.customerDotsourceDotexpiring
  - typings.stripe.stripeStrings.customerDotsourceDotupdated
  - typings.stripe.stripeStrings.customerDotsubscriptionDotcreated
  - typings.stripe.stripeStrings.customerDotsubscriptionDotdeleted
  - typings.stripe.stripeStrings.customerDotsubscriptionDottrial_will_end
  - typings.stripe.stripeStrings.customerDotsubscriptionDotupdated
  - typings.stripe.stripeStrings.customerDottax_idDotcreated
  - typings.stripe.stripeStrings.customerDottax_idDotdeleted
  - typings.stripe.stripeStrings.customerDottax_idDotupdated
  - typings.stripe.stripeStrings.fileDotcreated
  - typings.stripe.stripeStrings.invoiceDotcreated
  - typings.stripe.stripeStrings.invoiceDotdeleted
  - typings.stripe.stripeStrings.invoiceDotfinalized
  - typings.stripe.stripeStrings.invoiceDotmarked_uncollectible
  - typings.stripe.stripeStrings.invoiceDotpayment_action_required
  - typings.stripe.stripeStrings.invoiceDotpayment_failed
  - typings.stripe.stripeStrings.invoiceDotpayment_succeeded
  - typings.stripe.stripeStrings.invoiceDotsent
  - typings.stripe.stripeStrings.invoiceDotupcoming
  - typings.stripe.stripeStrings.invoiceDotupdated
  - typings.stripe.stripeStrings.invoiceDotvoided
  - typings.stripe.stripeStrings.invoiceitemDotcreated
  - typings.stripe.stripeStrings.invoiceitemDotdeleted
  - typings.stripe.stripeStrings.invoiceitemDotupdated
  - typings.stripe.stripeStrings.issuing_authorizationDotcreated
  - typings.stripe.stripeStrings.issuing_authorizationDotrequest
  - typings.stripe.stripeStrings.issuing_authorizationDotupdated
  - typings.stripe.stripeStrings.issuing_cardDotcreated
  - typings.stripe.stripeStrings.issuing_cardDotupdated
  - typings.stripe.stripeStrings.issuing_cardholderDotcreated
  - typings.stripe.stripeStrings.issuing_cardholderDotupdated
  - typings.stripe.stripeStrings.issuing_disputeDotcreated
  - typings.stripe.stripeStrings.issuing_disputeDotupdated
  - typings.stripe.stripeStrings.issuing_settlementDotcreated
  - typings.stripe.stripeStrings.issuing_settlementDotupdated
  - typings.stripe.stripeStrings.issuing_transactionDotcreated
  - typings.stripe.stripeStrings.issuing_transactionDotupdated
  - typings.stripe.stripeStrings.mandateDotupdated
  - typings.stripe.stripeStrings.orderDotcreated
  - typings.stripe.stripeStrings.orderDotpayment_failed
  - typings.stripe.stripeStrings.orderDotpayment_succeeded
  - typings.stripe.stripeStrings.orderDotupdated
  - typings.stripe.stripeStrings.order_returnDotcreated
  - typings.stripe.stripeStrings.payment_intentDotamount_capturable_updated
  - typings.stripe.stripeStrings.payment_intentDotcanceled
  - typings.stripe.stripeStrings.payment_intentDotcreated
  - typings.stripe.stripeStrings.payment_intentDotpayment_failed
  - typings.stripe.stripeStrings.payment_intentDotsucceeded
  - typings.stripe.stripeStrings.payment_methodDotattached
  - typings.stripe.stripeStrings.payment_methodDotcard_automatically_updated
  - typings.stripe.stripeStrings.payment_methodDotdetached
  - typings.stripe.stripeStrings.payment_methodDotupdated
  - typings.stripe.stripeStrings.payoutDotcanceled
  - typings.stripe.stripeStrings.payoutDotcreated
  - typings.stripe.stripeStrings.payoutDotfailed
  - typings.stripe.stripeStrings.payoutDotpaid
  - typings.stripe.stripeStrings.payoutDotupdated
  - typings.stripe.stripeStrings.personDotcreated
  - typings.stripe.stripeStrings.personDotdeleted
  - typings.stripe.stripeStrings.personDotupdated
  - typings.stripe.stripeStrings.planDotcreated
  - typings.stripe.stripeStrings.planDotdeleted
  - typings.stripe.stripeStrings.planDotupdated
  - typings.stripe.stripeStrings.productDotcreated
  - typings.stripe.stripeStrings.productDotdeleted
  - typings.stripe.stripeStrings.productDotupdated
  - typings.stripe.stripeStrings.radarDotearly_fraud_warningDotcreated
  - typings.stripe.stripeStrings.radarDotearly_fraud_warningDotupdated
  - typings.stripe.stripeStrings.recipientDotcreated
  - typings.stripe.stripeStrings.recipientDotdeleted
  - typings.stripe.stripeStrings.recipientDotupdated
  - typings.stripe.stripeStrings.reportingDotreport_runDotfailed
  - typings.stripe.stripeStrings.reportingDotreport_runDotsucceeded
  - typings.stripe.stripeStrings.reportingDotreport_typeDotupdated
  - typings.stripe.stripeStrings.reviewDotclosed
  - typings.stripe.stripeStrings.reviewDotopened
  - typings.stripe.stripeStrings.setup_intentDotcanceled
  - typings.stripe.stripeStrings.setup_intentDotcreated
  - typings.stripe.stripeStrings.setup_intentDotsetup_failed
  - typings.stripe.stripeStrings.setup_intentDotsucceeded
  - typings.stripe.stripeStrings.sigmaDotscheduled_query_runDotcreated
  - typings.stripe.stripeStrings.skuDotcreated
  - typings.stripe.stripeStrings.skuDotdeleted
  - typings.stripe.stripeStrings.skuDotupdated
  - typings.stripe.stripeStrings.sourceDotcanceled
  - typings.stripe.stripeStrings.sourceDotchargeable
  - typings.stripe.stripeStrings.sourceDotfailed
  - typings.stripe.stripeStrings.sourceDotmandate_notification
  - typings.stripe.stripeStrings.sourceDotrefund_attributes_required
  - typings.stripe.stripeStrings.sourceDottransactionDotcreated
  - typings.stripe.stripeStrings.sourceDottransactionDotupdated
  - typings.stripe.stripeStrings.subscription_scheduleDotaborted
  - typings.stripe.stripeStrings.subscription_scheduleDotcanceled
  - typings.stripe.stripeStrings.subscription_scheduleDotcompleted
  - typings.stripe.stripeStrings.subscription_scheduleDotcreated
  - typings.stripe.stripeStrings.subscription_scheduleDotexpiring
  - typings.stripe.stripeStrings.subscription_scheduleDotreleased
  - typings.stripe.stripeStrings.subscription_scheduleDotupdated
  - typings.stripe.stripeStrings.tax_rateDotcreated
  - typings.stripe.stripeStrings.tax_rateDotupdated
  - typings.stripe.stripeStrings.topupDotcreated
  - typings.stripe.stripeStrings.topupDotfailed
  - typings.stripe.stripeStrings.topupDotreversed
  - typings.stripe.stripeStrings.topupDotsucceeded
  - typings.stripe.stripeStrings.transferDotcreated
  - typings.stripe.stripeStrings.transferDotfailed
  - typings.stripe.stripeStrings.transferDotpaid
  - typings.stripe.stripeStrings.transferDotreversed
  - typings.stripe.stripeStrings.transferDotupdated
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def Asterisk: typings.stripe.stripeStrings.Asterisk = this.cast("*")
  @scala.inline
  def accountDotapplicationDotauthorized: typings.stripe.stripeStrings.accountDotapplicationDotauthorized = this.cast("account.application.authorized")
  @scala.inline
  def accountDotapplicationDotdeauthorized: typings.stripe.stripeStrings.accountDotapplicationDotdeauthorized = this.cast("account.application.deauthorized")
  @scala.inline
  def accountDotexternal_accountDotcreated: typings.stripe.stripeStrings.accountDotexternal_accountDotcreated = this.cast("account.external_account.created")
  @scala.inline
  def accountDotexternal_accountDotdeleted: typings.stripe.stripeStrings.accountDotexternal_accountDotdeleted = this.cast("account.external_account.deleted")
  @scala.inline
  def accountDotexternal_accountDotupdated: typings.stripe.stripeStrings.accountDotexternal_accountDotupdated = this.cast("account.external_account.updated")
  @scala.inline
  def accountDotupdated: typings.stripe.stripeStrings.accountDotupdated = this.cast("account.updated")
  @scala.inline
  def application_feeDotcreated: typings.stripe.stripeStrings.application_feeDotcreated = this.cast("application_fee.created")
  @scala.inline
  def application_feeDotrefundDotupdated: typings.stripe.stripeStrings.application_feeDotrefundDotupdated = this.cast("application_fee.refund.updated")
  @scala.inline
  def application_feeDotrefunded: typings.stripe.stripeStrings.application_feeDotrefunded = this.cast("application_fee.refunded")
  @scala.inline
  def balanceDotavailable: typings.stripe.stripeStrings.balanceDotavailable = this.cast("balance.available")
  @scala.inline
  def capabilityDotupdated: typings.stripe.stripeStrings.capabilityDotupdated = this.cast("capability.updated")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chargeDotcaptured: typings.stripe.stripeStrings.chargeDotcaptured = this.cast("charge.captured")
  @scala.inline
  def chargeDotdisputeDotclosed: typings.stripe.stripeStrings.chargeDotdisputeDotclosed = this.cast("charge.dispute.closed")
  @scala.inline
  def chargeDotdisputeDotcreated: typings.stripe.stripeStrings.chargeDotdisputeDotcreated = this.cast("charge.dispute.created")
  @scala.inline
  def chargeDotdisputeDotfunds_reinstated: typings.stripe.stripeStrings.chargeDotdisputeDotfunds_reinstated = this.cast("charge.dispute.funds_reinstated")
  @scala.inline
  def chargeDotdisputeDotfunds_withdrawn: typings.stripe.stripeStrings.chargeDotdisputeDotfunds_withdrawn = this.cast("charge.dispute.funds_withdrawn")
  @scala.inline
  def chargeDotdisputeDotupdated: typings.stripe.stripeStrings.chargeDotdisputeDotupdated = this.cast("charge.dispute.updated")
  @scala.inline
  def chargeDotexpired: typings.stripe.stripeStrings.chargeDotexpired = this.cast("charge.expired")
  @scala.inline
  def chargeDotfailed: typings.stripe.stripeStrings.chargeDotfailed = this.cast("charge.failed")
  @scala.inline
  def chargeDotpending: typings.stripe.stripeStrings.chargeDotpending = this.cast("charge.pending")
  @scala.inline
  def chargeDotrefundDotupdated: typings.stripe.stripeStrings.chargeDotrefundDotupdated = this.cast("charge.refund.updated")
  @scala.inline
  def chargeDotrefunded: typings.stripe.stripeStrings.chargeDotrefunded = this.cast("charge.refunded")
  @scala.inline
  def chargeDotsucceeded: typings.stripe.stripeStrings.chargeDotsucceeded = this.cast("charge.succeeded")
  @scala.inline
  def chargeDotupdated: typings.stripe.stripeStrings.chargeDotupdated = this.cast("charge.updated")
  @scala.inline
  def checkoutDotsessionDotcompleted: typings.stripe.stripeStrings.checkoutDotsessionDotcompleted = this.cast("checkout.session.completed")
  @scala.inline
  def couponDotcreated: typings.stripe.stripeStrings.couponDotcreated = this.cast("coupon.created")
  @scala.inline
  def couponDotdeleted: typings.stripe.stripeStrings.couponDotdeleted = this.cast("coupon.deleted")
  @scala.inline
  def couponDotupdated: typings.stripe.stripeStrings.couponDotupdated = this.cast("coupon.updated")
  @scala.inline
  def credit_noteDotcreated: typings.stripe.stripeStrings.credit_noteDotcreated = this.cast("credit_note.created")
  @scala.inline
  def credit_noteDotupdated: typings.stripe.stripeStrings.credit_noteDotupdated = this.cast("credit_note.updated")
  @scala.inline
  def credit_noteDotvoided: typings.stripe.stripeStrings.credit_noteDotvoided = this.cast("credit_note.voided")
  @scala.inline
  def customerDotcreated: typings.stripe.stripeStrings.customerDotcreated = this.cast("customer.created")
  @scala.inline
  def customerDotdeleted: typings.stripe.stripeStrings.customerDotdeleted = this.cast("customer.deleted")
  @scala.inline
  def customerDotdiscountDotcreated: typings.stripe.stripeStrings.customerDotdiscountDotcreated = this.cast("customer.discount.created")
  @scala.inline
  def customerDotdiscountDotdeleted: typings.stripe.stripeStrings.customerDotdiscountDotdeleted = this.cast("customer.discount.deleted")
  @scala.inline
  def customerDotdiscountDotupdated: typings.stripe.stripeStrings.customerDotdiscountDotupdated = this.cast("customer.discount.updated")
  @scala.inline
  def customerDotsourceDotcreated: typings.stripe.stripeStrings.customerDotsourceDotcreated = this.cast("customer.source.created")
  @scala.inline
  def customerDotsourceDotdeleted: typings.stripe.stripeStrings.customerDotsourceDotdeleted = this.cast("customer.source.deleted")
  @scala.inline
  def customerDotsourceDotexpiring: typings.stripe.stripeStrings.customerDotsourceDotexpiring = this.cast("customer.source.expiring")
  @scala.inline
  def customerDotsourceDotupdated: typings.stripe.stripeStrings.customerDotsourceDotupdated = this.cast("customer.source.updated")
  @scala.inline
  def customerDotsubscriptionDotcreated: typings.stripe.stripeStrings.customerDotsubscriptionDotcreated = this.cast("customer.subscription.created")
  @scala.inline
  def customerDotsubscriptionDotdeleted: typings.stripe.stripeStrings.customerDotsubscriptionDotdeleted = this.cast("customer.subscription.deleted")
  @scala.inline
  def customerDotsubscriptionDottrial_will_end: typings.stripe.stripeStrings.customerDotsubscriptionDottrial_will_end = this.cast("customer.subscription.trial_will_end")
  @scala.inline
  def customerDotsubscriptionDotupdated: typings.stripe.stripeStrings.customerDotsubscriptionDotupdated = this.cast("customer.subscription.updated")
  @scala.inline
  def customerDottax_idDotcreated: typings.stripe.stripeStrings.customerDottax_idDotcreated = this.cast("customer.tax_id.created")
  @scala.inline
  def customerDottax_idDotdeleted: typings.stripe.stripeStrings.customerDottax_idDotdeleted = this.cast("customer.tax_id.deleted")
  @scala.inline
  def customerDottax_idDotupdated: typings.stripe.stripeStrings.customerDottax_idDotupdated = this.cast("customer.tax_id.updated")
  @scala.inline
  def customerDotupdated: typings.stripe.stripeStrings.customerDotupdated = this.cast("customer.updated")
  @scala.inline
  def fileDotcreated: typings.stripe.stripeStrings.fileDotcreated = this.cast("file.created")
  @scala.inline
  def invoiceDotcreated: typings.stripe.stripeStrings.invoiceDotcreated = this.cast("invoice.created")
  @scala.inline
  def invoiceDotdeleted: typings.stripe.stripeStrings.invoiceDotdeleted = this.cast("invoice.deleted")
  @scala.inline
  def invoiceDotfinalized: typings.stripe.stripeStrings.invoiceDotfinalized = this.cast("invoice.finalized")
  @scala.inline
  def invoiceDotmarked_uncollectible: typings.stripe.stripeStrings.invoiceDotmarked_uncollectible = this.cast("invoice.marked_uncollectible")
  @scala.inline
  def invoiceDotpayment_action_required: typings.stripe.stripeStrings.invoiceDotpayment_action_required = this.cast("invoice.payment_action_required")
  @scala.inline
  def invoiceDotpayment_failed: typings.stripe.stripeStrings.invoiceDotpayment_failed = this.cast("invoice.payment_failed")
  @scala.inline
  def invoiceDotpayment_succeeded: typings.stripe.stripeStrings.invoiceDotpayment_succeeded = this.cast("invoice.payment_succeeded")
  @scala.inline
  def invoiceDotsent: typings.stripe.stripeStrings.invoiceDotsent = this.cast("invoice.sent")
  @scala.inline
  def invoiceDotupcoming: typings.stripe.stripeStrings.invoiceDotupcoming = this.cast("invoice.upcoming")
  @scala.inline
  def invoiceDotupdated: typings.stripe.stripeStrings.invoiceDotupdated = this.cast("invoice.updated")
  @scala.inline
  def invoiceDotvoided: typings.stripe.stripeStrings.invoiceDotvoided = this.cast("invoice.voided")
  @scala.inline
  def invoiceitemDotcreated: typings.stripe.stripeStrings.invoiceitemDotcreated = this.cast("invoiceitem.created")
  @scala.inline
  def invoiceitemDotdeleted: typings.stripe.stripeStrings.invoiceitemDotdeleted = this.cast("invoiceitem.deleted")
  @scala.inline
  def invoiceitemDotupdated: typings.stripe.stripeStrings.invoiceitemDotupdated = this.cast("invoiceitem.updated")
  @scala.inline
  def issuing_authorizationDotcreated: typings.stripe.stripeStrings.issuing_authorizationDotcreated = this.cast("issuing_authorization.created")
  @scala.inline
  def issuing_authorizationDotrequest: typings.stripe.stripeStrings.issuing_authorizationDotrequest = this.cast("issuing_authorization.request")
  @scala.inline
  def issuing_authorizationDotupdated: typings.stripe.stripeStrings.issuing_authorizationDotupdated = this.cast("issuing_authorization.updated")
  @scala.inline
  def issuing_cardDotcreated: typings.stripe.stripeStrings.issuing_cardDotcreated = this.cast("issuing_card.created")
  @scala.inline
  def issuing_cardDotupdated: typings.stripe.stripeStrings.issuing_cardDotupdated = this.cast("issuing_card.updated")
  @scala.inline
  def issuing_cardholderDotcreated: typings.stripe.stripeStrings.issuing_cardholderDotcreated = this.cast("issuing_cardholder.created")
  @scala.inline
  def issuing_cardholderDotupdated: typings.stripe.stripeStrings.issuing_cardholderDotupdated = this.cast("issuing_cardholder.updated")
  @scala.inline
  def issuing_disputeDotcreated: typings.stripe.stripeStrings.issuing_disputeDotcreated = this.cast("issuing_dispute.created")
  @scala.inline
  def issuing_disputeDotupdated: typings.stripe.stripeStrings.issuing_disputeDotupdated = this.cast("issuing_dispute.updated")
  @scala.inline
  def issuing_settlementDotcreated: typings.stripe.stripeStrings.issuing_settlementDotcreated = this.cast("issuing_settlement.created")
  @scala.inline
  def issuing_settlementDotupdated: typings.stripe.stripeStrings.issuing_settlementDotupdated = this.cast("issuing_settlement.updated")
  @scala.inline
  def issuing_transactionDotcreated: typings.stripe.stripeStrings.issuing_transactionDotcreated = this.cast("issuing_transaction.created")
  @scala.inline
  def issuing_transactionDotupdated: typings.stripe.stripeStrings.issuing_transactionDotupdated = this.cast("issuing_transaction.updated")
  @scala.inline
  def mandateDotupdated: typings.stripe.stripeStrings.mandateDotupdated = this.cast("mandate.updated")
  @scala.inline
  def orderDotcreated: typings.stripe.stripeStrings.orderDotcreated = this.cast("order.created")
  @scala.inline
  def orderDotpayment_failed: typings.stripe.stripeStrings.orderDotpayment_failed = this.cast("order.payment_failed")
  @scala.inline
  def orderDotpayment_succeeded: typings.stripe.stripeStrings.orderDotpayment_succeeded = this.cast("order.payment_succeeded")
  @scala.inline
  def orderDotupdated: typings.stripe.stripeStrings.orderDotupdated = this.cast("order.updated")
  @scala.inline
  def order_returnDotcreated: typings.stripe.stripeStrings.order_returnDotcreated = this.cast("order_return.created")
  @scala.inline
  def payment_intentDotamount_capturable_updated: typings.stripe.stripeStrings.payment_intentDotamount_capturable_updated = this.cast("payment_intent.amount_capturable_updated")
  @scala.inline
  def payment_intentDotcanceled: typings.stripe.stripeStrings.payment_intentDotcanceled = this.cast("payment_intent.canceled")
  @scala.inline
  def payment_intentDotcreated: typings.stripe.stripeStrings.payment_intentDotcreated = this.cast("payment_intent.created")
  @scala.inline
  def payment_intentDotpayment_failed: typings.stripe.stripeStrings.payment_intentDotpayment_failed = this.cast("payment_intent.payment_failed")
  @scala.inline
  def payment_intentDotsucceeded: typings.stripe.stripeStrings.payment_intentDotsucceeded = this.cast("payment_intent.succeeded")
  @scala.inline
  def payment_methodDotattached: typings.stripe.stripeStrings.payment_methodDotattached = this.cast("payment_method.attached")
  @scala.inline
  def payment_methodDotcard_automatically_updated: typings.stripe.stripeStrings.payment_methodDotcard_automatically_updated = this.cast("payment_method.card_automatically_updated")
  @scala.inline
  def payment_methodDotdetached: typings.stripe.stripeStrings.payment_methodDotdetached = this.cast("payment_method.detached")
  @scala.inline
  def payment_methodDotupdated: typings.stripe.stripeStrings.payment_methodDotupdated = this.cast("payment_method.updated")
  @scala.inline
  def payoutDotcanceled: typings.stripe.stripeStrings.payoutDotcanceled = this.cast("payout.canceled")
  @scala.inline
  def payoutDotcreated: typings.stripe.stripeStrings.payoutDotcreated = this.cast("payout.created")
  @scala.inline
  def payoutDotfailed: typings.stripe.stripeStrings.payoutDotfailed = this.cast("payout.failed")
  @scala.inline
  def payoutDotpaid: typings.stripe.stripeStrings.payoutDotpaid = this.cast("payout.paid")
  @scala.inline
  def payoutDotupdated: typings.stripe.stripeStrings.payoutDotupdated = this.cast("payout.updated")
  @scala.inline
  def personDotcreated: typings.stripe.stripeStrings.personDotcreated = this.cast("person.created")
  @scala.inline
  def personDotdeleted: typings.stripe.stripeStrings.personDotdeleted = this.cast("person.deleted")
  @scala.inline
  def personDotupdated: typings.stripe.stripeStrings.personDotupdated = this.cast("person.updated")
  @scala.inline
  def planDotcreated: typings.stripe.stripeStrings.planDotcreated = this.cast("plan.created")
  @scala.inline
  def planDotdeleted: typings.stripe.stripeStrings.planDotdeleted = this.cast("plan.deleted")
  @scala.inline
  def planDotupdated: typings.stripe.stripeStrings.planDotupdated = this.cast("plan.updated")
  @scala.inline
  def productDotcreated: typings.stripe.stripeStrings.productDotcreated = this.cast("product.created")
  @scala.inline
  def productDotdeleted: typings.stripe.stripeStrings.productDotdeleted = this.cast("product.deleted")
  @scala.inline
  def productDotupdated: typings.stripe.stripeStrings.productDotupdated = this.cast("product.updated")
  @scala.inline
  def radarDotearly_fraud_warningDotcreated: typings.stripe.stripeStrings.radarDotearly_fraud_warningDotcreated = this.cast("radar.early_fraud_warning.created")
  @scala.inline
  def radarDotearly_fraud_warningDotupdated: typings.stripe.stripeStrings.radarDotearly_fraud_warningDotupdated = this.cast("radar.early_fraud_warning.updated")
  @scala.inline
  def recipientDotcreated: typings.stripe.stripeStrings.recipientDotcreated = this.cast("recipient.created")
  @scala.inline
  def recipientDotdeleted: typings.stripe.stripeStrings.recipientDotdeleted = this.cast("recipient.deleted")
  @scala.inline
  def recipientDotupdated: typings.stripe.stripeStrings.recipientDotupdated = this.cast("recipient.updated")
  @scala.inline
  def reportingDotreport_runDotfailed: typings.stripe.stripeStrings.reportingDotreport_runDotfailed = this.cast("reporting.report_run.failed")
  @scala.inline
  def reportingDotreport_runDotsucceeded: typings.stripe.stripeStrings.reportingDotreport_runDotsucceeded = this.cast("reporting.report_run.succeeded")
  @scala.inline
  def reportingDotreport_typeDotupdated: typings.stripe.stripeStrings.reportingDotreport_typeDotupdated = this.cast("reporting.report_type.updated")
  @scala.inline
  def reviewDotclosed: typings.stripe.stripeStrings.reviewDotclosed = this.cast("review.closed")
  @scala.inline
  def reviewDotopened: typings.stripe.stripeStrings.reviewDotopened = this.cast("review.opened")
  @scala.inline
  def setup_intentDotcanceled: typings.stripe.stripeStrings.setup_intentDotcanceled = this.cast("setup_intent.canceled")
  @scala.inline
  def setup_intentDotcreated: typings.stripe.stripeStrings.setup_intentDotcreated = this.cast("setup_intent.created")
  @scala.inline
  def setup_intentDotsetup_failed: typings.stripe.stripeStrings.setup_intentDotsetup_failed = this.cast("setup_intent.setup_failed")
  @scala.inline
  def setup_intentDotsucceeded: typings.stripe.stripeStrings.setup_intentDotsucceeded = this.cast("setup_intent.succeeded")
  @scala.inline
  def sigmaDotscheduled_query_runDotcreated: typings.stripe.stripeStrings.sigmaDotscheduled_query_runDotcreated = this.cast("sigma.scheduled_query_run.created")
  @scala.inline
  def skuDotcreated: typings.stripe.stripeStrings.skuDotcreated = this.cast("sku.created")
  @scala.inline
  def skuDotdeleted: typings.stripe.stripeStrings.skuDotdeleted = this.cast("sku.deleted")
  @scala.inline
  def skuDotupdated: typings.stripe.stripeStrings.skuDotupdated = this.cast("sku.updated")
  @scala.inline
  def sourceDotcanceled: typings.stripe.stripeStrings.sourceDotcanceled = this.cast("source.canceled")
  @scala.inline
  def sourceDotchargeable: typings.stripe.stripeStrings.sourceDotchargeable = this.cast("source.chargeable")
  @scala.inline
  def sourceDotfailed: typings.stripe.stripeStrings.sourceDotfailed = this.cast("source.failed")
  @scala.inline
  def sourceDotmandate_notification: typings.stripe.stripeStrings.sourceDotmandate_notification = this.cast("source.mandate_notification")
  @scala.inline
  def sourceDotrefund_attributes_required: typings.stripe.stripeStrings.sourceDotrefund_attributes_required = this.cast("source.refund_attributes_required")
  @scala.inline
  def sourceDottransactionDotcreated: typings.stripe.stripeStrings.sourceDottransactionDotcreated = this.cast("source.transaction.created")
  @scala.inline
  def sourceDottransactionDotupdated: typings.stripe.stripeStrings.sourceDottransactionDotupdated = this.cast("source.transaction.updated")
  @scala.inline
  def subscription_scheduleDotaborted: typings.stripe.stripeStrings.subscription_scheduleDotaborted = this.cast("subscription_schedule.aborted")
  @scala.inline
  def subscription_scheduleDotcanceled: typings.stripe.stripeStrings.subscription_scheduleDotcanceled = this.cast("subscription_schedule.canceled")
  @scala.inline
  def subscription_scheduleDotcompleted: typings.stripe.stripeStrings.subscription_scheduleDotcompleted = this.cast("subscription_schedule.completed")
  @scala.inline
  def subscription_scheduleDotcreated: typings.stripe.stripeStrings.subscription_scheduleDotcreated = this.cast("subscription_schedule.created")
  @scala.inline
  def subscription_scheduleDotexpiring: typings.stripe.stripeStrings.subscription_scheduleDotexpiring = this.cast("subscription_schedule.expiring")
  @scala.inline
  def subscription_scheduleDotreleased: typings.stripe.stripeStrings.subscription_scheduleDotreleased = this.cast("subscription_schedule.released")
  @scala.inline
  def subscription_scheduleDotupdated: typings.stripe.stripeStrings.subscription_scheduleDotupdated = this.cast("subscription_schedule.updated")
  @scala.inline
  def tax_rateDotcreated: typings.stripe.stripeStrings.tax_rateDotcreated = this.cast("tax_rate.created")
  @scala.inline
  def tax_rateDotupdated: typings.stripe.stripeStrings.tax_rateDotupdated = this.cast("tax_rate.updated")
  @scala.inline
  def topupDotcreated: typings.stripe.stripeStrings.topupDotcreated = this.cast("topup.created")
  @scala.inline
  def topupDotfailed: typings.stripe.stripeStrings.topupDotfailed = this.cast("topup.failed")
  @scala.inline
  def topupDotreversed: typings.stripe.stripeStrings.topupDotreversed = this.cast("topup.reversed")
  @scala.inline
  def topupDotsucceeded: typings.stripe.stripeStrings.topupDotsucceeded = this.cast("topup.succeeded")
  @scala.inline
  def transferDotcreated: typings.stripe.stripeStrings.transferDotcreated = this.cast("transfer.created")
  @scala.inline
  def transferDotfailed: typings.stripe.stripeStrings.transferDotfailed = this.cast("transfer.failed")
  @scala.inline
  def transferDotpaid: typings.stripe.stripeStrings.transferDotpaid = this.cast("transfer.paid")
  @scala.inline
  def transferDotreversed: typings.stripe.stripeStrings.transferDotreversed = this.cast("transfer.reversed")
  @scala.inline
  def transferDotupdated: typings.stripe.stripeStrings.transferDotupdated = this.cast("transfer.updated")
}

