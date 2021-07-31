package typings.textMaskAddons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<text-mask-addons.text-mask-addons.NumberMaskOptions> */
  trait PartialNumberMaskOptions extends StObject {
    
    var allowDecimal: js.UndefOr[Boolean] = js.undefined
    
    var allowLeadingZeroes: js.UndefOr[Boolean] = js.undefined
    
    var allowNegative: js.UndefOr[Boolean] = js.undefined
    
    var decimalLimit: js.UndefOr[Double] = js.undefined
    
    var decimalSymbol: js.UndefOr[String] = js.undefined
    
    var includeThousandsSeparator: js.UndefOr[Boolean] = js.undefined
    
    var integerLimit: js.UndefOr[Double | Null] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var requireDecimal: js.UndefOr[Boolean] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var thousandsSeparatorSymbol: js.UndefOr[String] = js.undefined
  }
  object PartialNumberMaskOptions {
    
    @scala.inline
    def apply(): PartialNumberMaskOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialNumberMaskOptions]
    }
    
    @scala.inline
    implicit class PartialNumberMaskOptionsMutableBuilder[Self <: PartialNumberMaskOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDecimal(value: Boolean): Self = StObject.set(x, "allowDecimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDecimalUndefined: Self = StObject.set(x, "allowDecimal", js.undefined)
      
      @scala.inline
      def setAllowLeadingZeroes(value: Boolean): Self = StObject.set(x, "allowLeadingZeroes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowLeadingZeroesUndefined: Self = StObject.set(x, "allowLeadingZeroes", js.undefined)
      
      @scala.inline
      def setAllowNegative(value: Boolean): Self = StObject.set(x, "allowNegative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowNegativeUndefined: Self = StObject.set(x, "allowNegative", js.undefined)
      
      @scala.inline
      def setDecimalLimit(value: Double): Self = StObject.set(x, "decimalLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalLimitUndefined: Self = StObject.set(x, "decimalLimit", js.undefined)
      
      @scala.inline
      def setDecimalSymbol(value: String): Self = StObject.set(x, "decimalSymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalSymbolUndefined: Self = StObject.set(x, "decimalSymbol", js.undefined)
      
      @scala.inline
      def setIncludeThousandsSeparator(value: Boolean): Self = StObject.set(x, "includeThousandsSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeThousandsSeparatorUndefined: Self = StObject.set(x, "includeThousandsSeparator", js.undefined)
      
      @scala.inline
      def setIntegerLimit(value: Double): Self = StObject.set(x, "integerLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegerLimitNull: Self = StObject.set(x, "integerLimit", null)
      
      @scala.inline
      def setIntegerLimitUndefined: Self = StObject.set(x, "integerLimit", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRequireDecimal(value: Boolean): Self = StObject.set(x, "requireDecimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireDecimalUndefined: Self = StObject.set(x, "requireDecimal", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setThousandsSeparatorSymbol(value: String): Self = StObject.set(x, "thousandsSeparatorSymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThousandsSeparatorSymbolUndefined: Self = StObject.set(x, "thousandsSeparatorSymbol", js.undefined)
    }
  }
}
