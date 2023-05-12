package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCurrencySnakeMod {
  
  trait EnabledCurrencySnake extends StObject {
    
    var code: String
    
    var decimals: Double
    
    var name: String
    
    var rate: Double
    
    var symbol: String
    
    var `type`: String
  }
  object EnabledCurrencySnake {
    
    inline def apply(code: String, decimals: Double, name: String, rate: Double, symbol: String, `type`: String): EnabledCurrencySnake = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnabledCurrencySnake]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnabledCurrencySnake] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormatInputSnake extends StObject {
    
    var code: String
    
    var decimals: Double
    
    var locale: String
    
    var rate: Double
  }
  object FormatInputSnake {
    
    inline def apply(code: String, decimals: Double, locale: String, rate: Double): FormatInputSnake = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatInputSnake]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatInputSnake] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectCurrencyReturnSnake extends StObject {
    
    var account_id: js.UndefOr[String] = js.undefined
    
    var cart_id: js.UndefOr[String] = js.undefined
    
    var currency: String
    
    var public_key: js.UndefOr[String] = js.undefined
  }
  object SelectCurrencyReturnSnake {
    
    inline def apply(currency: String): SelectCurrencyReturnSnake = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectCurrencyReturnSnake]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectCurrencyReturnSnake] (val x: Self) extends AnyVal {
      
      inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
      
      inline def setAccount_idUndefined: Self = StObject.set(x, "account_id", js.undefined)
      
      inline def setCart_id(value: String): Self = StObject.set(x, "cart_id", value.asInstanceOf[js.Any])
      
      inline def setCart_idUndefined: Self = StObject.set(x, "cart_id", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
      
      inline def setPublic_keyUndefined: Self = StObject.set(x, "public_key", js.undefined)
    }
  }
}
