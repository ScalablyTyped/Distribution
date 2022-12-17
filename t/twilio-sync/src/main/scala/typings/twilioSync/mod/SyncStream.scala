package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Sync primitive for pub-sub messaging. Stream Messages are not persisted, exist
  * only in transit, and will be dropped if (due to congestion or network anomalies) they
  * cannot be delivered promptly. Use the {@link SyncClient.stream} method to obtain a reference to a Sync Message Stream.
  * Information about rate limits can be found [here](https://www.twilio.com/docs/sync/limits).
  */
@JSImport("twilio-sync", "SyncStream")
@js.native
open class SyncStream protected () extends Closeable {
  /**
    * @internal
    */
  def this(syncStreamImpl: SyncStreamImpl) = this()
  
  def dateExpires: String = js.native
  
  def lastEventId: Any = js.native
  
  def links: Any = js.native
  
  /**
    * Publish a message to the stream. The system will attempt delivery to all online subscribers.
    * @param data The body of the dispatched message. Maximum size in serialized JSON: 4KB.
    * A rate limit applies to this operation, refer to the [Sync API documentation](https://www.twilio.com/docs/api/sync) for details.
    * @return A promise which resolves after the message is successfully published
    * to the Sync service. Resolves irrespective of ultimate delivery to any subscribers.
    * @example
    * ```typescript
    * stream.publishMessage({ x: 42, y: 123 })
    *   .then((message) => {
    *     console.log('Stream publishMessage() successful, message SID:', message.sid);
    *   })
    *   .catch((error) => {
    *     console.error('Stream publishMessage() failed', error);
    *   });
    * ```
    */
  def publishMessage(data: js.Object): js.Promise[SyncStreamMessage] = js.native
  
  /**
    * Permanently delete this Stream.
    * @return A promise which resolves after the Stream is successfully deleted.
    * @example
    * ```typescript
    * stream.removeStream()
    *   .then(() => {
    *     console.log('Stream removeStream() successful');
    *   })
    *   .catch((error) => {
    *     console.error('Stream removeStream() failed', error);
    *   });
    * ```
    */
  def removeStream(): js.Promise[Unit] = js.native
  
  /**
    * Update the time-to-live of the stream.
    * @param ttl Specifies the TTL in seconds after which the stream is subject to automatic deletion. The value 0 means infinity.
    * @return A promise that resolves after the TTL update was successful.
    * @example
    * ```typescript
    * stream.setTtl(3600)
    *   .then(() => {
    *     console.log('Stream setTtl() successful');
    *   })
    *   .catch((error) => {
    *     console.error('Stream setTtl() failed', error);
    *   });
    * ```
    */
  def setTtl(ttl: Double): js.Promise[Unit] = js.native
  
  /**
    * The immutable system-assigned identifier of this stream. Never null.
    */
  def sid: String = js.native
  
  /* private */ val syncStreamImpl: Any = js.native
  
  def `type`: String = js.native
  
  /**
    * A unique identifier optionally assigned to the stream on creation.
    */
  def uniqueName: String = js.native
  
  // private props
  def uri: String = js.native
}
object SyncStream {
  
  /**
    * Fired when a message is published to the stream either locally or by a remote actor.
    *
    * Parameters:
    * 1. object `args` - info object provided with the event. It has the following properties:
    *     * {@link SyncStreamMessage} `message` -  Published message
    *     * boolean `isLocal` - equals true if the message was published by a local actor, false otherwise
    * @example
    * ```typescript
    * stream.on('messagePublished', (args) => {
    *   console.log('Stream message published');
    *   console.log('Message SID:', args.message.sid);
    *   console.log('Message data: ', args.message.data);
    *   console.log('args.isLocal:', args.isLocal);
    * });
    * ```
    * @event
    */
  /* static member */
  @JSImport("twilio-sync", "SyncStream.messagePublished")
  @js.native
  val messagePublished: /* "messagePublished" */ String = js.native
  
  /**
    * Fired when a stream is removed entirely, regardless of whether the remover was local or remote.
    *
    * Parameters:
    * 1. object `args` - info object provided with the event. It has the following properties:
    *     * boolean `isLocal` - equals true if the stream was removed by a local actor, false otherwise
    * @example
    * ```typescript
    * stream.on('removed', (args) => {
    *   console.log(`Stream ${stream.sid} was removed`);
    *   console.log('args.isLocal:', args.isLocal);
    * });
    * ```
    * @event
    */
  /* static member */
  @JSImport("twilio-sync", "SyncStream.removed")
  @js.native
  val removed: /* "removed" */ String = js.native
}
