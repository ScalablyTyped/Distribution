package typings.typeorm

import typings.typeorm.cacheQueryResultCacheOptionsMod.QueryResultCacheOptions
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheQueryResultCacheMod {
  
  @js.native
  trait QueryResultCache extends StObject {
    
    /**
      * Clears everything stored in the cache.
      */
    def clear(): js.Promise[Unit] = js.native
    def clear(queryRunner: QueryRunner): js.Promise[Unit] = js.native
    
    /**
      * Creates a connection with given cache provider.
      */
    def connect(): js.Promise[Unit] = js.native
    
    /**
      * Closes a connection with given cache provider.
      */
    def disconnect(): js.Promise[Unit] = js.native
    
    /**
      * Caches given query result.
      */
    def getFromCache(options: QueryResultCacheOptions): js.Promise[js.UndefOr[QueryResultCacheOptions]] = js.native
    def getFromCache(options: QueryResultCacheOptions, queryRunner: QueryRunner): js.Promise[js.UndefOr[QueryResultCacheOptions]] = js.native
    
    /**
      * Checks if cache is expired or not.
      */
    def isExpired(savedCache: QueryResultCacheOptions): Boolean = js.native
    
    /**
      * Removes all cached results by given identifiers from cache.
      */
    def remove(identifiers: js.Array[String]): js.Promise[Unit] = js.native
    def remove(identifiers: js.Array[String], queryRunner: QueryRunner): js.Promise[Unit] = js.native
    
    /**
      * Stores given query result in the cache.
      */
    def storeInCache(options: QueryResultCacheOptions): js.Promise[Unit] = js.native
    def storeInCache(options: QueryResultCacheOptions, savedCache: Unit, queryRunner: QueryRunner): js.Promise[Unit] = js.native
    def storeInCache(options: QueryResultCacheOptions, savedCache: QueryResultCacheOptions): js.Promise[Unit] = js.native
    def storeInCache(options: QueryResultCacheOptions, savedCache: QueryResultCacheOptions, queryRunner: QueryRunner): js.Promise[Unit] = js.native
    
    /**
      * Performs operations needs to be created during schema synchronization.
      */
    def synchronize(): js.Promise[Unit] = js.native
    def synchronize(queryRunner: QueryRunner): js.Promise[Unit] = js.native
  }
}
