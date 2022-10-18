package typings.typeormAuroraDataApiDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesQueryTransformerMod {
  
  @JSImport("typeorm-aurora-data-api-driver/dist/types/query-transformer", "MysqlQueryTransformer")
  @js.native
  open class MysqlQueryTransformer ()
    extends typings.typeormAuroraDataApiDriver.distTypesQueryTransformerMysqlQueryTransformerMod.MysqlQueryTransformer {
    def this(transformOptions: Any) = this()
  }
  
  @JSImport("typeorm-aurora-data-api-driver/dist/types/query-transformer", "PostgresQueryTransformer")
  @js.native
  open class PostgresQueryTransformer ()
    extends typings.typeormAuroraDataApiDriver.distTypesQueryTransformerPostgresQueryTransformerMod.PostgresQueryTransformer {
    def this(transformOptions: Any) = this()
  }
  
  /* note: abstract class */ @JSImport("typeorm-aurora-data-api-driver/dist/types/query-transformer", "QueryTransformer")
  @js.native
  open class QueryTransformer ()
    extends typings.typeormAuroraDataApiDriver.distTypesQueryTransformerQueryTransformerMod.QueryTransformer {
    def this(transformOptions: Any) = this()
  }
}
