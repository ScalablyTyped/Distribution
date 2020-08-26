package typings.winrtUwp.Windows.ApplicationModel.Store

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides localized information that details an in-app product. */
@js.native
trait ProductListing extends js.Object {
  var currencyCode: js.Any = js.native
   /* unmapped type */ /** Gets the description for the in-app product. */
  var description: String = js.native
  var formattedBasePrice: js.Any = js.native
   /* unmapped type */ /** Gets the purchase price for the in-app product with the appropriate formatting for the current market. */
  var formattedPrice: String = js.native
  /** Gets the URI of the image associated with the in-app product. */
  var imageUri: Uri = js.native
  var isOnSale: js.Any = js.native
   /* unmapped type */ /** Gets the list of keywords associated with the in-app product. These keywords are useful for filtering product lists by keyword, for example, when calling LoadListingInformationByKeywordsAsync . */
  var keywords: IIterable[String] = js.native
  /** Gets the descriptive name of the in-app product that is displayed customers in the current market. */
  var name: String = js.native
  /** Gets the in-app product ID. */
  var productId: String = js.native
  /** Gets the type of this in-app product. Possible values are defined by ProductType . */
  var productType: ProductType = js.native
  /** Gets the end date of the sale period for the in-app product. */
  var saleEndDate: Date = js.native
  /** Gets the tag string that contains custom information about an in-app product. */
  var tag: String = js.native
}

object ProductListing {
  @scala.inline
  def apply(
    currencyCode: js.Any,
    description: String,
    formattedBasePrice: js.Any,
    formattedPrice: String,
    imageUri: Uri,
    isOnSale: js.Any,
    keywords: IIterable[String],
    name: String,
    productId: String,
    productType: ProductType,
    saleEndDate: Date,
    tag: String
  ): ProductListing = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formattedBasePrice = formattedBasePrice.asInstanceOf[js.Any], formattedPrice = formattedPrice.asInstanceOf[js.Any], imageUri = imageUri.asInstanceOf[js.Any], isOnSale = isOnSale.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], productType = productType.asInstanceOf[js.Any], saleEndDate = saleEndDate.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductListing]
  }
  @scala.inline
  implicit class ProductListingOps[Self <: ProductListing] (val x: Self) extends AnyVal {
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
    def setCurrencyCode(value: js.Any): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormattedBasePrice(value: js.Any): Self = this.set("formattedBasePrice", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormattedPrice(value: String): Self = this.set("formattedPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageUri(value: Uri): Self = this.set("imageUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOnSale(value: js.Any): Self = this.set("isOnSale", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeywords(value: IIterable[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductType(value: ProductType): Self = this.set("productType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaleEndDate(value: Date): Self = this.set("saleEndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
  
}

