package typings.stripe.mod.customers

import typings.stripe.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomerInvoiceSettings extends js.Object {
  
  /**
    * Default custom fields to be displayed on invoices for this customer.
    */
  var custom_fields: js.UndefOr[js.Array[Name]] = js.native
  
  /**
    * ID of the default payment method used for subscriptions and invoices for the customer.
    */
  var default_payment_method: js.UndefOr[String] = js.native
  
  /**
    * Default footer to be displayed on invoices for this customer.
    * This can be unset by updating the value to null and then saving.
    */
  var footer: js.UndefOr[String] = js.native
}
object ICustomerInvoiceSettings {
  
  @scala.inline
  def apply(): ICustomerInvoiceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomerInvoiceSettings]
  }
  
  @scala.inline
  implicit class ICustomerInvoiceSettingsOps[Self <: ICustomerInvoiceSettings] (val x: Self) extends AnyVal {
    
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
    def setCustom_fieldsVarargs(value: Name*): Self = this.set("custom_fields", js.Array(value :_*))
    
    @scala.inline
    def setCustom_fields(value: js.Array[Name]): Self = this.set("custom_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_fields: Self = this.set("custom_fields", js.undefined)
    
    @scala.inline
    def setDefault_payment_method(value: String): Self = this.set("default_payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_payment_method: Self = this.set("default_payment_method", js.undefined)
    
    @scala.inline
    def setFooter(value: String): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
  }
}
