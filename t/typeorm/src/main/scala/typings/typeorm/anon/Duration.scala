package typings.typeorm.anon

import typings.typeorm.cacheQueryResultCacheMod.QueryResultCache
import typings.typeorm.typeormStrings.database
import typings.typeorm.typeormStrings.ioredis
import typings.typeorm.typeormStrings.ioredisSlashcluster
import typings.typeorm.typeormStrings.redis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Duration extends js.Object {
  
  /**
    * If set to true then queries (using find methods and QueryBuilder's methods) will always be cached.
    */
  val alwaysEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Time in milliseconds in which cache will expire.
    * This can be setup per-query.
    * Default value is 1000 which is equivalent to 1 second.
    */
  val duration: js.UndefOr[Double] = js.native
  
  /**
    * Used to provide redis connection options.
    */
  val options: js.UndefOr[js.Any] = js.native
  
  /**
    * Factory function for custom cache providers that implement QueryResultCache.
    */
  val provider: js.UndefOr[
    js.Function1[
      /* connection */ typings.typeorm.connectionConnectionMod.Connection, 
      QueryResultCache
    ]
  ] = js.native
  
  /**
    * Configurable table name for "database" type cache.
    * Default value is "query-result-cache"
    */
  val tableName: js.UndefOr[String] = js.native
  
  /**
    * Type of caching.
    *
    * - "database" means cached values will be stored in the separate table in database. This is default value.
    * - "redis" means cached values will be stored inside redis. You must provide redis connection options.
    */
  val `type`: js.UndefOr[database | redis | ioredis | ioredisSlashcluster] = js.native
}
object Duration {
  
  @scala.inline
  def apply(): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit class DurationOps[Self <: Duration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlwaysEnabled(value: Boolean): Self = this.set("alwaysEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysEnabled: Self = this.set("alwaysEnabled", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setProvider(value: /* connection */ typings.typeorm.connectionConnectionMod.Connection => QueryResultCache): Self = this.set("provider", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("tableName", js.undefined)
    
    @scala.inline
    def setType(value: database | redis | ioredis | ioredisSlashcluster): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
