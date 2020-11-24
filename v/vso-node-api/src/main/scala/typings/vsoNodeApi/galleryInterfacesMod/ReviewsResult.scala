package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReviewsResult extends js.Object {
  
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
  implicit class ReviewsResultOps[Self <: ReviewsResult] (val x: Self) extends AnyVal {
    
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
    def setHasMoreReviews(value: Boolean): Self = this.set("hasMoreReviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewsVarargs(value: Review*): Self = this.set("reviews", js.Array(value :_*))
    
    @scala.inline
    def setReviews(value: js.Array[Review]): Self = this.set("reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalReviewCount(value: Double): Self = this.set("totalReviewCount", value.asInstanceOf[js.Any])
  }
}
