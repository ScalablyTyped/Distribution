package typings.yelpFusionPlus.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Business extends StObject {
  
  var alias: String
  
  var categories: js.UndefOr[js.Array[Category] | Null] = js.undefined
  
  var coordinates: Coordinates
  
  var display_phone: String
  
  var distance: Double
  
  var id: String
  
  var image_url: String
  
  var is_closed: Boolean
  
  var location: Location
  
  var name: String
  
  var phone: String
  
  var price: js.UndefOr[String | Null] = js.undefined
  
  var rating: Double
  
  var review_count: Double
  
  var transactions: js.UndefOr[(js.Array[String | Null]) | Null] = js.undefined
  
  var url: String
}
object Business {
  
  inline def apply(
    alias: String,
    coordinates: Coordinates,
    display_phone: String,
    distance: Double,
    id: String,
    image_url: String,
    is_closed: Boolean,
    location: Location,
    name: String,
    phone: String,
    rating: Double,
    review_count: Double,
    url: String
  ): Business = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], display_phone = display_phone.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any], is_closed = is_closed.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], review_count = review_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Business]
  }
  
  extension [Self <: Business](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setCategories(value: js.Array[Category]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesNull: Self = StObject.set(x, "categories", null)
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: Category*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setCoordinates(value: Coordinates): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setDisplay_phone(value: String): Self = StObject.set(x, "display_phone", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
    
    inline def setIs_closed(value: Boolean): Self = StObject.set(x, "is_closed", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceNull: Self = StObject.set(x, "price", null)
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setReview_count(value: Double): Self = StObject.set(x, "review_count", value.asInstanceOf[js.Any])
    
    inline def setTransactions(value: js.Array[String | Null]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsNull: Self = StObject.set(x, "transactions", null)
    
    inline def setTransactionsUndefined: Self = StObject.set(x, "transactions", js.undefined)
    
    inline def setTransactionsVarargs(value: (String | Null)*): Self = StObject.set(x, "transactions", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
