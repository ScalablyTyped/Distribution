package typings.typeorm.anon

import typings.typeorm.queryResultCacheMod.QueryResultCache
import typings.typeorm.typeormStrings.database
import typings.typeorm.typeormStrings.ioredis
import typings.typeorm.typeormStrings.ioredisSlashcluster
import typings.typeorm.typeormStrings.redis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlwaysEnabled extends StObject {
  
  /**
    * If set to true then queries (using find methods and QueryBuilder's methods) will always be cached.
    */
  val alwaysEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Time in milliseconds in which cache will expire.
    * This can be setup per-query.
    * Default value is 1000 which is equivalent to 1 second.
    */
  val duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Used to provide redis connection options.
    */
  val options: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Factory function for custom cache providers that implement QueryResultCache.
    */
  val provider: js.UndefOr[
    js.Function1[/* connection */ typings.typeorm.connectionMod.Connection, QueryResultCache]
  ] = js.undefined
  
  /**
    * Configurable table name for "database" type cache.
    * Default value is "query-result-cache"
    */
  val tableName: js.UndefOr[String] = js.undefined
  
  /**
    * Type of caching.
    *
    * - "database" means cached values will be stored in the separate table in database. This is default value.
    * - "redis" means cached values will be stored inside redis. You must provide redis connection options.
    */
  val `type`: js.UndefOr[database | redis | ioredis | ioredisSlashcluster] = js.undefined
}
object AlwaysEnabled {
  
  @scala.inline
  def apply(): AlwaysEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlwaysEnabled]
  }
  
  @scala.inline
  implicit class AlwaysEnabledMutableBuilder[Self <: AlwaysEnabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysEnabled(value: Boolean): Self = StObject.set(x, "alwaysEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysEnabledUndefined: Self = StObject.set(x, "alwaysEnabled", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setProvider(value: /* connection */ typings.typeorm.connectionMod.Connection => QueryResultCache): Self = StObject.set(x, "provider", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    
    @scala.inline
    def setType(value: database | redis | ioredis | ioredisSlashcluster): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
