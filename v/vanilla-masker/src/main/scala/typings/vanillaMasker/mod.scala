package typings.vanillaMasker

import typings.std.Element
import typings.std.NodeListOf
import typings.vanillaMasker.anon.MaskAlphaNum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(el: Element): MaskAlphaNum = ^.asInstanceOf[js.Dynamic].apply(el.asInstanceOf[js.Any]).asInstanceOf[MaskAlphaNum]
  inline def apply(el: NodeListOf[Element]): MaskAlphaNum = ^.asInstanceOf[js.Dynamic].apply(el.asInstanceOf[js.Any]).asInstanceOf[MaskAlphaNum]
  
  @JSImport("vanilla-masker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toAlphaNumeric(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toAlphaNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toAlphaNumeric(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toAlphaNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toMoney(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toMoney")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toMoney(value: String, options: MoneyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMoney")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toMoney(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toMoney")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toMoney(value: Double, options: MoneyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMoney")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toNumber(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toNumber(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toPattern(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toPattern")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toPattern(value: String, options: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toPattern")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toPattern(value: String, options: PatternOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toPattern")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toPattern(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toPattern")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toPattern(value: Double, options: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toPattern")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toPattern(value: Double, options: PatternOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toPattern")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait MoneyOptions extends StObject {
    
    // Number delimiter -> "12.345.678"
    var delimiter: js.UndefOr[String] = js.undefined
    
    // Decimal precision -> "90"
    var precision: js.UndefOr[Double] = js.undefined
    
    // Decimal separator -> ",90"
    var separator: js.UndefOr[String] = js.undefined
    
    // Money unit -> "12.345.678,90 R$"
    var suffixUnit: js.UndefOr[String] = js.undefined
    
    // Money unit -> "R$ 12.345.678,90"
    var unit: js.UndefOr[String] = js.undefined
    
    // Force type only number instead decimal,
    // masking decimals with ",00"
    // Zero cents -> "R$ 1.234.567.890,00"
    var zeroCents: js.UndefOr[Boolean] = js.undefined
  }
  object MoneyOptions {
    
    inline def apply(): MoneyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoneyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MoneyOptions] (val x: Self) extends AnyVal {
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSuffixUnit(value: String): Self = StObject.set(x, "suffixUnit", value.asInstanceOf[js.Any])
      
      inline def setSuffixUnitUndefined: Self = StObject.set(x, "suffixUnit", js.undefined)
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      inline def setZeroCents(value: Boolean): Self = StObject.set(x, "zeroCents", value.asInstanceOf[js.Any])
      
      inline def setZeroCentsUndefined: Self = StObject.set(x, "zeroCents", js.undefined)
    }
  }
  
  trait PatternOptions extends StObject {
    
    // Pattern to mask value against.
    var pattern: js.UndefOr[String] = js.undefined
    
    // Placeholder option to represent remaining characters to be entered
    var placeholder: js.UndefOr[String] = js.undefined
  }
  object PatternOptions {
    
    inline def apply(): PatternOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatternOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PatternOptions] (val x: Self) extends AnyVal {
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    }
  }
}
