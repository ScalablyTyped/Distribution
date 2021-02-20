package typings.winrtUwp.Windows.ApplicationModel.Store

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the listing info that describes the app in the Windows Store. */
@js.native
trait ListingInformation extends StObject {
  
  /** Gets the age rating for the app. */
  var ageRating: Double = js.native
  
  var currencyCode: js.Any = js.native
  
  /* unmapped type */
  /** Gets the country code associated with the user's location, such as US or CA, that is used to identify their market for transactions in the current session. */
  var currentMarket: String = js.native
  
  /** Gets the app's description in the current market. */
  var description: String = js.native
  
  var formattedBasePrice: js.Any = js.native
  
  /* unmapped type */
  /** Gets the app's purchase price formatted for the current market and currency. */
  var formattedPrice: String = js.native
  
  var isOnSale: js.Any = js.native
  
  /* unmapped type */
  /** Gets the app's name in the current market. */
  var name: String = js.native
  
  /** Gets information about in-app products available for purchase. */
  var productListings: IMapView[String, ProductListing] = js.native
  
  var saleEndDate: js.Any = js.native
}
object ListingInformation {
  
  @scala.inline
  def apply(
    ageRating: Double,
    currencyCode: js.Any,
    currentMarket: String,
    description: String,
    formattedBasePrice: js.Any,
    formattedPrice: String,
    isOnSale: js.Any,
    name: String,
    productListings: IMapView[String, ProductListing],
    saleEndDate: js.Any
  ): ListingInformation = {
    val __obj = js.Dynamic.literal(ageRating = ageRating.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], currentMarket = currentMarket.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formattedBasePrice = formattedBasePrice.asInstanceOf[js.Any], formattedPrice = formattedPrice.asInstanceOf[js.Any], isOnSale = isOnSale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], productListings = productListings.asInstanceOf[js.Any], saleEndDate = saleEndDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListingInformation]
  }
  
  @scala.inline
  implicit class ListingInformationMutableBuilder[Self <: ListingInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgeRating(value: Double): Self = StObject.set(x, "ageRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCode(value: js.Any): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentMarket(value: String): Self = StObject.set(x, "currentMarket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedBasePrice(value: js.Any): Self = StObject.set(x, "formattedBasePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedPrice(value: String): Self = StObject.set(x, "formattedPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOnSale(value: js.Any): Self = StObject.set(x, "isOnSale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductListings(value: IMapView[String, ProductListing]): Self = StObject.set(x, "productListings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaleEndDate(value: js.Any): Self = StObject.set(x, "saleEndDate", value.asInstanceOf[js.Any])
  }
}
