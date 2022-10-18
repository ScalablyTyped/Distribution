package typings.typeormAuroraDataApiDriver

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTestFunctionalUtilsCreateConnectionMod {
  
  @JSImport("typeorm-aurora-data-api-driver/dist/types/test/functional/utils/create-connection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createConnection(dbType: DbType): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataSource */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(dbType.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataSource */ Any
  ]]
  inline def createConnection(dbType: DbType, partialOptions: Any): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataSource */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(dbType.asInstanceOf[js.Any], partialOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataSource */ Any
  ]]
  
  inline def createConnectionAndResetData(dbType: DbType): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataSource */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnectionAndResetData")(dbType.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataSource */ Any
  ]]
  inline def createConnectionAndResetData(
    dbType: DbType,
    partialOptions: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataSourceOptions */ Any
    ]
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataSource */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnectionAndResetData")(dbType.asInstanceOf[js.Any], partialOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataSource */ Any
  ]]
  
  inline def useCleanDatabase(
    dbType: DbType,
    partialOptions: Unit,
    invoke: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataSource */ /* connection */ Any, 
      js.Promise[Unit]
    ]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCleanDatabase")(dbType.asInstanceOf[js.Any], partialOptions.asInstanceOf[js.Any], invoke.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def useCleanDatabase(
    dbType: DbType,
    partialOptions: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_MysqlConnectionOptions.MysqlConnectionOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_PostgresConnectionOptions.PostgresConnectionOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_CockroachConnectionOptions.CockroachConnectionOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_SqliteConnectionOptions.SqliteConnectionOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_SqlServerConnectionOptions.SqlServerConnectionOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_SapConnectionOptions.SapConnectionOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_OracleConnectionOptions.OracleConnectionOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_CordovaConnectionOptions.CordovaConnectionOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_NativescriptConnectionOptions.NativescriptConnectionOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_ReactNativeConnectionOptions.ReactNativeConnectionOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_SqljsConnectionOptions.SqljsConnectionOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_MongoConnectionOptions.MongoConnectionOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AuroraMysqlConnectionOptions.AuroraMysqlConnectionOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AuroraPostgresConnectionOptions.AuroraPostgresConnectionOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_ExpoConnectionOptions.ExpoConnectionOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_BetterSqlite3ConnectionOptions.BetterSqlite3ConnectionOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_CapacitorConnectionOptions.CapacitorConnectionOptions */ Any
    ],
    invoke: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataSource */ /* connection */ Any, 
      js.Promise[Unit]
    ]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCleanDatabase")(dbType.asInstanceOf[js.Any], partialOptions.asInstanceOf[js.Any], invoke.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.mysql
    - typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.postgres
  */
  trait DbType extends StObject
  object DbType {
    
    inline def mysql: typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.mysql = "mysql".asInstanceOf[typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.mysql]
    
    inline def postgres: typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.postgres = "postgres".asInstanceOf[typings.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.postgres]
  }
}
