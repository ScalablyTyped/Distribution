package typings.stripe.mod.issuing.disputes

import typings.stripe.anon.Disputeexplanation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIssuingDisputeEvidence extends js.Object {
  /**
    * Evidence to support a fraudulent dispute. This will only be present if your dispute’s reason is fraudulent.
    */
  var fraudulent: js.UndefOr[Disputeexplanation] = js.native
  var other: js.UndefOr[Disputeexplanation] = js.native
}

object IIssuingDisputeEvidence {
  @scala.inline
  def apply(): IIssuingDisputeEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIssuingDisputeEvidence]
  }
  @scala.inline
  implicit class IIssuingDisputeEvidenceOps[Self <: IIssuingDisputeEvidence] (val x: Self) extends AnyVal {
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
    def setFraudulent(value: Disputeexplanation): Self = this.set("fraudulent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFraudulent: Self = this.set("fraudulent", js.undefined)
    @scala.inline
    def setOther(value: Disputeexplanation): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOther: Self = this.set("other", js.undefined)
  }
  
}

