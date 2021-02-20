package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disputeexplanation extends StObject {
  
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
  implicit class DisputeexplanationMutableBuilder[Self <: Disputeexplanation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispute_explanation(value: String): Self = StObject.set(x, "dispute_explanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncategorized_file(value: String): Self = StObject.set(x, "uncategorized_file", value.asInstanceOf[js.Any])
  }
}
