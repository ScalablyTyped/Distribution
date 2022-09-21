package typings.typeormAuroraDataApiDriver

import typings.typeormAuroraDataApiDriver.queryTransformerQueryTransformerMod.QueryTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mysqlQueryTransformerMod {
  
  @JSImport("typeorm-aurora-data-api-driver/dist/types/query-transformer/mysql-query-transformer", "MysqlQueryTransformer")
  @js.native
  open class MysqlQueryTransformer () extends QueryTransformer {
    def this(transformOptions: Any) = this()
    
    /* protected */ def expandArrayParameters(parameters: js.Array[Any]): js.Array[Any] = js.native
  }
}
