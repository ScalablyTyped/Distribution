package typings.typeorm

import typings.typeorm.anon.HasCitextColumns
import typings.typeorm.anon.IsArrayLength
import typings.typeorm.connectionMod.Connection
import typings.typeorm.driverMod.Driver
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.postgresConnectionCredentialsOptionsMod.PostgresConnectionCredentialsOptions
import typings.typeorm.postgresConnectionOptionsMod.PostgresConnectionOptions
import typings.typeorm.queryRunnerMod.QueryRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/postgres/PostgresDriver", JSImport.Namespace)
@js.native
object postgresDriverMod extends js.Object {
  
  @js.native
  class PostgresDriver () extends Driver {
    def this(connection: Connection) = this()
    
    /* protected */ def checkMetadataForExtensions(): js.Promise[HasCitextColumns] = js.native
    
    /**
      * Closes connection pool.
      */
    /* protected */ def closePool(pool: js.Any): js.Promise[Unit] = js.native
    
    /**
      * We store all created query runners because we need to release them.
      */
    var connectedQueryRunners: js.Array[QueryRunner] = js.native
    
    /**
      * Connection used by driver.
      */
    var connection: Connection = js.native
    
    /**
      * Creates generated map of values generated or returned by database after INSERT query.
      *
      * todo: slow. optimize Object.keys(), OrmUtils.mergeDeep and column.createValueMap parts
      */
    def createGeneratedMap(metadata: EntityMetadata, insertResult: ObjectLiteral): js.UndefOr[ObjectLiteral] = js.native
    
    /**
      * Creates a new connection pool for a given database credentials.
      */
    /* protected */ def createPool(options: PostgresConnectionOptions, credentials: PostgresConnectionCredentialsOptions): js.Promise[_] = js.native
    
    /* protected */ def enableExtensions(extensionsMetadata: js.Any, connection: js.Any): js.Promise[Unit] = js.native
    
    /**
      * Executes given query.
      */
    /* protected */ def executeQuery(connection: js.Any, query: String): js.Promise[_] = js.native
    
    /**
      * If driver dependency is not given explicitly, then try to load it via "require".
      */
    /* protected */ def loadDependencies(): Unit = js.native
    
    /**
      * Loads postgres query stream package.
      */
    def loadStreamDependency(): js.Any = js.native
    
    var lowerDefaultValueIfNecessary: js.Any = js.native
    
    /**
      * Pool for master database.
      */
    var master: js.Any = js.native
    
    /**
      * Max length allowed by Postgres for aliases.
      * @see https://www.postgresql.org/docs/current/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIERS
      */
    @JSName("maxAliasLength")
    var maxAliasLength_PostgresDriver: Double = js.native
    
    /**
      * Creates a database type from a given column metadata.
      */
    def normalizeType(column: IsArrayLength): String = js.native
    
    /**
      * Connection options.
      */
    @JSName("options")
    var options_PostgresDriver: PostgresConnectionOptions = js.native
    
    /**
      * Postgres underlying library.
      */
    var postgres: js.Any = js.native
    
    /**
      * Pool for slave databases.
      * Used in replication.
      */
    var slaves: js.Array[_] = js.native
    
    val uuidGenerator: String = js.native
  }
}
