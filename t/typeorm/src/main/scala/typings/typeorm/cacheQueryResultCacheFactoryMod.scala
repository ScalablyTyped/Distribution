package typings.typeorm

import typings.typeorm.cacheQueryResultCacheMod.QueryResultCache
import typings.typeorm.connectionConnectionMod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/cache/QueryResultCacheFactory", JSImport.Namespace)
@js.native
object cacheQueryResultCacheFactoryMod extends js.Object {
  
  @js.native
  class QueryResultCacheFactory protected () extends js.Object {
    def this(connection: Connection) = this()
    
    var connection: Connection = js.native
    
    /**
      * Creates a new query result cache based on connection options.
      */
    def create(): QueryResultCache = js.native
  }
}
