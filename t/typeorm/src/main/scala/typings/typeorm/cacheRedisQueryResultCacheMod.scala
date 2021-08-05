package typings.typeorm

import typings.typeorm.cacheQueryResultCacheMod.QueryResultCache
import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.typeormStrings.ioredis
import typings.typeorm.typeormStrings.ioredisSlashcluster
import typings.typeorm.typeormStrings.redis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheRedisQueryResultCacheMod {
  
  @JSImport("typeorm/cache/RedisQueryResultCache", "RedisQueryResultCache")
  @js.native
  class RedisQueryResultCache protected ()
    extends StObject
       with QueryResultCache {
    def this(connection: Connection, clientType: ioredis) = this()
    def this(connection: Connection, clientType: ioredisSlashcluster) = this()
    def this(connection: Connection, clientType: redis) = this()
    
    /**
      * Connected redis client.
      */
    /* protected */ var client: js.Any = js.native
    
    /**
      * Type of the Redis Client (redis or ioredis).
      */
    /* protected */ var clientType: redis | ioredis | ioredisSlashcluster = js.native
    
    /* protected */ var connection: Connection = js.native
    
    /**
      * Removes a single key from redis database.
      */
    /* protected */ def deleteKey(key: String): js.Promise[Unit] = js.native
    
    /**
      * Loads redis dependency.
      */
    /* protected */ def loadRedis(): js.Any = js.native
    
    /**
      * Redis module instance loaded dynamically.
      */
    /* protected */ var redis: js.Any = js.native
  }
}
