package typings.workboxExpiration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsCacheTimestampsModelMod {
  
  /**
    * Returns the timestamp model.
    *
    * @private
    */
  @JSImport("workbox-expiration/models/CacheTimestampsModel", "CacheTimestampsModel")
  @js.native
  open class CacheTimestampsModel protected () extends StObject {
    /**
      *
      * @param {string} cacheName
      *
      * @private
      */
    def this(cacheName: String) = this()
    
    /* private */ val _cacheName: Any = js.native
    
    /* private */ var _db: Any = js.native
    
    /**
      * Takes a URL and returns an ID that will be unique in the object store.
      *
      * @param {string} url
      * @return {string}
      *
      * @private
      */
    /* private */ var _getId: Any = js.native
    
    /**
      * Performs an upgrade of indexedDB.
      *
      * @param {IDBPDatabase<CacheDbSchema>} db
      *
      * @private
      */
    /* private */ var _upgradeDb: Any = js.native
    
    /**
      * Performs an upgrade of indexedDB and deletes deprecated DBs.
      *
      * @param {IDBPDatabase<CacheDbSchema>} db
      *
      * @private
      */
    /* private */ var _upgradeDbAndDeleteOldDbs: Any = js.native
    
    /**
      * Iterates through all the entries in the object store (from newest to
      * oldest) and removes entries once either `maxCount` is reached or the
      * entry's timestamp is less than `minTimestamp`.
      *
      * @param {number} minTimestamp
      * @param {number} maxCount
      * @return {Array<string>}
      *
      * @private
      */
    def expireEntries(minTimestamp: Double): js.Promise[js.Array[String]] = js.native
    def expireEntries(minTimestamp: Double, maxCount: Double): js.Promise[js.Array[String]] = js.native
    
    /**
      * Returns an open connection to the database.
      *
      * @private
      */
    /* private */ var getDb: Any = js.native
    
    /**
      * Returns the timestamp stored for a given URL.
      *
      * @param {string} url
      * @return {number | undefined}
      *
      * @private
      */
    def getTimestamp(url: String): js.Promise[js.UndefOr[Double]] = js.native
    
    /**
      * @param {string} url
      * @param {number} timestamp
      *
      * @private
      */
    def setTimestamp(url: String, timestamp: Double): js.Promise[Unit] = js.native
  }
}
