package typings.winrtUwp.Windows.ApplicationModel.Store

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the listing info that describes the app in the Windows Store. */
trait ListingInformation extends StObject {
  
  /** Gets the age rating for the app. */
  var ageRating: Double
  
  var currencyCode: Any
  
  /* unmapped type */
  /** Gets the country code associated with the user's location, such as US or CA, that is used to identify their market for transactions in the current session. */
  var currentMarket: String
  
  /** Gets the app's description in the current market. */
  var description: String
  
  var formattedBasePrice: Any
  
  /* unmapped type */
  /** Gets the app's purchase price formatted for the current market and currency. */
  var formattedPrice: String
  
  var isOnSale: Any
  
  /* unmapped type */
  /** Gets the app's name in the current market. */
  var name: String
  
  /** Gets information about in-app products available for purchase. */
  var productListings: IMapView[String, ProductListing]
  
  var saleEndDate: Any
}
object ListingInformation {
  
  inline def apply(
    ageRating: Double,
    currencyCode: Any,
    currentMarket: String,
    description: String,
    formattedBasePrice: Any,
    formattedPrice: String,
    isOnSale: Any,
    name: String,
    productListings: IMapView[String, ProductListing],
    saleEndDate: Any
  ): ListingInformation = {
    val __obj = js.Dynamic.literal(ageRating = ageRating.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], currentMarket = currentMarket.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formattedBasePrice = formattedBasePrice.asInstanceOf[js.Any], formattedPrice = formattedPrice.asInstanceOf[js.Any], isOnSale = isOnSale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], productListings = productListings.asInstanceOf[js.Any], saleEndDate = saleEndDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListingInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListingInformation] (val x: Self) extends AnyVal {
    
    inline def setAgeRating(value: Double): Self = StObject.set(x, "ageRating", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCode(value: Any): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrentMarket(value: String): Self = StObject.set(x, "currentMarket", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFormattedBasePrice(value: Any): Self = StObject.set(x, "formattedBasePrice", value.asInstanceOf[js.Any])
    
    inline def setFormattedPrice(value: String): Self = StObject.set(x, "formattedPrice", value.asInstanceOf[js.Any])
    
    inline def setIsOnSale(value: Any): Self = StObject.set(x, "isOnSale", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProductListings(value: IMapView[String, ProductListing]): Self = StObject.set(x, "productListings", value.asInstanceOf[js.Any])
    
    inline def setSaleEndDate(value: Any): Self = StObject.set(x, "saleEndDate", value.asInstanceOf[js.Any])
  }
}
