package typings.stripe.stripeMod.issuing.disputes

import typings.stripe.Anon_Disputeexplanation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIssuingDisputeEvidence extends js.Object {
  /**
    * Evidence to support a fraudulent dispute. This will only be present if your dispute’s reason is fraudulent.
    */
  var fraudulent: js.UndefOr[Anon_Disputeexplanation] = js.undefined
  var other: js.UndefOr[Anon_Disputeexplanation] = js.undefined
}

object IIssuingDisputeEvidence {
  @scala.inline
  def apply(fraudulent: Anon_Disputeexplanation = null, other: Anon_Disputeexplanation = null): IIssuingDisputeEvidence = {
    val __obj = js.Dynamic.literal()
    if (fraudulent != null) __obj.updateDynamic("fraudulent")(fraudulent.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingDisputeEvidence]
  }
}

