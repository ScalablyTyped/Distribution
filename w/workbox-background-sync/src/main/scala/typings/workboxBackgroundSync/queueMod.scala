package typings.workboxBackgroundSync

import typings.std.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueMod {
  
  @JSImport("workbox-background-sync/Queue", "Queue")
  @js.native
  class Queue protected () extends StObject {
    def this(name: String) = this()
    def this(name: String, options: QueueOptions) = this()
    
    def getAll(): js.Promise[js.Array[QueueEntry[_]]] = js.native
    
    val name: String = js.native
    
    def popRequest(): js.Promise[QueueEntry[_]] = js.native
    
    def pushRequest(entry: QueueEntry[_]): js.Promise[Unit] = js.native
    
    def registerSync(): js.Promise[Unit] = js.native
    
    def shiftRequest(): js.Promise[QueueEntry[_]] = js.native
    
    def unshiftRequest(entry: QueueEntry[_]): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait QueueEntry[Metadata] extends StObject {
    
    var metadata: js.UndefOr[Metadata] = js.native
    
    var request: Request = js.native
    
    var timestamp: js.UndefOr[Double] = js.native
  }
  object QueueEntry {
    
    @scala.inline
    def apply[Metadata](request: Request): QueueEntry[Metadata] = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueEntry[Metadata]]
    }
    
    @scala.inline
    implicit class QueueEntryMutableBuilder[Self <: QueueEntry[_], Metadata] (val x: Self with QueueEntry[Metadata]) extends AnyVal {
      
      @scala.inline
      def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  @js.native
  trait QueueOnSyncEvent extends StObject {
    
    var queue: Queue = js.native
  }
  object QueueOnSyncEvent {
    
    @scala.inline
    def apply(queue: Queue): QueueOnSyncEvent = {
      val __obj = js.Dynamic.literal(queue = queue.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueOnSyncEvent]
    }
    
    @scala.inline
    implicit class QueueOnSyncEventMutableBuilder[Self <: QueueOnSyncEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueue(value: Queue): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    }
  }
  
  type QueueOnSyncHandler = js.Function1[/* options */ QueueOnSyncEvent, Unit | js.Promise[Unit]]
  
  @js.native
  trait QueueOptions extends StObject {
    
    var maxRetentionTime: js.UndefOr[Double] = js.native
    
    var onSync: js.UndefOr[QueueOnSyncHandler] = js.native
  }
  object QueueOptions {
    
    @scala.inline
    def apply(): QueueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueOptions]
    }
    
    @scala.inline
    implicit class QueueOptionsMutableBuilder[Self <: QueueOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxRetentionTime(value: Double): Self = StObject.set(x, "maxRetentionTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetentionTimeUndefined: Self = StObject.set(x, "maxRetentionTime", js.undefined)
      
      @scala.inline
      def setOnSync(value: /* options */ QueueOnSyncEvent => Unit | js.Promise[Unit]): Self = StObject.set(x, "onSync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSyncUndefined: Self = StObject.set(x, "onSync", js.undefined)
    }
  }
}
