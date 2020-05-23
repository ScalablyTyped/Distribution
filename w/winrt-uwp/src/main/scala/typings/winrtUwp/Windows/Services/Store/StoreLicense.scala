package typings.winrtUwp.Windows.Services.Store

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides license info for an add-on that is associated with the current app. */
trait StoreLicense extends js.Object {
  /** Gets the expiration date and time for the add-on license. */
  var expirationDate: Date
  /** Gets complete license data in JSON format. */
  var extendedJsonData: String
  /** Gets in the product ID for the add-on. */
  var inAppOfferToken: String
  /** Gets a value that indicates whether the add-on license is active. */
  var isActive: Boolean
  /** Gets the Store ID of the licensed add-on SKU from the Windows Store catalog. */
  var skuStoreId: String
}

object StoreLicense {
  @scala.inline
  def apply(
    expirationDate: Date,
    extendedJsonData: String,
    inAppOfferToken: String,
    isActive: Boolean,
    skuStoreId: String
  ): StoreLicense = {
    val __obj = js.Dynamic.literal(expirationDate = expirationDate.asInstanceOf[js.Any], extendedJsonData = extendedJsonData.asInstanceOf[js.Any], inAppOfferToken = inAppOfferToken.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], skuStoreId = skuStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreLicense]
  }
}

