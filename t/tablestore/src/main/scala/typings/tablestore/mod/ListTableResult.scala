package typings.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTableResult extends StObject {
  
  var tableNames: js.Array[String]
}
object ListTableResult {
  
  inline def apply(tableNames: js.Array[String]): ListTableResult = {
    val __obj = js.Dynamic.literal(tableNames = tableNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTableResult]
  }
  
  extension [Self <: ListTableResult](x: Self) {
    
    inline def setTableNames(value: js.Array[String]): Self = StObject.set(x, "tableNames", value.asInstanceOf[js.Any])
    
    inline def setTableNamesVarargs(value: String*): Self = StObject.set(x, "tableNames", js.Array(value*))
  }
}
