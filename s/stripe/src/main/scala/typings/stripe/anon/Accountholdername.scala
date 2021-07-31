package typings.stripe.anon

import typings.stripe.stripeStrings.company
import typings.stripe.stripeStrings.individual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accountholdername extends StObject {
  
  /**
    * The name of the person or business that owns the bank account. This
    * field is required when attaching the bank account to a customer object.
    */
  var account_holder_name: js.UndefOr[String] = js.undefined
  
  /**
    * The type of entity that holds the account. This can be either
    * "individual" or "company". This field is required when attaching the
    * bank account to a customer object.
    */
  var account_holder_type: js.UndefOr[individual | company | Null] = js.undefined
  
  /**
    * The account number for the bank account in string form. Must be a
    * checking account.
    */
  var account_number: String
  
  /**
    * The country the bank account is in.
    */
  var country: String
  
  /**
    * The currency the bank account is in. This must be a country/currency
    * pairing that Stripe supports.
    */
  var currency: String
  
  /**
    * The type of external account. Should be "bank_account".
    */
  var `object`: String
  
  /**
    * The routing number, sort code, or other country-appropriate institution
    * number for the bank account. For US bank accounts, this is required
    * and should be the ACH routing number, not the wire routing number. If
    * you are providing an IBAN for account_number, this field is not
    * required.
    */
  var routing_number: js.UndefOr[String] = js.undefined
}
object Accountholdername {
  
  @scala.inline
  def apply(account_number: String, country: String, currency: String, `object`: String): Accountholdername = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accountholdername]
  }
  
  @scala.inline
  implicit class AccountholdernameMutableBuilder[Self <: Accountholdername] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_holder_name(value: String): Self = StObject.set(x, "account_holder_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount_holder_nameUndefined: Self = StObject.set(x, "account_holder_name", js.undefined)
    
    @scala.inline
    def setAccount_holder_type(value: individual | company): Self = StObject.set(x, "account_holder_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount_holder_typeNull: Self = StObject.set(x, "account_holder_type", null)
    
    @scala.inline
    def setAccount_holder_typeUndefined: Self = StObject.set(x, "account_holder_type", js.undefined)
    
    @scala.inline
    def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouting_number(value: String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouting_numberUndefined: Self = StObject.set(x, "routing_number", js.undefined)
  }
}
