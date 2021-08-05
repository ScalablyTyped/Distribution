package typings.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsCurrencyOptions extends StObject {
  
  /**
    * @default true
    */
  var allow_decimal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default false
    */
  var allow_negative_sign_placeholder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default true
    */
  var allow_negatives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default false
    */
  var allow_space_after_digits: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default false
    */
  var allow_space_after_symbol: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default '.'
    */
  var decimal_separator: js.UndefOr[String] = js.undefined
  
  /**
    * The array `digits_after_decimal` is filled with the exact number of digits allowed not a range, for example a range `1` to `3` will be given as `[1, 2, 3]`.
    *
    * @default [2]
    */
  var digits_after_decimal: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * @default false
    */
  var negative_sign_after_digits: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default false
    */
  var negative_sign_before_digits: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default false
    */
  var parens_for_negatives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default false
    */
  var require_decimal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default false
    */
  var require_symbol: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default '$'
    */
  var symbol: js.UndefOr[String] = js.undefined
  
  /**
    * @default false
    */
  var symbol_after_digits: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default ','
    */
  var thousands_separator: js.UndefOr[String] = js.undefined
}
object IsCurrencyOptions {
  
  inline def apply(): IsCurrencyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsCurrencyOptions]
  }
  
  extension [Self <: IsCurrencyOptions](x: Self) {
    
    inline def setAllow_decimal(value: Boolean): Self = StObject.set(x, "allow_decimal", value.asInstanceOf[js.Any])
    
    inline def setAllow_decimalUndefined: Self = StObject.set(x, "allow_decimal", js.undefined)
    
    inline def setAllow_negative_sign_placeholder(value: Boolean): Self = StObject.set(x, "allow_negative_sign_placeholder", value.asInstanceOf[js.Any])
    
    inline def setAllow_negative_sign_placeholderUndefined: Self = StObject.set(x, "allow_negative_sign_placeholder", js.undefined)
    
    inline def setAllow_negatives(value: Boolean): Self = StObject.set(x, "allow_negatives", value.asInstanceOf[js.Any])
    
    inline def setAllow_negativesUndefined: Self = StObject.set(x, "allow_negatives", js.undefined)
    
    inline def setAllow_space_after_digits(value: Boolean): Self = StObject.set(x, "allow_space_after_digits", value.asInstanceOf[js.Any])
    
    inline def setAllow_space_after_digitsUndefined: Self = StObject.set(x, "allow_space_after_digits", js.undefined)
    
    inline def setAllow_space_after_symbol(value: Boolean): Self = StObject.set(x, "allow_space_after_symbol", value.asInstanceOf[js.Any])
    
    inline def setAllow_space_after_symbolUndefined: Self = StObject.set(x, "allow_space_after_symbol", js.undefined)
    
    inline def setDecimal_separator(value: String): Self = StObject.set(x, "decimal_separator", value.asInstanceOf[js.Any])
    
    inline def setDecimal_separatorUndefined: Self = StObject.set(x, "decimal_separator", js.undefined)
    
    inline def setDigits_after_decimal(value: js.Array[Double]): Self = StObject.set(x, "digits_after_decimal", value.asInstanceOf[js.Any])
    
    inline def setDigits_after_decimalUndefined: Self = StObject.set(x, "digits_after_decimal", js.undefined)
    
    inline def setDigits_after_decimalVarargs(value: Double*): Self = StObject.set(x, "digits_after_decimal", js.Array(value :_*))
    
    inline def setNegative_sign_after_digits(value: Boolean): Self = StObject.set(x, "negative_sign_after_digits", value.asInstanceOf[js.Any])
    
    inline def setNegative_sign_after_digitsUndefined: Self = StObject.set(x, "negative_sign_after_digits", js.undefined)
    
    inline def setNegative_sign_before_digits(value: Boolean): Self = StObject.set(x, "negative_sign_before_digits", value.asInstanceOf[js.Any])
    
    inline def setNegative_sign_before_digitsUndefined: Self = StObject.set(x, "negative_sign_before_digits", js.undefined)
    
    inline def setParens_for_negatives(value: Boolean): Self = StObject.set(x, "parens_for_negatives", value.asInstanceOf[js.Any])
    
    inline def setParens_for_negativesUndefined: Self = StObject.set(x, "parens_for_negatives", js.undefined)
    
    inline def setRequire_decimal(value: Boolean): Self = StObject.set(x, "require_decimal", value.asInstanceOf[js.Any])
    
    inline def setRequire_decimalUndefined: Self = StObject.set(x, "require_decimal", js.undefined)
    
    inline def setRequire_symbol(value: Boolean): Self = StObject.set(x, "require_symbol", value.asInstanceOf[js.Any])
    
    inline def setRequire_symbolUndefined: Self = StObject.set(x, "require_symbol", js.undefined)
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setSymbol_after_digits(value: Boolean): Self = StObject.set(x, "symbol_after_digits", value.asInstanceOf[js.Any])
    
    inline def setSymbol_after_digitsUndefined: Self = StObject.set(x, "symbol_after_digits", js.undefined)
    
    inline def setThousands_separator(value: String): Self = StObject.set(x, "thousands_separator", value.asInstanceOf[js.Any])
    
    inline def setThousands_separatorUndefined: Self = StObject.set(x, "thousands_separator", js.undefined)
  }
}
