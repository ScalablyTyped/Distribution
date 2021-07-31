package typings.typeorm

import typings.typeorm.anon.Database
import typings.typeorm.anon.NewColumnOldColumn
import typings.typeorm.anon.NewColumnTableColumn
import typings.typeorm.auroraDataApiAuroraDataApiDriverMod.AuroraDataApiDriver
import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.driverQueryMod.Query
import typings.typeorm.platformPlatformToolsMod.ReadStream
import typings.typeorm.queryRunnerBaseQueryRunnerMod.BaseQueryRunner
import typings.typeorm.tableTableCheckMod.TableCheck
import typings.typeorm.tableTableColumnMod.TableColumn
import typings.typeorm.tableTableExclusionMod.TableExclusion
import typings.typeorm.tableTableForeignKeyMod.TableForeignKey
import typings.typeorm.tableTableIndexMod.TableIndex
import typings.typeorm.tableTableMod.Table
import typings.typeorm.tableTableUniqueMod.TableUnique
import typings.typeorm.typesIsolationLevelMod.IsolationLevel
import typings.typeorm.viewViewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auroraDataApiAuroraDataApiQueryRunnerMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner because var conflicts: broadcaster, connection, isReleased, isTransactionActive, loadedTables, loadedViews, manager. Inlined data, connect, release, clearDatabase, clearDatabase, startTransaction, startTransaction, commitTransaction, rollbackTransaction, stream, stream, stream, stream, stream, stream, stream, stream, getDatabases, getSchemas, getSchemas, hasDatabase, hasSchema, hasTable, hasTable, hasColumn, hasColumn, createDatabase, createDatabase, dropDatabase, dropDatabase, createSchema, createSchema, dropSchema, dropSchema, dropSchema, dropSchema, createTable, createTable, createTable, createTable, createTable, createTable, createTable, createTable, dropTable, dropTable, dropTable, dropTable, dropTable, dropTable, dropTable, dropTable, dropTable, dropTable, dropTable, dropTable, dropTable, dropTable, dropTable, dropTable, createView, createView, dropView, dropView, renameTable, renameTable, addColumn, addColumn, addColumns, addColumns, renameColumn, renameColumn, renameColumn, renameColumn, renameColumn, renameColumn, renameColumn, renameColumn, changeColumn, changeColumn, changeColumn, changeColumn, changeColumns, changeColumns, dropColumn, dropColumn, dropColumn, dropColumn, dropColumns, dropColumns, createPrimaryKey, createPrimaryKey, updatePrimaryKeys, updatePrimaryKeys, dropPrimaryKey, dropPrimaryKey, createUniqueConstraint, createUniqueConstraint, createUniqueConstraints, createUniqueConstraints, dropUniqueConstraint, dropUniqueConstraint, dropUniqueConstraint, dropUniqueConstraint, dropUniqueConstraints, dropUniqueConstraints, createCheckConstraint, createCheckConstraint, createCheckConstraints, createCheckConstraints, dropCheckConstraint, dropCheckConstraint, dropCheckConstraint, dropCheckConstraint, dropCheckConstraints, dropCheckConstraints, createExclusionConstraint, createExclusionConstraint, createExclusionConstraints, createExclusionConstraints, dropExclusionConstraint, dropExclusionConstraint, dropExclusionConstraint, dropExclusionConstraint, dropExclusionConstraints, dropExclusionConstraints, createForeignKey, createForeignKey, createForeignKeys, createForeignKeys, dropForeignKey, dropForeignKey, dropForeignKey, dropForeignKey, dropForeignKeys, dropForeignKeys, createIndex, createIndex, createIndices, createIndices, dropIndex, dropIndex, dropIndex, dropIndex, dropIndices, dropIndices, clearTable */ @JSImport("typeorm/driver/aurora-data-api/AuroraDataApiQueryRunner", "AuroraDataApiQueryRunner")
  @js.native
  class AuroraDataApiQueryRunner protected () extends BaseQueryRunner {
    def this(driver: AuroraDataApiDriver) = this()
    
    def addColumn(tableOrName: String, column: TableColumn): js.Promise[Unit] = js.native
    /**
      * Creates a new column from the column in the table.
      */
    /**
      * Adds a new column.
      */
    def addColumn(tableOrName: Table, column: TableColumn): js.Promise[Unit] = js.native
    
    def addColumns(tableOrName: String, columns: js.Array[TableColumn]): js.Promise[Unit] = js.native
    /**
      * Creates a new columns from the column in the table.
      */
    /**
      * Adds new columns.
      */
    def addColumns(tableOrName: Table, columns: js.Array[TableColumn]): js.Promise[Unit] = js.native
    
    /**
      * Builds a part of query to create/change a column.
      */
    /* protected */ def buildCreateColumnSql(column: TableColumn, skipPrimary: Boolean): String = js.native
    /* protected */ def buildCreateColumnSql(column: TableColumn, skipPrimary: Boolean, skipName: Boolean): String = js.native
    
    def changeColumn(tableOrName: String, oldColumnOrName: String, newColumn: TableColumn): js.Promise[Unit] = js.native
    def changeColumn(tableOrName: String, oldColumnOrName: TableColumn, newColumn: TableColumn): js.Promise[Unit] = js.native
    def changeColumn(tableOrName: Table, oldColumnOrName: String, newColumn: TableColumn): js.Promise[Unit] = js.native
    /**
      * Changes a column in the table.
      */
    def changeColumn(tableOrName: Table, oldColumnOrName: TableColumn, newColumn: TableColumn): js.Promise[Unit] = js.native
    
    def changeColumns(tableOrName: String, changedColumns: js.Array[NewColumnOldColumn | NewColumnTableColumn]): js.Promise[Unit] = js.native
    /**
      * Changes a column in the table.
      */
    /**
      * Changes columns in the table.
      */
    def changeColumns(tableOrName: Table, changedColumns: js.Array[NewColumnOldColumn | NewColumnTableColumn]): js.Promise[Unit] = js.native
    
    /**
      * Removes all tables from the currently connected database.
      * Be careful using this method and avoid using it in production or migrations
      * (because it can clear all your database).
      */
    /**
      * Removes all tables from the currently connected database.
      * Be careful with using this method and avoid using it in production or migrations
      * (because it can clear all your database).
      */
    def clearDatabase(): js.Promise[Unit] = js.native
    def clearDatabase(database: String): js.Promise[Unit] = js.native
    
    /**
      * Clears all table contents.
      * Note: this operation uses SQL's TRUNCATE query which cannot be reverted in transactions.
      */
    def clearTable(tableOrName: String): js.Promise[Unit] = js.native
    /**
      * Clears all table contents.
      * Note: this operation uses SQL's TRUNCATE query which cannot be reverted in transactions.
      */
    def clearTable(tableOrName: Table): js.Promise[Unit] = js.native
    
    /**
      * Commits transaction.
      * Error will be thrown if transaction was not started.
      */
    def commitTransaction(): js.Promise[Unit] = js.native
    
    /**
      * Creates/uses database connection from the connection pool to perform further operations.
      * Returns obtained database connection.
      */
    def connect(): js.Promise[js.Any] = js.native
    
    def createCheckConstraint(tableOrName: String, checkConstraint: TableCheck): js.Promise[Unit] = js.native
    /**
      * Creates a new check constraint.
      */
    def createCheckConstraint(tableOrName: Table, checkConstraint: TableCheck): js.Promise[Unit] = js.native
    
    def createCheckConstraints(tableOrName: String, checkConstraints: js.Array[TableCheck]): js.Promise[Unit] = js.native
    /**
      * Creates a new check constraints.
      */
    /**
      * Creates new check constraints.
      */
    def createCheckConstraints(tableOrName: Table, checkConstraints: js.Array[TableCheck]): js.Promise[Unit] = js.native
    
    /**
      * Creates a new database.
      */
    def createDatabase(database: String): js.Promise[Unit] = js.native
    def createDatabase(database: String, ifNotExist: Boolean): js.Promise[Unit] = js.native
    
    def createExclusionConstraint(tableOrName: String, exclusionConstraint: TableExclusion): js.Promise[Unit] = js.native
    /**
      * Creates a new exclusion constraint.
      */
    def createExclusionConstraint(tableOrName: Table, exclusionConstraint: TableExclusion): js.Promise[Unit] = js.native
    
    def createExclusionConstraints(tableOrName: String, exclusionConstraints: js.Array[TableExclusion]): js.Promise[Unit] = js.native
    /**
      * Creates a new exclusion constraints.
      */
    /**
      * Creates new exclusion constraints.
      */
    def createExclusionConstraints(tableOrName: Table, exclusionConstraints: js.Array[TableExclusion]): js.Promise[Unit] = js.native
    
    def createForeignKey(tableOrName: String, foreignKey: TableForeignKey): js.Promise[Unit] = js.native
    /**
      * Creates a new foreign key.
      */
    def createForeignKey(tableOrName: Table, foreignKey: TableForeignKey): js.Promise[Unit] = js.native
    
    /**
      * Builds create foreign key sql.
      */
    /* protected */ def createForeignKeySql(table: Table, foreignKey: TableForeignKey): Query = js.native
    
    def createForeignKeys(tableOrName: String, foreignKeys: js.Array[TableForeignKey]): js.Promise[Unit] = js.native
    /**
      * Creates a new foreign keys.
      */
    /**
      * Creates new foreign keys.
      */
    def createForeignKeys(tableOrName: Table, foreignKeys: js.Array[TableForeignKey]): js.Promise[Unit] = js.native
    
    def createIndex(tableOrName: String, index: TableIndex): js.Promise[Unit] = js.native
    /**
      * Creates a new index.
      */
    def createIndex(tableOrName: Table, index: TableIndex): js.Promise[Unit] = js.native
    
    /**
      * Builds create index sql.
      */
    /* protected */ def createIndexSql(table: Table, index: TableIndex): Query = js.native
    
    def createIndices(tableOrName: String, indices: js.Array[TableIndex]): js.Promise[Unit] = js.native
    /**
      * Creates a new indices
      */
    /**
      * Creates new indices.
      */
    def createIndices(tableOrName: Table, indices: js.Array[TableIndex]): js.Promise[Unit] = js.native
    
    def createPrimaryKey(tableOrName: String, columnNames: js.Array[String]): js.Promise[Unit] = js.native
    /**
      * Creates a new primary key.
      */
    def createPrimaryKey(tableOrName: Table, columnNames: js.Array[String]): js.Promise[Unit] = js.native
    
    /**
      * Builds create primary key sql.
      */
    /* protected */ def createPrimaryKeySql(table: Table, columnNames: js.Array[String]): Query = js.native
    
    /**
      * Creates a new table schema.
      */
    def createSchema(schema: String): js.Promise[Unit] = js.native
    def createSchema(schema: String, ifNotExist: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Creates a new table.
      */
    def createTable(table: Table): js.Promise[Unit] = js.native
    def createTable(table: Table, ifNotExist: Boolean): js.Promise[Unit] = js.native
    def createTable(table: Table, ifNotExist: Boolean, createForeignKeys: Boolean): js.Promise[Unit] = js.native
    def createTable(table: Table, ifNotExist: Boolean, createForeignKeys: Boolean, createIndices: Boolean): js.Promise[Unit] = js.native
    def createTable(table: Table, ifNotExist: Boolean, createForeignKeys: Unit, createIndices: Boolean): js.Promise[Unit] = js.native
    def createTable(table: Table, ifNotExist: Unit, createForeignKeys: Boolean): js.Promise[Unit] = js.native
    def createTable(table: Table, ifNotExist: Unit, createForeignKeys: Boolean, createIndices: Boolean): js.Promise[Unit] = js.native
    def createTable(table: Table, ifNotExist: Unit, createForeignKeys: Unit, createIndices: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Builds create table sql
      */
    /* protected */ def createTableSql(table: Table): Query = js.native
    /* protected */ def createTableSql(table: Table, createForeignKeys: Boolean): Query = js.native
    
    def createUniqueConstraint(tableOrName: String, uniqueConstraint: TableUnique): js.Promise[Unit] = js.native
    /**
      * Creates a new unique constraint.
      */
    def createUniqueConstraint(tableOrName: Table, uniqueConstraint: TableUnique): js.Promise[Unit] = js.native
    
    def createUniqueConstraints(tableOrName: String, uniqueConstraints: js.Array[TableUnique]): js.Promise[Unit] = js.native
    /**
      * Creates a new unique constraints.
      */
    /**
      * Creates new unique constraints.
      */
    def createUniqueConstraints(tableOrName: Table, uniqueConstraints: js.Array[TableUnique]): js.Promise[Unit] = js.native
    
    /**
      * Creates a new view.
      */
    def createView(view: View): js.Promise[Unit] = js.native
    def createView(view: View, oldView: View): js.Promise[Unit] = js.native
    
    /* protected */ def createViewSql(view: View): Query = js.native
    
    /**
      * Stores temporarily user data.
      * Useful for sharing data with subscribers.
      */
    var data: ObjectLiteral = js.native
    
    /**
      * Promise used to obtain a database connection from a pool for a first time.
      */
    var databaseConnectionPromise: js.Promise[js.Any] = js.native
    
    /* protected */ def deleteViewDefinitionSql(viewOrPath: String): js.Promise[Query] = js.native
    /**
      * Builds remove view sql.
      */
    /* protected */ def deleteViewDefinitionSql(viewOrPath: View): js.Promise[Query] = js.native
    
    /**
      * Database driver used by connection.
      */
    var driver: AuroraDataApiDriver = js.native
    
    def dropCheckConstraint(tableOrName: String, checkOrName: String): js.Promise[Unit] = js.native
    def dropCheckConstraint(tableOrName: String, checkOrName: TableCheck): js.Promise[Unit] = js.native
    def dropCheckConstraint(tableOrName: Table, checkOrName: String): js.Promise[Unit] = js.native
    /**
      * Drops check constraint.
      */
    /**
      * Drops a check constraint.
      */
    def dropCheckConstraint(tableOrName: Table, checkOrName: TableCheck): js.Promise[Unit] = js.native
    
    def dropCheckConstraints(tableOrName: String, checkConstraints: js.Array[TableCheck]): js.Promise[Unit] = js.native
    /**
      * Drops check constraints.
      */
    def dropCheckConstraints(tableOrName: Table, checkConstraints: js.Array[TableCheck]): js.Promise[Unit] = js.native
    
    def dropColumn(tableOrName: String, columnOrName: String): js.Promise[Unit] = js.native
    def dropColumn(tableOrName: String, columnOrName: TableColumn): js.Promise[Unit] = js.native
    def dropColumn(tableOrName: Table, columnOrName: String): js.Promise[Unit] = js.native
    /**
      * Drops column in the table.
      */
    /**
      * Drops a column in the table.
      */
    def dropColumn(tableOrName: Table, columnOrName: TableColumn): js.Promise[Unit] = js.native
    
    def dropColumns(tableOrName: String, columns: js.Array[TableColumn]): js.Promise[Unit] = js.native
    /**
      * Drops the columns in the table.
      */
    /**
      * Drops columns in the table.
      */
    def dropColumns(tableOrName: Table, columns: js.Array[TableColumn]): js.Promise[Unit] = js.native
    
    /**
      * Drops database.
      */
    def dropDatabase(database: String): js.Promise[Unit] = js.native
    def dropDatabase(database: String, ifExist: Boolean): js.Promise[Unit] = js.native
    
    def dropExclusionConstraint(tableOrName: String, exclusionOrName: String): js.Promise[Unit] = js.native
    def dropExclusionConstraint(tableOrName: String, exclusionOrName: TableExclusion): js.Promise[Unit] = js.native
    def dropExclusionConstraint(tableOrName: Table, exclusionOrName: String): js.Promise[Unit] = js.native
    /**
      * Drops exclusion constraint.
      */
    /**
      * Drops a exclusion constraint.
      */
    def dropExclusionConstraint(tableOrName: Table, exclusionOrName: TableExclusion): js.Promise[Unit] = js.native
    
    def dropExclusionConstraints(tableOrName: String, exclusionConstraints: js.Array[TableExclusion]): js.Promise[Unit] = js.native
    /**
      * Drops exclusion constraints.
      */
    def dropExclusionConstraints(tableOrName: Table, exclusionConstraints: js.Array[TableExclusion]): js.Promise[Unit] = js.native
    
    def dropForeignKey(tableOrName: String, foreignKeyOrName: String): js.Promise[Unit] = js.native
    def dropForeignKey(tableOrName: String, foreignKeyOrName: TableForeignKey): js.Promise[Unit] = js.native
    def dropForeignKey(tableOrName: Table, foreignKeyOrName: String): js.Promise[Unit] = js.native
    /**
      * Drops a foreign key.
      */
    def dropForeignKey(tableOrName: Table, foreignKeyOrName: TableForeignKey): js.Promise[Unit] = js.native
    
    /* protected */ def dropForeignKeySql(table: Table, foreignKeyOrName: String): Query = js.native
    /**
      * Builds drop foreign key sql.
      */
    /* protected */ def dropForeignKeySql(table: Table, foreignKeyOrName: TableForeignKey): Query = js.native
    
    def dropForeignKeys(tableOrName: String, foreignKeys: js.Array[TableForeignKey]): js.Promise[Unit] = js.native
    /**
      * Drops a foreign keys from the table.
      */
    /**
      * Drops foreign keys.
      */
    def dropForeignKeys(tableOrName: Table, foreignKeys: js.Array[TableForeignKey]): js.Promise[Unit] = js.native
    
    def dropIndex(tableOrName: String, indexOrName: String): js.Promise[Unit] = js.native
    def dropIndex(tableOrName: String, indexOrName: TableIndex): js.Promise[Unit] = js.native
    def dropIndex(tableOrName: Table, indexOrName: String): js.Promise[Unit] = js.native
    /**
      * Drops an index.
      */
    def dropIndex(tableOrName: Table, indexOrName: TableIndex): js.Promise[Unit] = js.native
    
    /* protected */ def dropIndexSql(table: Table, indexOrName: String): Query = js.native
    /**
      * Builds drop index sql.
      */
    /* protected */ def dropIndexSql(table: Table, indexOrName: TableIndex): Query = js.native
    
    def dropIndices(tableOrName: String, indices: js.Array[TableIndex]): js.Promise[Unit] = js.native
    /**
      * Drops an indices from the table.
      */
    /**
      * Drops indices.
      */
    def dropIndices(tableOrName: Table, indices: js.Array[TableIndex]): js.Promise[Unit] = js.native
    
    def dropPrimaryKey(tableOrName: String): js.Promise[Unit] = js.native
    /**
      * Drops a primary key.
      */
    def dropPrimaryKey(tableOrName: Table): js.Promise[Unit] = js.native
    
    /**
      * Builds drop primary key sql.
      */
    /* protected */ def dropPrimaryKeySql(table: Table): Query = js.native
    
    /**
      * Drops table schema.
      */
    /**
      * Drops table schema.
      * For SqlServer can accept schema path (e.g. 'dbName.schemaName') as parameter.
      * If schema path passed, it will drop schema in specified database.
      */
    def dropSchema(schemaPath: String): js.Promise[Unit] = js.native
    def dropSchema(schemaPath: String, ifExist: Boolean): js.Promise[Unit] = js.native
    def dropSchema(schemaPath: String, ifExist: Boolean, isCascade: Boolean): js.Promise[Unit] = js.native
    def dropSchema(schemaPath: String, ifExist: Unit, isCascade: Boolean): js.Promise[Unit] = js.native
    
    def dropTable(table: String, ifExist: Boolean, dropForeignKeys: Boolean, dropIndices: Boolean): js.Promise[Unit] = js.native
    def dropTable(table: String, ifExist: Boolean, dropForeignKeys: Unit, dropIndices: Boolean): js.Promise[Unit] = js.native
    def dropTable(table: String, ifExist: Unit, dropForeignKeys: Boolean, dropIndices: Boolean): js.Promise[Unit] = js.native
    def dropTable(table: String, ifExist: Unit, dropForeignKeys: Unit, dropIndices: Boolean): js.Promise[Unit] = js.native
    def dropTable(table: Table, ifExist: Boolean, dropForeignKeys: Boolean, dropIndices: Boolean): js.Promise[Unit] = js.native
    def dropTable(table: Table, ifExist: Boolean, dropForeignKeys: Unit, dropIndices: Boolean): js.Promise[Unit] = js.native
    def dropTable(table: Table, ifExist: Unit, dropForeignKeys: Boolean, dropIndices: Boolean): js.Promise[Unit] = js.native
    def dropTable(table: Table, ifExist: Unit, dropForeignKeys: Unit, dropIndices: Boolean): js.Promise[Unit] = js.native
    def dropTable(target: String): js.Promise[Unit] = js.native
    def dropTable(target: String, ifExist: Boolean): js.Promise[Unit] = js.native
    def dropTable(target: String, ifExist: Boolean, dropForeignKeys: Boolean): js.Promise[Unit] = js.native
    def dropTable(target: String, ifExist: Unit, dropForeignKeys: Boolean): js.Promise[Unit] = js.native
    /**
      * Drop the table.
      */
    /**
      * Drops a table.
      */
    def dropTable(target: Table): js.Promise[Unit] = js.native
    def dropTable(target: Table, ifExist: Boolean): js.Promise[Unit] = js.native
    def dropTable(target: Table, ifExist: Boolean, dropForeignKeys: Boolean): js.Promise[Unit] = js.native
    def dropTable(target: Table, ifExist: Unit, dropForeignKeys: Boolean): js.Promise[Unit] = js.native
    
    /* protected */ def dropTableSql(tableOrName: String): Query = js.native
    /**
      * Builds drop table sql
      */
    /* protected */ def dropTableSql(tableOrName: Table): Query = js.native
    
    def dropUniqueConstraint(tableOrName: String, uniqueOrName: String): js.Promise[Unit] = js.native
    def dropUniqueConstraint(tableOrName: String, uniqueOrName: TableUnique): js.Promise[Unit] = js.native
    def dropUniqueConstraint(tableOrName: Table, uniqueOrName: String): js.Promise[Unit] = js.native
    /**
      * Drops an unique constraint.
      */
    def dropUniqueConstraint(tableOrName: Table, uniqueOrName: TableUnique): js.Promise[Unit] = js.native
    
    def dropUniqueConstraints(tableOrName: String, uniqueConstraints: js.Array[TableUnique]): js.Promise[Unit] = js.native
    /**
      * Drops an unique constraints.
      */
    /**
      * Drops unique constraints.
      */
    def dropUniqueConstraints(tableOrName: Table, uniqueConstraints: js.Array[TableUnique]): js.Promise[Unit] = js.native
    
    def dropView(target: String): js.Promise[Unit] = js.native
    /**
      * Drops the view.
      */
    /**
      * Drops a view.
      */
    def dropView(target: View): js.Promise[Unit] = js.native
    
    /* protected */ def dropViewSql(viewOrPath: String): Query = js.native
    /**
      * Builds drop view sql.
      */
    /* protected */ def dropViewSql(viewOrPath: View): Query = js.native
    
    /* protected */ def escapePath(target: String): String = js.native
    /* protected */ def escapePath(target: String, disableEscape: Boolean): String = js.native
    /**
      * Escapes given table or view path.
      */
    /* protected */ def escapePath(target: Table): String = js.native
    /* protected */ def escapePath(target: Table, disableEscape: Boolean): String = js.native
    /* protected */ def escapePath(target: View): String = js.native
    /* protected */ def escapePath(target: View, disableEscape: Boolean): String = js.native
    
    /**
      * Returns current database.
      */
    /* protected */ def getCurrentDatabase(): js.Promise[String] = js.native
    
    /**
      * Returns all available database names including system databases.
      */
    def getDatabases(): js.Promise[js.Array[String]] = js.native
    
    /**
      * Returns all available schema names including system schemas.
      * If database parameter specified, returns schemas of that database.
      */
    /**
      * Returns all available schema names including system schemas.
      * If database parameter specified, returns schemas of that database.
      * Useful for SQLServer and Postgres only.
      */
    def getSchemas(): js.Promise[js.Array[String]] = js.native
    def getSchemas(database: String): js.Promise[js.Array[String]] = js.native
    
    def hasColumn(tableOrName: String, column: String): js.Promise[Boolean] = js.native
    def hasColumn(tableOrName: String, column: TableColumn): js.Promise[Boolean] = js.native
    /**
      * Checks if a column exist in the table.
      */
    def hasColumn(tableOrName: Table, column: String): js.Promise[Boolean] = js.native
    /**
      * Checks if column with the given name exist in the given table.
      */
    def hasColumn(tableOrName: Table, column: TableColumn): js.Promise[Boolean] = js.native
    
    /**
      * Checks if database with the given name exist.
      */
    /**
      * Checks if a database with the given name exist.
      */
    def hasDatabase(database: String): js.Promise[Boolean] = js.native
    
    /**
      * Checks if schema with the given name exist.
      */
    /**
      * Checks if a schema with the given name exist.
      */
    def hasSchema(schema: String): js.Promise[Boolean] = js.native
    
    def hasTable(tableOrName: String): js.Promise[Boolean] = js.native
    /**
      * Checks if table with the given name exist in the database.
      */
    /**
      * Checks if a table with the given name exist.
      */
    def hasTable(tableOrName: Table): js.Promise[Boolean] = js.native
    
    /* protected */ def insertViewDefinitionSql(view: View): js.Promise[Query] = js.native
    
    /**
      * Checks if column display width is by default.
      */
    /* protected */ def isDefaultColumnWidth(table: Table, column: TableColumn, width: Double): Boolean = js.native
    
    /* protected */ def parseTableName(target: String): Database = js.native
    /* protected */ def parseTableName(target: Table): Database = js.native
    
    /**
      * Releases used database connection.
      * You cannot use query runner methods once its released.
      */
    /**
      * Releases used database connection.
      * You cannot use query runner methods after connection is released.
      */
    def release(): js.Promise[Unit] = js.native
    
    def renameColumn(tableOrName: String, oldTableColumnOrName: String, newTableColumnOrName: String): js.Promise[Unit] = js.native
    def renameColumn(tableOrName: String, oldTableColumnOrName: String, newTableColumnOrName: TableColumn): js.Promise[Unit] = js.native
    def renameColumn(tableOrName: String, oldTableColumnOrName: TableColumn, newTableColumnOrName: String): js.Promise[Unit] = js.native
    def renameColumn(tableOrName: String, oldTableColumnOrName: TableColumn, newTableColumnOrName: TableColumn): js.Promise[Unit] = js.native
    def renameColumn(tableOrName: Table, oldTableColumnOrName: String, newTableColumnOrName: String): js.Promise[Unit] = js.native
    def renameColumn(tableOrName: Table, oldTableColumnOrName: String, newTableColumnOrName: TableColumn): js.Promise[Unit] = js.native
    def renameColumn(tableOrName: Table, oldTableColumnOrName: TableColumn, newTableColumnOrName: String): js.Promise[Unit] = js.native
    /**
      * Renames column in the given table.
      */
    /**
      * Renames a column.
      */
    def renameColumn(tableOrName: Table, oldTableColumnOrName: TableColumn, newTableColumnOrName: TableColumn): js.Promise[Unit] = js.native
    
    def renameTable(oldTableOrName: String, newTableName: String): js.Promise[Unit] = js.native
    /**
      * Renames a table.
      */
    def renameTable(oldTableOrName: Table, newTableName: String): js.Promise[Unit] = js.native
    
    /**
      * Rollbacks transaction.
      * Error will be thrown if transaction was not started.
      */
    def rollbackTransaction(): js.Promise[Unit] = js.native
    
    /**
      * Starts transaction on the current connection.
      */
    /**
      * Starts transaction.
      */
    def startTransaction(): js.Promise[Unit] = js.native
    def startTransaction(isolationLevel: IsolationLevel): js.Promise[Unit] = js.native
    
    /**
      * Returns raw data stream.
      */
    def stream(query: String): js.Promise[ReadStream] = js.native
    def stream(query: String, parameters: js.Array[js.Any]): js.Promise[ReadStream] = js.native
    def stream(query: String, parameters: js.Array[js.Any], onEnd: js.Function): js.Promise[ReadStream] = js.native
    def stream(query: String, parameters: js.Array[js.Any], onEnd: js.Function, onError: js.Function): js.Promise[ReadStream] = js.native
    def stream(query: String, parameters: js.Array[js.Any], onEnd: Unit, onError: js.Function): js.Promise[ReadStream] = js.native
    def stream(query: String, parameters: Unit, onEnd: js.Function): js.Promise[ReadStream] = js.native
    def stream(query: String, parameters: Unit, onEnd: js.Function, onError: js.Function): js.Promise[ReadStream] = js.native
    def stream(query: String, parameters: Unit, onEnd: Unit, onError: js.Function): js.Promise[ReadStream] = js.native
    
    def updatePrimaryKeys(tableOrName: String, columns: js.Array[TableColumn]): js.Promise[Unit] = js.native
    /**
      * Updates composite primary keys.
      */
    def updatePrimaryKeys(tableOrName: Table, columns: js.Array[TableColumn]): js.Promise[Unit] = js.native
  }
}
