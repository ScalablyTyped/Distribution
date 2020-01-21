package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisputeexplanation extends js.Object {
  /**
    * Brief freeform text explaining why you are disputing this transaction.
    */
  var dispute_explanation: String
  /**
    * (ID of a file upload) Additional file evidence supporting your dispute.
    */
  var uncategorized_file: String
}

object AnonDisputeexplanation {
  @scala.inline
  def apply(dispute_explanation: String, uncategorized_file: String): AnonDisputeexplanation = {
    val __obj = js.Dynamic.literal(dispute_explanation = dispute_explanation.asInstanceOf[js.Any], uncategorized_file = uncategorized_file.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDisputeexplanation]
  }
}

