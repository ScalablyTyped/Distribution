package typings.swellJs

import typings.swellJs.typesCurrencySnakeMod.EnabledCurrencySnake
import typings.swellJs.typesCurrencySnakeMod.FormatInputSnake
import typings.swellJs.typesCurrencySnakeMod.SelectCurrencyReturnSnake
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCurrencyMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesCurrencyCamelMod.EnabledCurrencyCamel because var conflicts: code, decimals, name, rate, symbol, `type`. Inlined  */ trait EnabledCurrency
    extends StObject
       with EnabledCurrencySnake
  object EnabledCurrency {
    
    inline def apply(code: String, decimals: Double, name: String, rate: Double, symbol: String, `type`: String): EnabledCurrency = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnabledCurrency]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesCurrencyCamelMod.FormatInputCamel because var conflicts: code, decimals, locale, rate. Inlined  */ trait FormatInput
    extends StObject
       with FormatInputSnake
  object FormatInput {
    
    inline def apply(code: String, decimals: Double, locale: String, rate: Double): FormatInput = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatInput]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesCurrencyCamelMod.SelectCurrencyReturnCamel because var conflicts: account_id, cart_id, currency, public_key. Inlined  */ trait SelectCurrencyReturn
    extends StObject
       with SelectCurrencyReturnSnake
  object SelectCurrencyReturn {
    
    inline def apply(currency: String): SelectCurrencyReturn = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectCurrencyReturn]
    }
  }
}
