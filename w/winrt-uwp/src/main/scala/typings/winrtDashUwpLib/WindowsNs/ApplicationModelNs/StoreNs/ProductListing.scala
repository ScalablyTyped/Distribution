package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides localized information that details an in-app product. */
@JSGlobal("Windows.ApplicationModel.Store.ProductListing")
@js.native
abstract class ProductListing () extends js.Object {
  var currencyCode: js.Any = js.native
   /* unmapped type */ /** Gets the description for the in-app product. */
  var description: java.lang.String = js.native
  var formattedBasePrice: js.Any = js.native
   /* unmapped type */ /** Gets the purchase price for the in-app product with the appropriate formatting for the current market. */
  var formattedPrice: java.lang.String = js.native
  /** Gets the URI of the image associated with the in-app product. */
  var imageUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  var isOnSale: js.Any = js.native
   /* unmapped type */ /** Gets the list of keywords associated with the in-app product. These keywords are useful for filtering product lists by keyword, for example, when calling LoadListingInformationByKeywordsAsync . */
  var keywords: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String] = js.native
  /** Gets the descriptive name of the in-app product that is displayed customers in the current market. */
  var name: java.lang.String = js.native
  /** Gets the in-app product ID. */
  var productId: java.lang.String = js.native
  /** Gets the type of this in-app product. Possible values are defined by ProductType . */
  var productType: ProductType = js.native
  /** Gets the end date of the sale period for the in-app product. */
  var saleEndDate: stdLib.Date = js.native
  /** Gets the tag string that contains custom information about an in-app product. */
  var tag: java.lang.String = js.native
}

