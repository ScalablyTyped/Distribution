package typings.stripe.mod.issuing.cards

import typings.stripe.mod.issuing.ICreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns a list of Issuing Card objects. The objects are sorted in descending order by creation date,
  * with the most recently created object appearing first.
  */
@js.native
trait IIssuingCardListOptions extends js.Object {
  
  /**
    * Only return cards belonging to the Cardholder with the provided ID.
    */
  var cardholder: js.UndefOr[String] = js.native
  
  /**
    * A filter on the list based on the object created field.
    * The value can be a string with an integer Unix timestamp, or it can be a dictionary with the following options:
    */
  var created: js.UndefOr[String | ICreated] = js.native
  
  /**
    * A cursor for use in pagination. ending_before is an object ID that defines your place in the list.
    * For instance, if you make a list request and receive 100 objects, starting with obj_bar,
    * your subsequent call can include ending_before=obj_bar in order to fetch the previous page of the list.
    */
  var ending_before: js.UndefOr[String] = js.native
  
  /**
    * Only return cards that have the given expiration month.
    */
  var exp_month: js.UndefOr[Double] = js.native
  
  /**
    * Only return cards that have the given expiration year.
    */
  var exp_year: js.UndefOr[Double] = js.native
  
  /**
    * Only return cards that have the given last four digits.
    */
  var last4: js.UndefOr[String] = js.native
  
  /**
    * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Only return cards that have the given name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Only return cards whose full card number matches that of this card source ID.
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * A cursor for use in pagination. starting_after is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include starting_after=obj_foo in order to fetch the next page of the list.
    */
  var starting_after: js.UndefOr[String] = js.native
  
  /**
    * Only return cards that have the given status. One of active, inactive, canceled, lost, or stolen.
    */
  var status: js.UndefOr[IssuingCardStatus] = js.native
  
  /**
    * Only return cards that have the given type. One of virtual or physical.
    */
  var `type`: js.UndefOr[IssuingCardType] = js.native
}
object IIssuingCardListOptions {
  
  @scala.inline
  def apply(): IIssuingCardListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIssuingCardListOptions]
  }
  
  @scala.inline
  implicit class IIssuingCardListOptionsOps[Self <: IIssuingCardListOptions] (val x: Self) extends AnyVal {
    
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
    def setCardholder(value: String): Self = this.set("cardholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardholder: Self = this.set("cardholder", js.undefined)
    
    @scala.inline
    def setCreated(value: String | ICreated): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setEnding_before(value: String): Self = this.set("ending_before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnding_before: Self = this.set("ending_before", js.undefined)
    
    @scala.inline
    def setExp_month(value: Double): Self = this.set("exp_month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExp_month: Self = this.set("exp_month", js.undefined)
    
    @scala.inline
    def setExp_year(value: Double): Self = this.set("exp_year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExp_year: Self = this.set("exp_year", js.undefined)
    
    @scala.inline
    def setLast4(value: String): Self = this.set("last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast4: Self = this.set("last4", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setStarting_after(value: String): Self = this.set("starting_after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarting_after: Self = this.set("starting_after", js.undefined)
    
    @scala.inline
    def setStatus(value: IssuingCardStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setType(value: IssuingCardType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
