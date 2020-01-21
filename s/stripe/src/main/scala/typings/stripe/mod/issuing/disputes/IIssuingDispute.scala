package typings.stripe.mod.issuing.disputes

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.issuing.transactions.ITransaction
import typings.stripe.stripeStrings.issuingDotdispute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * As a card issuer, you can dispute transactions that you do not recognize, suspect to be fraudulent, or have some other issue.
  */
trait IIssuingDispute extends IResourceObject {
  /**
    * Disputed amount. Usually the amount of the disputed_transaction, but can differ (usually because of currency fluctuation or because only part of the order is disputed).
    */
  var amount: Double
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * The currency the disputed_transaction was made in.
    */
  var currency: String
  /**
    * The transaction being disputed.
    */
  var disputed_transaction: String | ITransaction
  /**
    * Evidence related to the dispute. This hash will contain exactly one non-null value, containing an evidence object that matches its reason
    */
  var evidence: IIssuingDisputeEvidence
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: Boolean
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to metadata.
    */
  var metadata: IMetadata
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  @JSName("object")
  var object_IIssuingDispute: issuingDotdispute
  /**
    * Reason for this dispute. One of other or fraudulent.
    */
  var reason: IssuingDisputeReason
  /**
    * Current status of dispute. One of lost, under_review, unsubmitted, or won.
    */
  var status: IssuingDisputeStatus
}

object IIssuingDispute {
  @scala.inline
  def apply(
    amount: Double,
    created: Double,
    currency: String,
    disputed_transaction: String | ITransaction,
    evidence: IIssuingDisputeEvidence,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: issuingDotdispute,
    reason: IssuingDisputeReason,
    status: IssuingDisputeStatus
  ): IIssuingDispute = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], disputed_transaction = disputed_transaction.asInstanceOf[js.Any], evidence = evidence.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingDispute]
  }
}

