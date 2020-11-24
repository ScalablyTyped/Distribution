package typings.stripe.mod.charges

import typings.stripe.anon.Userreport
import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IShippingInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChargeUpdateOptions extends IDataOptionsWithMetadata {
  
  /**
    * An arbitrary string which you can attach to a charge object. It is displayed when in the web interface alongside the charge.
    * Note that if you use Stripe to send automatic email receipts to your customers, your receipt emails will include the description
    * of the charge(s) that they are describing. This can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A set of key/value pairs you can attach to a charge giving information about its riskiness.
    */
  var fraud_details: js.UndefOr[Userreport] = js.native
  
  /**
    * This is the email address that the receipt for this charge will be sent to.
    * If this field is updated, then a new email receipt will be sent to the updated address.
    */
  var receipt_email: js.UndefOr[String] = js.native
  
  /**
    * Shipping information for the charge. Helps prevent fraud on charges for
    * physical goods.
    */
  var shipping: js.UndefOr[IShippingInformation] = js.native
  
  /**
    * A string that identifies this transaction as part of a group.
    * See the Connect documentation for details.
    *
    * Connect only.
    */
  var transfer_group: js.UndefOr[String] = js.native
}
object IChargeUpdateOptions {
  
  @scala.inline
  def apply(): IChargeUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChargeUpdateOptions]
  }
  
  @scala.inline
  implicit class IChargeUpdateOptionsOps[Self <: IChargeUpdateOptions] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFraud_details(value: Userreport): Self = this.set("fraud_details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFraud_details: Self = this.set("fraud_details", js.undefined)
    
    @scala.inline
    def setReceipt_email(value: String): Self = this.set("receipt_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceipt_email: Self = this.set("receipt_email", js.undefined)
    
    @scala.inline
    def setShipping(value: IShippingInformation): Self = this.set("shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipping: Self = this.set("shipping", js.undefined)
    
    @scala.inline
    def setTransfer_group(value: String): Self = this.set("transfer_group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransfer_group: Self = this.set("transfer_group", js.undefined)
  }
}
