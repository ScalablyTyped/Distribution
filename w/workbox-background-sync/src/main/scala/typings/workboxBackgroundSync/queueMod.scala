package typings.workboxBackgroundSync

import typings.std.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueMod {
  
  @JSImport("workbox-background-sync/Queue", "Queue")
  @js.native
  class Queue protected () extends StObject {
    def this(name: String) = this()
    def this(name: String, options: QueueOptions) = this()
    
    def getAll(): js.Promise[js.Array[QueueEntry[js.Any]]] = js.native
    
    val name: String = js.native
    
    def popRequest(): js.Promise[QueueEntry[js.Any]] = js.native
    
    def pushRequest(entry: QueueEntry[js.Any]): js.Promise[Unit] = js.native
    
    def registerSync(): js.Promise[Unit] = js.native
    
    def shiftRequest(): js.Promise[QueueEntry[js.Any]] = js.native
    
    def unshiftRequest(entry: QueueEntry[js.Any]): js.Promise[Unit] = js.native
  }
  
  trait QueueEntry[Metadata] extends StObject {
    
    var metadata: js.UndefOr[Metadata] = js.undefined
    
    var request: Request
    
    var timestamp: js.UndefOr[Double] = js.undefined
  }
  object QueueEntry {
    
    inline def apply[Metadata](request: Request): QueueEntry[Metadata] = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueEntry[Metadata]]
    }
    
    extension [Self <: QueueEntry[?], Metadata](x: Self & QueueEntry[Metadata]) {
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  trait QueueOnSyncEvent extends StObject {
    
    var queue: Queue
  }
  object QueueOnSyncEvent {
    
    inline def apply(queue: Queue): QueueOnSyncEvent = {
      val __obj = js.Dynamic.literal(queue = queue.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueOnSyncEvent]
    }
    
    extension [Self <: QueueOnSyncEvent](x: Self) {
      
      inline def setQueue(value: Queue): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    }
  }
  
  type QueueOnSyncHandler = js.Function1[/* options */ QueueOnSyncEvent, Unit | js.Promise[Unit]]
  
  trait QueueOptions extends StObject {
    
    var maxRetentionTime: js.UndefOr[Double] = js.undefined
    
    var onSync: js.UndefOr[QueueOnSyncHandler] = js.undefined
  }
  object QueueOptions {
    
    inline def apply(): QueueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueOptions]
    }
    
    extension [Self <: QueueOptions](x: Self) {
      
      inline def setMaxRetentionTime(value: Double): Self = StObject.set(x, "maxRetentionTime", value.asInstanceOf[js.Any])
      
      inline def setMaxRetentionTimeUndefined: Self = StObject.set(x, "maxRetentionTime", js.undefined)
      
      inline def setOnSync(value: /* options */ QueueOnSyncEvent => Unit | js.Promise[Unit]): Self = StObject.set(x, "onSync", js.Any.fromFunction1(value))
      
      inline def setOnSyncUndefined: Self = StObject.set(x, "onSync", js.undefined)
    }
  }
}
