package typings
package twilioDashSyncLib.libStreamsSyncstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/streams/syncstream", "SyncStreamImpl")
@js.native
class SyncStreamImpl protected ()
  extends twilioDashSyncLib.libEntityMod.SyncEntity {
  /**
    * @private
    */
  def this(services: StreamServices, descriptor: twilioDashSyncLib.libStreamsServerapiMod.StreamDescriptor, removalHandler: twilioDashSyncLib.libEntityMod.RemovalHandler) = this()
  var _handleMessagePublished: js.Any = js.native
  val dateExpires: java.lang.String = js.native
  val descriptor: js.Any = js.native
  val links: js.Any = js.native
  val uri: java.lang.String = js.native
  /**
    * Handle event from the server
    * @private
    */
  def _update(update: js.Any): scala.Unit = js.native
  def publishMessage(value: js.Object): js.Promise[StreamMessage] = js.native
  def removeStream(): js.Promise[scala.Unit] = js.native
  def setTtl(ttl: scala.Double): js.Promise[scala.Unit] = js.native
}

/* static members */
@JSImport("twilio-sync/lib/streams/syncstream", "SyncStreamImpl")
@js.native
object SyncStreamImpl extends js.Object {
  val `type`: java.lang.String = js.native
}

