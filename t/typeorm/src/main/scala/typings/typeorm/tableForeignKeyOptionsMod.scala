package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableForeignKeyOptionsMod {
  
  @js.native
  trait TableForeignKeyOptions extends StObject {
    
    /**
      * Column names which included by this foreign key.
      */
    var columnNames: js.Array[String] = js.native
    
    /**
      * Set this foreign key constraint as "DEFERRABLE" e.g. check constraints at start
      * or at the end of a transaction
      */
    var deferrable: js.UndefOr[String] = js.native
    
    /**
      * Name of the table which contains this foreign key.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * "ON DELETE" of this foreign key, e.g. what action database should perform when
      * referenced stuff is being deleted.
      */
    var onDelete: js.UndefOr[String] = js.native
    
    /**
      * "ON UPDATE" of this foreign key, e.g. what action database should perform when
      * referenced stuff is being updated.
      */
    var onUpdate: js.UndefOr[String] = js.native
    
    /**
      * Column names which included by this foreign key.
      */
    var referencedColumnNames: js.Array[String] = js.native
    
    /**
      * Table referenced in the foreign key.
      */
    var referencedTableName: String = js.native
  }
  object TableForeignKeyOptions {
    
    @scala.inline
    def apply(
      columnNames: js.Array[String],
      referencedColumnNames: js.Array[String],
      referencedTableName: String
    ): TableForeignKeyOptions = {
      val __obj = js.Dynamic.literal(columnNames = columnNames.asInstanceOf[js.Any], referencedColumnNames = referencedColumnNames.asInstanceOf[js.Any], referencedTableName = referencedTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableForeignKeyOptions]
    }
    
    @scala.inline
    implicit class TableForeignKeyOptionsMutableBuilder[Self <: TableForeignKeyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnNames(value: js.Array[String]): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNamesVarargs(value: String*): Self = StObject.set(x, "columnNames", js.Array(value :_*))
      
      @scala.inline
      def setDeferrable(value: String): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnDelete(value: String): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: String): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setReferencedColumnNames(value: js.Array[String]): Self = StObject.set(x, "referencedColumnNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencedColumnNamesVarargs(value: String*): Self = StObject.set(x, "referencedColumnNames", js.Array(value :_*))
      
      @scala.inline
      def setReferencedTableName(value: String): Self = StObject.set(x, "referencedTableName", value.asInstanceOf[js.Any])
    }
  }
}
