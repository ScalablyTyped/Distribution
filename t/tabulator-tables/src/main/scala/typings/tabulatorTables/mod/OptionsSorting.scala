package typings.tabulatorTables.mod

import typings.tabulatorTables.tabulatorTablesStrings.header
import typings.tabulatorTables.tabulatorTablesStrings.icon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsSorting extends StObject {
  
  var headerSortClickElement: js.UndefOr[header | icon] = js.undefined
  
  /** Array of sorters to be applied on load. */
  var initialSort: js.UndefOr[js.Array[Sorter]] = js.undefined
  
  /** reverse the order that multiple sorters are applied to the table. */
  var sortOrderReverse: js.UndefOr[Boolean] = js.undefined
}
object OptionsSorting {
  
  inline def apply(): OptionsSorting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSorting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsSorting] (val x: Self) extends AnyVal {
    
    inline def setHeaderSortClickElement(value: header | icon): Self = StObject.set(x, "headerSortClickElement", value.asInstanceOf[js.Any])
    
    inline def setHeaderSortClickElementUndefined: Self = StObject.set(x, "headerSortClickElement", js.undefined)
    
    inline def setInitialSort(value: js.Array[Sorter]): Self = StObject.set(x, "initialSort", value.asInstanceOf[js.Any])
    
    inline def setInitialSortUndefined: Self = StObject.set(x, "initialSort", js.undefined)
    
    inline def setInitialSortVarargs(value: Sorter*): Self = StObject.set(x, "initialSort", js.Array(value*))
    
    inline def setSortOrderReverse(value: Boolean): Self = StObject.set(x, "sortOrderReverse", value.asInstanceOf[js.Any])
    
    inline def setSortOrderReverseUndefined: Self = StObject.set(x, "sortOrderReverse", js.undefined)
  }
}
