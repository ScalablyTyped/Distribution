package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableUniqueOptionsMod {
  
  trait TableUniqueOptions extends StObject {
    
    /**
      * Columns that contains this constraint.
      */
    var columnNames: js.Array[String]
    
    /**
      * Constraint name.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object TableUniqueOptions {
    
    inline def apply(columnNames: js.Array[String]): TableUniqueOptions = {
      val __obj = js.Dynamic.literal(columnNames = columnNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableUniqueOptions]
    }
    
    extension [Self <: TableUniqueOptions](x: Self) {
      
      inline def setColumnNames(value: js.Array[String]): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
      
      inline def setColumnNamesVarargs(value: String*): Self = StObject.set(x, "columnNames", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
