package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReviewPatch extends StObject {
  
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
  implicit class ReviewPatchMutableBuilder[Self <: ReviewPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: ReviewPatchOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportedConcern(value: UserReportedConcern): Self = StObject.set(x, "reportedConcern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewItem(value: Review): Self = StObject.set(x, "reviewItem", value.asInstanceOf[js.Any])
  }
}
