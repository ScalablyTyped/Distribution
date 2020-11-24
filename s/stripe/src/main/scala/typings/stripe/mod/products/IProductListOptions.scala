package typings.stripe.mod.products

import typings.stripe.mod.IDateFilter
import typings.stripe.mod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProductListOptions extends IListOptions {
  
  /**
    * Only return products that are active or inactive (e.g. pass false to list all inactive products).
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var created: js.UndefOr[IDateFilter] = js.native
  
  /**
    * Only return products with the given IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Only return products that can be shipped (i.e., physical, not digital products).
    */
  var shippable: js.UndefOr[Boolean] = js.native
  
  /**
    * Only return products of this type
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Only return products with the given url
    */
  var url: js.UndefOr[String] = js.native
}
object IProductListOptions {
  
  @scala.inline
  def apply(): IProductListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProductListOptions]
  }
  
  @scala.inline
  implicit class IProductListOptionsOps[Self <: IProductListOptions] (val x: Self) extends AnyVal {
    
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
    def setCreated(value: IDateFilter): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    
    @scala.inline
    def setShippable(value: Boolean): Self = this.set("shippable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippable: Self = this.set("shippable", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
