package typings.winrtUwp.global.Windows.ApplicationModel.Store

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the listing info that describes the app in the Windows Store. */
@JSGlobal("Windows.ApplicationModel.Store.ListingInformation")
@js.native
abstract class ListingInformation ()
  extends typings.winrtUwp.Windows.ApplicationModel.Store.ListingInformation {
  /** Gets the age rating for the app. */
  /* CompleteClass */
  override var ageRating: Double = js.native
  /* CompleteClass */
  override var currencyCode: js.Any = js.native
   /* unmapped type */ /** Gets the country code associated with the user's location, such as US or CA, that is used to identify their market for transactions in the current session. */
  /* CompleteClass */
  override var currentMarket: String = js.native
  /** Gets the app's description in the current market. */
  /* CompleteClass */
  override var description: String = js.native
  /* CompleteClass */
  override var formattedBasePrice: js.Any = js.native
   /* unmapped type */ /** Gets the app's purchase price formatted for the current market and currency. */
  /* CompleteClass */
  override var formattedPrice: String = js.native
  /* CompleteClass */
  override var isOnSale: js.Any = js.native
   /* unmapped type */ /** Gets the app's name in the current market. */
  /* CompleteClass */
  override var name: String = js.native
  /** Gets information about in-app products available for purchase. */
  /* CompleteClass */
  override var productListings: IMapView[String, typings.winrtUwp.Windows.ApplicationModel.Store.ProductListing] = js.native
  /* CompleteClass */
  override var saleEndDate: js.Any = js.native
}

