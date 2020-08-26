package typings.winrt.Windows.ApplicationModel.Store

import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IListingInformation extends js.Object {
  var ageRating: Double = js.native
  var currentMarket: String = js.native
  var description: String = js.native
  var formattedPrice: String = js.native
  var name: String = js.native
  var productListings: IMapView[String, ProductListing] = js.native
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
  @scala.inline
  implicit class IListingInformationOps[Self <: IListingInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAgeRating(value: Double): Self = this.set("ageRating", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentMarket(value: String): Self = this.set("currentMarket", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormattedPrice(value: String): Self = this.set("formattedPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductListings(value: IMapView[String, ProductListing]): Self = this.set("productListings", value.asInstanceOf[js.Any])
  }
  
}

