package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryHierarchyItemsResult extends StObject {
  
  /**
    * The count of items.
    */
  var count: Double
  
  /**
    * Indicates if the max return limit was hit but there are still more items
    */
  var hasMore: Boolean
  
  /**
    * The list of items
    */
  var value: js.Array[QueryHierarchyItem]
}
object QueryHierarchyItemsResult {
  
  inline def apply(count: Double, hasMore: Boolean, value: js.Array[QueryHierarchyItem]): QueryHierarchyItemsResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], hasMore = hasMore.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryHierarchyItemsResult]
  }
  
  extension [Self <: QueryHierarchyItemsResult](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[QueryHierarchyItem]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: QueryHierarchyItem*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
