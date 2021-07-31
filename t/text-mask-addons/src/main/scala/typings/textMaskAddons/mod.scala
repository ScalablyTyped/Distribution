package typings.textMaskAddons

import typings.textMaskAddons.anon.PartialNumberMaskOptions
import typings.textMaskCore.mod.Mask
import typings.textMaskCore.mod.Pipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("text-mask-addons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createAutoCorrectedDatePipe(): Pipe = ^.asInstanceOf[js.Dynamic].applyDynamic("createAutoCorrectedDatePipe")().asInstanceOf[Pipe]
  @scala.inline
  def createAutoCorrectedDatePipe(dateFormat: String): Pipe = ^.asInstanceOf[js.Dynamic].applyDynamic("createAutoCorrectedDatePipe")(dateFormat.asInstanceOf[js.Any]).asInstanceOf[Pipe]
  @scala.inline
  def createAutoCorrectedDatePipe(dateFormat: String, validYears: DatePipeYears): Pipe = (^.asInstanceOf[js.Dynamic].applyDynamic("createAutoCorrectedDatePipe")(dateFormat.asInstanceOf[js.Any], validYears.asInstanceOf[js.Any])).asInstanceOf[Pipe]
  @scala.inline
  def createAutoCorrectedDatePipe(dateFormat: Unit, validYears: DatePipeYears): Pipe = (^.asInstanceOf[js.Dynamic].applyDynamic("createAutoCorrectedDatePipe")(dateFormat.asInstanceOf[js.Any], validYears.asInstanceOf[js.Any])).asInstanceOf[Pipe]
  
  @scala.inline
  def createNumberMask(): js.Function1[/* rawValue */ String, Mask] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNumberMask")().asInstanceOf[js.Function1[/* rawValue */ String, Mask]]
  @scala.inline
  def createNumberMask(maskOptions: PartialNumberMaskOptions): js.Function1[/* rawValue */ String, Mask] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNumberMask")(maskOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* rawValue */ String, Mask]]
  
  trait DatePipeYears extends StObject {
    
    var maxYear: Double
    
    var minYear: Double
  }
  object DatePipeYears {
    
    @scala.inline
    def apply(maxYear: Double, minYear: Double): DatePipeYears = {
      val __obj = js.Dynamic.literal(maxYear = maxYear.asInstanceOf[js.Any], minYear = minYear.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatePipeYears]
    }
    
    @scala.inline
    implicit class DatePipeYearsMutableBuilder[Self <: DatePipeYears] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxYear(value: Double): Self = StObject.set(x, "maxYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinYear(value: Double): Self = StObject.set(x, "minYear", value.asInstanceOf[js.Any])
    }
  }
  
  trait NumberMaskOptions extends StObject {
    
    var allowDecimal: Boolean
    
    var allowLeadingZeroes: Boolean
    
    var allowNegative: Boolean
    
    var decimalLimit: Double
    
    var decimalSymbol: String
    
    var includeThousandsSeparator: Boolean
    
    var integerLimit: Double | Null
    
    var prefix: String
    
    var requireDecimal: Boolean
    
    var suffix: String
    
    var thousandsSeparatorSymbol: String
  }
  object NumberMaskOptions {
    
    @scala.inline
    def apply(
      allowDecimal: Boolean,
      allowLeadingZeroes: Boolean,
      allowNegative: Boolean,
      decimalLimit: Double,
      decimalSymbol: String,
      includeThousandsSeparator: Boolean,
      prefix: String,
      requireDecimal: Boolean,
      suffix: String,
      thousandsSeparatorSymbol: String
    ): NumberMaskOptions = {
      val __obj = js.Dynamic.literal(allowDecimal = allowDecimal.asInstanceOf[js.Any], allowLeadingZeroes = allowLeadingZeroes.asInstanceOf[js.Any], allowNegative = allowNegative.asInstanceOf[js.Any], decimalLimit = decimalLimit.asInstanceOf[js.Any], decimalSymbol = decimalSymbol.asInstanceOf[js.Any], includeThousandsSeparator = includeThousandsSeparator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], requireDecimal = requireDecimal.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], thousandsSeparatorSymbol = thousandsSeparatorSymbol.asInstanceOf[js.Any], integerLimit = null)
      __obj.asInstanceOf[NumberMaskOptions]
    }
    
    @scala.inline
    implicit class NumberMaskOptionsMutableBuilder[Self <: NumberMaskOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDecimal(value: Boolean): Self = StObject.set(x, "allowDecimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowLeadingZeroes(value: Boolean): Self = StObject.set(x, "allowLeadingZeroes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowNegative(value: Boolean): Self = StObject.set(x, "allowNegative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalLimit(value: Double): Self = StObject.set(x, "decimalLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalSymbol(value: String): Self = StObject.set(x, "decimalSymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeThousandsSeparator(value: Boolean): Self = StObject.set(x, "includeThousandsSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegerLimit(value: Double): Self = StObject.set(x, "integerLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegerLimitNull: Self = StObject.set(x, "integerLimit", null)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireDecimal(value: Boolean): Self = StObject.set(x, "requireDecimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThousandsSeparatorSymbol(value: String): Self = StObject.set(x, "thousandsSeparatorSymbol", value.asInstanceOf[js.Any])
    }
  }
}
