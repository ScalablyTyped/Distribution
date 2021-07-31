package typings.stripe.mod.invoices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IThresholdReason extends StObject {
  
  /**
    * The total invoice amount threshold boundary if it triggered the threshold invoice.
    */
  var amount_gte: Double
  
  /**
    * Indicates which line items triggered a threshold invoice.
    */
  var item_reasons: js.Array[IItemReason]
}
object IThresholdReason {
  
  @scala.inline
  def apply(amount_gte: Double, item_reasons: js.Array[IItemReason]): IThresholdReason = {
    val __obj = js.Dynamic.literal(amount_gte = amount_gte.asInstanceOf[js.Any], item_reasons = item_reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThresholdReason]
  }
  
  @scala.inline
  implicit class IThresholdReasonMutableBuilder[Self <: IThresholdReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount_gte(value: Double): Self = StObject.set(x, "amount_gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem_reasons(value: js.Array[IItemReason]): Self = StObject.set(x, "item_reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem_reasonsVarargs(value: IItemReason*): Self = StObject.set(x, "item_reasons", js.Array(value :_*))
  }
}
