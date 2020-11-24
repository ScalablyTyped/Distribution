package typings.stripe.mod.issuing.disputes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIssuingDisputeCreateOptions extends IIssuingDisputeUpdateOptions {
  
  /**
    * Amount to dispute, defaults to full value, given in the currency the transaction was made in.
    */
  var amount: js.UndefOr[Double] = js.native
  
  /**
    * The ID of the issuing transaction to create a dispute for.
    */
  var disputed_transaction: String = js.native
  
  /**
    * A hash containing all the evidence related to the dispute. This should have a single key, equal to the provided reason, mapping to an appropriate evidence object.
    */
  var evidence: js.UndefOr[IIssuingDisputeEvidence] = js.native
  
  /**
    * The reason for the dispute. One of other or fraudulent.
    */
  var reason: IssuingDisputeReason = js.native
}
object IIssuingDisputeCreateOptions {
  
  @scala.inline
  def apply(disputed_transaction: String, reason: IssuingDisputeReason): IIssuingDisputeCreateOptions = {
    val __obj = js.Dynamic.literal(disputed_transaction = disputed_transaction.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingDisputeCreateOptions]
  }
  
  @scala.inline
  implicit class IIssuingDisputeCreateOptionsOps[Self <: IIssuingDisputeCreateOptions] (val x: Self) extends AnyVal {
    
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
    def setDisputed_transaction(value: String): Self = this.set("disputed_transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: IssuingDisputeReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setEvidence(value: IIssuingDisputeEvidence): Self = this.set("evidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvidence: Self = this.set("evidence", js.undefined)
  }
}
