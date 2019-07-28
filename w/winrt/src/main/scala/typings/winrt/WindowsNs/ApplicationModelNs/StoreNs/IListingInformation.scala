package typings.winrt.WindowsNs.ApplicationModelNs.StoreNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListingInformation extends js.Object {
  var ageRating: Double
  var currentMarket: String
  var description: String
  var formattedPrice: String
  var name: String
  var productListings: IMapView[String, ProductListing]
}

object IListingInformation {
  @scala.inline
  def apply(
    ageRating: Double,
    currentMarket: String,
    description: String,
    formattedPrice: String,
    name: String,
    productListings: IMapView[String, ProductListing]
  ): IListingInformation = {
    val __obj = js.Dynamic.literal(ageRating = ageRating, currentMarket = currentMarket, description = description, formattedPrice = formattedPrice, name = name, productListings = productListings)
  
    __obj.asInstanceOf[IListingInformation]
  }
}

