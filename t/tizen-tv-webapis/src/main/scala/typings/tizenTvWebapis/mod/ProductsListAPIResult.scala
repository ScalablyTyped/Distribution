package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductsListAPIResult extends StObject {
  
  var CPResult: String
  
  var CPStatus: String
  
  var CheckValue: String
  
  var ItemDetails: typings.tizenTvWebapis.mod.ItemDetails
  
  var TotalCount: Double
}
object ProductsListAPIResult {
  
  inline def apply(
    CPResult: String,
    CPStatus: String,
    CheckValue: String,
    ItemDetails: ItemDetails,
    TotalCount: Double
  ): ProductsListAPIResult = {
    val __obj = js.Dynamic.literal(CPResult = CPResult.asInstanceOf[js.Any], CPStatus = CPStatus.asInstanceOf[js.Any], CheckValue = CheckValue.asInstanceOf[js.Any], ItemDetails = ItemDetails.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductsListAPIResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductsListAPIResult] (val x: Self) extends AnyVal {
    
    inline def setCPResult(value: String): Self = StObject.set(x, "CPResult", value.asInstanceOf[js.Any])
    
    inline def setCPStatus(value: String): Self = StObject.set(x, "CPStatus", value.asInstanceOf[js.Any])
    
    inline def setCheckValue(value: String): Self = StObject.set(x, "CheckValue", value.asInstanceOf[js.Any])
    
    inline def setItemDetails(value: ItemDetails): Self = StObject.set(x, "ItemDetails", value.asInstanceOf[js.Any])
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
  }
}
