package typings
package twilioDashSyncLib.libLivequeryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/livequery", "LiveQueryProxy")
@js.native
class LiveQueryProxy protected ()
  extends twilioDashSyncLib.libEntityMod.SyncEntity {
  def this(descriptor: LiveQueryDescriptor, services: InsightsServices, removalHandler: twilioDashSyncLib.libEntityMod.RemovalHandler) = this()
  var attachedLiveQueries: js.Any = js.native
  val descriptor: js.Any = js.native
  val liveQueryDescriptor: LiveQueryDescriptor = js.native
  val network: twilioDashSyncLib.libInterfacesServicesMod.Network = js.native
  val queryUri: java.lang.String = js.native
  def attach(liveQuery: LiveQuery): scala.Unit = js.native
  def detach(listenerUuid: java.lang.String): scala.Unit = js.native
  /* protected */ def onRemoved(): scala.Unit = js.native
}

/* static members */
@JSImport("twilio-sync/lib/livequery", "LiveQueryProxy")
@js.native
object LiveQueryProxy extends js.Object {
  val `type`: java.lang.String = js.native
}

