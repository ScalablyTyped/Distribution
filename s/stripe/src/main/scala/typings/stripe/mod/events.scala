package typings.stripe.mod

import typings.stripe.anon.Id
import typings.stripe.anon.Previousattributes
import typings.stripe.stripeStrings.event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
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
  trait EventType extends StObject
  object EventType {
    
    @scala.inline
    def Asterisk: typings.stripe.stripeStrings.Asterisk = "*".asInstanceOf[typings.stripe.stripeStrings.Asterisk]
    
    @scala.inline
    def accountDotapplicationDotauthorized: typings.stripe.stripeStrings.accountDotapplicationDotauthorized = "account.application.authorized".asInstanceOf[typings.stripe.stripeStrings.accountDotapplicationDotauthorized]
    
    @scala.inline
    def accountDotapplicationDotdeauthorized: typings.stripe.stripeStrings.accountDotapplicationDotdeauthorized = "account.application.deauthorized".asInstanceOf[typings.stripe.stripeStrings.accountDotapplicationDotdeauthorized]
    
    @scala.inline
    def accountDotexternal_accountDotcreated: typings.stripe.stripeStrings.accountDotexternal_accountDotcreated = "account.external_account.created".asInstanceOf[typings.stripe.stripeStrings.accountDotexternal_accountDotcreated]
    
    @scala.inline
    def accountDotexternal_accountDotdeleted: typings.stripe.stripeStrings.accountDotexternal_accountDotdeleted = "account.external_account.deleted".asInstanceOf[typings.stripe.stripeStrings.accountDotexternal_accountDotdeleted]
    
    @scala.inline
    def accountDotexternal_accountDotupdated: typings.stripe.stripeStrings.accountDotexternal_accountDotupdated = "account.external_account.updated".asInstanceOf[typings.stripe.stripeStrings.accountDotexternal_accountDotupdated]
    
    @scala.inline
    def accountDotupdated: typings.stripe.stripeStrings.accountDotupdated = "account.updated".asInstanceOf[typings.stripe.stripeStrings.accountDotupdated]
    
    @scala.inline
    def application_feeDotcreated: typings.stripe.stripeStrings.application_feeDotcreated = "application_fee.created".asInstanceOf[typings.stripe.stripeStrings.application_feeDotcreated]
    
    @scala.inline
    def application_feeDotrefundDotupdated: typings.stripe.stripeStrings.application_feeDotrefundDotupdated = "application_fee.refund.updated".asInstanceOf[typings.stripe.stripeStrings.application_feeDotrefundDotupdated]
    
    @scala.inline
    def application_feeDotrefunded: typings.stripe.stripeStrings.application_feeDotrefunded = "application_fee.refunded".asInstanceOf[typings.stripe.stripeStrings.application_feeDotrefunded]
    
    @scala.inline
    def balanceDotavailable: typings.stripe.stripeStrings.balanceDotavailable = "balance.available".asInstanceOf[typings.stripe.stripeStrings.balanceDotavailable]
    
    @scala.inline
    def capabilityDotupdated: typings.stripe.stripeStrings.capabilityDotupdated = "capability.updated".asInstanceOf[typings.stripe.stripeStrings.capabilityDotupdated]
    
    @scala.inline
    def chargeDotcaptured: typings.stripe.stripeStrings.chargeDotcaptured = "charge.captured".asInstanceOf[typings.stripe.stripeStrings.chargeDotcaptured]
    
    @scala.inline
    def chargeDotdisputeDotclosed: typings.stripe.stripeStrings.chargeDotdisputeDotclosed = "charge.dispute.closed".asInstanceOf[typings.stripe.stripeStrings.chargeDotdisputeDotclosed]
    
    @scala.inline
    def chargeDotdisputeDotcreated: typings.stripe.stripeStrings.chargeDotdisputeDotcreated = "charge.dispute.created".asInstanceOf[typings.stripe.stripeStrings.chargeDotdisputeDotcreated]
    
    @scala.inline
    def chargeDotdisputeDotfunds_reinstated: typings.stripe.stripeStrings.chargeDotdisputeDotfunds_reinstated = "charge.dispute.funds_reinstated".asInstanceOf[typings.stripe.stripeStrings.chargeDotdisputeDotfunds_reinstated]
    
    @scala.inline
    def chargeDotdisputeDotfunds_withdrawn: typings.stripe.stripeStrings.chargeDotdisputeDotfunds_withdrawn = "charge.dispute.funds_withdrawn".asInstanceOf[typings.stripe.stripeStrings.chargeDotdisputeDotfunds_withdrawn]
    
    @scala.inline
    def chargeDotdisputeDotupdated: typings.stripe.stripeStrings.chargeDotdisputeDotupdated = "charge.dispute.updated".asInstanceOf[typings.stripe.stripeStrings.chargeDotdisputeDotupdated]
    
    @scala.inline
    def chargeDotexpired: typings.stripe.stripeStrings.chargeDotexpired = "charge.expired".asInstanceOf[typings.stripe.stripeStrings.chargeDotexpired]
    
    @scala.inline
    def chargeDotfailed: typings.stripe.stripeStrings.chargeDotfailed = "charge.failed".asInstanceOf[typings.stripe.stripeStrings.chargeDotfailed]
    
    @scala.inline
    def chargeDotpending: typings.stripe.stripeStrings.chargeDotpending = "charge.pending".asInstanceOf[typings.stripe.stripeStrings.chargeDotpending]
    
    @scala.inline
    def chargeDotrefundDotupdated: typings.stripe.stripeStrings.chargeDotrefundDotupdated = "charge.refund.updated".asInstanceOf[typings.stripe.stripeStrings.chargeDotrefundDotupdated]
    
    @scala.inline
    def chargeDotrefunded: typings.stripe.stripeStrings.chargeDotrefunded = "charge.refunded".asInstanceOf[typings.stripe.stripeStrings.chargeDotrefunded]
    
    @scala.inline
    def chargeDotsucceeded: typings.stripe.stripeStrings.chargeDotsucceeded = "charge.succeeded".asInstanceOf[typings.stripe.stripeStrings.chargeDotsucceeded]
    
    @scala.inline
    def chargeDotupdated: typings.stripe.stripeStrings.chargeDotupdated = "charge.updated".asInstanceOf[typings.stripe.stripeStrings.chargeDotupdated]
    
    @scala.inline
    def checkoutDotsessionDotcompleted: typings.stripe.stripeStrings.checkoutDotsessionDotcompleted = "checkout.session.completed".asInstanceOf[typings.stripe.stripeStrings.checkoutDotsessionDotcompleted]
    
    @scala.inline
    def couponDotcreated: typings.stripe.stripeStrings.couponDotcreated = "coupon.created".asInstanceOf[typings.stripe.stripeStrings.couponDotcreated]
    
    @scala.inline
    def couponDotdeleted: typings.stripe.stripeStrings.couponDotdeleted = "coupon.deleted".asInstanceOf[typings.stripe.stripeStrings.couponDotdeleted]
    
    @scala.inline
    def couponDotupdated: typings.stripe.stripeStrings.couponDotupdated = "coupon.updated".asInstanceOf[typings.stripe.stripeStrings.couponDotupdated]
    
    @scala.inline
    def credit_noteDotcreated: typings.stripe.stripeStrings.credit_noteDotcreated = "credit_note.created".asInstanceOf[typings.stripe.stripeStrings.credit_noteDotcreated]
    
    @scala.inline
    def credit_noteDotupdated: typings.stripe.stripeStrings.credit_noteDotupdated = "credit_note.updated".asInstanceOf[typings.stripe.stripeStrings.credit_noteDotupdated]
    
    @scala.inline
    def credit_noteDotvoided: typings.stripe.stripeStrings.credit_noteDotvoided = "credit_note.voided".asInstanceOf[typings.stripe.stripeStrings.credit_noteDotvoided]
    
    @scala.inline
    def customerDotcreated: typings.stripe.stripeStrings.customerDotcreated = "customer.created".asInstanceOf[typings.stripe.stripeStrings.customerDotcreated]
    
    @scala.inline
    def customerDotdeleted: typings.stripe.stripeStrings.customerDotdeleted = "customer.deleted".asInstanceOf[typings.stripe.stripeStrings.customerDotdeleted]
    
    @scala.inline
    def customerDotdiscountDotcreated: typings.stripe.stripeStrings.customerDotdiscountDotcreated = "customer.discount.created".asInstanceOf[typings.stripe.stripeStrings.customerDotdiscountDotcreated]
    
    @scala.inline
    def customerDotdiscountDotdeleted: typings.stripe.stripeStrings.customerDotdiscountDotdeleted = "customer.discount.deleted".asInstanceOf[typings.stripe.stripeStrings.customerDotdiscountDotdeleted]
    
    @scala.inline
    def customerDotdiscountDotupdated: typings.stripe.stripeStrings.customerDotdiscountDotupdated = "customer.discount.updated".asInstanceOf[typings.stripe.stripeStrings.customerDotdiscountDotupdated]
    
    @scala.inline
    def customerDotsourceDotcreated: typings.stripe.stripeStrings.customerDotsourceDotcreated = "customer.source.created".asInstanceOf[typings.stripe.stripeStrings.customerDotsourceDotcreated]
    
    @scala.inline
    def customerDotsourceDotdeleted: typings.stripe.stripeStrings.customerDotsourceDotdeleted = "customer.source.deleted".asInstanceOf[typings.stripe.stripeStrings.customerDotsourceDotdeleted]
    
    @scala.inline
    def customerDotsourceDotexpiring: typings.stripe.stripeStrings.customerDotsourceDotexpiring = "customer.source.expiring".asInstanceOf[typings.stripe.stripeStrings.customerDotsourceDotexpiring]
    
    @scala.inline
    def customerDotsourceDotupdated: typings.stripe.stripeStrings.customerDotsourceDotupdated = "customer.source.updated".asInstanceOf[typings.stripe.stripeStrings.customerDotsourceDotupdated]
    
    @scala.inline
    def customerDotsubscriptionDotcreated: typings.stripe.stripeStrings.customerDotsubscriptionDotcreated = "customer.subscription.created".asInstanceOf[typings.stripe.stripeStrings.customerDotsubscriptionDotcreated]
    
    @scala.inline
    def customerDotsubscriptionDotdeleted: typings.stripe.stripeStrings.customerDotsubscriptionDotdeleted = "customer.subscription.deleted".asInstanceOf[typings.stripe.stripeStrings.customerDotsubscriptionDotdeleted]
    
    @scala.inline
    def customerDotsubscriptionDottrial_will_end: typings.stripe.stripeStrings.customerDotsubscriptionDottrial_will_end = "customer.subscription.trial_will_end".asInstanceOf[typings.stripe.stripeStrings.customerDotsubscriptionDottrial_will_end]
    
    @scala.inline
    def customerDotsubscriptionDotupdated: typings.stripe.stripeStrings.customerDotsubscriptionDotupdated = "customer.subscription.updated".asInstanceOf[typings.stripe.stripeStrings.customerDotsubscriptionDotupdated]
    
    @scala.inline
    def customerDottax_idDotcreated: typings.stripe.stripeStrings.customerDottax_idDotcreated = "customer.tax_id.created".asInstanceOf[typings.stripe.stripeStrings.customerDottax_idDotcreated]
    
    @scala.inline
    def customerDottax_idDotdeleted: typings.stripe.stripeStrings.customerDottax_idDotdeleted = "customer.tax_id.deleted".asInstanceOf[typings.stripe.stripeStrings.customerDottax_idDotdeleted]
    
    @scala.inline
    def customerDottax_idDotupdated: typings.stripe.stripeStrings.customerDottax_idDotupdated = "customer.tax_id.updated".asInstanceOf[typings.stripe.stripeStrings.customerDottax_idDotupdated]
    
    @scala.inline
    def customerDotupdated: typings.stripe.stripeStrings.customerDotupdated = "customer.updated".asInstanceOf[typings.stripe.stripeStrings.customerDotupdated]
    
    @scala.inline
    def fileDotcreated: typings.stripe.stripeStrings.fileDotcreated = "file.created".asInstanceOf[typings.stripe.stripeStrings.fileDotcreated]
    
    @scala.inline
    def invoiceDotcreated: typings.stripe.stripeStrings.invoiceDotcreated = "invoice.created".asInstanceOf[typings.stripe.stripeStrings.invoiceDotcreated]
    
    @scala.inline
    def invoiceDotdeleted: typings.stripe.stripeStrings.invoiceDotdeleted = "invoice.deleted".asInstanceOf[typings.stripe.stripeStrings.invoiceDotdeleted]
    
    @scala.inline
    def invoiceDotfinalized: typings.stripe.stripeStrings.invoiceDotfinalized = "invoice.finalized".asInstanceOf[typings.stripe.stripeStrings.invoiceDotfinalized]
    
    @scala.inline
    def invoiceDotmarked_uncollectible: typings.stripe.stripeStrings.invoiceDotmarked_uncollectible = "invoice.marked_uncollectible".asInstanceOf[typings.stripe.stripeStrings.invoiceDotmarked_uncollectible]
    
    @scala.inline
    def invoiceDotpayment_action_required: typings.stripe.stripeStrings.invoiceDotpayment_action_required = "invoice.payment_action_required".asInstanceOf[typings.stripe.stripeStrings.invoiceDotpayment_action_required]
    
    @scala.inline
    def invoiceDotpayment_failed: typings.stripe.stripeStrings.invoiceDotpayment_failed = "invoice.payment_failed".asInstanceOf[typings.stripe.stripeStrings.invoiceDotpayment_failed]
    
    @scala.inline
    def invoiceDotpayment_succeeded: typings.stripe.stripeStrings.invoiceDotpayment_succeeded = "invoice.payment_succeeded".asInstanceOf[typings.stripe.stripeStrings.invoiceDotpayment_succeeded]
    
    @scala.inline
    def invoiceDotsent: typings.stripe.stripeStrings.invoiceDotsent = "invoice.sent".asInstanceOf[typings.stripe.stripeStrings.invoiceDotsent]
    
    @scala.inline
    def invoiceDotupcoming: typings.stripe.stripeStrings.invoiceDotupcoming = "invoice.upcoming".asInstanceOf[typings.stripe.stripeStrings.invoiceDotupcoming]
    
    @scala.inline
    def invoiceDotupdated: typings.stripe.stripeStrings.invoiceDotupdated = "invoice.updated".asInstanceOf[typings.stripe.stripeStrings.invoiceDotupdated]
    
    @scala.inline
    def invoiceDotvoided: typings.stripe.stripeStrings.invoiceDotvoided = "invoice.voided".asInstanceOf[typings.stripe.stripeStrings.invoiceDotvoided]
    
    @scala.inline
    def invoiceitemDotcreated: typings.stripe.stripeStrings.invoiceitemDotcreated = "invoiceitem.created".asInstanceOf[typings.stripe.stripeStrings.invoiceitemDotcreated]
    
    @scala.inline
    def invoiceitemDotdeleted: typings.stripe.stripeStrings.invoiceitemDotdeleted = "invoiceitem.deleted".asInstanceOf[typings.stripe.stripeStrings.invoiceitemDotdeleted]
    
    @scala.inline
    def invoiceitemDotupdated: typings.stripe.stripeStrings.invoiceitemDotupdated = "invoiceitem.updated".asInstanceOf[typings.stripe.stripeStrings.invoiceitemDotupdated]
    
    @scala.inline
    def issuing_authorizationDotcreated: typings.stripe.stripeStrings.issuing_authorizationDotcreated = "issuing_authorization.created".asInstanceOf[typings.stripe.stripeStrings.issuing_authorizationDotcreated]
    
    @scala.inline
    def issuing_authorizationDotrequest: typings.stripe.stripeStrings.issuing_authorizationDotrequest = "issuing_authorization.request".asInstanceOf[typings.stripe.stripeStrings.issuing_authorizationDotrequest]
    
    @scala.inline
    def issuing_authorizationDotupdated: typings.stripe.stripeStrings.issuing_authorizationDotupdated = "issuing_authorization.updated".asInstanceOf[typings.stripe.stripeStrings.issuing_authorizationDotupdated]
    
    @scala.inline
    def issuing_cardDotcreated: typings.stripe.stripeStrings.issuing_cardDotcreated = "issuing_card.created".asInstanceOf[typings.stripe.stripeStrings.issuing_cardDotcreated]
    
    @scala.inline
    def issuing_cardDotupdated: typings.stripe.stripeStrings.issuing_cardDotupdated = "issuing_card.updated".asInstanceOf[typings.stripe.stripeStrings.issuing_cardDotupdated]
    
    @scala.inline
    def issuing_cardholderDotcreated: typings.stripe.stripeStrings.issuing_cardholderDotcreated = "issuing_cardholder.created".asInstanceOf[typings.stripe.stripeStrings.issuing_cardholderDotcreated]
    
    @scala.inline
    def issuing_cardholderDotupdated: typings.stripe.stripeStrings.issuing_cardholderDotupdated = "issuing_cardholder.updated".asInstanceOf[typings.stripe.stripeStrings.issuing_cardholderDotupdated]
    
    @scala.inline
    def issuing_disputeDotcreated: typings.stripe.stripeStrings.issuing_disputeDotcreated = "issuing_dispute.created".asInstanceOf[typings.stripe.stripeStrings.issuing_disputeDotcreated]
    
    @scala.inline
    def issuing_disputeDotupdated: typings.stripe.stripeStrings.issuing_disputeDotupdated = "issuing_dispute.updated".asInstanceOf[typings.stripe.stripeStrings.issuing_disputeDotupdated]
    
    @scala.inline
    def issuing_settlementDotcreated: typings.stripe.stripeStrings.issuing_settlementDotcreated = "issuing_settlement.created".asInstanceOf[typings.stripe.stripeStrings.issuing_settlementDotcreated]
    
    @scala.inline
    def issuing_settlementDotupdated: typings.stripe.stripeStrings.issuing_settlementDotupdated = "issuing_settlement.updated".asInstanceOf[typings.stripe.stripeStrings.issuing_settlementDotupdated]
    
    @scala.inline
    def issuing_transactionDotcreated: typings.stripe.stripeStrings.issuing_transactionDotcreated = "issuing_transaction.created".asInstanceOf[typings.stripe.stripeStrings.issuing_transactionDotcreated]
    
    @scala.inline
    def issuing_transactionDotupdated: typings.stripe.stripeStrings.issuing_transactionDotupdated = "issuing_transaction.updated".asInstanceOf[typings.stripe.stripeStrings.issuing_transactionDotupdated]
    
    @scala.inline
    def mandateDotupdated: typings.stripe.stripeStrings.mandateDotupdated = "mandate.updated".asInstanceOf[typings.stripe.stripeStrings.mandateDotupdated]
    
    @scala.inline
    def orderDotcreated: typings.stripe.stripeStrings.orderDotcreated = "order.created".asInstanceOf[typings.stripe.stripeStrings.orderDotcreated]
    
    @scala.inline
    def orderDotpayment_failed: typings.stripe.stripeStrings.orderDotpayment_failed = "order.payment_failed".asInstanceOf[typings.stripe.stripeStrings.orderDotpayment_failed]
    
    @scala.inline
    def orderDotpayment_succeeded: typings.stripe.stripeStrings.orderDotpayment_succeeded = "order.payment_succeeded".asInstanceOf[typings.stripe.stripeStrings.orderDotpayment_succeeded]
    
    @scala.inline
    def orderDotupdated: typings.stripe.stripeStrings.orderDotupdated = "order.updated".asInstanceOf[typings.stripe.stripeStrings.orderDotupdated]
    
    @scala.inline
    def order_returnDotcreated: typings.stripe.stripeStrings.order_returnDotcreated = "order_return.created".asInstanceOf[typings.stripe.stripeStrings.order_returnDotcreated]
    
    @scala.inline
    def payment_intentDotamount_capturable_updated: typings.stripe.stripeStrings.payment_intentDotamount_capturable_updated = "payment_intent.amount_capturable_updated".asInstanceOf[typings.stripe.stripeStrings.payment_intentDotamount_capturable_updated]
    
    @scala.inline
    def payment_intentDotcanceled: typings.stripe.stripeStrings.payment_intentDotcanceled = "payment_intent.canceled".asInstanceOf[typings.stripe.stripeStrings.payment_intentDotcanceled]
    
    @scala.inline
    def payment_intentDotcreated: typings.stripe.stripeStrings.payment_intentDotcreated = "payment_intent.created".asInstanceOf[typings.stripe.stripeStrings.payment_intentDotcreated]
    
    @scala.inline
    def payment_intentDotpayment_failed: typings.stripe.stripeStrings.payment_intentDotpayment_failed = "payment_intent.payment_failed".asInstanceOf[typings.stripe.stripeStrings.payment_intentDotpayment_failed]
    
    @scala.inline
    def payment_intentDotsucceeded: typings.stripe.stripeStrings.payment_intentDotsucceeded = "payment_intent.succeeded".asInstanceOf[typings.stripe.stripeStrings.payment_intentDotsucceeded]
    
    @scala.inline
    def payment_methodDotattached: typings.stripe.stripeStrings.payment_methodDotattached = "payment_method.attached".asInstanceOf[typings.stripe.stripeStrings.payment_methodDotattached]
    
    @scala.inline
    def payment_methodDotcard_automatically_updated: typings.stripe.stripeStrings.payment_methodDotcard_automatically_updated = "payment_method.card_automatically_updated".asInstanceOf[typings.stripe.stripeStrings.payment_methodDotcard_automatically_updated]
    
    @scala.inline
    def payment_methodDotdetached: typings.stripe.stripeStrings.payment_methodDotdetached = "payment_method.detached".asInstanceOf[typings.stripe.stripeStrings.payment_methodDotdetached]
    
    @scala.inline
    def payment_methodDotupdated: typings.stripe.stripeStrings.payment_methodDotupdated = "payment_method.updated".asInstanceOf[typings.stripe.stripeStrings.payment_methodDotupdated]
    
    @scala.inline
    def payoutDotcanceled: typings.stripe.stripeStrings.payoutDotcanceled = "payout.canceled".asInstanceOf[typings.stripe.stripeStrings.payoutDotcanceled]
    
    @scala.inline
    def payoutDotcreated: typings.stripe.stripeStrings.payoutDotcreated = "payout.created".asInstanceOf[typings.stripe.stripeStrings.payoutDotcreated]
    
    @scala.inline
    def payoutDotfailed: typings.stripe.stripeStrings.payoutDotfailed = "payout.failed".asInstanceOf[typings.stripe.stripeStrings.payoutDotfailed]
    
    @scala.inline
    def payoutDotpaid: typings.stripe.stripeStrings.payoutDotpaid = "payout.paid".asInstanceOf[typings.stripe.stripeStrings.payoutDotpaid]
    
    @scala.inline
    def payoutDotupdated: typings.stripe.stripeStrings.payoutDotupdated = "payout.updated".asInstanceOf[typings.stripe.stripeStrings.payoutDotupdated]
    
    @scala.inline
    def personDotcreated: typings.stripe.stripeStrings.personDotcreated = "person.created".asInstanceOf[typings.stripe.stripeStrings.personDotcreated]
    
    @scala.inline
    def personDotdeleted: typings.stripe.stripeStrings.personDotdeleted = "person.deleted".asInstanceOf[typings.stripe.stripeStrings.personDotdeleted]
    
    @scala.inline
    def personDotupdated: typings.stripe.stripeStrings.personDotupdated = "person.updated".asInstanceOf[typings.stripe.stripeStrings.personDotupdated]
    
    @scala.inline
    def planDotcreated: typings.stripe.stripeStrings.planDotcreated = "plan.created".asInstanceOf[typings.stripe.stripeStrings.planDotcreated]
    
    @scala.inline
    def planDotdeleted: typings.stripe.stripeStrings.planDotdeleted = "plan.deleted".asInstanceOf[typings.stripe.stripeStrings.planDotdeleted]
    
    @scala.inline
    def planDotupdated: typings.stripe.stripeStrings.planDotupdated = "plan.updated".asInstanceOf[typings.stripe.stripeStrings.planDotupdated]
    
    @scala.inline
    def productDotcreated: typings.stripe.stripeStrings.productDotcreated = "product.created".asInstanceOf[typings.stripe.stripeStrings.productDotcreated]
    
    @scala.inline
    def productDotdeleted: typings.stripe.stripeStrings.productDotdeleted = "product.deleted".asInstanceOf[typings.stripe.stripeStrings.productDotdeleted]
    
    @scala.inline
    def productDotupdated: typings.stripe.stripeStrings.productDotupdated = "product.updated".asInstanceOf[typings.stripe.stripeStrings.productDotupdated]
    
    @scala.inline
    def radarDotearly_fraud_warningDotcreated: typings.stripe.stripeStrings.radarDotearly_fraud_warningDotcreated = "radar.early_fraud_warning.created".asInstanceOf[typings.stripe.stripeStrings.radarDotearly_fraud_warningDotcreated]
    
    @scala.inline
    def radarDotearly_fraud_warningDotupdated: typings.stripe.stripeStrings.radarDotearly_fraud_warningDotupdated = "radar.early_fraud_warning.updated".asInstanceOf[typings.stripe.stripeStrings.radarDotearly_fraud_warningDotupdated]
    
    @scala.inline
    def recipientDotcreated: typings.stripe.stripeStrings.recipientDotcreated = "recipient.created".asInstanceOf[typings.stripe.stripeStrings.recipientDotcreated]
    
    @scala.inline
    def recipientDotdeleted: typings.stripe.stripeStrings.recipientDotdeleted = "recipient.deleted".asInstanceOf[typings.stripe.stripeStrings.recipientDotdeleted]
    
    @scala.inline
    def recipientDotupdated: typings.stripe.stripeStrings.recipientDotupdated = "recipient.updated".asInstanceOf[typings.stripe.stripeStrings.recipientDotupdated]
    
    @scala.inline
    def reportingDotreport_runDotfailed: typings.stripe.stripeStrings.reportingDotreport_runDotfailed = "reporting.report_run.failed".asInstanceOf[typings.stripe.stripeStrings.reportingDotreport_runDotfailed]
    
    @scala.inline
    def reportingDotreport_runDotsucceeded: typings.stripe.stripeStrings.reportingDotreport_runDotsucceeded = "reporting.report_run.succeeded".asInstanceOf[typings.stripe.stripeStrings.reportingDotreport_runDotsucceeded]
    
    @scala.inline
    def reportingDotreport_typeDotupdated: typings.stripe.stripeStrings.reportingDotreport_typeDotupdated = "reporting.report_type.updated".asInstanceOf[typings.stripe.stripeStrings.reportingDotreport_typeDotupdated]
    
    @scala.inline
    def reviewDotclosed: typings.stripe.stripeStrings.reviewDotclosed = "review.closed".asInstanceOf[typings.stripe.stripeStrings.reviewDotclosed]
    
    @scala.inline
    def reviewDotopened: typings.stripe.stripeStrings.reviewDotopened = "review.opened".asInstanceOf[typings.stripe.stripeStrings.reviewDotopened]
    
    @scala.inline
    def setup_intentDotcanceled: typings.stripe.stripeStrings.setup_intentDotcanceled = "setup_intent.canceled".asInstanceOf[typings.stripe.stripeStrings.setup_intentDotcanceled]
    
    @scala.inline
    def setup_intentDotcreated: typings.stripe.stripeStrings.setup_intentDotcreated = "setup_intent.created".asInstanceOf[typings.stripe.stripeStrings.setup_intentDotcreated]
    
    @scala.inline
    def setup_intentDotsetup_failed: typings.stripe.stripeStrings.setup_intentDotsetup_failed = "setup_intent.setup_failed".asInstanceOf[typings.stripe.stripeStrings.setup_intentDotsetup_failed]
    
    @scala.inline
    def setup_intentDotsucceeded: typings.stripe.stripeStrings.setup_intentDotsucceeded = "setup_intent.succeeded".asInstanceOf[typings.stripe.stripeStrings.setup_intentDotsucceeded]
    
    @scala.inline
    def sigmaDotscheduled_query_runDotcreated: typings.stripe.stripeStrings.sigmaDotscheduled_query_runDotcreated = "sigma.scheduled_query_run.created".asInstanceOf[typings.stripe.stripeStrings.sigmaDotscheduled_query_runDotcreated]
    
    @scala.inline
    def skuDotcreated: typings.stripe.stripeStrings.skuDotcreated = "sku.created".asInstanceOf[typings.stripe.stripeStrings.skuDotcreated]
    
    @scala.inline
    def skuDotdeleted: typings.stripe.stripeStrings.skuDotdeleted = "sku.deleted".asInstanceOf[typings.stripe.stripeStrings.skuDotdeleted]
    
    @scala.inline
    def skuDotupdated: typings.stripe.stripeStrings.skuDotupdated = "sku.updated".asInstanceOf[typings.stripe.stripeStrings.skuDotupdated]
    
    @scala.inline
    def sourceDotcanceled: typings.stripe.stripeStrings.sourceDotcanceled = "source.canceled".asInstanceOf[typings.stripe.stripeStrings.sourceDotcanceled]
    
    @scala.inline
    def sourceDotchargeable: typings.stripe.stripeStrings.sourceDotchargeable = "source.chargeable".asInstanceOf[typings.stripe.stripeStrings.sourceDotchargeable]
    
    @scala.inline
    def sourceDotfailed: typings.stripe.stripeStrings.sourceDotfailed = "source.failed".asInstanceOf[typings.stripe.stripeStrings.sourceDotfailed]
    
    @scala.inline
    def sourceDotmandate_notification: typings.stripe.stripeStrings.sourceDotmandate_notification = "source.mandate_notification".asInstanceOf[typings.stripe.stripeStrings.sourceDotmandate_notification]
    
    @scala.inline
    def sourceDotrefund_attributes_required: typings.stripe.stripeStrings.sourceDotrefund_attributes_required = "source.refund_attributes_required".asInstanceOf[typings.stripe.stripeStrings.sourceDotrefund_attributes_required]
    
    @scala.inline
    def sourceDottransactionDotcreated: typings.stripe.stripeStrings.sourceDottransactionDotcreated = "source.transaction.created".asInstanceOf[typings.stripe.stripeStrings.sourceDottransactionDotcreated]
    
    @scala.inline
    def sourceDottransactionDotupdated: typings.stripe.stripeStrings.sourceDottransactionDotupdated = "source.transaction.updated".asInstanceOf[typings.stripe.stripeStrings.sourceDottransactionDotupdated]
    
    @scala.inline
    def subscription_scheduleDotaborted: typings.stripe.stripeStrings.subscription_scheduleDotaborted = "subscription_schedule.aborted".asInstanceOf[typings.stripe.stripeStrings.subscription_scheduleDotaborted]
    
    @scala.inline
    def subscription_scheduleDotcanceled: typings.stripe.stripeStrings.subscription_scheduleDotcanceled = "subscription_schedule.canceled".asInstanceOf[typings.stripe.stripeStrings.subscription_scheduleDotcanceled]
    
    @scala.inline
    def subscription_scheduleDotcompleted: typings.stripe.stripeStrings.subscription_scheduleDotcompleted = "subscription_schedule.completed".asInstanceOf[typings.stripe.stripeStrings.subscription_scheduleDotcompleted]
    
    @scala.inline
    def subscription_scheduleDotcreated: typings.stripe.stripeStrings.subscription_scheduleDotcreated = "subscription_schedule.created".asInstanceOf[typings.stripe.stripeStrings.subscription_scheduleDotcreated]
    
    @scala.inline
    def subscription_scheduleDotexpiring: typings.stripe.stripeStrings.subscription_scheduleDotexpiring = "subscription_schedule.expiring".asInstanceOf[typings.stripe.stripeStrings.subscription_scheduleDotexpiring]
    
    @scala.inline
    def subscription_scheduleDotreleased: typings.stripe.stripeStrings.subscription_scheduleDotreleased = "subscription_schedule.released".asInstanceOf[typings.stripe.stripeStrings.subscription_scheduleDotreleased]
    
    @scala.inline
    def subscription_scheduleDotupdated: typings.stripe.stripeStrings.subscription_scheduleDotupdated = "subscription_schedule.updated".asInstanceOf[typings.stripe.stripeStrings.subscription_scheduleDotupdated]
    
    @scala.inline
    def tax_rateDotcreated: typings.stripe.stripeStrings.tax_rateDotcreated = "tax_rate.created".asInstanceOf[typings.stripe.stripeStrings.tax_rateDotcreated]
    
    @scala.inline
    def tax_rateDotupdated: typings.stripe.stripeStrings.tax_rateDotupdated = "tax_rate.updated".asInstanceOf[typings.stripe.stripeStrings.tax_rateDotupdated]
    
    @scala.inline
    def topupDotcreated: typings.stripe.stripeStrings.topupDotcreated = "topup.created".asInstanceOf[typings.stripe.stripeStrings.topupDotcreated]
    
    @scala.inline
    def topupDotfailed: typings.stripe.stripeStrings.topupDotfailed = "topup.failed".asInstanceOf[typings.stripe.stripeStrings.topupDotfailed]
    
    @scala.inline
    def topupDotreversed: typings.stripe.stripeStrings.topupDotreversed = "topup.reversed".asInstanceOf[typings.stripe.stripeStrings.topupDotreversed]
    
    @scala.inline
    def topupDotsucceeded: typings.stripe.stripeStrings.topupDotsucceeded = "topup.succeeded".asInstanceOf[typings.stripe.stripeStrings.topupDotsucceeded]
    
    @scala.inline
    def transferDotcreated: typings.stripe.stripeStrings.transferDotcreated = "transfer.created".asInstanceOf[typings.stripe.stripeStrings.transferDotcreated]
    
    @scala.inline
    def transferDotfailed: typings.stripe.stripeStrings.transferDotfailed = "transfer.failed".asInstanceOf[typings.stripe.stripeStrings.transferDotfailed]
    
    @scala.inline
    def transferDotpaid: typings.stripe.stripeStrings.transferDotpaid = "transfer.paid".asInstanceOf[typings.stripe.stripeStrings.transferDotpaid]
    
    @scala.inline
    def transferDotreversed: typings.stripe.stripeStrings.transferDotreversed = "transfer.reversed".asInstanceOf[typings.stripe.stripeStrings.transferDotreversed]
    
    @scala.inline
    def transferDotupdated: typings.stripe.stripeStrings.transferDotupdated = "transfer.updated".asInstanceOf[typings.stripe.stripeStrings.transferDotupdated]
  }
  
  @js.native
  trait IEvent extends IResourceObject {
    
    /**
      * The connected account that originated the event.
      * CONNECT ONLY
      */
    var account: js.UndefOr[String] = js.native
    
    /**
      * The Stripe API version used to render data.
      * Note: this property is populated for events on or after October 31, 2014.
      */
    var api_version: String = js.native
    
    var created: Double = js.native
    
    /**
      * Hash containing data associated with the event.
      */
    var data: Previousattributes = js.native
    
    var livemode: Boolean = js.native
    
    /**
      * Value is "event"
      */
    @JSName("object")
    var object_IEvent: event = js.native
    
    /**
      * Number of webhooks yet to be delivered successfully (return a 20x response) to the URLs you’ve specified.
      *
      * positive integer or zero
      */
    var pending_webhooks: Double = js.native
    
    /**
      * Information on the API request that instigated the event.
      */
    var request: Id = js.native
    
    /**
      * Description of the event: e.g. invoice.created, charge.refunded, etc.
      */
    var `type`: String = js.native
  }
  object IEvent {
    
    @scala.inline
    def apply(
      api_version: String,
      created: Double,
      data: Previousattributes,
      id: String,
      livemode: Boolean,
      `object`: event,
      pending_webhooks: Double,
      request: Id,
      `type`: String
    ): IEvent = {
      val __obj = js.Dynamic.literal(api_version = api_version.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], pending_webhooks = pending_webhooks.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEvent]
    }
    
    @scala.inline
    implicit class IEventMutableBuilder[Self <: IEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      @scala.inline
      def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: Previousattributes): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: event): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending_webhooks(value: Double): Self = StObject.set(x, "pending_webhooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: Id): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IEventListOptions extends IListOptionsCreated {
    
    /**
      * A string containing a specific event name, or group of events using * as a
      * wildcard. The list will be filtered to include only events with a matching
      * event property
      */
    var `type`: String = js.native
  }
  object IEventListOptions {
    
    @scala.inline
    def apply(`type`: String): IEventListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEventListOptions]
    }
    
    @scala.inline
    implicit class IEventListOptionsMutableBuilder[Self <: IEventListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
