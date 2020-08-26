package typings.stripe.mod.skus

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.products.IPackageDimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISkuUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * Whether or not the SKU is available for purchase.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * 3-letter ISO code for currency.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * The URL of an image for this SKU, meant to be displayable to the customer.
    * This can be unset by updating the value to null and then saving.
    */
  var image: js.UndefOr[String] = js.native
  var inventory: js.UndefOr[IInventory] = js.native
  /**
    * The dimensions of this SKU for shipping purposes.
    */
  var package_dimensions: js.UndefOr[IPackageDimensions] = js.native
  /**
    * The cost of the item as a nonnegative integer in the smallest currency unit (that is, 100 cents to charge $1.00, or 1 to charge ¥1,
    * Japanese Yen being a 0-decimal currency).
    */
  var price: js.UndefOr[Double] = js.native
  /**
    * The ID of the product this SKU is associated with.
    */
  var product: js.UndefOr[String] = js.native
}

object ISkuUpdateOptions {
  @scala.inline
  def apply(): ISkuUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISkuUpdateOptions]
  }
  @scala.inline
  implicit class ISkuUpdateOptionsOps[Self <: ISkuUpdateOptions] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setInventory(value: IInventory): Self = this.set("inventory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInventory: Self = this.set("inventory", js.undefined)
    @scala.inline
    def setPackage_dimensions(value: IPackageDimensions): Self = this.set("package_dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackage_dimensions: Self = this.set("package_dimensions", js.undefined)
    @scala.inline
    def setPrice(value: Double): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
  }
  
}

