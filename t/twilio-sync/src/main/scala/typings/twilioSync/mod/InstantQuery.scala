package typings.twilioSync.mod

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows repetitive quick searches against a specific Flex data. Unlike a
  * LiveQuery, this result set does not subscribe to any updates and therefore receives no events
  * beyond the initial result set.
  *
  * Use the {@link SyncClient.instantQuery} method to create an Instant Query.
  */
@js.native
trait InstantQuery extends EventEmitter {
  
  /* private */ var generateQueryUri: Any = js.native
  
  /**
    * @return A snapshot of items matching current query expression.
    */
  def getItems(): ItemsSnapshot = js.native
  
  /* private */ var indexName: Any = js.native
  
  /* private */ val insightsUri: Any = js.native
  
  /* private */ var items: Any = js.native
  
  /* private */ val liveQueryCreator: Any = js.native
  
  /* private */ val network: Any = js.native
  
  /* private */ var queryExpression: Any = js.native
  
  /* private */ var queryUri: Any = js.native
  
  /**
    * Spawns a new search request. The result will be provided asynchronously via the {@link InstantQuery.searchResult}
    * event.
    * @param queryExpression A query expression to be executed against the given data index. For more information
    * on the syntax read {@link SyncClient.liveQuery}.
    * @return A promise that resolves when query result has been received.
    */
  def search(queryExpression: String): js.Promise[Unit] = js.native
  
  /**
    * Instantiates a LiveQuery object based on the last known query expression that was passed to the
    * {@link InstantQuery.search} method. This LiveQuery will start receiving updates with new results,
    * while current object can be still used to execute repetitive searches.
    * @return A promise which resolves when the LiveQuery object is ready.
    */
  def subscribe(): js.Promise[LiveQuery] = js.native
  
  def `type`: String = js.native
  
  /**
    * Set new index name
    * @param indexName New index name to set
    */
  def updateIndexName(indexName: String): Unit = js.native
}
