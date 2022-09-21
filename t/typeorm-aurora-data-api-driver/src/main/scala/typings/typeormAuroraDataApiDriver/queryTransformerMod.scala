package typings.typeormAuroraDataApiDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryTransformerMod {
  
  @JSImport("typeorm-aurora-data-api-driver/dist/types/query-transformer", "MysqlQueryTransformer")
  @js.native
  open class MysqlQueryTransformer ()
    extends typings.typeormAuroraDataApiDriver.mysqlQueryTransformerMod.MysqlQueryTransformer {
    def this(transformOptions: Any) = this()
  }
  
  @JSImport("typeorm-aurora-data-api-driver/dist/types/query-transformer", "PostgresQueryTransformer")
  @js.native
  open class PostgresQueryTransformer ()
    extends typings.typeormAuroraDataApiDriver.postgresQueryTransformerMod.PostgresQueryTransformer {
    def this(transformOptions: Any) = this()
  }
  
  @JSImport("typeorm-aurora-data-api-driver/dist/types/query-transformer", "QueryTransformer")
  @js.native
  abstract class QueryTransformer ()
    extends typings.typeormAuroraDataApiDriver.queryTransformerQueryTransformerMod.QueryTransformer {
    def this(transformOptions: Any) = this()
  }
}
