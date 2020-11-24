package typings.stripe.mod.accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIndividualCreateUpdateOptions extends IIndividualShared {
  
  /**
    * The government-issued ID number of the individual, as appropriate for the representative’s country.
    * (Examples are a Social Security Number in the U.S., or a Social Insurance Number in Canada).
    * Instead of the number itself, you can also provide a PII token created with Stripe.js.
    * This can be unset by updating the value to null and then saving.
    */
  var id_number: js.UndefOr[String] = js.native
  
  /**
    * The last four digits of the individual’s Social Security Number (U.S. only).
    * This can be unset by updating the value to null and then saving.
    */
  var ssn_last_4: js.UndefOr[String] = js.native
}
object IIndividualCreateUpdateOptions {
  
  @scala.inline
  def apply(): IIndividualCreateUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIndividualCreateUpdateOptions]
  }
  
  @scala.inline
  implicit class IIndividualCreateUpdateOptionsOps[Self <: IIndividualCreateUpdateOptions] (val x: Self) extends AnyVal {
    
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
    def setId_number(value: String): Self = this.set("id_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId_number: Self = this.set("id_number", js.undefined)
    
    @scala.inline
    def setSsn_last_4(value: String): Self = this.set("ssn_last_4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsn_last_4: Self = this.set("ssn_last_4", js.undefined)
  }
}
