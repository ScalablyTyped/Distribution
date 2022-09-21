package typings.yelpFusionPlus.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusinessDetails
  extends StObject
     with Business {
  
  var hours: js.Array[Hour]
  
  var is_claimed: Boolean
  
  var photos: js.Array[String]
}
object BusinessDetails {
  
  inline def apply(
    alias: String,
    coordinates: Coordinates,
    display_phone: String,
    distance: Double,
    hours: js.Array[Hour],
    id: String,
    image_url: String,
    is_claimed: Boolean,
    is_closed: Boolean,
    location: Location,
    name: String,
    phone: String,
    photos: js.Array[String],
    rating: Double,
    review_count: Double,
    url: String
  ): BusinessDetails = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], display_phone = display_phone.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any], is_claimed = is_claimed.asInstanceOf[js.Any], is_closed = is_closed.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], review_count = review_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessDetails]
  }
  
  extension [Self <: BusinessDetails](x: Self) {
    
    inline def setHours(value: js.Array[Hour]): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setHoursVarargs(value: Hour*): Self = StObject.set(x, "hours", js.Array(value*))
    
    inline def setIs_claimed(value: Boolean): Self = StObject.set(x, "is_claimed", value.asInstanceOf[js.Any])
    
    inline def setPhotos(value: js.Array[String]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setPhotosVarargs(value: String*): Self = StObject.set(x, "photos", js.Array(value*))
  }
}
