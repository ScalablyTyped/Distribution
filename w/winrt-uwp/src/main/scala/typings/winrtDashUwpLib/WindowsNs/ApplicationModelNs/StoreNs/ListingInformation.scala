package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the listing info that describes the app in the Windows Store. */
@JSGlobal("Windows.ApplicationModel.Store.ListingInformation")
@js.native
abstract class ListingInformation () extends js.Object {
  /** Gets the age rating for the app. */
  var ageRating: scala.Double = js.native
  var currencyCode: js.Any = js.native
   /* unmapped type *//** Gets the country code associated with the user's location, such as US or CA, that is used to identify their market for transactions in the current session. */
  var currentMarket: java.lang.String = js.native
  /** Gets the app's description in the current market. */
  var description: java.lang.String = js.native
  var formattedBasePrice: js.Any = js.native
   /* unmapped type *//** Gets the app's purchase price formatted for the current market and currency. */
  var formattedPrice: java.lang.String = js.native
  var isOnSale: js.Any = js.native
   /* unmapped type *//** Gets the app's name in the current market. */
  var name: java.lang.String = js.native
  /** Gets information about in-app products available for purchase. */
  var productListings: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, ProductListing] = js.native
  var saleEndDate: js.Any = js.native
}

