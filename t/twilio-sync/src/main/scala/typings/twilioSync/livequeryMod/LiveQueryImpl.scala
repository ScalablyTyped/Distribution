package typings.twilioSync.livequeryMod

import typings.twilioSync.entityMod.RemovalHandler
import typings.twilioSync.entityMod.SyncEntity
import typings.twilioSync.servicesMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val descriptor: js.Any = js.native
  val items: js.Any = js.native
  val liveQueryDescriptor: LiveQueryDescriptor = js.native
  val network: Network = js.native
  val queryUri: String = js.native
  /**
    * @private
    */
  def _update(message: js.Any): Unit = js.native
  def getItems(): ItemsSnapshot = js.native
  /* protected */ def onRemoved(): Unit = js.native
}

/* static members */
@JSImport("twilio-sync/lib/livequery", "LiveQueryImpl")
@js.native
object LiveQueryImpl extends js.Object {
  val `type`: String = js.native
}

