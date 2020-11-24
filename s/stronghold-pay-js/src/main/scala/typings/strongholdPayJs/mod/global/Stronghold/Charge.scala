package typings.strongholdPayJs.mod.global.Stronghold

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Charge extends js.Object {
  
  var amount: Double = js.native
  
  var created_at: String = js.native
  
  var id: String = js.native
  
  var status: CHARGE_STATUS = js.native
  
  var `type`: CHARGE_TYPE = js.native
}
object Charge {
  
  @scala.inline
  def apply(amount: Double, created_at: String, id: String, status: CHARGE_STATUS, `type`: CHARGE_TYPE): Charge = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Charge]
  }
  
  @scala.inline
  implicit class ChargeOps[Self <: Charge] (val x: Self) extends AnyVal {
    
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
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: CHARGE_STATUS): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CHARGE_TYPE): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
