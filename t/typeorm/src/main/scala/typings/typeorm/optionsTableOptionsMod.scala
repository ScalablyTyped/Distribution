package typings.typeorm

import typings.typeorm.optionsTableCheckOptionsMod.TableCheckOptions
import typings.typeorm.optionsTableColumnOptionsMod.TableColumnOptions
import typings.typeorm.optionsTableExclusionOptionsMod.TableExclusionOptions
import typings.typeorm.optionsTableForeignKeyOptionsMod.TableForeignKeyOptions
import typings.typeorm.optionsTableIndexOptionsMod.TableIndexOptions
import typings.typeorm.optionsTableUniqueOptionsMod.TableUniqueOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsTableOptionsMod {
  
  trait TableOptions extends StObject {
    
    /**
      * Table check constraints.
      */
    var checks: js.UndefOr[js.Array[TableCheckOptions]] = js.undefined
    
    /**
      * Table columns.
      */
    var columns: js.UndefOr[js.Array[TableColumnOptions]] = js.undefined
    
    /**
      * Table engine.
      */
    var engine: js.UndefOr[String] = js.undefined
    
    /**
      * Table check constraints.
      */
    var exclusions: js.UndefOr[js.Array[TableExclusionOptions]] = js.undefined
    
    /**
      * Table foreign keys.
      */
    var foreignKeys: js.UndefOr[js.Array[TableForeignKeyOptions]] = js.undefined
    
    /**
      * Table indices.
      */
    var indices: js.UndefOr[js.Array[TableIndexOptions]] = js.undefined
    
    /**
      * Indicates if table was just created.
      * This is needed, for example to check if we need to skip primary keys creation
      * for new tables.
      */
    var justCreated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Table name.
      */
    var name: String
    
    /**
      * Table unique constraints.
      */
    var uniques: js.UndefOr[js.Array[TableUniqueOptions]] = js.undefined
  }
  object TableOptions {
    
    inline def apply(name: String): TableOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableOptions]
    }
    
    extension [Self <: TableOptions](x: Self) {
      
      inline def setChecks(value: js.Array[TableCheckOptions]): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
      
      inline def setChecksUndefined: Self = StObject.set(x, "checks", js.undefined)
      
      inline def setChecksVarargs(value: TableCheckOptions*): Self = StObject.set(x, "checks", js.Array(value :_*))
      
      inline def setColumns(value: js.Array[TableColumnOptions]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: TableColumnOptions*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setExclusions(value: js.Array[TableExclusionOptions]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
      
      inline def setExclusionsUndefined: Self = StObject.set(x, "exclusions", js.undefined)
      
      inline def setExclusionsVarargs(value: TableExclusionOptions*): Self = StObject.set(x, "exclusions", js.Array(value :_*))
      
      inline def setForeignKeys(value: js.Array[TableForeignKeyOptions]): Self = StObject.set(x, "foreignKeys", value.asInstanceOf[js.Any])
      
      inline def setForeignKeysUndefined: Self = StObject.set(x, "foreignKeys", js.undefined)
      
      inline def setForeignKeysVarargs(value: TableForeignKeyOptions*): Self = StObject.set(x, "foreignKeys", js.Array(value :_*))
      
      inline def setIndices(value: js.Array[TableIndexOptions]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
      
      inline def setIndicesVarargs(value: TableIndexOptions*): Self = StObject.set(x, "indices", js.Array(value :_*))
      
      inline def setJustCreated(value: Boolean): Self = StObject.set(x, "justCreated", value.asInstanceOf[js.Any])
      
      inline def setJustCreatedUndefined: Self = StObject.set(x, "justCreated", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUniques(value: js.Array[TableUniqueOptions]): Self = StObject.set(x, "uniques", value.asInstanceOf[js.Any])
      
      inline def setUniquesUndefined: Self = StObject.set(x, "uniques", js.undefined)
      
      inline def setUniquesVarargs(value: TableUniqueOptions*): Self = StObject.set(x, "uniques", js.Array(value :_*))
    }
  }
}
