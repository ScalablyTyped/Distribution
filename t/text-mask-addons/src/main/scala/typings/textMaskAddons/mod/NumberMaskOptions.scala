package typings.textMaskAddons.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberMaskOptions extends js.Object {
  
  var allowDecimal: Boolean = js.native
  
  var allowLeadingZeroes: Boolean = js.native
  
  var allowNegative: Boolean = js.native
  
  var decimalLimit: Double = js.native
  
  var decimalSymbol: String = js.native
  
  var includeThousandsSeparator: Boolean = js.native
  
  var integerLimit: Double | Null = js.native
  
  var prefix: String = js.native
  
  var requireDecimal: Boolean = js.native
  
  var suffix: String = js.native
  
  var thousandsSeparatorSymbol: String = js.native
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
    val __obj = js.Dynamic.literal(allowDecimal = allowDecimal.asInstanceOf[js.Any], allowLeadingZeroes = allowLeadingZeroes.asInstanceOf[js.Any], allowNegative = allowNegative.asInstanceOf[js.Any], decimalLimit = decimalLimit.asInstanceOf[js.Any], decimalSymbol = decimalSymbol.asInstanceOf[js.Any], includeThousandsSeparator = includeThousandsSeparator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], requireDecimal = requireDecimal.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], thousandsSeparatorSymbol = thousandsSeparatorSymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberMaskOptions]
  }
  
  @scala.inline
  implicit class NumberMaskOptionsOps[Self <: NumberMaskOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowDecimal(value: Boolean): Self = this.set("allowDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowLeadingZeroes(value: Boolean): Self = this.set("allowLeadingZeroes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNegative(value: Boolean): Self = this.set("allowNegative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalLimit(value: Double): Self = this.set("decimalLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalSymbol(value: String): Self = this.set("decimalSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeThousandsSeparator(value: Boolean): Self = this.set("includeThousandsSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireDecimal(value: Boolean): Self = this.set("requireDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThousandsSeparatorSymbol(value: String): Self = this.set("thousandsSeparatorSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerLimit(value: Double): Self = this.set("integerLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerLimitNull: Self = this.set("integerLimit", null)
  }
}
