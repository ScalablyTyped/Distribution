package typings.typeormAuroraDataApiDriver

import typings.typeormAuroraDataApiDriver.distTypesQueryTransformerQueryTransformerMod.QueryTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesQueryTransformerPostgresQueryTransformerMod {
  
  @JSImport("typeorm-aurora-data-api-driver/dist/types/query-transformer/postgres-query-transformer", "PostgresQueryTransformer")
  @js.native
  open class PostgresQueryTransformer () extends QueryTransformer {
    def this(transformOptions: Any) = this()
    
    /* protected */ def transformQuery(query: String): String = js.native
  }
}
