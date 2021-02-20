package typings.typeorm

import typings.typeorm.driverMod.Driver
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.tableCheckMod.TableCheck
import typings.typeorm.tableColumnMod.TableColumn
import typings.typeorm.tableExclusionMod.TableExclusion
import typings.typeorm.tableForeignKeyMod.TableForeignKey
import typings.typeorm.tableIndexMod.TableIndex
import typings.typeorm.tableOptionsMod.TableOptions
import typings.typeorm.tableUniqueMod.TableUnique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  @JSImport("typeorm/browser/schema-builder/table/Table", "Table")
  @js.native
  class Table () extends StObject {
    def this(options: TableOptions) = this()
    
    /**
      * Adds check constraint.
      */
    def addCheckConstraint(checkConstraint: TableCheck): Unit = js.native
    
    /**
      * Add column and creates its constraints.
      */
    def addColumn(column: TableColumn): Unit = js.native
    
    /**
      * Adds exclusion constraint.
      */
    def addExclusionConstraint(exclusionConstraint: TableExclusion): Unit = js.native
    
    /**
      * Adds foreign keys.
      */
    def addForeignKey(foreignKey: TableForeignKey): Unit = js.native
    
    /**
      * Adds index.
      */
    def addIndex(index: TableIndex): Unit = js.native
    def addIndex(index: TableIndex, isMysql: Boolean): Unit = js.native
    
    /**
      * Adds unique constraint.
      */
    def addUniqueConstraint(uniqueConstraint: TableUnique): Unit = js.native
    
    /**
      * Table check constraints.
      */
    var checks: js.Array[TableCheck] = js.native
    
    /**
      * Table columns.
      */
    var columns: js.Array[TableColumn] = js.native
    
    /**
      * Table engine.
      */
    var engine: js.UndefOr[String] = js.native
    
    /**
      * Table exclusion constraints.
      */
    var exclusions: js.Array[TableExclusion] = js.native
    
    def findColumnByName(name: String): js.UndefOr[TableColumn] = js.native
    
    /**
      * Returns all column checks.
      */
    def findColumnChecks(column: TableColumn): js.Array[TableCheck] = js.native
    
    /**
      * Returns all column foreign keys.
      */
    def findColumnForeignKeys(column: TableColumn): js.Array[TableForeignKey] = js.native
    
    /**
      * Returns all column indices.
      */
    def findColumnIndices(column: TableColumn): js.Array[TableIndex] = js.native
    
    /**
      * Returns all column uniques.
      */
    def findColumnUniques(column: TableColumn): js.Array[TableUnique] = js.native
    
    /**
      * Table foreign keys.
      */
    var foreignKeys: js.Array[TableForeignKey] = js.native
    
    /**
      * Table indices.
      */
    var indices: js.Array[TableIndex] = js.native
    
    /**
      * Indicates if table was just created.
      * This is needed, for example to check if we need to skip primary keys creation
      * for new tables.
      */
    var justCreated: Boolean = js.native
    
    /**
      * Contains database name, schema name and table name.
      * E.g. "myDB"."mySchema"."myTable"
      */
    var name: String = js.native
    
    val primaryColumns: js.Array[TableColumn] = js.native
    
    /**
      * Removes check constraint.
      */
    def removeCheckConstraint(removedCheck: TableCheck): Unit = js.native
    
    /**
      * Remove column and its constraints.
      */
    def removeColumn(column: TableColumn): Unit = js.native
    
    /**
      * Removes exclusion constraint.
      */
    def removeExclusionConstraint(removedExclusion: TableExclusion): Unit = js.native
    
    /**
      * Removes foreign key.
      */
    def removeForeignKey(removedForeignKey: TableForeignKey): Unit = js.native
    
    /**
      * Removes index.
      */
    def removeIndex(tableIndex: TableIndex): Unit = js.native
    def removeIndex(tableIndex: TableIndex, isMysql: Boolean): Unit = js.native
    
    /**
      * Removes unique constraint.
      */
    def removeUniqueConstraint(removedUnique: TableUnique): Unit = js.native
    
    /**
      * Table unique constraints.
      */
    var uniques: js.Array[TableUnique] = js.native
  }
  /* static members */
  object Table {
    
    /**
      * Creates table from a given entity metadata.
      */
    @JSImport("typeorm/browser/schema-builder/table/Table", "Table.create")
    @js.native
    def create(entityMetadata: EntityMetadata, driver: Driver): Table = js.native
  }
}
