package typings.tablesorter

import typings.tablesorter.sortDefinitionOrderMod.SortDefinitionOrder
import typings.tablesorter.sortInitiatorMod.SortInitiator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableSortingMod {
  
  @js.native
  trait TableSorting extends StObject {
    
    /**
      * The number of times the sorting has been applied.
      */
    var count: Double = js.native
    
    /**
      * A value indicating whether the order is locked.
      */
    var lockedOrder: Boolean = js.native
    
    /**
      * The order to apply the sorting.
      */
    var order: js.Array[SortDefinitionOrder] = js.native
    
    /**
      * The initiator of the sorting.
      */
    var sortedBy: SortInitiator = js.native
  }
  object TableSorting {
    
    @scala.inline
    def apply(count: Double, lockedOrder: Boolean, order: js.Array[SortDefinitionOrder], sortedBy: SortInitiator): TableSorting = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lockedOrder = lockedOrder.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], sortedBy = sortedBy.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableSorting]
    }
    
    @scala.inline
    implicit class TableSortingMutableBuilder[Self <: TableSorting] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockedOrder(value: Boolean): Self = StObject.set(x, "lockedOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: js.Array[SortDefinitionOrder]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderVarargs(value: SortDefinitionOrder*): Self = StObject.set(x, "order", js.Array(value :_*))
      
      @scala.inline
      def setSortedBy(value: SortInitiator): Self = StObject.set(x, "sortedBy", value.asInstanceOf[js.Any])
    }
  }
}
