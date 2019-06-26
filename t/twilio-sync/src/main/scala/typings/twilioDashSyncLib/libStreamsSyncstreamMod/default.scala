package typings
package twilioDashSyncLib.libStreamsSyncstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @alias Stream
  * @classdesc A Sync primitive for pub-sub messaging. Stream Messages are not persisted, exist
  *     only in transit, and will be dropped if (due to congestion or network anomalies) they
  *     cannot be delivered promptly. Use the {@link Client#stream} method to obtain a reference to a Sync Message Stream.
  * @property {String} sid The immutable system-assigned identifier of this stream. Never null.
  * @property {String} [uniqueName=null] A unique identifier optionally assigned to the stream on creation.
  *
  * @fires Stream#messagePublished
  * @fires Stream#removed
  */
@JSImport("twilio-sync/lib/streams/syncstream", JSImport.Default)
@js.native
class default protected () extends SyncStream {
  def this(syncStreamImpl: SyncStreamImpl) = this()
}

/* static members */
@JSImport("twilio-sync/lib/streams/syncstream", JSImport.Default)
@js.native
object default extends js.Object {
  val `type`: java.lang.String = js.native
}

