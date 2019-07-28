package typings.twilioDashSync.libStreamsSyncstreamMod

import typings.twilioDashSync.libEntityMod.RemovalHandler
import typings.twilioDashSync.libEntityMod.SyncEntity
import typings.twilioDashSync.libStreamsServerapiMod.StreamDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/streams/syncstream", "SyncStreamImpl")
@js.native
class SyncStreamImpl protected () extends SyncEntity {
  /**
    * @private
    */
  def this(services: StreamServices, descriptor: StreamDescriptor, removalHandler: RemovalHandler) = this()
  var _handleMessagePublished: js.Any = js.native
  val dateExpires: String = js.native
  val descriptor: js.Any = js.native
  val links: js.Any = js.native
  val uri: String = js.native
  /**
    * Handle event from the server
    * @private
    */
  def _update(update: js.Any): Unit = js.native
  def publishMessage(value: js.Object): js.Promise[StreamMessage] = js.native
  def removeStream(): js.Promise[Unit] = js.native
  def setTtl(ttl: Double): js.Promise[Unit] = js.native
}

/* static members */
@JSImport("twilio-sync/lib/streams/syncstream", "SyncStreamImpl")
@js.native
object SyncStreamImpl extends js.Object {
  val `type`: String = js.native
}

