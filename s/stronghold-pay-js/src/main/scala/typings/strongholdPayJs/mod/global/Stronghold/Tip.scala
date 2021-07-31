package typings.strongholdPayJs.mod.global.Stronghold

import typings.strongholdPayJs.anon.Displaymessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tip extends StObject {
  
  var amount: Double
  
  var beneficiary_name: String
  
  var charge_id: String
  
  var created_at: String
  
  var details: js.UndefOr[Displaymessage] = js.undefined
  
  var id: String
  
  var payment_source_id: String
}
object Tip {
  
  @scala.inline
  def apply(
    amount: Double,
    beneficiary_name: String,
    charge_id: String,
    created_at: String,
    id: String,
    payment_source_id: String
  ): Tip = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], beneficiary_name = beneficiary_name.asInstanceOf[js.Any], charge_id = charge_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], payment_source_id = payment_source_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tip]
  }
  
  @scala.inline
  implicit class TipMutableBuilder[Self <: Tip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeneficiary_name(value: String): Self = StObject.set(x, "beneficiary_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharge_id(value: String): Self = StObject.set(x, "charge_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: Displaymessage): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_source_id(value: String): Self = StObject.set(x, "payment_source_id", value.asInstanceOf[js.Any])
  }
}
