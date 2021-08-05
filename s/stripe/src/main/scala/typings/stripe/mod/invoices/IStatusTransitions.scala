package typings.stripe.mod.invoices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStatusTransitions extends StObject {
  
  /**
    * The time that the invoice draft was finalized.
    */
  var finalized_at: Double | Null
  
  /**
    * The time that the invoice was marked uncollectible.
    */
  var marked_uncollectible_at: Double | Null
  
  /**
    * The time that the invoice was paid.
    */
  var paid_at: Double | Null
  
  /**
    * The time that the invoice was voided.
    */
  var voided_at: Double | Null
}
object IStatusTransitions {
  
  inline def apply(): IStatusTransitions = {
    val __obj = js.Dynamic.literal(finalized_at = null, marked_uncollectible_at = null, paid_at = null, voided_at = null)
    __obj.asInstanceOf[IStatusTransitions]
  }
  
  extension [Self <: IStatusTransitions](x: Self) {
    
    inline def setFinalized_at(value: Double): Self = StObject.set(x, "finalized_at", value.asInstanceOf[js.Any])
    
    inline def setFinalized_atNull: Self = StObject.set(x, "finalized_at", null)
    
    inline def setMarked_uncollectible_at(value: Double): Self = StObject.set(x, "marked_uncollectible_at", value.asInstanceOf[js.Any])
    
    inline def setMarked_uncollectible_atNull: Self = StObject.set(x, "marked_uncollectible_at", null)
    
    inline def setPaid_at(value: Double): Self = StObject.set(x, "paid_at", value.asInstanceOf[js.Any])
    
    inline def setPaid_atNull: Self = StObject.set(x, "paid_at", null)
    
    inline def setVoided_at(value: Double): Self = StObject.set(x, "voided_at", value.asInstanceOf[js.Any])
    
    inline def setVoided_atNull: Self = StObject.set(x, "voided_at", null)
  }
}
