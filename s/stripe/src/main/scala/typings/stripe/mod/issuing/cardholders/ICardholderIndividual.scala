package typings.stripe.mod.issuing.cardholders

import typings.stripe.anon.Day
import typings.stripe.anon.DocumentFront
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICardholderIndividual extends js.Object {
  
  /**
    * The date of birth of this cardholder.
    */
  var dob: Day = js.native
  
  /**
    * The first name of this cardholder.
    */
  var first_name: String = js.native
  
  /**
    * The last name of this cardholder.
    */
  var last_name: String = js.native
  
  /**
    * Government-issued ID document for this cardholder.
    */
  var verification: js.UndefOr[DocumentFront] = js.native
}
object ICardholderIndividual {
  
  @scala.inline
  def apply(dob: Day, first_name: String, last_name: String): ICardholderIndividual = {
    val __obj = js.Dynamic.literal(dob = dob.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardholderIndividual]
  }
  
  @scala.inline
  implicit class ICardholderIndividualOps[Self <: ICardholderIndividual] (val x: Self) extends AnyVal {
    
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
    def setDob(value: Day): Self = this.set("dob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerification(value: DocumentFront): Self = this.set("verification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerification: Self = this.set("verification", js.undefined)
  }
}
