package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReviewPatch extends js.Object {
  
  /**
    * Denotes the patch operation type
    */
  var operation: ReviewPatchOperation = js.native
  
  /**
    * Use when patch operation is FlagReview
    */
  var reportedConcern: UserReportedConcern = js.native
  
  /**
    * Use when patch operation is EditReview
    */
  var reviewItem: Review = js.native
}
object ReviewPatch {
  
  @scala.inline
  def apply(operation: ReviewPatchOperation, reportedConcern: UserReportedConcern, reviewItem: Review): ReviewPatch = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], reportedConcern = reportedConcern.asInstanceOf[js.Any], reviewItem = reviewItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewPatch]
  }
  
  @scala.inline
  implicit class ReviewPatchOps[Self <: ReviewPatch] (val x: Self) extends AnyVal {
    
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
    def setOperation(value: ReviewPatchOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportedConcern(value: UserReportedConcern): Self = this.set("reportedConcern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewItem(value: Review): Self = this.set("reviewItem", value.asInstanceOf[js.Any])
  }
}
