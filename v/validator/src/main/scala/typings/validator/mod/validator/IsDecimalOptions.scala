package typings.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDecimalOptions extends StObject {
  
  /**
    * `decimal_digits` is given as a range like `'1,3'`,
    * a specific value like `'3'` or min like `'1,'`
    *
    * @default '1,'
    */
  var decimal_digits: js.UndefOr[String] = js.undefined
  
  /**
    * @default false
    */
  var force_decimal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * DecimalLocale
    *
    * @default 'en-US'
    */
  var locale: js.UndefOr[DecimalLocale] = js.undefined
}
object IsDecimalOptions {
  
  inline def apply(): IsDecimalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsDecimalOptions]
  }
  
  extension [Self <: IsDecimalOptions](x: Self) {
    
    inline def setDecimal_digits(value: String): Self = StObject.set(x, "decimal_digits", value.asInstanceOf[js.Any])
    
    inline def setDecimal_digitsUndefined: Self = StObject.set(x, "decimal_digits", js.undefined)
    
    inline def setForce_decimal(value: Boolean): Self = StObject.set(x, "force_decimal", value.asInstanceOf[js.Any])
    
    inline def setForce_decimalUndefined: Self = StObject.set(x, "force_decimal", js.undefined)
    
    inline def setLocale(value: DecimalLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
