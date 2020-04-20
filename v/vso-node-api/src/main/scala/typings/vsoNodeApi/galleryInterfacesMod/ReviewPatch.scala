package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewPatch extends js.Object {
  /**
    * Denotes the patch operation type
    */
  var operation: ReviewPatchOperation
  /**
    * Use when patch operation is FlagReview
    */
  var reportedConcern: UserReportedConcern
  /**
    * Use when patch operation is EditReview
    */
  var reviewItem: Review
}

object ReviewPatch {
  @scala.inline
  def apply(operation: ReviewPatchOperation, reportedConcern: UserReportedConcern, reviewItem: Review): ReviewPatch = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], reportedConcern = reportedConcern.asInstanceOf[js.Any], reviewItem = reviewItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewPatch]
  }
}

