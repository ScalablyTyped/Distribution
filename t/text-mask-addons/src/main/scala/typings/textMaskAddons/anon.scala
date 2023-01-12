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
    
    inline def apply(): PartialNumberMaskOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialNumberMaskOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialNumberMaskOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowDecimal(value: Boolean): Self = StObject.set(x, "allowDecimal", value.asInstanceOf[js.Any])
      
      inline def setAllowDecimalUndefined: Self = StObject.set(x, "allowDecimal", js.undefined)
      
      inline def setAllowLeadingZeroes(value: Boolean): Self = StObject.set(x, "allowLeadingZeroes", value.asInstanceOf[js.Any])
      
      inline def setAllowLeadingZeroesUndefined: Self = StObject.set(x, "allowLeadingZeroes", js.undefined)
      
      inline def setAllowNegative(value: Boolean): Self = StObject.set(x, "allowNegative", value.asInstanceOf[js.Any])
      
      inline def setAllowNegativeUndefined: Self = StObject.set(x, "allowNegative", js.undefined)
      
      inline def setDecimalLimit(value: Double): Self = StObject.set(x, "decimalLimit", value.asInstanceOf[js.Any])
      
      inline def setDecimalLimitUndefined: Self = StObject.set(x, "decimalLimit", js.undefined)
      
      inline def setDecimalSymbol(value: String): Self = StObject.set(x, "decimalSymbol", value.asInstanceOf[js.Any])
      
      inline def setDecimalSymbolUndefined: Self = StObject.set(x, "decimalSymbol", js.undefined)
      
      inline def setIncludeThousandsSeparator(value: Boolean): Self = StObject.set(x, "includeThousandsSeparator", value.asInstanceOf[js.Any])
      
      inline def setIncludeThousandsSeparatorUndefined: Self = StObject.set(x, "includeThousandsSeparator", js.undefined)
      
      inline def setIntegerLimit(value: Double): Self = StObject.set(x, "integerLimit", value.asInstanceOf[js.Any])
      
      inline def setIntegerLimitNull: Self = StObject.set(x, "integerLimit", null)
      
      inline def setIntegerLimitUndefined: Self = StObject.set(x, "integerLimit", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRequireDecimal(value: Boolean): Self = StObject.set(x, "requireDecimal", value.asInstanceOf[js.Any])
      
      inline def setRequireDecimalUndefined: Self = StObject.set(x, "requireDecimal", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setThousandsSeparatorSymbol(value: String): Self = StObject.set(x, "thousandsSeparatorSymbol", value.asInstanceOf[js.Any])
      
      inline def setThousandsSeparatorSymbolUndefined: Self = StObject.set(x, "thousandsSeparatorSymbol", js.undefined)
    }
  }
}
