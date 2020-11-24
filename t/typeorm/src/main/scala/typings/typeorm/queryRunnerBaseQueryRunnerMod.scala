package typings.typeorm

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.driverQueryMod.Query
import typings.typeorm.driverSqlInMemoryMod.SqlInMemory
import typings.typeorm.entityManagerEntityManagerMod.EntityManager
import typings.typeorm.subscriberBroadcasterMod.Broadcaster
import typings.typeorm.tableTableColumnMod.TableColumn
import typings.typeorm.tableTableMod.Table
import typings.typeorm.typesReplicationModeMod.ReplicationMode
import typings.typeorm.viewViewMod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/query-runner/BaseQueryRunner", JSImport.Namespace)
@js.native
object queryRunnerBaseQueryRunnerMod extends js.Object {
  
  @js.native
  abstract class BaseQueryRunner () extends js.Object {
    
    /**
      * Broadcaster used on this query runner to broadcast entity events.
      */
    var broadcaster: Broadcaster = js.native
    
    /**
      * Flushes all memorized sqls.
      */
    def clearSqlMemory(): Unit = js.native
    
    /**
      * Connection used by this query runner.
      */
    var connection: Connection = js.native
    
    /**
      * Real database connection from a connection pool used to perform queries.
      */
    var databaseConnection: js.Any = js.native
    
    /**
      * Disables special query runner mode in which sql queries won't be executed
      * started by calling enableSqlMemory() method.
      *
      * Previously memorized sql will be flushed.
      */
    def disableSqlMemory(): Unit = js.native
    
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
    
    /* protected */ def executeQueries(upQueries: js.Array[Query], downQueries: js.Array[Query]): js.Promise[Unit] = js.native
    /* protected */ def executeQueries(upQueries: js.Array[Query], downQueries: Query): js.Promise[Unit] = js.native
    /* protected */ def executeQueries(upQueries: Query, downQueries: js.Array[Query]): js.Promise[Unit] = js.native
    /**
      * Executes sql used special for schema build.
      */
    /* protected */ def executeQueries(upQueries: Query, downQueries: Query): js.Promise[Unit] = js.native
    
    /**
      * Gets table from previously loaded tables, otherwise loads it from database.
      */
    /* protected */ def getCachedTable(tableName: String): js.Promise[Table] = js.native
    
    /**
      * Gets view from previously loaded views, otherwise loads it from database.
      */
    /* protected */ def getCachedView(viewName: String): js.Promise[View] = js.native
    
    /**
      * Gets sql stored in the memory. Parameters in the sql are already replaced.
      */
    def getMemorySql(): SqlInMemory = js.native
    
    /**
      * Loads given table's data from the database.
      */
    def getTable(tablePath: String): js.Promise[js.UndefOr[Table]] = js.native
    
    /**
      * Loads all tables (with given names) from the database.
      */
    def getTables(tableNames: js.Array[String]): js.Promise[js.Array[Table]] = js.native
    
    /* protected */ def getTypeormMetadataTableName(): String = js.native
    
    /**
      * Loads given view's data from the database.
      */
    def getView(viewPath: String): js.Promise[js.UndefOr[View]] = js.native
    
    /**
      * Loads given view's data from the database.
      */
    def getViews(viewPaths: js.Array[String]): js.Promise[js.Array[View]] = js.native
    
    /**
      * Checks if at least one of column properties was changed.
      * Does not checks column type, length and autoincrement, because these properties changes separately.
      */
    /* protected */ def isColumnChanged(oldColumn: TableColumn, newColumn: TableColumn): Boolean = js.native
    /* protected */ def isColumnChanged(
      oldColumn: TableColumn,
      newColumn: TableColumn,
      checkDefault: js.UndefOr[scala.Nothing],
      checkComment: Boolean
    ): Boolean = js.native
    /* protected */ def isColumnChanged(oldColumn: TableColumn, newColumn: TableColumn, checkDefault: Boolean): Boolean = js.native
    /* protected */ def isColumnChanged(oldColumn: TableColumn, newColumn: TableColumn, checkDefault: Boolean, checkComment: Boolean): Boolean = js.native
    
    /**
      * Checks if column length is by default.
      */
    /* protected */ def isDefaultColumnLength(table: Table, column: TableColumn, length: String): Boolean = js.native
    
    /**
      * Checks if column precision is by default.
      */
    /* protected */ def isDefaultColumnPrecision(table: Table, column: TableColumn, precision: Double): Boolean = js.native
    
    /**
      * Checks if column scale is by default.
      */
    /* protected */ def isDefaultColumnScale(table: Table, column: TableColumn, scale: Double): Boolean = js.native
    
    /**
      * Indicates if connection for this query runner is released.
      * Once its released, query runner cannot run queries anymore.
      */
    var isReleased: Boolean = js.native
    
    /**
      * Indicates if transaction is in progress.
      */
    var isTransactionActive: Boolean = js.native
    
    /* protected */ def loadTables(tablePaths: js.Array[String]): js.Promise[js.Array[Table]] = js.native
    
    /* protected */ def loadViews(tablePaths: js.Array[String]): js.Promise[js.Array[View]] = js.native
    
    /**
      * All synchronized tables in the database.
      */
    var loadedTables: js.Array[Table] = js.native
    
    /**
      * All synchronized views in the database.
      */
    var loadedViews: js.Array[View] = js.native
    
    /**
      * Entity manager working only with current query runner.
      */
    var manager: EntityManager = js.native
    
    /**
      * Mode in which query runner executes.
      * Used for replication.
      * If replication is not setup its value is ignored.
      */
    var mode: ReplicationMode = js.native
    
    /**
      * Executes a given SQL query.
      */
    def query(query: String): js.Promise[_] = js.native
    def query(query: String, parameters: js.Array[_]): js.Promise[_] = js.native
    
    /**
      * Replaces loaded table with given changed table.
      */
    /* protected */ def replaceCachedTable(table: Table, changedTable: Table): Unit = js.native
    
    /**
      * Sql-s stored if "sql in memory" mode is enabled.
      */
    var sqlInMemory: SqlInMemory = js.native
    
    /**
      * Indicates if special query runner mode in which sql queries won't be executed is enabled.
      */
    var sqlMemoryMode: Boolean = js.native
  }
}
