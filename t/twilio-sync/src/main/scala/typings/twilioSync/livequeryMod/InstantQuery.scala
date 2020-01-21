package typings.twilioSync.livequeryMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/livequery", "InstantQuery")
@js.native
class InstantQuery protected () extends EventEmitter {
  /**
    * @private
    */
  def this(params: js.Any) = this()
  var generateQueryUri: js.Any = js.native
  var indexName: js.Any = js.native
  val insightsUri: js.Any = js.native
  var items: js.Any = js.native
  val liveQueryCreator: js.Any = js.native
  val network: js.Any = js.native
  var queryExpression: js.Any = js.native
  var queryUri: js.Any = js.native
  val `type`: String = js.native
  /**
    * @returns {LiveQuery#ItemsSnapshot} A snapshot of items matching current query expression.
    * @public
    */
  def getItems(): ItemsSnapshot = js.native
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
  /**
    * Set new index name
    * @param {String} indexName New index name to set
    * @returns void
    * @public
    */
  def updateIndexName(indexName: String): Unit = js.native
}

/* static members */
@JSImport("twilio-sync/lib/livequery", "InstantQuery")
@js.native
object InstantQuery extends js.Object {
  val `type`: String = js.native
}

