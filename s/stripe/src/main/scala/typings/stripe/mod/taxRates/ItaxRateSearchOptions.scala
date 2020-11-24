package typings.stripe.mod.taxRates

import typings.stripe.mod.IDateFilter
import typings.stripe.mod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItaxRateSearchOptions extends IListOptions {
  
  /**
    * Optional flag to filter by tax rates that are either active or not active (archived)
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * A filter on the list based on the object created field.
    */
  var created: js.UndefOr[String | IDateFilter] = js.native
  
  /**
    * A cursor for use in pagination. ending_before is an object ID that defines your place in the list. For instance, if you make
    * a list request and receive 100 objects, starting with obj_bar, your subsequent call can include ending_before=obj_bar in
    * order to fetch the previous page of the list.
    */
  var inclusive: js.UndefOr[Boolean] = js.native
  
  /**
    * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    */
  @JSName("limit")
  var limit_ItaxRateSearchOptions: Double = js.native
}
object ItaxRateSearchOptions {
  
  @scala.inline
  def apply(limit: Double): ItaxRateSearchOptions = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItaxRateSearchOptions]
  }
  
  @scala.inline
  implicit class ItaxRateSearchOptionsOps[Self <: ItaxRateSearchOptions] (val x: Self) extends AnyVal {
    
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setCreated(value: String | IDateFilter): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setInclusive(value: Boolean): Self = this.set("inclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclusive: Self = this.set("inclusive", js.undefined)
  }
}
