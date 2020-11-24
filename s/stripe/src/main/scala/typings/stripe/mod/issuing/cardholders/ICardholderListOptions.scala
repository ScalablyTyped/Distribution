package typings.stripe.mod.issuing.cardholders

import typings.stripe.mod.issuing.ICreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICardholderListOptions extends js.Object {
  
  /**
    * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp, or it can be a
    * dictionary with the following options:
    */
  var created: js.UndefOr[String | ICreated] = js.native
  
  /**
    * Only return cardholders that have the given email address.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * A cursor for use in pagination. ending_before is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_bar, your subsequent call can include ending_before=obj_bar in order to fetch the previous page of the list.
    */
  var ending_before: js.UndefOr[String] = js.native
  
  /**
    * Only return the default cardholder.
    */
  var is_default: js.UndefOr[Boolean] = js.native
  
  /**
    * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Only return cardholders that have the given phone number.
    */
  var phone_number: js.UndefOr[String] = js.native
  
  /**
    * A cursor for use in pagination. starting_after is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include starting_after=obj_foo in order to fetch the next page of the list.
    */
  var starting_after: js.UndefOr[String] = js.native
  
  /**
    * Only return cardholders that have the given status. One of active, inactive, or blocked.
    */
  var status: js.UndefOr[CardholderStatus] = js.native
  
  /**
    * Only return cardholders that have the given type. One of individual or business_entity.
    */
  var `type`: js.UndefOr[CardholderType] = js.native
}
object ICardholderListOptions {
  
  @scala.inline
  def apply(): ICardholderListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICardholderListOptions]
  }
  
  @scala.inline
  implicit class ICardholderListOptionsOps[Self <: ICardholderListOptions] (val x: Self) extends AnyVal {
    
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
    def setCreated(value: String | ICreated): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setEnding_before(value: String): Self = this.set("ending_before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnding_before: Self = this.set("ending_before", js.undefined)
    
    @scala.inline
    def setIs_default(value: Boolean): Self = this.set("is_default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_default: Self = this.set("is_default", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setPhone_number(value: String): Self = this.set("phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone_number: Self = this.set("phone_number", js.undefined)
    
    @scala.inline
    def setStarting_after(value: String): Self = this.set("starting_after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarting_after: Self = this.set("starting_after", js.undefined)
    
    @scala.inline
    def setStatus(value: CardholderStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setType(value: CardholderType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
