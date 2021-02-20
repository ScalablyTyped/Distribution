package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReviewsResult extends StObject {
  
  /**
    * Flag indicating if there are more reviews to be shown (for paging)
    */
  var hasMoreReviews: Boolean = js.native
  
  /**
    * List of reviews
    */
  var reviews: js.Array[Review] = js.native
  
  /**
    * Count of total review items
    */
  var totalReviewCount: Double = js.native
}
object ReviewsResult {
  
  @scala.inline
  def apply(hasMoreReviews: Boolean, reviews: js.Array[Review], totalReviewCount: Double): ReviewsResult = {
    val __obj = js.Dynamic.literal(hasMoreReviews = hasMoreReviews.asInstanceOf[js.Any], reviews = reviews.asInstanceOf[js.Any], totalReviewCount = totalReviewCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewsResult]
  }
  
  @scala.inline
  implicit class ReviewsResultMutableBuilder[Self <: ReviewsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasMoreReviews(value: Boolean): Self = StObject.set(x, "hasMoreReviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviews(value: js.Array[Review]): Self = StObject.set(x, "reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewsVarargs(value: Review*): Self = StObject.set(x, "reviews", js.Array(value :_*))
    
    @scala.inline
    def setTotalReviewCount(value: Double): Self = StObject.set(x, "totalReviewCount", value.asInstanceOf[js.Any])
  }
}
