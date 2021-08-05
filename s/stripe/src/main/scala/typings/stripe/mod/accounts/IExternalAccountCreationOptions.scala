package typings.stripe.mod.accounts

import typings.stripe.mod.IDataOptionsWithMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExternalAccountCreationOptions
  extends StObject
     with IDataOptionsWithMetadata {
  
  /**
    * Only applicable on accounts (not customers or recipients). If you set this to true (or if this is the first external account being added
    * in this currency) this card will become the default external account for its currency.
    */
  var default_for_currency: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When adding a card to a customer, the parameter name is source. When
    * adding to an account, the parameter name is external_account. The
    * value can either be a token, like the ones returned by our Stripe.js, or a
    * dictionary containing a user’s credit card details (with the options shown
    * below). Stripe will automatically validate the card.
    */
  var external_account: String
}
object IExternalAccountCreationOptions {
  
  inline def apply(external_account: String): IExternalAccountCreationOptions = {
    val __obj = js.Dynamic.literal(external_account = external_account.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExternalAccountCreationOptions]
  }
  
  extension [Self <: IExternalAccountCreationOptions](x: Self) {
    
    inline def setDefault_for_currency(value: Boolean): Self = StObject.set(x, "default_for_currency", value.asInstanceOf[js.Any])
    
    inline def setDefault_for_currencyUndefined: Self = StObject.set(x, "default_for_currency", js.undefined)
    
    inline def setExternal_account(value: String): Self = StObject.set(x, "external_account", value.asInstanceOf[js.Any])
  }
}
