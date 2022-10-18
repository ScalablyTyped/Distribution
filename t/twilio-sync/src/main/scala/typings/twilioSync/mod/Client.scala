package typings.twilioSync.mod

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Client for the Twilio Sync service.
  *
  * @example
  * ```typescript
  * // Using NPM resolution
  * const SyncClient = require('twilio-sync');
  * const syncClient = new SyncClient(token, { loglevel: 'debug' });
  *
  * // Using CDN
  * const syncClient = new Twilio.Sync.Client(token, { logLevel: 'debug' });
  * ```
  */
@js.native
trait Client extends EventEmitter {
  
  /* private */ var _createDocument: Any = js.native
  
  /* private */ var _createList: Any = js.native
  
  /* private */ var _createMap: Any = js.native
  
  /* private */ var _createStream: Any = js.native
  
  /* private */ var _get: Any = js.native
  
  /* private */ var _getDocument: Any = js.native
  
  /* private */ var _getList: Any = js.native
  
  /* private */ var _getLiveQuery: Any = js.native
  
  /* private */ var _getMap: Any = js.native
  
  /* private */ var _getStream: Any = js.native
  
  /**
    * Entry point for all the incoming messages (Router).
    *
    * @param type Type of the incoming message
    * @param message Message to route
    * @internal
    */
  def _routeMessage(`type`: String, message: Any): Unit = js.native
  
  /**
    * Subscribe for events (Router)
    *
    * @internal
    */
  def _subscribe(sid: String, entity: Any): Unit = js.native
  
  /**
    * Unsubscribe from events (Router)
    *
    * @internal
    */
  def _unsubscribe(sid: String): Unit = js.native
  
  /**
    * Current service connection state.
    */
  def connectionState: ConnectionState = js.native
  
  /**
    * Read or create a Sync document.
    * @param arg Could be any of the following:
    * * Unique name or SID identifying the Sync document - opens the document with the given identifier or creates one if it does not exist.
    * * none - creates a new document with a randomly assigned SID and no unique name.
    * * {@link OpenDocumentOptions} object for more granular control.
    * @return A promise which resolves after the document is successfully read (or created).
    * This promise may reject if the document could not be created or if this endpoint lacks the necessary permissions to access it.
    * @example
    * ```typescript
    * syncClient.document('MyDocument')
    *   .then((document) => {
    *     console.log('Successfully opened a document. SID:', document.sid);
    *     document.on('updated', (event) => {
    *       console.log('Received an "updated" event: ', event);
    *     });
    *   })
    *   .catch((error) => {
    *     console.error('Unexpected error', error);
    *   });
    * ```
    */
  def document(): js.Promise[SyncDocument] = js.native
  def document(arg: String): js.Promise[SyncDocument] = js.native
  def document(arg: OpenDocumentOptions): js.Promise[SyncDocument] = js.native
  
  /**
    * Returns a promise which resolves when library is correctly initialized
    * Or throws if initialization is impossible
    *
    * @internal
    */
  /* private */ var ensureReady: Any = js.native
  
  /* private */ val entities: Any = js.native
  
  /* private */ var getCached: Any = js.native
  
  /**
    * For Flex customers only. Creates a query object that can be used to issue one-time queries repeatedly
    * against the target index.
    *
    * @param indexName Must specify one of the Flex data classes for which live queries are available.
    * @return A promise which resolves after the instance of InstantQuery is successfully created.
    * @example
    * ```typescript
    * syncClient.instantQuery('tr-worker')
    *   .then((q) => {
    *     q.on('searchResult', (items) => {
    *       Object.entries(items).forEach(([key, value]) => {
    *         console.log('Search result item key:', key);
    *         console.log('Search result item value:', value);
    *       });
    *     });
    *   });
    * ```
    */
  def instantQuery(indexName: String): js.Promise[InstantQuery] = js.native
  
  /**
    * Read or create a Sync list.
    * @param arg Could be any of the following:
    * * Unique name or SID identifying a Sync list - opens the list with the given identifier or creates one if it does not exist.
    * * none - creates a new list with a randomly assigned SID and no unique name.
    * * {@link OpenListOptions} object for more granular control.
    * @return A promise which resolves after the list is successfully read (or created).
    * This promise may reject if the list could not be created or if this endpoint lacks the necessary permissions to access it.
    * @example
    * ```typescript
    * syncClient.list('MyList')
    *   .then((list) => {
    *     console.log('Successfully opened a List. SID:', list.sid);
    *     list.on('itemAdded', (event) => {
    *       console.log('Received an "itemAdded" event:', event);
    *     });
    *   })
    *   .catch((error) => {
    *     console.error('Unexpected error', error);
    *   });
    * ```
    */
  def list(): js.Promise[SyncList] = js.native
  def list(arg: String): js.Promise[SyncList] = js.native
  def list(arg: OpenListOptions): js.Promise[SyncList] = js.native
  
  /**
    * For Flex customers only. Establishes a long-running query against Flex data wherein the returned
    * result set is updated whenever new (or updated) records match the given expression. Updated results
    * are presented row-by-row according to the lifetime of the returned LiveQuery object.
    *
    * @param indexName Must specify one of the Flex data classes for which Live Queries are available.
    * @param queryExpression A query expression to be executed against the given data index.
    * Please review the [Live Query Language](https://www.twilio.com/docs/sync/live-query)
    * page for Sync client limits and a full list of operators currently supported in query expressions.
    *
    * @return A promise that resolves when the query has been successfully executed.
    * @example
    * ```typescript
    * syncClient.liveQuery('tr-worker', 'data.attributes.worker_name == "Bob"')
    *   .then((args) => {
    *      console.log('Subscribed to live data updates for worker Bob');
    *      const items = args.getItems();
    *      Object.entries(items).forEach(([key, value]) => {
    *        console.log('Search result item key:', key);
    *        console.log('Search result item value:', value);
    *      });
    *   })
    *   .catch((err) => {
    *      console.error('Error when subscribing to live updates for worker Bob', err);
    *   });
    * ```
    */
  def liveQuery(indexName: String, queryExpression: String): js.Promise[LiveQuery] = js.native
  
  /**
    * Read or create a Sync map.
    * @param arg Could be any of the following:
    * * Unique name or SID identifying the Sync map - opens the map with the given identifier or creates one if it does not exist.
    * * none - creates a new map with a randomly assigned SID and no unique name.
    * * {@link OpenMapOptions} object for more granular control.
    * @return A promise which resolves after the map is successfully read (or created).
    * This promise may reject if the map could not be created or if this endpoint lacks the necessary permissions to access it.
    * @example
    * ```typescript
    * syncClient.map('MyMap')
    *   .then((map) => {
    *     console.log('Successfully opened a map. SID:', map.sid);
    *     map.on('itemUpdated', (event) => {
    *       console.log('Received an "itemUpdated" event:', event);
    *     });
    *   })
    *   .catch((error) => {
    *     console.error('Unexpected error', error);
    *   });
    * ```
    */
  def map(): js.Promise[SyncMap] = js.native
  def map(arg: String): js.Promise[SyncMap] = js.native
  def map(arg: OpenMapOptions): js.Promise[SyncMap] = js.native
  
  /* private */ var readRootFromSessionCache: Any = js.native
  
  /* private */ var removeFromCacheAndSession: Any = js.native
  
  /* private */ val services: Any = js.native
  
  /**
    * Gracefully shuts the Sync client down.
    */
  def shutdown(): js.Promise[Unit] = js.native
  
  /* private */ var storeRootInSessionCache: Any = js.native
  
  /**
    * Read or create a Sync message stream.
    * @param arg Could be any of the following:
    * * Unique name or SID identifying a stream - opens the stream with the given identifier or creates one if it does not exist.
    * * none - creates a new stream with a randomly assigned SID and no unique name.
    * * {@link OpenStreamOptions} object for more granular control.
    * @return A promise which resolves after the stream is successfully read (or created).
    * The flow of messages will begin imminently (but not necessarily immediately) upon resolution.
    * This promise may reject if the stream could not be created or if this endpoint lacks the necessary permissions to access it.
    * @example
    * ```typescript
    * syncClient.stream('MyStream')
    *   .then((stream) => {
    *     console.log('Successfully opened a message stream. SID:', stream.sid);
    *     stream.on('messagePublished', (event) => {
    *       console.log('Received a "messagePublished" event:', event);
    *     });
    *   })
    *   .catch((error) => {
    *     console.error('Unexpected error', error);
    *   });
    * ```
    */
  def stream(): js.Promise[SyncStream] = js.native
  def stream(arg: String): js.Promise[SyncStream] = js.native
  def stream(arg: OpenStreamOptions): js.Promise[SyncStream] = js.native
  
  /**
    * Set the authentication token.
    * @param token New token to set.
    */
  def updateToken(token: String): js.Promise[Unit] = js.native
}
