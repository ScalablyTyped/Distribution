package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsTableForeignKeyOptionsMod {
  
  trait TableForeignKeyOptions extends StObject {
    
    /**
      * Column names which included by this foreign key.
      */
    var columnNames: js.Array[String]
    
    /**
      * Set this foreign key constraint as "DEFERRABLE" e.g. check constraints at start
      * or at the end of a transaction
      */
    var deferrable: js.UndefOr[String] = js.undefined
    
    /**
      * Name of the table which contains this foreign key.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * "ON DELETE" of this foreign key, e.g. what action database should perform when
      * referenced stuff is being deleted.
      */
    var onDelete: js.UndefOr[String] = js.undefined
    
    /**
      * "ON UPDATE" of this foreign key, e.g. what action database should perform when
      * referenced stuff is being updated.
      */
    var onUpdate: js.UndefOr[String] = js.undefined
    
    /**
      * Column names which included by this foreign key.
      */
    var referencedColumnNames: js.Array[String]
    
    /**
      * Table referenced in the foreign key.
      */
    var referencedTableName: String
  }
  object TableForeignKeyOptions {
    
    inline def apply(
      columnNames: js.Array[String],
      referencedColumnNames: js.Array[String],
      referencedTableName: String
    ): TableForeignKeyOptions = {
      val __obj = js.Dynamic.literal(columnNames = columnNames.asInstanceOf[js.Any], referencedColumnNames = referencedColumnNames.asInstanceOf[js.Any], referencedTableName = referencedTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableForeignKeyOptions]
    }
    
    extension [Self <: TableForeignKeyOptions](x: Self) {
      
      inline def setColumnNames(value: js.Array[String]): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
      
      inline def setColumnNamesVarargs(value: String*): Self = StObject.set(x, "columnNames", js.Array(value :_*))
      
      inline def setDeferrable(value: String): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
      
      inline def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnDelete(value: String): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
      
      inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      inline def setOnUpdate(value: String): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setReferencedColumnNames(value: js.Array[String]): Self = StObject.set(x, "referencedColumnNames", value.asInstanceOf[js.Any])
      
      inline def setReferencedColumnNamesVarargs(value: String*): Self = StObject.set(x, "referencedColumnNames", js.Array(value :_*))
      
      inline def setReferencedTableName(value: String): Self = StObject.set(x, "referencedTableName", value.asInstanceOf[js.Any])
    }
  }
}
