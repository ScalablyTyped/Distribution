package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserReportedConcern extends StObject {
  
  /**
    * Category of the concern
    */
  var category: ConcernCategory
  
  /**
    * User comment associated with the report
    */
  var concernText: String
  
  /**
    * Id of the review which was reported
    */
  var reviewId: Double
  
  /**
    * Date the report was submitted
    */
  var submittedDate: js.Date
  
  /**
    * Id of the user who reported a review
    */
  var userId: String
}
object UserReportedConcern {
  
  inline def apply(
    category: ConcernCategory,
    concernText: String,
    reviewId: Double,
    submittedDate: js.Date,
    userId: String
  ): UserReportedConcern = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], concernText = concernText.asInstanceOf[js.Any], reviewId = reviewId.asInstanceOf[js.Any], submittedDate = submittedDate.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserReportedConcern]
  }
  
  extension [Self <: UserReportedConcern](x: Self) {
    
    inline def setCategory(value: ConcernCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setConcernText(value: String): Self = StObject.set(x, "concernText", value.asInstanceOf[js.Any])
    
    inline def setReviewId(value: Double): Self = StObject.set(x, "reviewId", value.asInstanceOf[js.Any])
    
    inline def setSubmittedDate(value: js.Date): Self = StObject.set(x, "submittedDate", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
