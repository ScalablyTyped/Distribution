package typings.typeorm

import typings.typeorm.cacheQueryResultCacheMod.QueryResultCache
import typings.typeorm.connectionConnectionMod.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheQueryResultCacheFactoryMod {
  
  @JSImport("typeorm/cache/QueryResultCacheFactory", "QueryResultCacheFactory")
  @js.native
  class QueryResultCacheFactory protected () extends StObject {
    def this(connection: Connection) = this()
    
    var connection: Connection = js.native
    
    /**
      * Creates a new query result cache based on connection options.
      */
    def create(): QueryResultCache = js.native
  }
}
