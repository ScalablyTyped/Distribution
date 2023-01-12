package typings.tediousConnectionPool

import typings.events.mod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Tedious Connection Pool Class
    */
  @JSImport("tedious-connection-pool", JSImport.Namespace)
  @js.native
  open class ^ protected () extends tcp {
    /**
      * Connection Pool constructor
      * @param poolConfig the pool configuration
      * @param connectionConfig the connection configuration
      */
    def this(
      poolConfig: PoolConfig,
      connectionConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tedious.ConnectionConfig */ Any
    ) = this()
  }
  
  /**
    * Extends Tedious Connection with release function
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tedious.Connection * / any */ @JSImport("tedious-connection-pool", "PooledConnection")
  @js.native
  open class PooledConnection () extends StObject {
    
    /**
      * If the connection is issued from a connection pool returns the connection to the pool.
      */
    def release(): Unit = js.native
  }
  
  /**
    * Provides a connection or an error
    * @param err error if any
    * @param connection issued from the pool
    */
  type ConnectionCallback = js.Function2[/* err */ js.Error, /* connection */ PooledConnection, Unit]
  
  /**
    *  Pool Configuration interface
    */
  trait PoolConfig extends StObject {
    
    /**
      * Acquire timeout
      */
    var acquireTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Idle timeout
      */
    var idleTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines if logging is activated
      */
    var log: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum concurrent connections
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum concurrent connections
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * Retry delay
      */
    var retryDelay: js.UndefOr[Double] = js.undefined
  }
  object PoolConfig {
    
    inline def apply(): PoolConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PoolConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PoolConfig] (val x: Self) extends AnyVal {
      
      inline def setAcquireTimeout(value: Double): Self = StObject.set(x, "acquireTimeout", value.asInstanceOf[js.Any])
      
      inline def setAcquireTimeoutUndefined: Self = StObject.set(x, "acquireTimeout", js.undefined)
      
      inline def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
      
      inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
    }
  }
  
  /**
    * Tedious Connection Pool Class
    */
  @js.native
  trait tcp extends EventEmitter {
    
    /**
      * acquires a connection from the pool
      * @param callback invoked when the connection is retrieved and ready
      */
    def acquire(callback: ConnectionCallback): Unit = js.native
    
    /**
      * closes opened connections
      */
    def drain(): Unit = js.native
  }
}
