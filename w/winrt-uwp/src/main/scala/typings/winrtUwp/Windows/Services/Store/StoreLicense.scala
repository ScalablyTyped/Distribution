package typings.winrtUwp.Windows.Services.Store

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides license info for an add-on that is associated with the current app. */
@js.native
trait StoreLicense extends js.Object {
  /** Gets the expiration date and time for the add-on license. */
  var expirationDate: Date = js.native
  /** Gets complete license data in JSON format. */
  var extendedJsonData: String = js.native
  /** Gets in the product ID for the add-on. */
  var inAppOfferToken: String = js.native
  /** Gets a value that indicates whether the add-on license is active. */
  var isActive: Boolean = js.native
  /** Gets the Store ID of the licensed add-on SKU from the Windows Store catalog. */
  var skuStoreId: String = js.native
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
  @scala.inline
  implicit class StoreLicenseOps[Self <: StoreLicense] (val x: Self) extends AnyVal {
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
    def setExpirationDate(value: Date): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtendedJsonData(value: String): Self = this.set("extendedJsonData", value.asInstanceOf[js.Any])
    @scala.inline
    def setInAppOfferToken(value: String): Self = this.set("inAppOfferToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkuStoreId(value: String): Self = this.set("skuStoreId", value.asInstanceOf[js.Any])
  }
  
}

