package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReviewSummary extends StObject {
  
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
  implicit class ReviewSummaryMutableBuilder[Self <: ReviewSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverageRating(value: Double): Self = StObject.set(x, "averageRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingCount(value: Double): Self = StObject.set(x, "ratingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingSplit(value: js.Array[RatingCountPerRating]): Self = StObject.set(x, "ratingSplit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingSplitVarargs(value: RatingCountPerRating*): Self = StObject.set(x, "ratingSplit", js.Array(value :_*))
  }
}
