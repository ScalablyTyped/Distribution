package typings.stripe.mod.skus

import typings.stripe.mod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISkuListOptions extends IListOptions {
  
  /**
    * Only return SKUs that are active or inactive (e.g. pass false to list all inactive products).
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Only return SKUs that have the specified key/value pairs in this partially constructed dictionary.
    * Can be specified only if product is also supplied. For instance, if the associated product has
    * attributes ["color", "size"], passing in attributes[color]=red returns all the SKUs for this product
    * that have color set to red.
    */
  var attributes: js.UndefOr[ISkuAttributes] = js.native
  
  /**
    * Only return SKUs with the given IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Only return SKUs that are either in stock or out of stock (e.g. pass false to list all SKUs that are out of stock).
    * If no value is provided, all SKUs are returned.
    */
  var in_stock: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the product whose SKUs will be retrieved.
    */
  var product: js.UndefOr[String] = js.native
}
object ISkuListOptions {
  
  @scala.inline
  def apply(): ISkuListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISkuListOptions]
  }
  
  @scala.inline
  implicit class ISkuListOptionsOps[Self <: ISkuListOptions] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: ISkuAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    
    @scala.inline
    def setIn_stock(value: Boolean): Self = this.set("in_stock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn_stock: Self = this.set("in_stock", js.undefined)
    
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
  }
}
