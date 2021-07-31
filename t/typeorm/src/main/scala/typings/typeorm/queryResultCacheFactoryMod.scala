package typings.typeorm

import typings.typeorm.connectionMod.Connection
import typings.typeorm.queryResultCacheMod.QueryResultCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryResultCacheFactoryMod {
  
  @JSImport("typeorm/browser/cache/QueryResultCacheFactory", "QueryResultCacheFactory")
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
