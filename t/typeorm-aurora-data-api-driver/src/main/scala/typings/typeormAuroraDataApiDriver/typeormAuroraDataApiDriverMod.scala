package typings.typeormAuroraDataApiDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeormAuroraDataApiDriverMod {
  
  @JSImport("typeorm-aurora-data-api-driver/dist/types/src/typeorm-aurora-data-api-driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(region: String, secretArn: String, resourceArn: String, database: String): DataApiDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(region.asInstanceOf[js.Any], secretArn.asInstanceOf[js.Any], resourceArn.asInstanceOf[js.Any], database.asInstanceOf[js.Any])).asInstanceOf[DataApiDriver]
  inline def default(
    region: String,
    secretArn: String,
    resourceArn: String,
    database: String,
    loggerFn: js.Function2[/* query */ String, /* parameters */ js.UndefOr[js.Array[Any]], Unit]
  ): DataApiDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(region.asInstanceOf[js.Any], secretArn.asInstanceOf[js.Any], resourceArn.asInstanceOf[js.Any], database.asInstanceOf[js.Any], loggerFn.asInstanceOf[js.Any])).asInstanceOf[DataApiDriver]
  inline def default(
    region: String,
    secretArn: String,
    resourceArn: String,
    database: String,
    loggerFn: js.Function2[/* query */ String, /* parameters */ js.UndefOr[js.Array[Any]], Unit],
    serviceConfigOptions: Any
  ): DataApiDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(region.asInstanceOf[js.Any], secretArn.asInstanceOf[js.Any], resourceArn.asInstanceOf[js.Any], database.asInstanceOf[js.Any], loggerFn.asInstanceOf[js.Any], serviceConfigOptions.asInstanceOf[js.Any])).asInstanceOf[DataApiDriver]
  inline def default(
    region: String,
    secretArn: String,
    resourceArn: String,
    database: String,
    loggerFn: js.Function2[/* query */ String, /* parameters */ js.UndefOr[js.Array[Any]], Unit],
    serviceConfigOptions: Any,
    formatOptions: Any
  ): DataApiDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(region.asInstanceOf[js.Any], secretArn.asInstanceOf[js.Any], resourceArn.asInstanceOf[js.Any], database.asInstanceOf[js.Any], loggerFn.asInstanceOf[js.Any], serviceConfigOptions.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[DataApiDriver]
  inline def default(
    region: String,
    secretArn: String,
    resourceArn: String,
    database: String,
    loggerFn: js.Function2[/* query */ String, /* parameters */ js.UndefOr[js.Array[Any]], Unit],
    serviceConfigOptions: Unit,
    formatOptions: Any
  ): DataApiDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(region.asInstanceOf[js.Any], secretArn.asInstanceOf[js.Any], resourceArn.asInstanceOf[js.Any], database.asInstanceOf[js.Any], loggerFn.asInstanceOf[js.Any], serviceConfigOptions.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[DataApiDriver]
  inline def default(
    region: String,
    secretArn: String,
    resourceArn: String,
    database: String,
    loggerFn: Unit,
    serviceConfigOptions: Any
  ): DataApiDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(region.asInstanceOf[js.Any], secretArn.asInstanceOf[js.Any], resourceArn.asInstanceOf[js.Any], database.asInstanceOf[js.Any], loggerFn.asInstanceOf[js.Any], serviceConfigOptions.asInstanceOf[js.Any])).asInstanceOf[DataApiDriver]
  inline def default(
    region: String,
    secretArn: String,
    resourceArn: String,
    database: String,
    loggerFn: Unit,
    serviceConfigOptions: Any,
    formatOptions: Any
  ): DataApiDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(region.asInstanceOf[js.Any], secretArn.asInstanceOf[js.Any], resourceArn.asInstanceOf[js.Any], database.asInstanceOf[js.Any], loggerFn.asInstanceOf[js.Any], serviceConfigOptions.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[DataApiDriver]
  inline def default(
    region: String,
    secretArn: String,
    resourceArn: String,
    database: String,
    loggerFn: Unit,
    serviceConfigOptions: Unit,
    formatOptions: Any
  ): DataApiDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(region.asInstanceOf[js.Any], secretArn.asInstanceOf[js.Any], resourceArn.asInstanceOf[js.Any], database.asInstanceOf[js.Any], loggerFn.asInstanceOf[js.Any], serviceConfigOptions.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[DataApiDriver]
  
  @JSImport("typeorm-aurora-data-api-driver/dist/types/src/typeorm-aurora-data-api-driver", "MysqlQueryTransformer")
  @js.native
  open class MysqlQueryTransformer ()
    extends typings.typeormAuroraDataApiDriver.srcQueryTransformerMod.MysqlQueryTransformer {
    def this(transformOptions: Any) = this()
  }
  
  @JSImport("typeorm-aurora-data-api-driver/dist/types/src/typeorm-aurora-data-api-driver", "PostgresQueryTransformer")
  @js.native
  open class PostgresQueryTransformer ()
    extends typings.typeormAuroraDataApiDriver.srcQueryTransformerMod.PostgresQueryTransformer {
    def this(transformOptions: Any) = this()
  }
  
  inline def pg(region: String, secretArn: String, resourceArn: String, database: String): DataApiDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("pg")(region.asInstanceOf[js.Any], secretArn.asInstanceOf[js.Any], resourceArn.asInstanceOf[js.Any], database.asInstanceOf[js.Any])).asInstanceOf[DataApiDriver]
  inline def pg(
    region: String,
    secretArn: String,
    resourceArn: String,
    database: String,
    loggerFn: js.Function2[/* query */ String, /* parameters */ js.UndefOr[js.Array[Any]], Unit]
  ): DataApiDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("pg")(region.asInstanceOf[js.Any], secretArn.asInstanceOf[js.Any], resourceArn.asInstanceOf[js.Any], database.asInstanceOf[js.Any], loggerFn.asInstanceOf[js.Any])).asInstanceOf[DataApiDriver]
  inline def pg(
    region: String,
    secretArn: String,
    resourceArn: String,
    database: String,
    loggerFn: js.Function2[/* query */ String, /* parameters */ js.UndefOr[js.Array[Any]], Unit],
    serviceConfigOptions: Any
  ): DataApiDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("pg")(region.asInstanceOf[js.Any], secretArn.asInstanceOf[js.Any], resourceArn.asInstanceOf[js.Any], database.asInstanceOf[js.Any], loggerFn.asInstanceOf[js.Any], serviceConfigOptions.asInstanceOf[js.Any])).asInstanceOf[DataApiDriver]
  inline def pg(
    region: String,
    secretArn: String,
    resourceArn: String,
    database: String,
    loggerFn: js.Function2[/* query */ String, /* parameters */ js.UndefOr[js.Array[Any]], Unit],
    serviceConfigOptions: Any,
    formatOptions: Any
  ): DataApiDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("pg")(region.asInstanceOf[js.Any], secretArn.asInstanceOf[js.Any], resourceArn.asInstanceOf[js.Any], database.asInstanceOf[js.Any], loggerFn.asInstanceOf[js.Any], serviceConfigOptions.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[DataApiDriver]
  inline def pg(
    region: String,
    secretArn: String,
    resourceArn: String,
    database: String,
    loggerFn: js.Function2[/* query */ String, /* parameters */ js.UndefOr[js.Array[Any]], Unit],
    serviceConfigOptions: Unit,
    formatOptions: Any
  ): DataApiDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("pg")(region.asInstanceOf[js.Any], secretArn.asInstanceOf[js.Any], resourceArn.asInstanceOf[js.Any], database.asInstanceOf[js.Any], loggerFn.asInstanceOf[js.Any], serviceConfigOptions.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[DataApiDriver]
  inline def pg(
    region: String,
    secretArn: String,
    resourceArn: String,
    database: String,
    loggerFn: Unit,
    serviceConfigOptions: Any
  ): DataApiDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("pg")(region.asInstanceOf[js.Any], secretArn.asInstanceOf[js.Any], resourceArn.asInstanceOf[js.Any], database.asInstanceOf[js.Any], loggerFn.asInstanceOf[js.Any], serviceConfigOptions.asInstanceOf[js.Any])).asInstanceOf[DataApiDriver]
  inline def pg(
    region: String,
    secretArn: String,
    resourceArn: String,
    database: String,
    loggerFn: Unit,
    serviceConfigOptions: Any,
    formatOptions: Any
  ): DataApiDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("pg")(region.asInstanceOf[js.Any], secretArn.asInstanceOf[js.Any], resourceArn.asInstanceOf[js.Any], database.asInstanceOf[js.Any], loggerFn.asInstanceOf[js.Any], serviceConfigOptions.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[DataApiDriver]
  inline def pg(
    region: String,
    secretArn: String,
    resourceArn: String,
    database: String,
    loggerFn: Unit,
    serviceConfigOptions: Unit,
    formatOptions: Any
  ): DataApiDriver = (^.asInstanceOf[js.Dynamic].applyDynamic("pg")(region.asInstanceOf[js.Any], secretArn.asInstanceOf[js.Any], resourceArn.asInstanceOf[js.Any], database.asInstanceOf[js.Any], loggerFn.asInstanceOf[js.Any], serviceConfigOptions.asInstanceOf[js.Any], formatOptions.asInstanceOf[js.Any])).asInstanceOf[DataApiDriver]
  
  @js.native
  trait DataApiDriver extends StObject {
    
    /* private */ val client: Any = js.native
    
    def commitTransaction(): js.Promise[Unit] = js.native
    
    /* private */ val database: Any = js.native
    
    /* private */ val formatOptions: Any = js.native
    
    /* private */ val loggerFn: Any = js.native
    
    def prepareHydratedValue(
      value: Any,
      columnMetadata: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColumnMetadata */ Any
    ): Any = js.native
    
    def preparePersistentValue(
      value: Any,
      columnMetadata: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColumnMetadata */ Any
    ): Any = js.native
    
    def query(query: String): js.Promise[Any] = js.native
    def query(query: String, parameters: js.Array[Any]): js.Promise[Any] = js.native
    
    /* private */ val queryConfigOptions: Any = js.native
    
    /* private */ val queryTransformer: Any = js.native
    
    /* private */ val region: Any = js.native
    
    /* private */ val resourceArn: Any = js.native
    
    def rollbackTransaction(): js.Promise[Unit] = js.native
    
    /* private */ val secretArn: Any = js.native
    
    /* private */ val serviceConfigOptions: Any = js.native
    
    def startTransaction(): js.Promise[Unit] = js.native
    
    /* private */ var transactionId: Any = js.native
  }
}
