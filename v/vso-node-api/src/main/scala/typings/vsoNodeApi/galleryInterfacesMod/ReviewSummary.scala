package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReviewSummary extends StObject {
  
  /**
    * Average Rating
    */
  var averageRating: Double
  
  /**
    * Count of total ratings
    */
  var ratingCount: Double
  
  /**
    * Split of count accross rating
    */
  var ratingSplit: js.Array[RatingCountPerRating]
}
object ReviewSummary {
  
  inline def apply(averageRating: Double, ratingCount: Double, ratingSplit: js.Array[RatingCountPerRating]): ReviewSummary = {
    val __obj = js.Dynamic.literal(averageRating = averageRating.asInstanceOf[js.Any], ratingCount = ratingCount.asInstanceOf[js.Any], ratingSplit = ratingSplit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewSummary]
  }
  
  extension [Self <: ReviewSummary](x: Self) {
    
    inline def setAverageRating(value: Double): Self = StObject.set(x, "averageRating", value.asInstanceOf[js.Any])
    
    inline def setRatingCount(value: Double): Self = StObject.set(x, "ratingCount", value.asInstanceOf[js.Any])
    
    inline def setRatingSplit(value: js.Array[RatingCountPerRating]): Self = StObject.set(x, "ratingSplit", value.asInstanceOf[js.Any])
    
    inline def setRatingSplitVarargs(value: RatingCountPerRating*): Self = StObject.set(x, "ratingSplit", js.Array(value :_*))
  }
}
