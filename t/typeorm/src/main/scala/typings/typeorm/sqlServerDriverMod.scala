package typings.typeorm

import typings.typeorm.anon.Precision
import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.connectionMod.Connection
import typings.typeorm.driverMod.Driver
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.mssqlParameterMod.MssqlParameter
import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.sqlServerConnectionCredentialsOptionsMod.SqlServerConnectionCredentialsOptions
import typings.typeorm.sqlServerConnectionOptionsMod.SqlServerConnectionOptions
import typings.typeorm.tableColumnMod.TableColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlServerDriverMod {
  
  @JSImport("typeorm/browser/driver/sqlserver/SqlServerDriver", "SqlServerDriver")
  @js.native
  class SqlServerDriver protected ()
    extends StObject
       with Driver {
    def this(connection: Connection) = this()
    
    def buildTableVariableDeclaration(identifier: String, columns: js.Array[ColumnMetadata]): String = js.native
    
    /**
      * Closes connection pool.
      */
    /* protected */ def closePool(pool: js.Any): js.Promise[Unit] = js.native
    
    /**
      * Connection used by driver.
      */
    var connection: Connection = js.native
    
    /**
      * Creates generated map of values generated or returned by database after INSERT query.
      */
    def createGeneratedMap(metadata: EntityMetadata, insertResult: ObjectLiteral): js.UndefOr[ObjectLiteral] = js.native
    
    /**
      * Creates a new connection pool for a given database credentials.
      */
    /* protected */ def createPool(options: SqlServerConnectionOptions, credentials: SqlServerConnectionCredentialsOptions): js.Promise[js.Any] = js.native
    
    def getColumnLength(column: TableColumn): String = js.native
    
    /**
      * If driver dependency is not given explicitly, then try to load it via "require".
      */
    /* protected */ def loadDependencies(): Unit = js.native
    
    var lowerDefaultValueIfNessesary: js.Any = js.native
    
    /**
      * Pool for master database.
      */
    var master: js.Any = js.native
    
    /**
      * Max length allowed by MSSQL Server for aliases (identifiers).
      * @see https://docs.microsoft.com/en-us/sql/sql-server/maximum-capacity-specifications-for-sql-server
      */
    @JSName("maxAliasLength")
    var maxAliasLength_SqlServerDriver: Double = js.native
    
    /**
      * SQL Server library.
      */
    var mssql: js.Any = js.native
    
    /**
      * Creates a database type from a given column metadata.
      */
    def normalizeType(column: Precision): String = js.native
    
    /**
      * Connection options.
      */
    @JSName("options")
    var options_SqlServerDriver: SqlServerConnectionOptions = js.native
    
    /**
      * Sql server's parameters needs to be wrapped into special object with type information about this value.
      * This method wraps all values of the given object into MssqlParameter based on their column definitions in the given table.
      */
    def parametrizeMap(tablePath: String, map: ObjectLiteral): ObjectLiteral = js.native
    
    /**
      * Sql server's parameters needs to be wrapped into special object with type information about this value.
      * This method wraps given value into MssqlParameter based on its column definition.
      */
    def parametrizeValue(column: ColumnMetadata, value: js.Any): MssqlParameter = js.native
    
    /**
      * Pool for slave databases.
      * Used in replication.
      */
    var slaves: js.Array[js.Any] = js.native
  }
}
