package typings.vanillaMasker

import typings.std.Element
import typings.std.NodeListOf
import typings.vanillaMasker.anon.MaskAlphaNum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vanilla-masker", JSImport.Namespace)
  @js.native
  def apply(el: Element): MaskAlphaNum = js.native
  @JSImport("vanilla-masker", JSImport.Namespace)
  @js.native
  def apply(el: NodeListOf[Element]): MaskAlphaNum = js.native
  
  @JSImport("vanilla-masker", "toAlphaNumeric")
  @js.native
  def toAlphaNumeric(value: String): String = js.native
  @JSImport("vanilla-masker", "toAlphaNumeric")
  @js.native
  def toAlphaNumeric(value: Double): String = js.native
  
  @JSImport("vanilla-masker", "toMoney")
  @js.native
  def toMoney(value: String): String = js.native
  @JSImport("vanilla-masker", "toMoney")
  @js.native
  def toMoney(value: String, options: MoneyOptions): String = js.native
  @JSImport("vanilla-masker", "toMoney")
  @js.native
  def toMoney(value: Double): String = js.native
  @JSImport("vanilla-masker", "toMoney")
  @js.native
  def toMoney(value: Double, options: MoneyOptions): String = js.native
  
  @JSImport("vanilla-masker", "toNumber")
  @js.native
  def toNumber(value: String): String = js.native
  @JSImport("vanilla-masker", "toNumber")
  @js.native
  def toNumber(value: Double): String = js.native
  
  @JSImport("vanilla-masker", "toPattern")
  @js.native
  def toPattern(value: String): String = js.native
  @JSImport("vanilla-masker", "toPattern")
  @js.native
  def toPattern(value: String, options: String): String = js.native
  @JSImport("vanilla-masker", "toPattern")
  @js.native
  def toPattern(value: String, options: PatternOptions): String = js.native
  @JSImport("vanilla-masker", "toPattern")
  @js.native
  def toPattern(value: Double): String = js.native
  @JSImport("vanilla-masker", "toPattern")
  @js.native
  def toPattern(value: Double, options: String): String = js.native
  @JSImport("vanilla-masker", "toPattern")
  @js.native
  def toPattern(value: Double, options: PatternOptions): String = js.native
  
  @js.native
  trait MoneyOptions extends StObject {
    
    // Number delimiter -> "12.345.678"
    var delimiter: js.UndefOr[String] = js.native
    
    // Decimal precision -> "90"
    var precision: js.UndefOr[Double] = js.native
    
    // Decimal separator -> ",90"
    var separator: js.UndefOr[String] = js.native
    
    // Money unit -> "12.345.678,90 R$"
    var suffixUnit: js.UndefOr[String] = js.native
    
    // Money unit -> "R$ 12.345.678,90"
    var unit: js.UndefOr[String] = js.native
    
    // Force type only number instead decimal,
    // masking decimals with ",00"
    // Zero cents -> "R$ 1.234.567.890,00"
    var zeroCents: js.UndefOr[Boolean] = js.native
  }
  object MoneyOptions {
    
    @scala.inline
    def apply(): MoneyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoneyOptions]
    }
    
    @scala.inline
    implicit class MoneyOptionsMutableBuilder[Self <: MoneyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setSuffixUnit(value: String): Self = StObject.set(x, "suffixUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUnitUndefined: Self = StObject.set(x, "suffixUnit", js.undefined)
      
      @scala.inline
      def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      @scala.inline
      def setZeroCents(value: Boolean): Self = StObject.set(x, "zeroCents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroCentsUndefined: Self = StObject.set(x, "zeroCents", js.undefined)
    }
  }
  
  @js.native
  trait PatternOptions extends StObject {
    
    // Pattern to mask value against.
    var pattern: js.UndefOr[String] = js.native
    
    // Placeholder option to represent remaining characters to be entered
    var placeholder: js.UndefOr[String] = js.native
  }
  object PatternOptions {
    
    @scala.inline
    def apply(): PatternOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatternOptions]
    }
    
    @scala.inline
    implicit class PatternOptionsMutableBuilder[Self <: PatternOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    }
  }
}
