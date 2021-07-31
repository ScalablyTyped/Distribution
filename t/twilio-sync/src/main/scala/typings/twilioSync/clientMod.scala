package typings.twilioSync

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.twilioSync.livequeryMod.InstantQuery
import typings.twilioSync.livequeryMod.LiveQuery
import typings.twilioSync.syncdocumentMod.SyncDocument
import typings.twilioSync.synclistMod.SyncList
import typings.twilioSync.syncmapMod.SyncMap
import typings.twilioSync.syncstreamMod.SyncStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  /**
    * @class Client
    * @classdesc
    * Client for the Twilio Sync service.
    * @constructor
    * @param {String} token - Twilio access token.
    * @param {Client#ClientOptions} [options] - Options to customize the Client.
    * @example
    * // Using NPM
    * var SyncClient = require('twilio-sync');
    * var syncClient = new SyncClient(token, { logLevel: 'debug' });
    *
    * // Using CDN
    * var SyncClient = new Twilio.Sync.Client(token, { logLevel: 'debug' });
    *
    * @property {Client#ConnectionState} connectionState - Contains current service connection state.
    * Valid options are ['connecting', 'connected', 'disconnecting', 'disconnected', 'denied', 'error'].
    */
  @JSImport("twilio-sync/lib/client", JSImport.Default)
  @js.native
  class default protected () extends Client {
    def this(fpaToken: String) = this()
    def this(fpaToken: String, options: js.Any) = this()
  }
  
  /**
    * @class Client
    * @classdesc
    * Client for the Twilio Sync service.
    * @constructor
    * @param {String} token - Twilio access token.
    * @param {Client#ClientOptions} [options] - Options to customize the Client.
    * @example
    * // Using NPM
    * var SyncClient = require('twilio-sync');
    * var syncClient = new SyncClient(token, { logLevel: 'debug' });
    *
    * // Using CDN
    * var SyncClient = new Twilio.Sync.Client(token, { logLevel: 'debug' });
    *
    * @property {Client#ConnectionState} connectionState - Contains current service connection state.
    * Valid options are ['connecting', 'connected', 'disconnecting', 'disconnected', 'denied', 'error'].
    */
  @JSImport("twilio-sync/lib/client", "Client")
  @js.native
  class Client protected () extends EventEmitter {
    def this(fpaToken: String) = this()
    def this(fpaToken: String, options: js.Any) = this()
    
    var _createDocument: js.Any = js.native
    
    var _createList: js.Any = js.native
    
    var _createMap: js.Any = js.native
    
    var _createStream: js.Any = js.native
    
    var _get: js.Any = js.native
    
    var _getDocument: js.Any = js.native
    
    var _getList: js.Any = js.native
    
    var _getLiveQuery: js.Any = js.native
    
    var _getMap: js.Any = js.native
    
    var _getStream: js.Any = js.native
    
    def connectionState: ConnectionState = js.native
    
    /**
      * Read or create a Sync Document.
      * @param {String | Client#OpenOptions} [arg] One of:
      * <li>Unique name or SID identifying a Sync Document - opens a Document with the given identifier or creates one if it does not exist.</li>
      * <li>none - creates a new Document with a randomly assigned SID and no unique name.</li>
      * <li>{@link Client#OpenOptions} object for more granular control.</li>
      * @return {Promise<Document>} a promise which resolves after the Document is successfully read (or created).
      * This promise may reject if the Document could not be created or if this endpoint lacks the necessary permissions to access it.
      * @public
      * @example
      * syncClient.document('MyDocument')
      *   .then(function(document) {
      *     console.log('Successfully opened a Document. SID: ' + document.sid);
      *     document.on('updated', function(event) {
      *       console.log('Received updated event: ', event);
      *     });
      *   })
      *   .catch(function(error) {
      *     console.log('Unexpected error', error);
      *   });
      */
    def document(): js.Promise[SyncDocument] = js.native
    def document(arg: String): js.Promise[SyncDocument] = js.native
    def document(arg: OpenDocumentOptions): js.Promise[SyncDocument] = js.native
    
    /**
      * Returns promise which resolves when library is correctly initialized
      * Or throws if initialization is impossible
      * @private
      */
    var ensureReady: js.Any = js.native
    
    val entities: js.Any = js.native
    
    var getCached: js.Any = js.native
    
    /**
      * For Flex customers only. Creates a query object that can be used to issue one-time queries repeatedly
      * against the target index.
      *
      * @param indexName {String} Must specify one of the Flex data classes for which Live Queries are available.
      * @return {Promise<InstantQuery>} a promise which resolves after the InstantQuery is successfully created.
      * @public
      * @example
      * syncClient.instantQuery('tr-worker')
      *    .then(function(q) {
      *        q.on('searchResult', function(items) {
      *          Object.entries(items).forEach(([key, value]) => {
      *             console.log('Search result item key: ' + key);
      *             console.log('Search result item value: ' + value);
      *          });
      *       });
      *    });
      */
    def instantQuery(indexName: String): js.Promise[InstantQuery] = js.native
    
    /**
      * Read or create a Sync List.
      * @param {String | Client#OpenOptions} [arg] One of:
      * <li>Unique name or SID identifying a Sync List - opens a List with the given identifier or creates one if it does not exist.</li>
      * <li>none - creates a new List with a randomly assigned SID and no unique name.</li>
      * <li>{@link Client#OpenOptions} object for more granular control.</li>
      * @return {Promise<List>} a promise which resolves after the List is successfully read (or created).
      * This promise may reject if the List could not be created or if this endpoint lacks the necessary permissions to access it.
      * @public
      * @example
      * syncClient.list('MyList')
      *   .then(function(list) {
      *     console.log('Successfully opened a List. SID: ' + list.sid);
      *     list.on('itemAdded', function(event) {
      *       console.log('Received itemAdded event: ', event);
      *     });
      *   })
      *   .catch(function(error) {
      *     console.log('Unexpected error', error);
      *   });
      */
    def list(): js.Promise[SyncList] = js.native
    def list(arg: String): js.Promise[SyncList] = js.native
    def list(arg: OpenListOptions): js.Promise[SyncList] = js.native
    
    /**
      * For Flex customers only. Establishes a long-running query against Flex data wherein the returned
      * result set is updated whenever new (or updated) records match the given expression. Updated results
      * are presented row-by-row according to the lifetime of the returned LiveQuery object.
      *
      * @param indexName {String} Must specify one of the Flex data classes for which Live Queries are available.
      * @param queryExpression {String} A query expression to be executed against the given data index.
      * Please review <a href="https://www.twilio.com/docs/sync/live-query" target="_blank">Live Query Language</a>
      * page for Sync Client limits and full list of operators currently supported in query expressions.
      *
      * @return {Promise<LiveQuery>} a promise that resolves when the query has been successfully executed.
      * @public
      * @example
      * syncClient.liveQuery('tr-worker', 'data.attributes.worker_name == "Bob"')
      *     .then(function(args) {
      *        console.log('Subscribed to live data updates for worker Bob');
      *        let items = args.getItems();
      *        Object.entries(items).forEach(([key, value]) => {
      *          console.log('Search result item key: ' + key);
      *          console.log('Search result item value: ' + value);
      *        });
      *     })
      *     .catch(function(err) {
      *        console.log('Error when subscribing to live updates for worker Bob', err);
      *     });
      */
    def liveQuery(indexName: String, queryExpression: String): js.Promise[LiveQuery] = js.native
    
    var localStorageId: js.Any = js.native
    
    /**
      * Read or create a Sync Map.
      * @param {String | Client#OpenOptions} [arg] One of:
      * <li>Unique name or SID identifying a Sync Map - opens a Map with the given identifier or creates one if it does not exist.</li>
      * <li>none - creates a new Map with a randomly assigned SID and no unique name.</li>
      * <li>{@link Client#OpenOptions} object for more granular control.</li>
      * @return {Promise<Map>} a promise which resolves after the Map is successfully read (or created).
      * This promise may reject if the Map could not be created or if this endpoint lacks the necessary permissions to access it.
      * @public
      * @example
      * syncClient.map('MyMap')
      *   .then(function(map) {
      *     console.log('Successfully opened a Map. SID: ' + map.sid);
      *     map.on('itemUpdated', function(event) {
      *       console.log('Received itemUpdated event: ', event);
      *     });
      *   })
      *   .catch(function(error) {
      *     console.log('Unexpected error', error);
      *   });
      */
    def map(): js.Promise[SyncMap] = js.native
    def map(arg: String): js.Promise[SyncMap] = js.native
    def map(arg: OpenMapOptions): js.Promise[SyncMap] = js.native
    
    var readRootFromSessionCache: js.Any = js.native
    
    var removeFromCacheAndSession: js.Any = js.native
    
    val services: js.Any = js.native
    
    /**
      * Gracefully shutdown the libray
      * Currently it is not properly implemented and being used only in tests
      * But should be made a part of public API
      * @private
      */
    def shutdown(): js.Promise[Unit] = js.native
    
    var storeRootInSessionCache: js.Any = js.native
    
    /**
      * Read or create a Sync Message Stream.
      * @param {String | Client#OpenOptions} [arg] One of:
      * <li>Unique name or SID identifying a Stream - opens a Stream with the given identifier or creates one if it does not exist.</li>
      * <li>none - creates a new Stream with a randomly assigned SID and no unique name.</li>
      * <li>{@link Client#OpenOptions} object for more granular control.</li>
      * @return {Promise<Stream>} a promise which resolves after the Stream is successfully read (or created).
      * The flow of messages will begin imminently (but not necessarily immediately) upon resolution.
      * This promise may reject if the Stream could not be created or if this endpoint lacks the necessary permissions to access it.
      * @public
      * @example
      * syncClient.stream('MyStream')
      *   .then(function(stream) {
      *     console.log('Successfully opened a Message Stream. SID: ' + stream.sid);
      *     stream.on('messagePublished', function(event) {
      *       console.log('Received messagePublished event: ', event);
      *     });
      *   })
      *   .catch(function(error) {
      *     console.log('Unexpected error', error);
      *   });
      */
    def stream(): js.Promise[SyncStream] = js.native
    def stream(arg: String): js.Promise[SyncStream] = js.native
    def stream(arg: OpenStreamOptions): js.Promise[SyncStream] = js.native
    
    /**
      * Set new authentication token.
      * @param {String} token New token to set.
      * @return {Promise<void>}
      * @public
      */
    def updateToken(token: String): js.Promise[Unit] = js.native
  }
  
  /**
    * @class Client
    * @classdesc
    * Client for the Twilio Sync service.
    * @constructor
    * @param {String} token - Twilio access token.
    * @param {Client#ClientOptions} [options] - Options to customize the Client.
    * @example
    * // Using NPM
    * var SyncClient = require('twilio-sync');
    * var syncClient = new SyncClient(token, { logLevel: 'debug' });
    *
    * // Using CDN
    * var SyncClient = new Twilio.Sync.Client(token, { logLevel: 'debug' });
    *
    * @property {Client#ConnectionState} connectionState - Contains current service connection state.
    * Valid options are ['connecting', 'connected', 'disconnecting', 'disconnected', 'denied', 'error'].
    */
  @JSImport("twilio-sync/lib/client", "SyncClient")
  @js.native
  class SyncClient protected () extends Client {
    def this(fpaToken: String) = this()
    def this(fpaToken: String, options: js.Any) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilioSync.twilioSyncStrings.disconnected
    - typings.twilioSync.twilioSyncStrings.connecting
    - typings.twilioSync.twilioSyncStrings.connected
    - typings.twilioSync.twilioSyncStrings.disconnecting
    - typings.twilioSync.twilioSyncStrings.denied
    - typings.twilioSync.twilioSyncStrings.error
  */
  trait ConnectionState extends StObject
  object ConnectionState {
    
    @scala.inline
    def connected: typings.twilioSync.twilioSyncStrings.connected = "connected".asInstanceOf[typings.twilioSync.twilioSyncStrings.connected]
    
    @scala.inline
    def connecting: typings.twilioSync.twilioSyncStrings.connecting = "connecting".asInstanceOf[typings.twilioSync.twilioSyncStrings.connecting]
    
    @scala.inline
    def denied: typings.twilioSync.twilioSyncStrings.denied = "denied".asInstanceOf[typings.twilioSync.twilioSyncStrings.denied]
    
    @scala.inline
    def disconnected: typings.twilioSync.twilioSyncStrings.disconnected = "disconnected".asInstanceOf[typings.twilioSync.twilioSyncStrings.disconnected]
    
    @scala.inline
    def disconnecting: typings.twilioSync.twilioSyncStrings.disconnecting = "disconnecting".asInstanceOf[typings.twilioSync.twilioSyncStrings.disconnecting]
    
    @scala.inline
    def error: typings.twilioSync.twilioSyncStrings.error = "error".asInstanceOf[typings.twilioSync.twilioSyncStrings.error]
  }
  
  trait OpenDocumentOptions
    extends StObject
       with OpenOptions {
    
    var value: js.UndefOr[json] = js.undefined
  }
  object OpenDocumentOptions {
    
    @scala.inline
    def apply(): OpenDocumentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenDocumentOptions]
    }
    
    @scala.inline
    implicit class OpenDocumentOptionsMutableBuilder[Self <: OpenDocumentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: json): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait OpenListOptions
    extends StObject
       with OpenOptions {
    
    var context: js.UndefOr[json] = js.undefined
    
    var includeItems: js.UndefOr[Boolean] = js.undefined
    
    var purpose: js.UndefOr[String] = js.undefined
  }
  object OpenListOptions {
    
    @scala.inline
    def apply(): OpenListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenListOptions]
    }
    
    @scala.inline
    implicit class OpenListOptionsMutableBuilder[Self <: OpenListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: json): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setIncludeItems(value: Boolean): Self = StObject.set(x, "includeItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeItemsUndefined: Self = StObject.set(x, "includeItems", js.undefined)
      
      @scala.inline
      def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    }
  }
  
  trait OpenMapOptions
    extends StObject
       with OpenOptions {
    
    var includeItems: js.UndefOr[Boolean] = js.undefined
  }
  object OpenMapOptions {
    
    @scala.inline
    def apply(): OpenMapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenMapOptions]
    }
    
    @scala.inline
    implicit class OpenMapOptionsMutableBuilder[Self <: OpenMapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeItems(value: Boolean): Self = StObject.set(x, "includeItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeItemsUndefined: Self = StObject.set(x, "includeItems", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilioSync.twilioSyncStrings.open_or_create
    - typings.twilioSync.twilioSyncStrings.open_existing
    - typings.twilioSync.twilioSyncStrings.create_new
  */
  trait OpenMode extends StObject
  object OpenMode {
    
    @scala.inline
    def create_new: typings.twilioSync.twilioSyncStrings.create_new = "create_new".asInstanceOf[typings.twilioSync.twilioSyncStrings.create_new]
    
    @scala.inline
    def open_existing: typings.twilioSync.twilioSyncStrings.open_existing = "open_existing".asInstanceOf[typings.twilioSync.twilioSyncStrings.open_existing]
    
    @scala.inline
    def open_or_create: typings.twilioSync.twilioSyncStrings.open_or_create = "open_or_create".asInstanceOf[typings.twilioSync.twilioSyncStrings.open_or_create]
  }
  
  trait OpenOptions extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[OpenMode] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object OpenOptions {
    
    @scala.inline
    def apply(): OpenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenOptions]
    }
    
    @scala.inline
    implicit class OpenOptionsMutableBuilder[Self <: OpenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMode(value: OpenMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  type OpenStreamOptions = OpenOptions
  
  type json = StringDictionary[js.Any]
}
