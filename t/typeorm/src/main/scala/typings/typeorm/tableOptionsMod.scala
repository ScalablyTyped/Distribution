package typings.typeorm

import typings.typeorm.tableCheckOptionsMod.TableCheckOptions
import typings.typeorm.tableColumnOptionsMod.TableColumnOptions
import typings.typeorm.tableExclusionOptionsMod.TableExclusionOptions
import typings.typeorm.tableForeignKeyOptionsMod.TableForeignKeyOptions
import typings.typeorm.tableIndexOptionsMod.TableIndexOptions
import typings.typeorm.tableUniqueOptionsMod.TableUniqueOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableOptionsMod {
  
  @js.native
  trait TableOptions extends StObject {
    
    /**
      * Table check constraints.
      */
    var checks: js.UndefOr[js.Array[TableCheckOptions]] = js.native
    
    /**
      * Table columns.
      */
    var columns: js.UndefOr[js.Array[TableColumnOptions]] = js.native
    
    /**
      * Table engine.
      */
    var engine: js.UndefOr[String] = js.native
    
    /**
      * Table check constraints.
      */
    var exclusions: js.UndefOr[js.Array[TableExclusionOptions]] = js.native
    
    /**
      * Table foreign keys.
      */
    var foreignKeys: js.UndefOr[js.Array[TableForeignKeyOptions]] = js.native
    
    /**
      * Table indices.
      */
    var indices: js.UndefOr[js.Array[TableIndexOptions]] = js.native
    
    /**
      * Indicates if table was just created.
      * This is needed, for example to check if we need to skip primary keys creation
      * for new tables.
      */
    var justCreated: js.UndefOr[Boolean] = js.native
    
    /**
      * Table name.
      */
    var name: String = js.native
    
    /**
      * Table unique constraints.
      */
    var uniques: js.UndefOr[js.Array[TableUniqueOptions]] = js.native
  }
  object TableOptions {
    
    @scala.inline
    def apply(name: String): TableOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableOptions]
    }
    
    @scala.inline
    implicit class TableOptionsMutableBuilder[Self <: TableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecks(value: js.Array[TableCheckOptions]): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChecksUndefined: Self = StObject.set(x, "checks", js.undefined)
      
      @scala.inline
      def setChecksVarargs(value: TableCheckOptions*): Self = StObject.set(x, "checks", js.Array(value :_*))
      
      @scala.inline
      def setColumns(value: js.Array[TableColumnOptions]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: TableColumnOptions*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setExclusions(value: js.Array[TableExclusionOptions]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusionsUndefined: Self = StObject.set(x, "exclusions", js.undefined)
      
      @scala.inline
      def setExclusionsVarargs(value: TableExclusionOptions*): Self = StObject.set(x, "exclusions", js.Array(value :_*))
      
      @scala.inline
      def setForeignKeys(value: js.Array[TableForeignKeyOptions]): Self = StObject.set(x, "foreignKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForeignKeysUndefined: Self = StObject.set(x, "foreignKeys", js.undefined)
      
      @scala.inline
      def setForeignKeysVarargs(value: TableForeignKeyOptions*): Self = StObject.set(x, "foreignKeys", js.Array(value :_*))
      
      @scala.inline
      def setIndices(value: js.Array[TableIndexOptions]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
      
      @scala.inline
      def setIndicesVarargs(value: TableIndexOptions*): Self = StObject.set(x, "indices", js.Array(value :_*))
      
      @scala.inline
      def setJustCreated(value: Boolean): Self = StObject.set(x, "justCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustCreatedUndefined: Self = StObject.set(x, "justCreated", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniques(value: js.Array[TableUniqueOptions]): Self = StObject.set(x, "uniques", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniquesUndefined: Self = StObject.set(x, "uniques", js.undefined)
      
      @scala.inline
      def setUniquesVarargs(value: TableUniqueOptions*): Self = StObject.set(x, "uniques", js.Array(value :_*))
    }
  }
}
