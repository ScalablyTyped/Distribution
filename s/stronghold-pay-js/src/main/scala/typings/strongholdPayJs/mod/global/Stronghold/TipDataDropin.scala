package typings.strongholdPayJs.mod.global.Stronghold

import typings.strongholdPayJs.anon.DisplayMessage_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TipDataDropin extends js.Object {
  
  /**
    * The amount to charge, specified in the smallest divisible currency unit. For example, number of cents of United States dollar.
    */
  var amount: Double = js.native
  
  var beneficiaryName: String = js.native
  
  var details: js.UndefOr[DisplayMessage_] = js.native
}
object TipDataDropin {
  
  @scala.inline
  def apply(amount: Double, beneficiaryName: String): TipDataDropin = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], beneficiaryName = beneficiaryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TipDataDropin]
  }
  
  @scala.inline
  implicit class TipDataDropinOps[Self <: TipDataDropin] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeneficiaryName(value: String): Self = this.set("beneficiaryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: DisplayMessage_): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
  }
}
