package typings.twilioDashSync.libLivequeryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/livequery", "LiveQuery")
@js.native
class LiveQuery protected ()
  extends typings.twilioDashSync.libCloseableMod.default {
  /**
    * @private
    */
  def this(liveQueryImpl: LiveQueryImpl) = this()
  val liveQueryImpl: js.Any = js.native
  val sid: String = js.native
  val `type`: String = js.native
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
  val `type`: String = js.native
}

