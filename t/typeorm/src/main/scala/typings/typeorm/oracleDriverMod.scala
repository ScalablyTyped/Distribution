package typings.typeorm

import typings.typeorm.anon.IsArrayLength
import typings.typeorm.columnTypesMod.ColumnType
import typings.typeorm.connectionMod.Connection
import typings.typeorm.driverMod.Driver
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.oracleConnectionCredentialsOptionsMod.OracleConnectionCredentialsOptions
import typings.typeorm.oracleConnectionOptionsMod.OracleConnectionOptions
import typings.typeorm.tableColumnMod.TableColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/oracle/OracleDriver", JSImport.Namespace)
@js.native
object oracleDriverMod extends js.Object {
  
  @js.native
  class OracleDriver protected () extends Driver {
    def this(connection: Connection) = this()
    
    /**
      * Closes connection pool.
      */
    /* protected */ def closePool(pool: js.Any): js.Promise[Unit] = js.native
    
    /**
      * Converts column type in to native oracle type.
      */
    def columnTypeToNativeParameter(`type`: ColumnType): js.Any = js.native
    
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
    /* protected */ def createPool(options: OracleConnectionOptions, credentials: OracleConnectionCredentialsOptions): js.Promise[_] = js.native
    
    def getColumnLength(column: TableColumn): String = js.native
    
    /**
      * Loads all driver dependencies.
      */
    /* protected */ def loadDependencies(): Unit = js.native
    
    /**
      * Pool for master database.
      */
    var master: js.Any = js.native
    
    /**
      * Max length allowed by Oracle for aliases.
      * @see https://docs.oracle.com/database/121/SQLRF/sql_elements008.htm#SQLRF51129
      * > The following list of rules applies to both quoted and nonquoted identifiers unless otherwise indicated
      * > Names must be from 1 to 30 bytes long with these exceptions:
      * > [...]
      *
      * Since Oracle 12.2 (with a compatible driver/client), the limit has been set to 128.
      * @see https://docs.oracle.com/en/database/oracle/oracle-database/12.2/sqlrf/Database-Object-Names-and-Qualifiers.html
      *
      * > If COMPATIBLE is set to a value of 12.2 or higher, then names must be from 1 to 128 bytes long with these exceptions
      */
    @JSName("maxAliasLength")
    var maxAliasLength_OracleDriver: Double = js.native
    
    /**
      * Creates a database type from a given column metadata.
      */
    def normalizeType(column: IsArrayLength): String = js.native
    
    /**
      * Connection options.
      */
    @JSName("options")
    var options_OracleDriver: OracleConnectionOptions = js.native
    
    /**
      * Underlying oracle library.
      */
    var oracle: js.Any = js.native
    
    /**
      * Pool for slave databases.
      * Used in replication.
      */
    var slaves: js.Array[_] = js.native
  }
}
