package typings.stripe.mod.accounts

import typings.stripe.stripeStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccountCreationOptions extends IAccountUpdateOptions {
  
  /**
    * The country the account holder resides in or that the business is legally
    * established in. For example, if you are in the United States and the
    * business you’re creating an account for is legally represented in Canada,
    * you would use “CA” as the country for the account being created.
    *
    * optional, default is your own country
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * The type of Stripe account to create. Currently must be custom, as only Custom
    * accounts may be created via the API.
    */
  var `type`: custom = js.native
}
object IAccountCreationOptions {
  
  @scala.inline
  def apply(`type`: custom): IAccountCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccountCreationOptions]
  }
  
  @scala.inline
  implicit class IAccountCreationOptionsMutableBuilder[Self <: IAccountCreationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setType(value: custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
