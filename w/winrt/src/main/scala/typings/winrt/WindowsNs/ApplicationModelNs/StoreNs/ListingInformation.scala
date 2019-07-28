package typings.winrt.WindowsNs.ApplicationModelNs.StoreNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Store.ListingInformation")
@js.native
class ListingInformation () extends IListingInformation {
  /* CompleteClass */
  override var ageRating: Double = js.native
  /* CompleteClass */
  override var currentMarket: String = js.native
  /* CompleteClass */
  override var description: String = js.native
  /* CompleteClass */
  override var formattedPrice: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var productListings: IMapView[String, ProductListing] = js.native
}

