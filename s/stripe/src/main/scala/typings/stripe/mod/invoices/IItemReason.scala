package typings.stripe.mod.invoices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IItemReason extends StObject {
  
  /**
    * The IDs of the line items that triggered the threshold invoice.
    */
  var line_item_ids: js.Array[String]
  
  /**
    * The quantity threshold boundary that applied to the given line item.
    */
  var usage_gte: Double
}
object IItemReason {
  
  inline def apply(line_item_ids: js.Array[String], usage_gte: Double): IItemReason = {
    val __obj = js.Dynamic.literal(line_item_ids = line_item_ids.asInstanceOf[js.Any], usage_gte = usage_gte.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemReason]
  }
  
  extension [Self <: IItemReason](x: Self) {
    
    inline def setLine_item_ids(value: js.Array[String]): Self = StObject.set(x, "line_item_ids", value.asInstanceOf[js.Any])
    
    inline def setLine_item_idsVarargs(value: String*): Self = StObject.set(x, "line_item_ids", js.Array(value :_*))
    
    inline def setUsage_gte(value: Double): Self = StObject.set(x, "usage_gte", value.asInstanceOf[js.Any])
  }
}
