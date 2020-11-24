package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disputeexplanation extends js.Object {
  
  /**
    * Brief freeform text explaining why you are disputing this transaction.
    */
  var dispute_explanation: String = js.native
  
  /**
    * (ID of a file upload) Additional file evidence supporting your dispute.
    */
  var uncategorized_file: String = js.native
}
object Disputeexplanation {
  
  @scala.inline
  def apply(dispute_explanation: String, uncategorized_file: String): Disputeexplanation = {
    val __obj = js.Dynamic.literal(dispute_explanation = dispute_explanation.asInstanceOf[js.Any], uncategorized_file = uncategorized_file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disputeexplanation]
  }
  
  @scala.inline
  implicit class DisputeexplanationOps[Self <: Disputeexplanation] (val x: Self) extends AnyVal {
    
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
    def setDispute_explanation(value: String): Self = this.set("dispute_explanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncategorized_file(value: String): Self = this.set("uncategorized_file", value.asInstanceOf[js.Any])
  }
}
