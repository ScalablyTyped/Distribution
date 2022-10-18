package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RatingCountPerRating extends StObject {
  
  /**
    * Rating value
    */
  var rating: Double
  
  /**
    * Count of total ratings
    */
  var ratingCount: Double
}
object RatingCountPerRating {
  
  inline def apply(rating: Double, ratingCount: Double): RatingCountPerRating = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any], ratingCount = ratingCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingCountPerRating]
  }
  
  extension [Self <: RatingCountPerRating](x: Self) {
    
    inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingCount(value: Double): Self = StObject.set(x, "ratingCount", value.asInstanceOf[js.Any])
  }
}
