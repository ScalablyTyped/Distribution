package typings.winrtUwp.Windows.ApplicationModel.Store

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides localized information that details an in-app product. */
trait ProductListing extends js.Object {
  var currencyCode: js.Any
   /* unmapped type */ /** Gets the description for the in-app product. */
  var description: String
  var formattedBasePrice: js.Any
   /* unmapped type */ /** Gets the purchase price for the in-app product with the appropriate formatting for the current market. */
  var formattedPrice: String
  /** Gets the URI of the image associated with the in-app product. */
  var imageUri: Uri
  var isOnSale: js.Any
   /* unmapped type */ /** Gets the list of keywords associated with the in-app product. These keywords are useful for filtering product lists by keyword, for example, when calling LoadListingInformationByKeywordsAsync . */
  var keywords: IIterable[String]
  /** Gets the descriptive name of the in-app product that is displayed customers in the current market. */
  var name: String
  /** Gets the in-app product ID. */
  var productId: String
  /** Gets the type of this in-app product. Possible values are defined by ProductType . */
  var productType: ProductType
  /** Gets the end date of the sale period for the in-app product. */
  var saleEndDate: Date
  /** Gets the tag string that contains custom information about an in-app product. */
  var tag: String
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
}

