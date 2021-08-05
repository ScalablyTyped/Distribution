package typings.twilioSync

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.twilioSync.anon.Data
import typings.twilioSync.closeableMod.Closeable
import typings.twilioSync.entityMod.EntityServices
import typings.twilioSync.entityMod.RemovalHandler
import typings.twilioSync.entityMod.SyncEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object livequeryMod {
  
  @JSImport("twilio-sync/lib/livequery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio-sync/lib/livequery", JSImport.Default)
  @js.native
  class default protected () extends LiveQuery {
    /**
      * @private
      */
    def this(liveQueryImpl: LiveQueryImpl) = this()
  }
  
  @JSImport("twilio-sync/lib/livequery", "InsightsItem")
  @js.native
  class InsightsItem () extends StObject {
    
    var key: String = js.native
    
    var value: js.Object = js.native
  }
  
  @JSImport("twilio-sync/lib/livequery", "InstantQuery")
  @js.native
  class InstantQuery protected () extends EventEmitter {
    /**
      * @private
      */
    def this(params: js.Any) = this()
    
    /* private */ var generateQueryUri: js.Any = js.native
    
    /**
      * @returns {LiveQuery#ItemsSnapshot} A snapshot of items matching current query expression.
      * @public
      */
    def getItems(): ItemsSnapshot = js.native
    
    /* private */ var indexName: js.Any = js.native
    
    /* private */ val insightsUri: js.Any = js.native
    
    /* private */ var items: js.Any = js.native
    
    /* private */ val liveQueryCreator: js.Any = js.native
    
    /* private */ val network: js.Any = js.native
    
    /* private */ var queryExpression: js.Any = js.native
    
    /* private */ var queryUri: js.Any = js.native
    
    /**
      * Spawns a new search request. The result will be provided asynchronously via the {@link InstantQuery#event:searchResult}
      * event.
      * @param {String} queryExpression A query expression to be executed against the given data index. For more information
      * on the syntax read {@link Client#liveQuery}.
      * @returns {Promise<void>} A promise that resolves when query result has been received.
      * @public
      */
    def search(queryExpression: String): js.Promise[Unit] = js.native
    
    /**
      * Instantiates a LiveQuery object based on the last known query expression that was passed to the
      * {@link InstantQuery#search} method. This LiveQuery will start receiving updates with new results,
      * while current object can be still used to execute repetitive searches.
      * @returns {Promise<LiveQuery>} A promise which resolves when the LiveQuery object is ready.
      * @public
      */
    def subscribe(): js.Promise[LiveQuery] = js.native
    
    def `type`: String = js.native
    
    /**
      * Set new index name
      * @param {String} indexName New index name to set
      * @returns void
      * @public
      */
    def updateIndexName(indexName: String): Unit = js.native
  }
  
  @JSImport("twilio-sync/lib/livequery", "LiveQuery")
  @js.native
  class LiveQuery protected () extends Closeable {
    /**
      * @private
      */
    def this(liveQueryImpl: LiveQueryImpl) = this()
    
    /**
      * @returns {LiveQuery#ItemsSnapshot} A snapshot of items matching the current query expression.
      * @public
      */
    def getItems(): ItemsSnapshot = js.native
    
    def lastEventId: Double = js.native
    
    /* private */ val liveQueryImpl: js.Any = js.native
    
    def sid: String = js.native
    
    def `type`: String = js.native
  }
  
  @JSImport("twilio-sync/lib/livequery", "LiveQueryImpl")
  @js.native
  class LiveQueryImpl protected () extends SyncEntity {
    def this(descriptor: LiveQueryDescriptor, services: InsightsServices, removalHandler: RemovalHandler) = this()
    def this(
      descriptor: LiveQueryDescriptor,
      services: InsightsServices,
      removalHandler: RemovalHandler,
      items: js.Any
    ) = this()
    
    /* private */ val cache: js.Any = js.native
    
    /* private */ val descriptor: js.Any = js.native
    
    def getItems(): ItemsSnapshot = js.native
    
    /* private */ var handleBatchUpdate: js.Any = js.native
    
    /* private */ var handleItemMutated: js.Any = js.native
    
    /* private */ var handleItemRemoved: js.Any = js.native
    
    def liveQueryDescriptor: LiveQueryDescriptor = js.native
    
    /* protected */ def onRemoved(): Unit = js.native
    
    def queryUri: String = js.native
    
    /* private */ var shouldIgnoreEvent: js.Any = js.native
  }
  
  inline def queryItems(params: js.Any): js.Promise[InsightsQueryResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryItems")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InsightsQueryResponse]]
  
  trait InsightsQueryResponse extends StObject {
    
    var items: js.UndefOr[js.Array[Data]] = js.undefined
    
    var last_event_id: Double
    
    var query_id: String
  }
  object InsightsQueryResponse {
    
    inline def apply(last_event_id: Double, query_id: String): InsightsQueryResponse = {
      val __obj = js.Dynamic.literal(last_event_id = last_event_id.asInstanceOf[js.Any], query_id = query_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsightsQueryResponse]
    }
    
    extension [Self <: InsightsQueryResponse](x: Self) {
      
      inline def setItems(value: js.Array[Data]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Data*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setLast_event_id(value: Double): Self = StObject.set(x, "last_event_id", value.asInstanceOf[js.Any])
      
      inline def setQuery_id(value: String): Self = StObject.set(x, "query_id", value.asInstanceOf[js.Any])
    }
  }
  
  type InsightsServices = EntityServices
  
  type ItemsSnapshot = StringDictionary[js.Object]
  
  type LiveQueryCreator = js.Function2[/* indexName */ String, /* queryExpression */ String, js.Promise[LiveQuery]]
  
  trait LiveQueryDescriptor extends StObject {
    
    var indexName: String
    
    var last_event_id: Double
    
    var queryExpression: String
    
    var queryUri: String
    
    var sid: String
  }
  object LiveQueryDescriptor {
    
    inline def apply(indexName: String, last_event_id: Double, queryExpression: String, queryUri: String, sid: String): LiveQueryDescriptor = {
      val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], last_event_id = last_event_id.asInstanceOf[js.Any], queryExpression = queryExpression.asInstanceOf[js.Any], queryUri = queryUri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveQueryDescriptor]
    }
    
    extension [Self <: LiveQueryDescriptor](x: Self) {
      
      inline def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
      
      inline def setLast_event_id(value: Double): Self = StObject.set(x, "last_event_id", value.asInstanceOf[js.Any])
      
      inline def setQueryExpression(value: String): Self = StObject.set(x, "queryExpression", value.asInstanceOf[js.Any])
      
      inline def setQueryUri(value: String): Self = StObject.set(x, "queryUri", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
}
