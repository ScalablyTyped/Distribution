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
@JSImport("twilio-sync/lib/streams/syncstream", "SyncStream")
@js.native
class SyncStream protected ()
  extends twilioDashSyncLib.libCloseableMod.default {
  def this(syncStreamImpl: SyncStreamImpl) = this()
  val dateExpires: java.lang.String = js.native
  val lastEventId: js.Any = js.native
  val links: js.Any = js.native
  val sid: java.lang.String = js.native
  val syncStreamImpl: js.Any = js.native
  val `type`: java.lang.String = js.native
  val uniqueName: java.lang.String = js.native
  val uri: java.lang.String = js.native
  /**
    * Publish a Message to the Stream. The system will attempt delivery to all online subscribers.
    * @param {Object} value The body of the dispatched message. Maximum size in serialized JSON: 4KB.
    * A rate limit applies to this operation, refer to the [Sync API documentation]{@link https://www.twilio.com/docs/api/sync} for details.
    * @return {Promise<StreamMessage>} A promise which resolves after the message is successfully published
    *   to the Sync service. Resolves irrespective of ultimate delivery to any subscribers.
    * @public
    * @example
    * stream.publishMessage({ x: 42, y: 123 })
    *   .then(function(message) {
    *     console.log('Stream publishMessage() successful, message SID:' + message.sid);
    *   })
    *   .catch(function(error) {
    *     console.error('Stream publishMessage() failed', error);
    *   });
    */
  def publishMessage(value: js.Object): js.Promise[StreamMessage] = js.native
  /**
    * Permanently delete this Stream.
    * @return {Promise<void>} A promise which resolves after the Stream is successfully deleted.
    * @public
    * @example
    * stream.removeStream()
    *   .then(function() {
    *     console.log('Stream removeStream() successful');
    *   })
    *   .catch(function(error) {
    *     console.error('Stream removeStream() failed', error);
    *   });
    */
  def removeStream(): js.Promise[scala.Unit] = js.native
  /**
    * Update the time-to-live of the stream.
    * @param {Number} ttl Specifies the TTL in seconds after which the stream is subject to automatic deletion. The value 0 means infinity.
    * @return {Promise<void>} A promise that resolves after the TTL update was successful.
    * @public
    * @example
    * stream.setTtl(3600)
    *   .then(function() {
    *     console.log('Stream setTtl() successful');
    *   })
    *   .catch(function(error) {
    *     console.error('Stream setTtl() failed', error);
    *   });
    */
  def setTtl(ttl: scala.Double): js.Promise[scala.Unit] = js.native
}

/* static members */
@JSImport("twilio-sync/lib/streams/syncstream", "SyncStream")
@js.native
object SyncStream extends js.Object {
  val `type`: java.lang.String = js.native
}

