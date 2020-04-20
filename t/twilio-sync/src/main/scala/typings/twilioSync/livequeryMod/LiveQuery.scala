package typings.twilioSync.livequeryMod

import typings.twilioSync.closeableMod.Closeable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/livequery", "LiveQuery")
@js.native
class LiveQuery protected () extends Closeable {
  /**
    * @private
    */
  def this(liveQueryImpl: LiveQueryImpl) = this()
  val liveQueryImpl: js.Any = js.native
  /**
    * @returns {LiveQuery#ItemsSnapshot} A snapshot of items matching the current query expression.
    * @public
    */
  def getItems(): ItemsSnapshot = js.native
  def lastEventId: Double = js.native
  def sid: String = js.native
  def `type`: String = js.native
}

/* static members */
@JSImport("twilio-sync/lib/livequery", "LiveQuery")
@js.native
object LiveQuery extends js.Object {
  def `type`: String = js.native
}

