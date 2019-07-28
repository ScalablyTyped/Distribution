package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dueby extends js.Object {
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

object Anon_Dueby {
  @scala.inline
  def apply(due_by: Double, has_evidence: Boolean, past_due: Boolean, submission_count: Double): Anon_Dueby = {
    val __obj = js.Dynamic.literal(due_by = due_by, has_evidence = has_evidence, past_due = past_due, submission_count = submission_count)
  
    __obj.asInstanceOf[Anon_Dueby]
  }
}

