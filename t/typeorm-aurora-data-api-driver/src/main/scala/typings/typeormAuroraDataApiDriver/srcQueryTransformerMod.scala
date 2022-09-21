package typings.typeormAuroraDataApiDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcQueryTransformerMod {
  
  @JSImport("typeorm-aurora-data-api-driver/dist/types/src/query-transformer", "MysqlQueryTransformer")
  @js.native
  open class MysqlQueryTransformer ()
    extends typings.typeormAuroraDataApiDriver.queryTransformerMysqlQueryTransformerMod.MysqlQueryTransformer {
    def this(transformOptions: Any) = this()
  }
  
  @JSImport("typeorm-aurora-data-api-driver/dist/types/src/query-transformer", "PostgresQueryTransformer")
  @js.native
  open class PostgresQueryTransformer ()
    extends typings.typeormAuroraDataApiDriver.queryTransformerPostgresQueryTransformerMod.PostgresQueryTransformer {
    def this(transformOptions: Any) = this()
  }
  
  @JSImport("typeorm-aurora-data-api-driver/dist/types/src/query-transformer", "QueryTransformer")
  @js.native
  abstract class QueryTransformer ()
    extends typings.typeormAuroraDataApiDriver.srcQueryTransformerQueryTransformerMod.QueryTransformer {
    def this(transformOptions: Any) = this()
  }
}
