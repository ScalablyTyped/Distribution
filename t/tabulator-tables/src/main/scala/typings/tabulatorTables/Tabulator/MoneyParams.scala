package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoneyParams extends _FormatterParams {
  
  // Money
  var decimal: js.UndefOr[String] = js.native
  
  var precision: js.UndefOr[Boolean | Double] = js.native
  
  var symbol: js.UndefOr[String] = js.native
  
  var symbolAfter: js.UndefOr[Boolean] = js.native
  
  var thousand: js.UndefOr[String] = js.native
}
object MoneyParams {
  
  @scala.inline
  def apply(): MoneyParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoneyParams]
  }
  
  @scala.inline
  implicit class MoneyParamsOps[Self <: MoneyParams] (val x: Self) extends AnyVal {
    
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
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimal: Self = this.set("decimal", js.undefined)
    
    @scala.inline
    def setPrecision(value: Boolean | Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    
    @scala.inline
    def setSymbolAfter(value: Boolean): Self = this.set("symbolAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolAfter: Self = this.set("symbolAfter", js.undefined)
    
    @scala.inline
    def setThousand(value: String): Self = this.set("thousand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThousand: Self = this.set("thousand", js.undefined)
  }
}
