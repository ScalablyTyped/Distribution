package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dueby extends StObject {
  
  /**
    * Date by which evidence must be submitted in order to successfully challenge dispute. Will be null
    * if the customer's bank or credit card company doesn't allow a response for this particular dispute.
    */
  var due_by: Double
  
  /**
    * Whether or not evidence has been saved for this dispute.
    */
  var has_evidence: Boolean
  
  /**
    * Whether or not the last evidence submission was submitted past the due date. Defaults to false
    * if no evidence submissions have occurred. If true, then delivery of the latest evidence is not guaranteed.
    */
  var past_due: Boolean
  
  /**
    * The number of times the evidence has been submitted. You may submit evidence a maximum of 5 times
    */
  var submission_count: Double
}
object Dueby {
  
  inline def apply(due_by: Double, has_evidence: Boolean, past_due: Boolean, submission_count: Double): Dueby = {
    val __obj = js.Dynamic.literal(due_by = due_by.asInstanceOf[js.Any], has_evidence = has_evidence.asInstanceOf[js.Any], past_due = past_due.asInstanceOf[js.Any], submission_count = submission_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dueby]
  }
  
  extension [Self <: Dueby](x: Self) {
    
    inline def setDue_by(value: Double): Self = StObject.set(x, "due_by", value.asInstanceOf[js.Any])
    
    inline def setHas_evidence(value: Boolean): Self = StObject.set(x, "has_evidence", value.asInstanceOf[js.Any])
    
    inline def setPast_due(value: Boolean): Self = StObject.set(x, "past_due", value.asInstanceOf[js.Any])
    
    inline def setSubmission_count(value: Double): Self = StObject.set(x, "submission_count", value.asInstanceOf[js.Any])
  }
}
