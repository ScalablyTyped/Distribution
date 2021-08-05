package typings.typeorm

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.driverSqlInMemoryMod.SqlInMemory
import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import typings.typeorm.optionsTableColumnOptionsMod.TableColumnOptions
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import typings.typeorm.schemaBuilderSchemaBuilderMod.SchemaBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaBuilderRdbmsSchemaBuilderMod {
  
  @JSImport("typeorm/schema-builder/RdbmsSchemaBuilder", "RdbmsSchemaBuilder")
  @js.native
  class RdbmsSchemaBuilder protected ()
    extends StObject
       with SchemaBuilder {
    def this(connection: Connection) = this()
    
    /**
      * Adds columns from metadata which does not exist in the table.
      * Columns are created without keys.
      */
    /* protected */ def addNewColumns(): js.Promise[Unit] = js.native
    
    /**
      * Creates complete schemas for the given entity metadatas.
      */
    /* CompleteClass */
    override def build(): js.Promise[Unit] = js.native
    
    /* protected */ var connection: Connection = js.native
    
    /**
      * Creates composite uniques which are missing in db yet.
      */
    /* protected */ def createCompositeUniqueConstraints(): js.Promise[Unit] = js.native
    
    /**
      * Creates foreign keys which does not exist in the table yet.
      */
    /* protected */ def createForeignKeys(): js.Promise[Unit] = js.native
    
    /* protected */ def createNewChecks(): js.Promise[Unit] = js.native
    
    /**
      * Creates exclusions which are missing in db yet.
      */
    /* protected */ def createNewExclusions(): js.Promise[Unit] = js.native
    
    /**
      * Creates composite indices which are missing in db yet.
      */
    /* protected */ def createNewIndices(): js.Promise[Unit] = js.native
    
    /**
      * Creates tables that do not exist in the database yet.
      * New tables are created without foreign and primary keys.
      * Primary key only can be created in conclusion with auto generated column.
      */
    /* protected */ def createNewTables(): js.Promise[Unit] = js.native
    
    /**
      * Creates typeorm service table for storing user defined Views.
      */
    /* protected */ def createTypeormMetadataTable(): js.Promise[Unit] = js.native
    
    /* protected */ def createViews(): js.Promise[Unit] = js.native
    
    /**
      * Drops all composite indices, related to given column.
      */
    /* protected */ def dropColumnCompositeIndices(tablePath: String, columnName: String): js.Promise[Unit] = js.native
    
    /**
      * Drops all composite uniques, related to given column.
      */
    /* protected */ def dropColumnCompositeUniques(tablePath: String, columnName: String): js.Promise[Unit] = js.native
    
    /**
      * Drops all foreign keys where given column of the given table is being used.
      */
    /* protected */ def dropColumnReferencedForeignKeys(tablePath: String, columnName: String): js.Promise[Unit] = js.native
    
    /* protected */ def dropCompositeUniqueConstraints(): js.Promise[Unit] = js.native
    
    /* protected */ def dropOldChecks(): js.Promise[Unit] = js.native
    
    /* protected */ def dropOldExclusions(): js.Promise[Unit] = js.native
    
    /**
      * Drops all (old) foreign keys that exist in the tables, but do not exist in the entity metadata.
      */
    /* protected */ def dropOldForeignKeys(): js.Promise[Unit] = js.native
    
    /* protected */ def dropOldIndices(): js.Promise[Unit] = js.native
    
    /* protected */ def dropOldViews(): js.Promise[Unit] = js.native
    
    /**
      * Drops all columns that exist in the table, but does not exist in the metadata (left old).
      * We drop their keys too, since it should be safe.
      */
    /* protected */ def dropRemovedColumns(): js.Promise[Unit] = js.native
    
    /**
      * Returns only entities that should be synced in the database.
      */
    /* protected */ val entityToSyncMetadatas: js.Array[EntityMetadata] = js.native
    
    /**
      * Executes schema sync operations in a proper order.
      * Order of operations matter here.
      */
    /* protected */ def executeSchemaSyncOperationsInProperOrder(): js.Promise[Unit] = js.native
    
    /**
      * Returns queries to be executed by schema builder.
      */
    /* CompleteClass */
    override def log(): js.Promise[SqlInMemory] = js.native
    
    /**
      * Creates new columns from the given column metadatas.
      */
    /* protected */ def metadataColumnsToTableColumnOptions(columns: js.Array[ColumnMetadata]): js.Array[TableColumnOptions] = js.native
    
    /**
      * Used to execute schema creation queries in a single connection.
      */
    /* protected */ var queryRunner: QueryRunner = js.native
    
    /**
      * Renames columns.
      * Works if only one column per table was changed.
      * Changes only column name. If something besides name was changed, these changes will be ignored.
      */
    /* protected */ def renameColumns(): js.Promise[Unit] = js.native
    
    /**
      * Rename tables
      */
    /* protected */ def renameTables(): js.Promise[Unit] = js.native
    
    /**
      * Update all exist columns which metadata has changed.
      * Still don't create keys. Also we don't touch foreign keys of the changed columns.
      */
    /* protected */ def updateExistColumns(): js.Promise[Unit] = js.native
    
    /**
      * Updates composite primary keys.
      */
    /* protected */ def updatePrimaryKeys(): js.Promise[Unit] = js.native
    
    /**
      * Returns only entities that should be synced in the database.
      */
    /* protected */ val viewEntityToSyncMetadatas: js.Array[EntityMetadata] = js.native
  }
}
