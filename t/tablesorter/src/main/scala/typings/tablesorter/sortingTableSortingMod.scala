package typings.tablesorter

import typings.tablesorter.sortingSortDefinitionOrderMod.SortDefinitionOrder
import typings.tablesorter.sortingSortInitiatorMod.SortInitiator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortingTableSortingMod {
  
  trait TableSorting extends StObject {
    
    /**
      * The number of times the sorting has been applied.
      */
    var count: Double
    
    /**
      * A value indicating whether the order is locked.
      */
    var lockedOrder: Boolean
    
    /**
      * The order to apply the sorting.
      */
    var order: js.Array[SortDefinitionOrder]
    
    /**
      * The initiator of the sorting.
      */
    var sortedBy: SortInitiator
  }
  object TableSorting {
    
    inline def apply(count: Double, lockedOrder: Boolean, order: js.Array[SortDefinitionOrder], sortedBy: SortInitiator): TableSorting = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lockedOrder = lockedOrder.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], sortedBy = sortedBy.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableSorting]
    }
    
    extension [Self <: TableSorting](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setLockedOrder(value: Boolean): Self = StObject.set(x, "lockedOrder", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: js.Array[SortDefinitionOrder]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderVarargs(value: SortDefinitionOrder*): Self = StObject.set(x, "order", js.Array(value*))
      
      inline def setSortedBy(value: SortInitiator): Self = StObject.set(x, "sortedBy", value.asInstanceOf[js.Any])
    }
  }
}
