package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReviewsResult extends StObject {
  
  /**
    * Flag indicating if there are more reviews to be shown (for paging)
    */
  var hasMoreReviews: Boolean
  
  /**
    * List of reviews
    */
  var reviews: js.Array[Review]
  
  /**
    * Count of total review items
    */
  var totalReviewCount: Double
}
object ReviewsResult {
  
  inline def apply(hasMoreReviews: Boolean, reviews: js.Array[Review], totalReviewCount: Double): ReviewsResult = {
    val __obj = js.Dynamic.literal(hasMoreReviews = hasMoreReviews.asInstanceOf[js.Any], reviews = reviews.asInstanceOf[js.Any], totalReviewCount = totalReviewCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewsResult]
  }
  
  extension [Self <: ReviewsResult](x: Self) {
    
    inline def setHasMoreReviews(value: Boolean): Self = StObject.set(x, "hasMoreReviews", value.asInstanceOf[js.Any])
    
    inline def setReviews(value: js.Array[Review]): Self = StObject.set(x, "reviews", value.asInstanceOf[js.Any])
    
    inline def setReviewsVarargs(value: Review*): Self = StObject.set(x, "reviews", js.Array(value :_*))
    
    inline def setTotalReviewCount(value: Double): Self = StObject.set(x, "totalReviewCount", value.asInstanceOf[js.Any])
  }
}
