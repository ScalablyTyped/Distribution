package typings.winrtUwp.Windows.ApplicationModel.Store

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the listing info that describes the app in the Windows Store. */
trait ListingInformation extends js.Object {
  /** Gets the age rating for the app. */
  var ageRating: Double
  var currencyCode: js.Any
   /* unmapped type */ /** Gets the country code associated with the user's location, such as US or CA, that is used to identify their market for transactions in the current session. */
  var currentMarket: String
  /** Gets the app's description in the current market. */
  var description: String
  var formattedBasePrice: js.Any
   /* unmapped type */ /** Gets the app's purchase price formatted for the current market and currency. */
  var formattedPrice: String
  var isOnSale: js.Any
   /* unmapped type */ /** Gets the app's name in the current market. */
  var name: String
  /** Gets information about in-app products available for purchase. */
  var productListings: IMapView[String, ProductListing]
  var saleEndDate: js.Any
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
}

