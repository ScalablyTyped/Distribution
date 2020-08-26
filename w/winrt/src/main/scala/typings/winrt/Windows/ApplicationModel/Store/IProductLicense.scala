package typings.winrt.Windows.ApplicationModel.Store

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProductLicense extends js.Object {
  var expirationDate: Date = js.native
  var isActive: Boolean = js.native
  var productId: String = js.native
}

object IProductLicense {
  @scala.inline
  def apply(expirationDate: Date, isActive: Boolean, productId: String): IProductLicense = {
    val __obj = js.Dynamic.literal(expirationDate = expirationDate.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProductLicense]
  }
  @scala.inline
  implicit class IProductLicenseOps[Self <: IProductLicense] (val x: Self) extends AnyVal {
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
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
  }
  
}

