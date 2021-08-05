package typings.typeorm

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entitySchemaEntitySchemaUniqueOptionsMod {
  
  trait EntitySchemaUniqueOptions extends StObject {
    
    /**
      * Unique column names.
      */
    var columns: js.UndefOr[
        (js.Function1[/* object */ js.UndefOr[js.Any], js.Array[js.Any] | StringDictionary[Double]]) | js.Array[String]
      ] = js.undefined
    
    /**
      * Unique constraint name.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object EntitySchemaUniqueOptions {
    
    inline def apply(): EntitySchemaUniqueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EntitySchemaUniqueOptions]
    }
    
    extension [Self <: EntitySchemaUniqueOptions](x: Self) {
      
      inline def setColumns(
        value: (js.Function1[/* object */ js.UndefOr[js.Any], js.Array[js.Any] | StringDictionary[Double]]) | js.Array[String]
      ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsFunction1(value: /* object */ js.UndefOr[js.Any] => js.Array[js.Any] | StringDictionary[Double]): Self = StObject.set(x, "columns", js.Any.fromFunction1(value))
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
