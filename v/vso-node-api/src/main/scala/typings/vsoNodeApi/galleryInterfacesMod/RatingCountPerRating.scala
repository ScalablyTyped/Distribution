package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RatingCountPerRating extends StObject {
  
  /**
    * Rating value
    */
  var rating: Double = js.native
  
  /**
    * Count of total ratings
    */
  var ratingCount: Double = js.native
}
object RatingCountPerRating {
  
  @scala.inline
  def apply(rating: Double, ratingCount: Double): RatingCountPerRating = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any], ratingCount = ratingCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingCountPerRating]
  }
  
  @scala.inline
  implicit class RatingCountPerRatingMutableBuilder[Self <: RatingCountPerRating] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingCount(value: Double): Self = StObject.set(x, "ratingCount", value.asInstanceOf[js.Any])
  }
}
