package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a long-running query against Flex data wherein the returned result set
  * subsequently receives pushed updates whenever new (or updated) records would match the
  * given expression. Updated results are presented row-by-row until this query is explicitly
  * closed.
  *
  * Use the {@link SyncClient.liveQuery} method to create a live query.
  */
@JSImport("twilio-sync", "LiveQuery")
@js.native
open class LiveQuery protected () extends Closeable {
  /**
    * @internal
    */
  def this(liveQueryImpl: LiveQueryImpl) = this()
  
  /**
    * @return A snapshot of items matching the current query expression.
    */
  def getItems(): ItemsSnapshot = js.native
  
  def lastEventId: Double = js.native
  
  /* private */ val liveQueryImpl: Any = js.native
  
  /**
    * The immutable identifier of this query object, assigned by the system.
    */
  def sid: String = js.native
  
  def `type`: String = js.native
}
object LiveQuery {
  
  /**
    * Fired when an existing item has been removed.
    *
    * Parameters:
    * 1. object `args` - info object provided with the event. It has the following properties:
    *     * object `key` - the key of the removed item
    * @example
    * ```typescript
    * liveQuery.on('itemRemoved', (args) => {
    *   console.log(`Item ${args.key} was removed`);
    * });
    * ```
    * @event
    */
  /* static member */
  @JSImport("twilio-sync", "LiveQuery.itemRemoved")
  @js.native
  val itemRemoved: /* "itemRemoved" */ String = js.native
  
  /**
    * Fired when an item has been added or updated.
    *
    * Parameters:
    * 1. {@link InsightsItem} `item` - updated item
    * @example
    * ```typescript
    * liveQuery.on('itemUpdated', (item) => {
    *   console.log(`Item ${item.key} was updated`'`);
    *   console.log('Item value:', item.value);
    * });
    * ```
    * @event
    */
  /* static member */
  @JSImport("twilio-sync", "LiveQuery.itemUpdated")
  @js.native
  val itemUpdated: /* "itemUpdated" */ String = js.native
}
