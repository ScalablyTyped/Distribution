package typings.typeorm

import typings.typeorm.connectionMod.Connection
import typings.typeorm.queryResultCacheMod.QueryResultCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/cache/QueryResultCacheFactory", JSImport.Namespace)
@js.native
object queryResultCacheFactoryMod extends js.Object {
  
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
