package typings.typeorm

import typings.typeorm.optionsJoinColumnOptionsMod.JoinColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsJoinTableMultipleColumnsOptionsMod {
  
  trait JoinTableMultipleColumnsOptions extends StObject {
    
    /**
      * Database where join table will be created.
      * Works only in some databases (like mysql and mssql).
      */
    var database: js.UndefOr[String] = js.undefined
    
    /**
      * Second (inverse) column of the join table.
      */
    var inverseJoinColumns: js.UndefOr[js.Array[JoinColumnOptions]] = js.undefined
    
    /**
      * First column of the join table.
      */
    var joinColumns: js.UndefOr[js.Array[JoinColumnOptions]] = js.undefined
    
    /**
      * Name of the table that will be created to store values of the both tables (join table).
      * By default is auto generated.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Schema where join table will be created.
      * Works only in some databases (like postgres and mssql).
      */
    var schema: js.UndefOr[String] = js.undefined
  }
  object JoinTableMultipleColumnsOptions {
    
    inline def apply(): JoinTableMultipleColumnsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JoinTableMultipleColumnsOptions]
    }
    
    extension [Self <: JoinTableMultipleColumnsOptions](x: Self) {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setInverseJoinColumns(value: js.Array[JoinColumnOptions]): Self = StObject.set(x, "inverseJoinColumns", value.asInstanceOf[js.Any])
      
      inline def setInverseJoinColumnsUndefined: Self = StObject.set(x, "inverseJoinColumns", js.undefined)
      
      inline def setInverseJoinColumnsVarargs(value: JoinColumnOptions*): Self = StObject.set(x, "inverseJoinColumns", js.Array(value :_*))
      
      inline def setJoinColumns(value: js.Array[JoinColumnOptions]): Self = StObject.set(x, "joinColumns", value.asInstanceOf[js.Any])
      
      inline def setJoinColumnsUndefined: Self = StObject.set(x, "joinColumns", js.undefined)
      
      inline def setJoinColumnsVarargs(value: JoinColumnOptions*): Self = StObject.set(x, "joinColumns", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
}
