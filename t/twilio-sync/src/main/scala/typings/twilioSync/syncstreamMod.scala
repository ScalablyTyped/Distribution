package typings.twilioSync

import typings.twilioSync.entityMod.EntityServices
import typings.twilioSync.entityMod.RemovalHandler
import typings.twilioSync.entityMod.SyncEntity
import typings.twilioSync.serverapiMod.StreamDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncstreamMod {
  
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
    extends typings.twilioSync.closeableMod.default {
    def this(syncStreamImpl: SyncStreamImpl) = this()
    
    def dateExpires: String = js.native
    
    def lastEventId: js.Any = js.native
    
    def links: js.Any = js.native
    
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
    def removeStream(): js.Promise[Unit] = js.native
    
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
    def setTtl(ttl: Double): js.Promise[Unit] = js.native
    
    def sid: String = js.native
    
    /* private */ val syncStreamImpl: js.Any = js.native
    
    def `type`: String = js.native
    
    def uniqueName: String = js.native
    
    def uri: String = js.native
  }
  
  @JSImport("twilio-sync/lib/streams/syncstream", "SyncStreamImpl")
  @js.native
  class SyncStreamImpl protected () extends SyncEntity {
    /**
      * @private
      */
    def this(services: StreamServices, descriptor: StreamDescriptor, removalHandler: RemovalHandler) = this()
    
    /* private */ var _handleMessagePublished: js.Any = js.native
    
    /**
      * Handle event from the server
      * @private
      */
    def _update(update: js.Any): Unit = js.native
    
    def dateExpires: String = js.native
    
    /* private */ val descriptor: js.Any = js.native
    
    def links: js.Any = js.native
    
    def publishMessage(value: js.Object): js.Promise[StreamMessage] = js.native
    
    def removeStream(): js.Promise[Unit] = js.native
    
    def setTtl(ttl: Double): js.Promise[Unit] = js.native
    
    def uri: String = js.native
  }
  
  trait StreamMessage extends StObject {
    
    var sid: String
    
    var value: js.Object
  }
  object StreamMessage {
    
    inline def apply(sid: String, value: js.Object): StreamMessage = {
      val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamMessage]
    }
    
    extension [Self <: StreamMessage](x: Self) {
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type StreamServices = EntityServices
}
