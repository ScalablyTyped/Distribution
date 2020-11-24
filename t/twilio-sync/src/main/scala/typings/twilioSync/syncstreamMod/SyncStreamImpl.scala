package typings.twilioSync.syncstreamMod

import typings.twilioSync.entityMod.RemovalHandler
import typings.twilioSync.entityMod.SyncEntity
import typings.twilioSync.serverapiMod.StreamDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-sync/lib/streams/syncstream", "SyncStreamImpl")
@js.native
class SyncStreamImpl protected () extends SyncEntity {
  /**
    * @private
    */
  def this(services: StreamServices, descriptor: StreamDescriptor, removalHandler: RemovalHandler) = this()
  
  var _handleMessagePublished: js.Any = js.native
  
  /**
    * Handle event from the server
    * @private
    */
  def _update(update: js.Any): Unit = js.native
  
  def dateExpires: String = js.native
  
  val descriptor: js.Any = js.native
  
  def links: js.Any = js.native
  
  def publishMessage(value: js.Object): js.Promise[StreamMessage] = js.native
  
  def removeStream(): js.Promise[Unit] = js.native
  
  def setTtl(ttl: Double): js.Promise[Unit] = js.native
  
  def uri: String = js.native
}
/* static members */
@JSImport("twilio-sync/lib/streams/syncstream", "SyncStreamImpl")
@js.native
object SyncStreamImpl extends js.Object {
  
  def `type`: String = js.native
}
