package typings.typeorm

import typings.typeorm.anon.HasCitextColumns
import typings.typeorm.anon.IsArrayLengthPrecision
import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.driverDriverMod.Driver
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import typings.typeorm.postgresPostgresConnectionCredentialsOptionsMod.PostgresConnectionCredentialsOptions
import typings.typeorm.postgresPostgresConnectionOptionsMod.PostgresConnectionOptions
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postgresPostgresDriverMod {
  
  @JSImport("typeorm/driver/postgres/PostgresDriver", "PostgresDriver")
  @js.native
  class PostgresDriver ()
    extends StObject
       with Driver {
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
    /* protected */ def createPool(options: PostgresConnectionOptions, credentials: PostgresConnectionCredentialsOptions): js.Promise[js.Any] = js.native
    
    /* protected */ def enableExtensions(extensionsMetadata: js.Any, connection: js.Any): js.Promise[Unit] = js.native
    
    /**
      * Executes given query.
      */
    /* protected */ def executeQuery(connection: js.Any, query: String): js.Promise[js.Any] = js.native
    
    /**
      * If driver dependency is not given explicitly, then try to load it via "require".
      */
    /* protected */ def loadDependencies(): Unit = js.native
    
    /**
      * Loads postgres query stream package.
      */
    def loadStreamDependency(): js.Any = js.native
    
    /* private */ var lowerDefaultValueIfNecessary: js.Any = js.native
    
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
    def normalizeType(column: IsArrayLengthPrecision): String = js.native
    
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
    var slaves: js.Array[js.Any] = js.native
    
    val uuidGenerator: String = js.native
  }
}
