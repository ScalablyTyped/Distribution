package typings.stripe.mod.issuing.disputes

import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIssuingDisputeCreateOptions extends IIssuingDisputeUpdateOptions {
  /**
    * Amount to dispute, defaults to full value, given in the currency the transaction was made in.
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * The ID of the issuing transaction to create a dispute for.
    */
  var disputed_transaction: String
  /**
    * A hash containing all the evidence related to the dispute. This should have a single key, equal to the provided reason, mapping to an appropriate evidence object.
    */
  var evidence: js.UndefOr[IIssuingDisputeEvidence] = js.undefined
  /**
    * The reason for the dispute. One of other or fraudulent.
    */
  var reason: IssuingDisputeReason
}

object IIssuingDisputeCreateOptions {
  @scala.inline
  def apply(
    disputed_transaction: String,
    reason: IssuingDisputeReason,
    amount: Int | Double = null,
    evidence: IIssuingDisputeEvidence = null,
    metadata: IOptionsMetadata = null
  ): IIssuingDisputeCreateOptions = {
    val __obj = js.Dynamic.literal(disputed_transaction = disputed_transaction.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (evidence != null) __obj.updateDynamic("evidence")(evidence.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingDisputeCreateOptions]
  }
}

