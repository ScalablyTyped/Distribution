package typings.winrt.Windows.ApplicationModel.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProductListing extends js.Object {
  var formattedPrice: String = js.native
  var name: String = js.native
  var productId: String = js.native
}

object IProductListing {
  @scala.inline
  def apply(formattedPrice: String, name: String, productId: String): IProductListing = {
    val __obj = js.Dynamic.literal(formattedPrice = formattedPrice.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProductListing]
  }
  @scala.inline
  implicit class IProductListingOps[Self <: IProductListing] (val x: Self) extends AnyVal {
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
    def setFormattedPrice(value: String): Self = this.set("formattedPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
  }
  
}

