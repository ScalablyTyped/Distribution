package typings.workboxBackgroundSync

import typings.workboxBackgroundSync.libQueueDbMod.QueueStoreEntry
import typings.workboxBackgroundSync.libQueueDbMod.UnidentifiedQueueStoreEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libQueueStoreMod {
  
  @JSImport("workbox-background-sync/lib/QueueStore", "QueueStore")
  @js.native
  open class QueueStore protected () extends StObject {
    /**
      * Associates this instance with a Queue instance, so entries added can be
      * identified by their queue name.
      *
      * @param {string} queueName
      */
    def this(queueName: String) = this()
    
    /* private */ val _queueDb: Any = js.native
    
    /* private */ val _queueName: Any = js.native
    
    /**
      * Removes and returns the first or last entry in the queue (based on the
      * `direction` argument) matching the `queueName`.
      *
      * @return {Promise<QueueStoreEntry|undefined>}
      * @private
      */
    def _removeEntry(): js.Promise[js.UndefOr[QueueStoreEntry]] = js.native
    def _removeEntry(entry: QueueStoreEntry): js.Promise[js.UndefOr[QueueStoreEntry]] = js.native
    
    /**
      * Deletes the entry for the given ID.
      *
      * WARNING: this method does not ensure the deleted entry belongs to this
      * queue (i.e. matches the `queueName`). But this limitation is acceptable
      * as this class is not publicly exposed. An additional check would make
      * this method slower than it needs to be.
      *
      * @param {number} id
      */
    def deleteEntry(id: Double): js.Promise[Unit] = js.native
    
    /**
      * Returns all entries in the store matching the `queueName`.
      *
      * @param {Object} options See {@link workbox-background-sync.Queue~getAll}
      * @return {Promise<Array<Object>>}
      */
    def getAll(): js.Promise[js.Array[QueueStoreEntry]] = js.native
    
    /**
      * Removes and returns the last entry in the queue matching the `queueName`.
      *
      * @return {Promise<QueueStoreEntry|undefined>}
      */
    def popEntry(): js.Promise[js.UndefOr[QueueStoreEntry]] = js.native
    
    /**
      * Append an entry last in the queue.
      *
      * @param {Object} entry
      * @param {Object} entry.requestData
      * @param {number} [entry.timestamp]
      * @param {Object} [entry.metadata]
      */
    def pushEntry(entry: UnidentifiedQueueStoreEntry): js.Promise[Unit] = js.native
    
    /**
      * Removes and returns the first entry in the queue matching the `queueName`.
      *
      * @return {Promise<QueueStoreEntry|undefined>}
      */
    def shiftEntry(): js.Promise[js.UndefOr[QueueStoreEntry]] = js.native
    
    /**
      * Returns the number of entries in the store matching the `queueName`.
      *
      * @param {Object} options See {@link workbox-background-sync.Queue~size}
      * @return {Promise<number>}
      */
    def size(): js.Promise[Double] = js.native
    
    /**
      * Prepend an entry first in the queue.
      *
      * @param {Object} entry
      * @param {Object} entry.requestData
      * @param {number} [entry.timestamp]
      * @param {Object} [entry.metadata]
      */
    def unshiftEntry(entry: UnidentifiedQueueStoreEntry): js.Promise[Unit] = js.native
  }
}
