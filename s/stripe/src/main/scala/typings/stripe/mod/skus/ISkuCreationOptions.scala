package typings.stripe.mod.skus

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.products.IPackageDimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISkuCreationOptions extends IDataOptionsWithMetadata {
  
  /**
    * Whether or not the SKU is available for purchase. Default to true.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  var attributes: js.UndefOr[ISkuAttributes] = js.native
  
  /**
    * 3-letter ISO code for currency.
    */
  var currency: String = js.native
  
  /**
    * The identifier for the SKU. Must be unique. If not provided, an identifier will be randomly generated.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The URL of an image for this SKU, meant to be displayable to the customer.
    */
  var image: js.UndefOr[String] = js.native
  
  var inventory: IInventory = js.native
  
  /**
    * The dimensions of this SKU for shipping purposes.
    */
  var package_dimensions: js.UndefOr[IPackageDimensions] = js.native
  
  /**
    * The cost of the item as a nonnegative integer in the smallest currency unit (that is, 100 cents to charge $1.00, or 1 to charge ¥1,
    * Japanese Yen being a 0-decimal currency).
    */
  var price: Double = js.native
  
  /**
    * The ID of the product this SKU is associated with.
    */
  var product: String = js.native
}
object ISkuCreationOptions {
  
  @scala.inline
  def apply(currency: String, inventory: IInventory, price: Double, product: String): ISkuCreationOptions = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], inventory = inventory.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISkuCreationOptions]
  }
  
  @scala.inline
  implicit class ISkuCreationOptionsOps[Self <: ISkuCreationOptions] (val x: Self) extends AnyVal {
    
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventory(value: IInventory): Self = this.set("inventory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: Double): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAttributes(value: ISkuAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setPackage_dimensions(value: IPackageDimensions): Self = this.set("package_dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackage_dimensions: Self = this.set("package_dimensions", js.undefined)
  }
}
