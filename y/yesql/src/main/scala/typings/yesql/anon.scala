package typings.yesql

import typings.yesql.yesqlStrings.mysql
import typings.yesql.yesqlStrings.pg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Pg extends StObject {
    
    var pg: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[pg | mysql] = js.undefined
  }
  object Pg {
    
    inline def apply(): Pg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pg] (val x: Self) extends AnyVal {
      
      inline def setPg(value: Boolean): Self = StObject.set(x, "pg", value.asInstanceOf[js.Any])
      
      inline def setPgUndefined: Self = StObject.set(x, "pg", js.undefined)
      
      inline def setType(value: pg | mysql): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Sql[TParams /* <: js.Object */] extends StObject {
    
    var sql: String
    
    var values: js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any
      ]
  }
  object Sql {
    
    inline def apply[TParams /* <: js.Object */](
      sql: String,
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any
        ]
    ): Sql[TParams] = {
      val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sql[TParams]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sql[?], TParams /* <: js.Object */] (val x: Self & Sql[TParams]) extends AnyVal {
      
      inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
      
      inline def setValues(
        value: js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any
            ]
      ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any)*
      ): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait Text[TParams /* <: js.Object */] extends StObject {
    
    var text: String
    
    var values: js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any
      ]
  }
  object Text {
    
    inline def apply[TParams /* <: js.Object */](
      text: String,
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any
        ]
    ): Text[TParams] = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text[TParams]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Text[?], TParams /* <: js.Object */] (val x: Self & Text[TParams]) extends AnyVal {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValues(
        value: js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any
            ]
      ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: TParams[keyof TParams] */ js.Any)*
      ): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
