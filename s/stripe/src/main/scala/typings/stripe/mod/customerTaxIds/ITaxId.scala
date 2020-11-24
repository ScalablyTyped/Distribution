package typings.stripe.mod.customerTaxIds

import typings.stripe.stripeStrings.string
import typings.stripe.stripeStrings.tax_id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITaxId extends js.Object {
  
  /**
    * Two-letter ISO code representing the country of the tax ID.
    */
  var country: string = js.native
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  
  /**
    * ID of the customer.
    */
  var customer: String = js.native
  
  /**
    * Unique identifier for the object.
    */
  var id: String = js.native
  
  /**
    * Has the value true if the object exists in live mode or the value false if the
    * object exists in test mode.
    */
  var livemode: Boolean = js.native
  
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  var `object`: tax_id = js.native
  
  /**
    * Type of the tax ID, one of au_abn, eu_vat, in_gst, no_vat, nz_gst, or unknown.
    */
  var `type`: TaxIdType = js.native
  
  /**
    * Value of the tax ID.
    */
  var value: String = js.native
  
  /**
    * Tax ID verification information.
    */
  var verification: ITaxIdVerification = js.native
}
object ITaxId {
  
  @scala.inline
  def apply(
    country: string,
    created: Double,
    customer: String,
    id: String,
    livemode: Boolean,
    `object`: tax_id,
    `type`: TaxIdType,
    value: String,
    verification: ITaxIdVerification
  ): ITaxId = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaxId]
  }
  
  @scala.inline
  implicit class ITaxIdOps[Self <: ITaxId] (val x: Self) extends AnyVal {
    
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
    def setCountry(value: string): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: tax_id): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TaxIdType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerification(value: ITaxIdVerification): Self = this.set("verification", value.asInstanceOf[js.Any])
  }
}
