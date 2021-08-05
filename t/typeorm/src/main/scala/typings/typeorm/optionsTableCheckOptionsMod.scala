package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsTableCheckOptionsMod {
  
  trait TableCheckOptions extends StObject {
    
    /**
      * Column that contains this constraint.
      */
    var columnNames: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Check expression.
      */
    var expression: js.UndefOr[String] = js.undefined
    
    /**
      * Constraint name.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object TableCheckOptions {
    
    inline def apply(): TableCheckOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableCheckOptions]
    }
    
    extension [Self <: TableCheckOptions](x: Self) {
      
      inline def setColumnNames(value: js.Array[String]): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
      
      inline def setColumnNamesUndefined: Self = StObject.set(x, "columnNames", js.undefined)
      
      inline def setColumnNamesVarargs(value: String*): Self = StObject.set(x, "columnNames", js.Array(value :_*))
      
      inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
