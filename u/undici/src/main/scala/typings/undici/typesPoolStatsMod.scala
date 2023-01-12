package typings.undici

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPoolStatsMod {
  
  @JSImport("undici/types/pool-stats", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with PoolStats {
    def this(pool: typings.undici.typesPoolMod.^) = this()
    
    /** Number of open socket connections in this pool. */
    /* CompleteClass */
    var connected: Double = js.native
    
    /** Number of open socket connections in this pool that do not have an active request. */
    /* CompleteClass */
    var free: Double = js.native
    
    /** Number of pending requests across all clients in this pool. */
    /* CompleteClass */
    var pending: Double = js.native
    
    /** Number of queued requests across all clients in this pool. */
    /* CompleteClass */
    var queued: Double = js.native
    
    /** Number of currently active requests across all clients in this pool. */
    /* CompleteClass */
    var running: Double = js.native
    
    /** Number of active, pending, or queued requests across all clients in this pool. */
    /* CompleteClass */
    var size: Double = js.native
  }
  
  trait PoolStats extends StObject {
    
    /** Number of open socket connections in this pool. */
    var connected: Double
    
    /** Number of open socket connections in this pool that do not have an active request. */
    var free: Double
    
    /** Number of pending requests across all clients in this pool. */
    var pending: Double
    
    /** Number of queued requests across all clients in this pool. */
    var queued: Double
    
    /** Number of currently active requests across all clients in this pool. */
    var running: Double
    
    /** Number of active, pending, or queued requests across all clients in this pool. */
    var size: Double
  }
  object PoolStats {
    
    inline def apply(connected: Double, free: Double, pending: Double, queued: Double, running: Double, size: Double): PoolStats = {
      val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], free = free.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[PoolStats]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PoolStats] (val x: Self) extends AnyVal {
      
      inline def setConnected(value: Double): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setFree(value: Double): Self = StObject.set(x, "free", value.asInstanceOf[js.Any])
      
      inline def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setQueued(value: Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
      
      inline def setRunning(value: Double): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
