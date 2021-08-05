package typings.stripe.mod.accounts

import typings.stripe.mod.IDataOptionsWithMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExternalAccountUpdateOptions
  extends StObject
     with IDataOptionsWithMetadata {
  
  /**
    * If set to true, this bank account will become the default external account for its currency.
    */
  var default_for_currency: js.UndefOr[Boolean] = js.undefined
}
object IExternalAccountUpdateOptions {
  
  inline def apply(): IExternalAccountUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExternalAccountUpdateOptions]
  }
  
  extension [Self <: IExternalAccountUpdateOptions](x: Self) {
    
    inline def setDefault_for_currency(value: Boolean): Self = StObject.set(x, "default_for_currency", value.asInstanceOf[js.Any])
    
    inline def setDefault_for_currencyUndefined: Self = StObject.set(x, "default_for_currency", js.undefined)
  }
}
