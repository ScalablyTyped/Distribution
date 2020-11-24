package typings.textMaskAddons.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<text-mask-addons.text-mask-addons.NumberMaskOptions> */
@js.native
trait PartialNumberMaskOptions extends js.Object {
  
  var allowDecimal: js.UndefOr[Boolean] = js.native
  
  var allowLeadingZeroes: js.UndefOr[Boolean] = js.native
  
  var allowNegative: js.UndefOr[Boolean] = js.native
  
  var decimalLimit: js.UndefOr[Double] = js.native
  
  var decimalSymbol: js.UndefOr[String] = js.native
  
  var includeThousandsSeparator: js.UndefOr[Boolean] = js.native
  
  var integerLimit: js.UndefOr[Double | Null] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var requireDecimal: js.UndefOr[Boolean] = js.native
  
  var suffix: js.UndefOr[String] = js.native
  
  var thousandsSeparatorSymbol: js.UndefOr[String] = js.native
}
object PartialNumberMaskOptions {
  
  @scala.inline
  def apply(): PartialNumberMaskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNumberMaskOptions]
  }
  
  @scala.inline
  implicit class PartialNumberMaskOptionsOps[Self <: PartialNumberMaskOptions] (val x: Self) extends AnyVal {
    
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
    def deleteAllowDecimal: Self = this.set("allowDecimal", js.undefined)
    
    @scala.inline
    def setAllowLeadingZeroes(value: Boolean): Self = this.set("allowLeadingZeroes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowLeadingZeroes: Self = this.set("allowLeadingZeroes", js.undefined)
    
    @scala.inline
    def setAllowNegative(value: Boolean): Self = this.set("allowNegative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNegative: Self = this.set("allowNegative", js.undefined)
    
    @scala.inline
    def setDecimalLimit(value: Double): Self = this.set("decimalLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimalLimit: Self = this.set("decimalLimit", js.undefined)
    
    @scala.inline
    def setDecimalSymbol(value: String): Self = this.set("decimalSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimalSymbol: Self = this.set("decimalSymbol", js.undefined)
    
    @scala.inline
    def setIncludeThousandsSeparator(value: Boolean): Self = this.set("includeThousandsSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeThousandsSeparator: Self = this.set("includeThousandsSeparator", js.undefined)
    
    @scala.inline
    def setIntegerLimit(value: Double): Self = this.set("integerLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegerLimit: Self = this.set("integerLimit", js.undefined)
    
    @scala.inline
    def setIntegerLimitNull: Self = this.set("integerLimit", null)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setRequireDecimal(value: Boolean): Self = this.set("requireDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireDecimal: Self = this.set("requireDecimal", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    
    @scala.inline
    def setThousandsSeparatorSymbol(value: String): Self = this.set("thousandsSeparatorSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThousandsSeparatorSymbol: Self = this.set("thousandsSeparatorSymbol", js.undefined)
  }
}
