package typings.stripe.mod.issuing.cardholders

import typings.stripe.anon.AddressICardholderBillingAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICardholderCreateOptions extends ICardholderUpdateOptions {
  
  /**
    * The cardholder’s billing address.
    */
  @JSName("billing")
  var billing_ICardholderCreateOptions: AddressICardholderBillingAddress = js.native
  
  /**
    * The cardholder’s name. This will be printed on cards issued to them.
    */
  var name: String = js.native
  
  /**
    * The type of cardholder. Possible values are individual or business_entity.
    */
  var `type`: CardholderType = js.native
}
object ICardholderCreateOptions {
  
  @scala.inline
  def apply(billing: AddressICardholderBillingAddress, name: String, `type`: CardholderType): ICardholderCreateOptions = {
    val __obj = js.Dynamic.literal(billing = billing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardholderCreateOptions]
  }
  
  @scala.inline
  implicit class ICardholderCreateOptionsOps[Self <: ICardholderCreateOptions] (val x: Self) extends AnyVal {
    
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
    def setBilling(value: AddressICardholderBillingAddress): Self = this.set("billing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CardholderType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
