package typings.vanillaMasker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoneyOptions extends js.Object {
  
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
  implicit class MoneyOptionsOps[Self <: MoneyOptions] (val x: Self) extends AnyVal {
    
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
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setSuffixUnit(value: String): Self = this.set("suffixUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffixUnit: Self = this.set("suffixUnit", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    
    @scala.inline
    def setZeroCents(value: Boolean): Self = this.set("zeroCents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZeroCents: Self = this.set("zeroCents", js.undefined)
  }
}
