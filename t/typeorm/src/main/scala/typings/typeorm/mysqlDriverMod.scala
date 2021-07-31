package typings.typeorm

import typings.typeorm.anon.Length
import typings.typeorm.columnTypesMod.ColumnType
import typings.typeorm.connectionMod.Connection
import typings.typeorm.driverMod.Driver
import typings.typeorm.mysqlConnectionCredentialsOptionsMod.MysqlConnectionCredentialsOptions
import typings.typeorm.mysqlConnectionOptionsMod.MysqlConnectionOptions
import typings.typeorm.tableColumnMod.TableColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mysqlDriverMod {
  
  @JSImport("typeorm/browser/driver/mysql/MysqlDriver", "MysqlDriver")
  @js.native
  class MysqlDriver protected ()
    extends StObject
       with Driver {
    def this(connection: Connection) = this()
    
    /**
      * Checks if "DEFAULT" values in the column metadata and in the database are equal.
      */
    /* protected */ def compareDefaultValues(columnMetadataValue: String, databaseValue: String): Boolean = js.native
    
    /**
      * Connection used by driver.
      */
    var connection: Connection = js.native
    
    /**
      * Creates a new connection pool for a given database credentials.
      */
    /* protected */ def createConnectionOptions(options: MysqlConnectionOptions, credentials: MysqlConnectionCredentialsOptions): js.Promise[js.Any] = js.native
    
    /**
      * Creates a new connection pool for a given database credentials.
      */
    /* protected */ def createPool(connectionOptions: js.Any): js.Promise[js.Any] = js.native
    
    def getColumnLength(column: TableColumn): String = js.native
    
    /**
      * Loads all driver dependencies.
      */
    /* protected */ def loadDependencies(): Unit = js.native
    
    /**
      * Max length allowed by MySQL for aliases.
      * @see https://dev.mysql.com/doc/refman/5.5/en/identifiers.html
      */
    @JSName("maxAliasLength")
    var maxAliasLength_MysqlDriver: Double = js.native
    
    /**
      * Mysql underlying library.
      */
    var mysql: js.Any = js.native
    
    /**
      * Creates a database type from a given column metadata.
      */
    def normalizeType(column: Length): String = js.native
    
    /**
      * Connection options.
      */
    @JSName("options")
    var options_MysqlDriver: MysqlConnectionOptions = js.native
    
    /**
      * Connection pool.
      * Used in non-replication mode.
      */
    var pool: js.Any = js.native
    
    /**
      * Pool cluster used in replication mode.
      */
    var poolCluster: js.Any = js.native
    
    /**
      * Attaches all required base handlers to a database connection, such as the unhandled error handler.
      */
    var prepareDbConnection: js.Any = js.native
    
    /**
      * Gets list of column data types that supports UNSIGNED and ZEROFILL attributes.
      */
    var unsignedAndZerofillTypes: js.Array[ColumnType] = js.native
    
    /**
      * Gets list of column data types that support length by a driver.
      */
    var withWidthColumnTypes: js.Array[ColumnType] = js.native
  }
}
