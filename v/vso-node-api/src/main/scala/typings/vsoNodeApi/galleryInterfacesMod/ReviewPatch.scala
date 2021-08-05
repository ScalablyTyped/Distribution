package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReviewPatch extends StObject {
  
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
  
  inline def apply(operation: ReviewPatchOperation, reportedConcern: UserReportedConcern, reviewItem: Review): ReviewPatch = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], reportedConcern = reportedConcern.asInstanceOf[js.Any], reviewItem = reviewItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewPatch]
  }
  
  extension [Self <: ReviewPatch](x: Self) {
    
    inline def setOperation(value: ReviewPatchOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setReportedConcern(value: UserReportedConcern): Self = StObject.set(x, "reportedConcern", value.asInstanceOf[js.Any])
    
    inline def setReviewItem(value: Review): Self = StObject.set(x, "reviewItem", value.asInstanceOf[js.Any])
  }
}
