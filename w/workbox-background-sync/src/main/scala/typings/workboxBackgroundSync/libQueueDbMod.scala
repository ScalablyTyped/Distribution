package typings.workboxBackgroundSync

import typings.std.IDBCursorDirection
import typings.std.IDBKeyRange
import typings.workboxBackgroundSync.libStorableRequestMod.RequestData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libQueueDbMod {
  
  @JSImport("workbox-background-sync/lib/QueueDb", "QueueDb")
  @js.native
  open class QueueDb () extends StObject {
    
    /* private */ var _db: Any = js.native
    
    /**
      * Upgrades QueueDB
      *
      * @param {IDBPDatabase<QueueDBSchema>} db
      * @param {number} oldVersion
      * @private
      */
    /* private */ var _upgradeDb: Any = js.native
    
    /**
      * Add QueueStoreEntry to underlying db.
      *
      * @param {UnidentifiedQueueStoreEntry} entry
      */
    def addEntry(entry: UnidentifiedQueueStoreEntry): js.Promise[Unit] = js.native
    
    /**
      * Deletes a single entry by id.
      *
      * @param {number} id the id of the entry to be deleted
      */
    def deleteEntry(id: Double): js.Promise[Unit] = js.native
    
    /**
      * Get all the entries filtered by index
      *
      * @param queueName
      * @return {Promise<QueueStoreEntry[]>}
      */
    def getAllEntriesByQueueName(queueName: String): js.Promise[js.Array[QueueStoreEntry]] = js.native
    
    /**
      * Returns an open connection to the database.
      *
      * @private
      */
    /* private */ var getDb: Any = js.native
    
    /**
      * Returns either the first or the last entries, depending on direction.
      * Filtered by index.
      *
      * @param {IDBCursorDirection} direction
      * @param {IDBKeyRange} query
      * @return {Promise<QueueStoreEntry | undefined>}
      * @private
      */
    def getEndEntryFromIndex(query: IDBKeyRange, direction: IDBCursorDirection): js.Promise[js.UndefOr[QueueStoreEntry]] = js.native
    
    /**
      * Returns the number of entries filtered by index
      *
      * @param queueName
      * @return {Promise<number>}
      */
    def getEntryCountByQueueName(queueName: String): js.Promise[Double] = js.native
    
    /**
      *
      * @param queueName
      * @returns {Promise<QueueStoreEntry | undefined>}
      */
    def getFirstEntryByQueueName(queueName: String): js.Promise[js.UndefOr[QueueStoreEntry]] = js.native
    
    /**
      * Returns the first entry id in the ObjectStore.
      *
      * @return {number | undefined}
      */
    def getFirstEntryId(): js.Promise[js.UndefOr[Double]] = js.native
    
    /**
      *
      * @param queueName
      * @returns {Promise<QueueStoreEntry | undefined>}
      */
    def getLastEntryByQueueName(queueName: String): js.Promise[js.UndefOr[QueueStoreEntry]] = js.native
  }
  
  trait QueueStoreEntry
    extends StObject
       with UnidentifiedQueueStoreEntry {
    
    @JSName("id")
    var id_QueueStoreEntry: Double
  }
  object QueueStoreEntry {
    
    inline def apply(id: Double, requestData: RequestData, timestamp: Double): QueueStoreEntry = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], requestData = requestData.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueStoreEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueueStoreEntry] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnidentifiedQueueStoreEntry extends StObject {
    
    var id: js.UndefOr[Double] = js.undefined
    
    var metadata: js.UndefOr[js.Object] = js.undefined
    
    var queueName: js.UndefOr[String] = js.undefined
    
    var requestData: RequestData
    
    var timestamp: Double
  }
  object UnidentifiedQueueStoreEntry {
    
    inline def apply(requestData: RequestData, timestamp: Double): UnidentifiedQueueStoreEntry = {
      val __obj = js.Dynamic.literal(requestData = requestData.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnidentifiedQueueStoreEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnidentifiedQueueStoreEntry] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setQueueName(value: String): Self = StObject.set(x, "queueName", value.asInstanceOf[js.Any])
      
      inline def setQueueNameUndefined: Self = StObject.set(x, "queueName", js.undefined)
      
      inline def setRequestData(value: RequestData): Self = StObject.set(x, "requestData", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
