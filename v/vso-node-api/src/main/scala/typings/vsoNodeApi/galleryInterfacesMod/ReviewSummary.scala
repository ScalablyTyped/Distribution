package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReviewSummary extends js.Object {
  
  /**
    * Average Rating
    */
  var averageRating: Double = js.native
  
  /**
    * Count of total ratings
    */
  var ratingCount: Double = js.native
  
  /**
    * Split of count accross rating
    */
  var ratingSplit: js.Array[RatingCountPerRating] = js.native
}
object ReviewSummary {
  
  @scala.inline
  def apply(averageRating: Double, ratingCount: Double, ratingSplit: js.Array[RatingCountPerRating]): ReviewSummary = {
    val __obj = js.Dynamic.literal(averageRating = averageRating.asInstanceOf[js.Any], ratingCount = ratingCount.asInstanceOf[js.Any], ratingSplit = ratingSplit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewSummary]
  }
  
  @scala.inline
  implicit class ReviewSummaryOps[Self <: ReviewSummary] (val x: Self) extends AnyVal {
    
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
    def setAverageRating(value: Double): Self = this.set("averageRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingCount(value: Double): Self = this.set("ratingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingSplitVarargs(value: RatingCountPerRating*): Self = this.set("ratingSplit", js.Array(value :_*))
    
    @scala.inline
    def setRatingSplit(value: js.Array[RatingCountPerRating]): Self = this.set("ratingSplit", value.asInstanceOf[js.Any])
  }
}
