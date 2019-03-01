package typings
package winrtLib.WindowsNs.ApplicationModelNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListingInformation extends js.Object {
  var ageRating: scala.Double
  var currentMarket: java.lang.String
  var description: java.lang.String
  var formattedPrice: java.lang.String
  var name: java.lang.String
  var productListings: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, ProductListing]
}

object IListingInformation {
  @scala.inline
  def apply(
    ageRating: scala.Double,
    currentMarket: java.lang.String,
    description: java.lang.String,
    formattedPrice: java.lang.String,
    name: java.lang.String,
    productListings: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, ProductListing]
  ): IListingInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ageRating")(ageRating)
    __obj.updateDynamic("currentMarket")(currentMarket)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("formattedPrice")(formattedPrice)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("productListings")(productListings)
    __obj.asInstanceOf[IListingInformation]
  }
}

