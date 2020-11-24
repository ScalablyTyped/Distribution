package typings.stripe.mod.invoices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStatusTransitions extends js.Object {
  
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
  implicit class IStatusTransitionsOps[Self <: IStatusTransitions] (val x: Self) extends AnyVal {
    
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
    def setFinalized_at(value: Double): Self = this.set("finalized_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalized_atNull: Self = this.set("finalized_at", null)
    
    @scala.inline
    def setMarked_uncollectible_at(value: Double): Self = this.set("marked_uncollectible_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarked_uncollectible_atNull: Self = this.set("marked_uncollectible_at", null)
    
    @scala.inline
    def setPaid_at(value: Double): Self = this.set("paid_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaid_atNull: Self = this.set("paid_at", null)
    
    @scala.inline
    def setVoided_at(value: Double): Self = this.set("voided_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoided_atNull: Self = this.set("voided_at", null)
  }
}
