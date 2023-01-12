package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sorter extends StObject {
  
  var column: String
  
  var dir: SortDirection
}
object Sorter {
  
  inline def apply(column: String, dir: SortDirection): Sorter = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sorter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sorter] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setDir(value: SortDirection): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
  }
}
