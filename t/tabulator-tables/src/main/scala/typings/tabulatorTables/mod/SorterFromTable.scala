package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SorterFromTable extends StObject {
  
  /** The column component for the sorted column. */
  var column: ColumnComponent
  
  /** A string of either `asc` or `desc` indicating the direction of sort. */
  var dir: SortDirection
  
  /** A string of the field name for the sorted column. */
  var field: String
}
object SorterFromTable {
  
  inline def apply(column: ColumnComponent, dir: SortDirection, field: String): SorterFromTable = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SorterFromTable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SorterFromTable] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: ColumnComponent): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setDir(value: SortDirection): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
