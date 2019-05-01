package typings
package twilioDashSyncLib.libLivequeryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/livequery", "LiveQuery")
@js.native
class LiveQuery protected ()
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * @private
    */
  def this(proxy: LiveQueryProxy) = this()
  def this(proxy: LiveQueryProxy, items: js.Any) = this()
  var items: js.Any = js.native
  val listenerUuid: java.lang.String = js.native
  val proxy: js.Any = js.native
  val sid: java.lang.String = js.native
  val `type`: java.lang.String = js.native
  val uuid: js.Any = js.native
  /**
    * @private
    */
  def _update(message: js.Any): scala.Unit = js.native
  /**
    * Closes this query instance and unsubscribes from further service events.
    * This will eventually stop the physical inflow of updates over the network, when all other instances of this query are closed as well.
    * @public
    */
  def close(): scala.Unit = js.native
  /**
    * @returns {LiveQuery#ItemsSnapshot} A snapshot of items matching the current query expression.
    * @public
    */
  def getItems(): ItemsSnapshot = js.native
}

/* static members */
@JSImport("twilio-sync/lib/livequery", "LiveQuery")
@js.native
object LiveQuery extends js.Object {
  val `type`: java.lang.String = js.native
}

