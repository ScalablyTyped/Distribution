package typings.stripe.mod.invoices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStatusTransitions extends StObject {
  
  /**
    * The time that the invoice draft was finalized.
    */
  var finalized_at: Double | Null = js.native
  
  /**
    * The time that the invoice was marked uncollectible.
    */
  var marked_uncollectible_at: Double | Null = js.native
  
  /**
    * The time that the invoice was paid.
    */
  var paid_at: Double | Null = js.native
  
  /**
    * The time that the invoice was voided.
    */
  var voided_at: Double | Null = js.native
}
object IStatusTransitions {
  
  @scala.inline
  def apply(): IStatusTransitions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStatusTransitions]
  }
  
  @scala.inline
  implicit class IStatusTransitionsMutableBuilder[Self <: IStatusTransitions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinalized_at(value: Double): Self = StObject.set(x, "finalized_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalized_atNull: Self = StObject.set(x, "finalized_at", null)
    
    @scala.inline
    def setMarked_uncollectible_at(value: Double): Self = StObject.set(x, "marked_uncollectible_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarked_uncollectible_atNull: Self = StObject.set(x, "marked_uncollectible_at", null)
    
    @scala.inline
    def setPaid_at(value: Double): Self = StObject.set(x, "paid_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaid_atNull: Self = StObject.set(x, "paid_at", null)
    
    @scala.inline
    def setVoided_at(value: Double): Self = StObject.set(x, "voided_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoided_atNull: Self = StObject.set(x, "voided_at", null)
  }
}
