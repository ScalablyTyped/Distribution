package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistenceOptions extends StObject {
  
  var columns: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  var filter: js.UndefOr[Boolean] = js.undefined
  
  var group: js.UndefOr[Boolean | PersistenceGroupOptions] = js.undefined
  
  var page: js.UndefOr[Boolean | PersistencePageOptions] = js.undefined
  
  var sort: js.UndefOr[Boolean] = js.undefined
}
object PersistenceOptions {
  
  inline def apply(): PersistenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistenceOptions] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: Boolean | js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGroup(value: Boolean | PersistenceGroupOptions): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setPage(value: Boolean | PersistencePageOptions): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
