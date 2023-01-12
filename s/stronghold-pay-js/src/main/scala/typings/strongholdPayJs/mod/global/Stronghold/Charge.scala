package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Charge extends StObject {
  
  var amount: Double
  
  var created_at: String
  
  var id: String
  
  var status: CHARGE_STATUS
  
  var `type`: CHARGE_TYPE
}
object Charge {
  
  inline def apply(amount: Double, created_at: String, id: String, status: CHARGE_STATUS, `type`: CHARGE_TYPE): Charge = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Charge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Charge] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: CHARGE_STATUS): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: CHARGE_TYPE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
