package typings.winrt.Windows.ApplicationModel.Store

import typings.winrt.Windows.Foundation.Collections.IMapView
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
    val __obj = js.Dynamic.literal(ageRating = ageRating.asInstanceOf[js.Any], currentMarket = currentMarket.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formattedPrice = formattedPrice.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], productListings = productListings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListingInformation]
  }
}

