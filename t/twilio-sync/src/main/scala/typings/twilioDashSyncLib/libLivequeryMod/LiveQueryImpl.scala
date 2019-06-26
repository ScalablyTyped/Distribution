package typings
package twilioDashSyncLib.libLivequeryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/livequery", "LiveQueryImpl")
@js.native
class LiveQueryImpl protected ()
  extends twilioDashSyncLib.libEntityMod.SyncEntity {
  def this(descriptor: LiveQueryDescriptor, services: InsightsServices, removalHandler: twilioDashSyncLib.libEntityMod.RemovalHandler) = this()
  def this(descriptor: LiveQueryDescriptor, services: InsightsServices, removalHandler: twilioDashSyncLib.libEntityMod.RemovalHandler, items: js.Any) = this()
  val descriptor: js.Any = js.native
  val items: js.Any = js.native
  val liveQueryDescriptor: LiveQueryDescriptor = js.native
  val network: twilioDashSyncLib.libInterfacesServicesMod.Network = js.native
  val queryUri: java.lang.String = js.native
  /**
    * @private
    */
  def _update(message: js.Any): scala.Unit = js.native
  def getItems(): ItemsSnapshot = js.native
  /* protected */ def onRemoved(): scala.Unit = js.native
}

/* static members */
@JSImport("twilio-sync/lib/livequery", "LiveQueryImpl")
@js.native
object LiveQueryImpl extends js.Object {
  val `type`: java.lang.String = js.native
}

