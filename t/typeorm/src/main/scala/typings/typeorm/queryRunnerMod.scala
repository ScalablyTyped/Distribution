package typings.typeorm

import typings.typeorm.anon.OldColumn
import typings.typeorm.broadcasterMod.Broadcaster
import typings.typeorm.connectionMod.Connection
import typings.typeorm.entityManagerMod.EntityManager
import typings.typeorm.isolationLevelMod.IsolationLevel
import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.platformToolsMod.ReadStream
import typings.typeorm.sqlInMemoryMod.SqlInMemory
import typings.typeorm.tableCheckMod.TableCheck
import typings.typeorm.tableColumnMod.TableColumn
import typings.typeorm.tableExclusionMod.TableExclusion
import typings.typeorm.tableForeignKeyMod.TableForeignKey
import typings.typeorm.tableIndexMod.TableIndex
import typings.typeorm.tableMod.Table
import typings.typeorm.tableUniqueMod.TableUnique
import typings.typeorm.viewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryRunnerMod {
  
  @js.native
  trait QueryRunner extends StObject {
    
    def addColumn(table: String, column: TableColumn): js.Promise[Unit] = js.native
    /**
      * Adds a new column.
      */
    def addColumn(table: Table, column: TableColumn): js.Promise[Unit] = js.native
    
    def addColumns(table: String, columns: js.Array[TableColumn]): js.Promise[Unit] = js.native
    /**
      * Adds new columns.
      */
    def addColumns(table: Table, columns: js.Array[TableColumn]): js.Promise[Unit] = js.native
    
    /**
      * Broadcaster used on this query runner to broadcast entity events.
      */
    val broadcaster: Broadcaster = js.native
    
    def changeColumn(table: String, oldColumn: String, newColumn: TableColumn): js.Promise[Unit] = js.native
    def changeColumn(table: String, oldColumn: TableColumn, newColumn: TableColumn): js.Promise[Unit] = js.native
    def changeColumn(table: Table, oldColumn: String, newColumn: TableColumn): js.Promise[Unit] = js.native
    /**
      * Changes a column in the table.
      */
    def changeColumn(table: Table, oldColumn: TableColumn, newColumn: TableColumn): js.Promise[Unit] = js.native
    
    def changeColumns(table: String, changedColumns: js.Array[OldColumn]): js.Promise[Unit] = js.native
    /**
      * Changes columns in the table.
      */
    def changeColumns(table: Table, changedColumns: js.Array[OldColumn]): js.Promise[Unit] = js.native
    
    /**
      * Removes all tables from the currently connected database.
      * Be careful with using this method and avoid using it in production or migrations
      * (because it can clear all your database).
      */
    def clearDatabase(): js.Promise[Unit] = js.native
    def clearDatabase(database: String): js.Promise[Unit] = js.native
    
    /**
      * Flushes all memorized sqls.
      */
    def clearSqlMemory(): Unit = js.native
    
    /**
      * Clears all table contents.
      * Note: this operation uses SQL's TRUNCATE query which cannot be reverted in transactions.
      */
    def clearTable(tableName: String): js.Promise[Unit] = js.native
    
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
    
    /**
      * Connection used by this query runner.
      */
    val connection: Connection = js.native
    
    def createCheckConstraint(table: String, checkConstraint: TableCheck): js.Promise[Unit] = js.native
    /**
      * Creates a new check constraint.
      */
    def createCheckConstraint(table: Table, checkConstraint: TableCheck): js.Promise[Unit] = js.native
    
    def createCheckConstraints(table: String, checkConstraints: js.Array[TableCheck]): js.Promise[Unit] = js.native
    /**
      * Creates new check constraints.
      */
    def createCheckConstraints(table: Table, checkConstraints: js.Array[TableCheck]): js.Promise[Unit] = js.native
    
    /**
      * Creates a new database.
      */
    def createDatabase(database: String): js.Promise[Unit] = js.native
    def createDatabase(database: String, ifNotExist: Boolean): js.Promise[Unit] = js.native
    
    def createExclusionConstraint(table: String, exclusionConstraint: TableExclusion): js.Promise[Unit] = js.native
    /**
      * Creates a new exclusion constraint.
      */
    def createExclusionConstraint(table: Table, exclusionConstraint: TableExclusion): js.Promise[Unit] = js.native
    
    def createExclusionConstraints(table: String, exclusionConstraints: js.Array[TableExclusion]): js.Promise[Unit] = js.native
    /**
      * Creates new exclusion constraints.
      */
    def createExclusionConstraints(table: Table, exclusionConstraints: js.Array[TableExclusion]): js.Promise[Unit] = js.native
    
    def createForeignKey(table: String, foreignKey: TableForeignKey): js.Promise[Unit] = js.native
    /**
      * Creates a new foreign key.
      */
    def createForeignKey(table: Table, foreignKey: TableForeignKey): js.Promise[Unit] = js.native
    
    def createForeignKeys(table: String, foreignKeys: js.Array[TableForeignKey]): js.Promise[Unit] = js.native
    /**
      * Creates new foreign keys.
      */
    def createForeignKeys(table: Table, foreignKeys: js.Array[TableForeignKey]): js.Promise[Unit] = js.native
    
    def createIndex(table: String, index: TableIndex): js.Promise[Unit] = js.native
    /**
      * Creates a new index.
      */
    def createIndex(table: Table, index: TableIndex): js.Promise[Unit] = js.native
    
    def createIndices(table: String, indices: js.Array[TableIndex]): js.Promise[Unit] = js.native
    /**
      * Creates new indices.
      */
    def createIndices(table: Table, indices: js.Array[TableIndex]): js.Promise[Unit] = js.native
    
    def createPrimaryKey(table: String, columnNames: js.Array[String]): js.Promise[Unit] = js.native
    /**
      * Creates a new primary key.
      */
    def createPrimaryKey(table: Table, columnNames: js.Array[String]): js.Promise[Unit] = js.native
    
    /**
      * Creates a new table schema.
      */
    def createSchema(schemaPath: String): js.Promise[Unit] = js.native
    def createSchema(schemaPath: String, ifNotExist: Boolean): js.Promise[Unit] = js.native
    
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
    
    def createUniqueConstraint(table: String, uniqueConstraint: TableUnique): js.Promise[Unit] = js.native
    /**
      * Creates a new unique constraint.
      */
    def createUniqueConstraint(table: Table, uniqueConstraint: TableUnique): js.Promise[Unit] = js.native
    
    def createUniqueConstraints(table: String, uniqueConstraints: js.Array[TableUnique]): js.Promise[Unit] = js.native
    /**
      * Creates new unique constraints.
      */
    def createUniqueConstraints(table: Table, uniqueConstraints: js.Array[TableUnique]): js.Promise[Unit] = js.native
    
    /**
      * Creates a new view.
      */
    def createView(view: View): js.Promise[Unit] = js.native
    def createView(view: View, oldView: View): js.Promise[Unit] = js.native
    
    /**
      * Stores temporarily user data.
      * Useful for sharing data with subscribers.
      */
    var data: ObjectLiteral = js.native
    
    /**
      * Disables special query runner mode in which sql queries won't be executed
      * started by calling enableSqlMemory() method.
      *
      * Previously memorized sql will be flushed.
      */
    def disableSqlMemory(): Unit = js.native
    
    def dropCheckConstraint(table: String, checkOrName: String): js.Promise[Unit] = js.native
    def dropCheckConstraint(table: String, checkOrName: TableCheck): js.Promise[Unit] = js.native
    def dropCheckConstraint(table: Table, checkOrName: String): js.Promise[Unit] = js.native
    /**
      * Drops a check constraint.
      */
    def dropCheckConstraint(table: Table, checkOrName: TableCheck): js.Promise[Unit] = js.native
    
    def dropCheckConstraints(table: String, checkConstraints: js.Array[TableCheck]): js.Promise[Unit] = js.native
    /**
      * Drops check constraints.
      */
    def dropCheckConstraints(table: Table, checkConstraints: js.Array[TableCheck]): js.Promise[Unit] = js.native
    
    def dropColumn(table: String, column: String): js.Promise[Unit] = js.native
    def dropColumn(table: String, column: TableColumn): js.Promise[Unit] = js.native
    def dropColumn(table: Table, column: String): js.Promise[Unit] = js.native
    /**
      * Drops a column in the table.
      */
    def dropColumn(table: Table, column: TableColumn): js.Promise[Unit] = js.native
    
    def dropColumns(table: String, columns: js.Array[TableColumn]): js.Promise[Unit] = js.native
    /**
      * Drops columns in the table.
      */
    def dropColumns(table: Table, columns: js.Array[TableColumn]): js.Promise[Unit] = js.native
    
    /**
      * Drops database.
      */
    def dropDatabase(database: String): js.Promise[Unit] = js.native
    def dropDatabase(database: String, ifExist: Boolean): js.Promise[Unit] = js.native
    
    def dropExclusionConstraint(table: String, exclusionOrName: String): js.Promise[Unit] = js.native
    def dropExclusionConstraint(table: String, exclusionOrName: TableExclusion): js.Promise[Unit] = js.native
    def dropExclusionConstraint(table: Table, exclusionOrName: String): js.Promise[Unit] = js.native
    /**
      * Drops a exclusion constraint.
      */
    def dropExclusionConstraint(table: Table, exclusionOrName: TableExclusion): js.Promise[Unit] = js.native
    
    def dropExclusionConstraints(table: String, exclusionConstraints: js.Array[TableExclusion]): js.Promise[Unit] = js.native
    /**
      * Drops exclusion constraints.
      */
    def dropExclusionConstraints(table: Table, exclusionConstraints: js.Array[TableExclusion]): js.Promise[Unit] = js.native
    
    def dropForeignKey(table: String, foreignKeyOrName: String): js.Promise[Unit] = js.native
    def dropForeignKey(table: String, foreignKeyOrName: TableForeignKey): js.Promise[Unit] = js.native
    def dropForeignKey(table: Table, foreignKeyOrName: String): js.Promise[Unit] = js.native
    /**
      * Drops a foreign key.
      */
    def dropForeignKey(table: Table, foreignKeyOrName: TableForeignKey): js.Promise[Unit] = js.native
    
    def dropForeignKeys(table: String, foreignKeys: js.Array[TableForeignKey]): js.Promise[Unit] = js.native
    /**
      * Drops foreign keys.
      */
    def dropForeignKeys(table: Table, foreignKeys: js.Array[TableForeignKey]): js.Promise[Unit] = js.native
    
    def dropIndex(table: String, index: String): js.Promise[Unit] = js.native
    def dropIndex(table: String, index: TableIndex): js.Promise[Unit] = js.native
    def dropIndex(table: Table, index: String): js.Promise[Unit] = js.native
    /**
      * Drops an index.
      */
    def dropIndex(table: Table, index: TableIndex): js.Promise[Unit] = js.native
    
    def dropIndices(table: String, indices: js.Array[TableIndex]): js.Promise[Unit] = js.native
    /**
      * Drops indices.
      */
    def dropIndices(table: Table, indices: js.Array[TableIndex]): js.Promise[Unit] = js.native
    
    def dropPrimaryKey(table: String): js.Promise[Unit] = js.native
    /**
      * Drops a primary key.
      */
    def dropPrimaryKey(table: Table): js.Promise[Unit] = js.native
    
    /**
      * Drops table schema.
      * For SqlServer can accept schema path (e.g. 'dbName.schemaName') as parameter.
      * If schema path passed, it will drop schema in specified database.
      */
    def dropSchema(schemaPath: String): js.Promise[Unit] = js.native
    def dropSchema(schemaPath: String, ifExist: Boolean): js.Promise[Unit] = js.native
    def dropSchema(schemaPath: String, ifExist: Boolean, isCascade: Boolean): js.Promise[Unit] = js.native
    def dropSchema(schemaPath: String, ifExist: Unit, isCascade: Boolean): js.Promise[Unit] = js.native
    
    def dropTable(table: String): js.Promise[Unit] = js.native
    def dropTable(table: String, ifExist: Boolean): js.Promise[Unit] = js.native
    def dropTable(table: String, ifExist: Boolean, dropForeignKeys: Boolean): js.Promise[Unit] = js.native
    def dropTable(table: String, ifExist: Boolean, dropForeignKeys: Boolean, dropIndices: Boolean): js.Promise[Unit] = js.native
    def dropTable(table: String, ifExist: Boolean, dropForeignKeys: Unit, dropIndices: Boolean): js.Promise[Unit] = js.native
    def dropTable(table: String, ifExist: Unit, dropForeignKeys: Boolean): js.Promise[Unit] = js.native
    def dropTable(table: String, ifExist: Unit, dropForeignKeys: Boolean, dropIndices: Boolean): js.Promise[Unit] = js.native
    def dropTable(table: String, ifExist: Unit, dropForeignKeys: Unit, dropIndices: Boolean): js.Promise[Unit] = js.native
    /**
      * Drops a table.
      */
    def dropTable(table: Table): js.Promise[Unit] = js.native
    def dropTable(table: Table, ifExist: Boolean): js.Promise[Unit] = js.native
    def dropTable(table: Table, ifExist: Boolean, dropForeignKeys: Boolean): js.Promise[Unit] = js.native
    def dropTable(table: Table, ifExist: Boolean, dropForeignKeys: Boolean, dropIndices: Boolean): js.Promise[Unit] = js.native
    def dropTable(table: Table, ifExist: Boolean, dropForeignKeys: Unit, dropIndices: Boolean): js.Promise[Unit] = js.native
    def dropTable(table: Table, ifExist: Unit, dropForeignKeys: Boolean): js.Promise[Unit] = js.native
    def dropTable(table: Table, ifExist: Unit, dropForeignKeys: Boolean, dropIndices: Boolean): js.Promise[Unit] = js.native
    def dropTable(table: Table, ifExist: Unit, dropForeignKeys: Unit, dropIndices: Boolean): js.Promise[Unit] = js.native
    
    def dropUniqueConstraint(table: String, uniqueOrName: String): js.Promise[Unit] = js.native
    def dropUniqueConstraint(table: String, uniqueOrName: TableUnique): js.Promise[Unit] = js.native
    def dropUniqueConstraint(table: Table, uniqueOrName: String): js.Promise[Unit] = js.native
    /**
      * Drops an unique constraint.
      */
    def dropUniqueConstraint(table: Table, uniqueOrName: TableUnique): js.Promise[Unit] = js.native
    
    def dropUniqueConstraints(table: String, uniqueConstraints: js.Array[TableUnique]): js.Promise[Unit] = js.native
    /**
      * Drops unique constraints.
      */
    def dropUniqueConstraints(table: Table, uniqueConstraints: js.Array[TableUnique]): js.Promise[Unit] = js.native
    
    def dropView(view: String): js.Promise[Unit] = js.native
    /**
      * Drops a view.
      */
    def dropView(view: View): js.Promise[Unit] = js.native
    
    /**
      * Enables special query runner mode in which sql queries won't be executed,
      * instead they will be memorized into a special variable inside query runner.
      * You can get memorized sql using getMemorySql() method.
      */
    def enableSqlMemory(): Unit = js.native
    
    /**
      * Executes down sql queries.
      */
    def executeMemoryDownSql(): js.Promise[Unit] = js.native
    
    /**
      * Executes up sql queries.
      */
    def executeMemoryUpSql(): js.Promise[Unit] = js.native
    
    /**
      * Returns all available database names including system databases.
      */
    def getDatabases(): js.Promise[js.Array[String]] = js.native
    
    /**
      * Gets sql stored in the memory. Parameters in the sql are already replaced.
      */
    def getMemorySql(): SqlInMemory = js.native
    
    /**
      * Returns all available schema names including system schemas.
      * If database parameter specified, returns schemas of that database.
      * Useful for SQLServer and Postgres only.
      */
    def getSchemas(): js.Promise[js.Array[String]] = js.native
    def getSchemas(database: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Loads a table by a given name from the database.
      */
    def getTable(tablePath: String): js.Promise[js.UndefOr[Table]] = js.native
    
    /**
      * Loads all tables from the database and returns them.
      *
      * todo: make tablePaths optional
      */
    def getTables(tablePaths: js.Array[String]): js.Promise[js.Array[Table]] = js.native
    
    /**
      * Loads a view by a given name from the database.
      */
    def getView(viewPath: String): js.Promise[js.UndefOr[View]] = js.native
    
    /**
      * Loads all views from the database and returns them.
      */
    def getViews(viewPaths: js.Array[String]): js.Promise[js.Array[View]] = js.native
    
    def hasColumn(table: String, columnName: String): js.Promise[Boolean] = js.native
    /**
      * Checks if a column exist in the table.
      */
    def hasColumn(table: Table, columnName: String): js.Promise[Boolean] = js.native
    
    /**
      * Checks if a database with the given name exist.
      */
    def hasDatabase(database: String): js.Promise[Boolean] = js.native
    
    /**
      * Checks if a schema with the given name exist.
      */
    def hasSchema(schema: String): js.Promise[Boolean] = js.native
    
    def hasTable(table: String): js.Promise[Boolean] = js.native
    /**
      * Checks if a table with the given name exist.
      */
    def hasTable(table: Table): js.Promise[Boolean] = js.native
    
    /**
      * Indicates if connection for this query runner is released.
      * Once its released, query runner cannot run queries anymore.
      */
    val isReleased: Boolean = js.native
    
    /**
      * Indicates if transaction is in progress.
      */
    val isTransactionActive: Boolean = js.native
    
    /**
      * All synchronized tables in the database.
      */
    var loadedTables: js.Array[Table] = js.native
    
    /**
      * All synchronized views in the database.
      */
    var loadedViews: js.Array[View] = js.native
    
    /**
      * Entity manager working only with this query runner.
      */
    val manager: EntityManager = js.native
    
    /**
      * Executes a given SQL query and returns raw database results.
      */
    def query(query: String): js.Promise[js.Any] = js.native
    def query(query: String, parameters: js.Array[js.Any]): js.Promise[js.Any] = js.native
    
    /**
      * Releases used database connection.
      * You cannot use query runner methods after connection is released.
      */
    def release(): js.Promise[Unit] = js.native
    
    def renameColumn(table: String, oldColumnOrName: String, newColumnOrName: String): js.Promise[Unit] = js.native
    def renameColumn(table: String, oldColumnOrName: String, newColumnOrName: TableColumn): js.Promise[Unit] = js.native
    def renameColumn(table: String, oldColumnOrName: TableColumn, newColumnOrName: String): js.Promise[Unit] = js.native
    def renameColumn(table: String, oldColumnOrName: TableColumn, newColumnOrName: TableColumn): js.Promise[Unit] = js.native
    def renameColumn(table: Table, oldColumnOrName: String, newColumnOrName: String): js.Promise[Unit] = js.native
    def renameColumn(table: Table, oldColumnOrName: String, newColumnOrName: TableColumn): js.Promise[Unit] = js.native
    def renameColumn(table: Table, oldColumnOrName: TableColumn, newColumnOrName: String): js.Promise[Unit] = js.native
    /**
      * Renames a column.
      */
    def renameColumn(table: Table, oldColumnOrName: TableColumn, newColumnOrName: TableColumn): js.Promise[Unit] = js.native
    
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
    
    def updatePrimaryKeys(table: String, columns: js.Array[TableColumn]): js.Promise[Unit] = js.native
    /**
      * Updates composite primary keys.
      */
    def updatePrimaryKeys(table: Table, columns: js.Array[TableColumn]): js.Promise[Unit] = js.native
  }
}
